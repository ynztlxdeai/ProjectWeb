package com.luoxiang.project.service.impl;

import com.google.gson.Gson;
import com.luoxiang.project.HttpClientUtil;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.ServerBean;
import com.luoxiang.project.mapper.GuangDong01Mapper;
import com.luoxiang.project.po.GuangDong01;
import com.luoxiang.project.service.GuangDongService;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.http.util.TextUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.net.ssl.SSLContext;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        GuangDongServiceImpl
 * author:	            Luoxiang
 * time:	            2021/1/30	11:50
 * desc:
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:
 */

@Service
public class GuangDongServiceImpl implements GuangDongService{

    @Resource
    public GuangDong01Mapper guangDong01Mapper;

    @Override
    public List<GuangDong01> selectAll() {
        return guangDong01Mapper.selectAll();
    }

    @Override
    public CommBean<T> update(String cookies) {
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

    @Override
    public List<GuangDong01> sortAll(int cmp, boolean filter) {
        List<GuangDong01> all = selectAll();
        if (filter){
            ArrayList<GuangDong01> results = new ArrayList<>();
            for (GuangDong01 t : all){
                if ((!t.getBenKe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            return results;
        }else {
            ArrayList<GuangDong01> results = new ArrayList<>();
            for (GuangDong01 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            return results;
        }
    }

    public HashMap<String, GuangDong01> initMap() {
        List<GuangDong01> list = guangDong01Mapper.selectAll();
        HashMap<String , GuangDong01> hashMap = new HashMap<>(list.size());
        for(GuangDong01 gd : list){
            hashMap.put(gd.getJobCode() , gd);
        }
        return hashMap;
    }

    public void getData(String cookies ,  HashMap<String , GuangDong01> hashMap) throws Exception{
        String     url        = "https://ggfw.gdhrss.gov.cn/gwyks/exam/details/spQuery.do";

        HttpPost httpPost = new HttpPost(url);
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
            nvps.add(new BasicNameValuePair("bfa001", "202101"));
            nvps.add(new BasicNameValuePair("bab301", HttpClientUtil.are[i]));
            nvps.add(new BasicNameValuePair("page","1"));
            nvps.add(new BasicNameValuePair("rows", "1500"));

            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity   entity   = response.getEntity();
            if (entity != null){
                String       s        = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);
                Gson                      gson       = new Gson();
                ServerBean                serverBean = gson.fromJson(s, ServerBean.class);
                List<ServerBean.RowsBean> rows       = serverBean.getRows();
                String                    jobCode    = null;
                for (ServerBean.RowsBean rowsBean : rows) {

                    if (hashMap != null){
                        jobCode = rowsBean.getBfe301();
                        GuangDong01 gov = hashMap.get(jobCode);


                        if (gov != null ){
                            int currentNums = rowsBean.getAab119();
                            gov.setAllNum(currentNums);

                            StringBuffer sb1 = new StringBuffer(gov.getIngNum());
                            sb1.append(TextUtils.isEmpty(gov.getIngNum()) ? "" : "," ).append(currentNums);
                            gov.setIngNum(sb1.toString());

                            guangDong01Mapper.updateByPrimaryKey(gov);
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
            SSLContext sslContext = SSLContextBuilder.create().useProtocol(
                    SSLConnectionSocketFactory.SSL).loadTrustMaterial((x, y) -> true).build();
            RequestConfig config = RequestConfig.custom().setConnectTimeout(5000).setSocketTimeout(5000).build();
            httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).setSSLContext(sslContext).setSSLHostnameVerifier((x, y) -> true).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
