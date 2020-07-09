package com.luoxiang.project.service.impl;

import com.google.gson.Gson;
import com.luoxiang.project.HttpClientUtil;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.ServerBean;
import com.luoxiang.project.mapper.Gd2020Mapper;
import com.luoxiang.project.po.Gd2020;
import com.luoxiang.project.service.Gd2020Service;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.net.ssl.SSLContext;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        Gd2020ServiceImpl
 * author:	            Luoxiang
 * time:	            2020/7/9	10:15
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/9
 * upDateDesc:	        TODO
 */

@Service
public class Gd2020ServiceImpl implements Gd2020Service{

    @Resource
    Gd2020Mapper gd2020Mapper;

    public HashMap<String, Gd2020> initMap() {
        List<Gd2020> list = gd2020Mapper.selectAll();
        HashMap<String , Gd2020> hashMap = new HashMap<>(list.size());
        for(Gd2020 gd : list){
            hashMap.put(gd.getJobCode() , gd);
        }
        return hashMap;
    }

    @Override
    public CommBean update(String cookies) {
        CommBean commBean = new CommBean();
        try {
            getData(cookies ,initMap());
            commBean.setCode(0);
            commBean.setMsg("Success");
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg("ERROR : " + e.getMessage());
        }
        return commBean;
    }

    public void getData(String cookies ,  HashMap<String , Gd2020> hashMap) throws Exception{
        String     url        = "https://ggfw.gdhrss.gov.cn/gwyks/exam/details/spQuery.do";

        HttpPost   httpPost   = new HttpPost(url);
        httpPost.addHeader("Accept" , "application/json, text/javascript, */*; q=0.01");
        httpPost.addHeader("Accept-Encoding" , "gzip, deflate, br");
        httpPost.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
        httpPost.addHeader("Connection" , "keep-alive");
        // httpPost.addHeader("Content-Length" , "38");
        httpPost.addHeader("Content-Type" , "application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.addHeader("Cookie" ,cookies );
        httpPost.addHeader("Host" , "ggfw.gdhrss.gov.cn");
        httpPost.addHeader("Origin" , "https://ggfw.gdhrss.gov.cn");
        httpPost.addHeader("Referer" , "https://ggfw.gdhrss.gov.cn/gwyks/center.do?nvt=1594262079718");
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

        for (int i = 0; i < HttpClientUtil.are.length; i++) {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("bfa001", "202001"));
            nvps.add(new BasicNameValuePair("bab301", HttpClientUtil.are[i]));
            nvps.add(new BasicNameValuePair("page","1"));
            nvps.add(new BasicNameValuePair("rows", "1500"));

            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity   entity   = response.getEntity();
            if (entity != null){
                String       s        = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);
                Gson       gson       = new Gson();
                ServerBean serverBean = gson.fromJson(s, ServerBean.class);
                List<ServerBean.RowsBean> rows    = serverBean.getRows();
                String                    jobCode = null;
                for (ServerBean.RowsBean rowsBean : rows) {

                    if (hashMap != null){
                        jobCode = rowsBean.getBfe301();
                        Gd2020 gd2020 = hashMap.get(jobCode);

                        int currentNums = rowsBean.getAab119();
                        if (gd2020 != null ){
                            if (gd2020 != null && gd2020.getHasNums() != currentNums){
                                gd2020.setHasNums(currentNums);
                                gd2020Mapper.updateByPrimaryKey(gd2020);
                            }
                        }else {
                            continue;
                        }

                    }else {
                        break;
                    }

                }
            }

            Thread.sleep(3000);
        }


    }


    private static CloseableHttpClient httpClient;

    static {
        try {
            SSLContext    sslContext = SSLContextBuilder.create().useProtocol(
                    SSLConnectionSocketFactory.SSL).loadTrustMaterial((x, y) -> true).build();
            RequestConfig config = RequestConfig.custom().setConnectTimeout(5000).setSocketTimeout(5000).build();
            httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).setSSLContext(sslContext).setSSLHostnameVerifier((x, y) -> true).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String doPost(String url, String jsonString) {
        try {
            HttpPost     httpPost     = new HttpPost(url);
            StringEntity stringEntity = new StringEntity(jsonString, "utf-8");
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            CloseableHttpResponse response   = httpClient.execute(httpPost);
            int                   statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                httpPost.abort();
                throw new RuntimeException("HttpClient,error status code :"
                                                   + statusCode);
            }
            HttpEntity entity = response.getEntity();
            String result = null;
            if (entity != null) {
                result = EntityUtils.toString(entity, "utf-8");
            }
            EntityUtils.consume(entity);
            response.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
