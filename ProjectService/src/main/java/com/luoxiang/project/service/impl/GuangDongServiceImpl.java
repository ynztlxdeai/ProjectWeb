package com.luoxiang.project.service.impl;

import com.google.gson.Gson;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.ServerBean;
import com.luoxiang.project.mapper.GdSydw2022Mapper;
import com.luoxiang.project.mapper.GuangDong01Mapper;
import com.luoxiang.project.po.GdSydw2022;
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
import java.util.Collections;
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

    private static final String[] ARE_LIST = {
            "99",//省直
            "01",//广州
            "02",//深圳
            "03",//珠海
            "04",//汕头
            "05",//佛山
            "06",//韶关
            "07",//河源
            "08",//梅州
            "09",//惠州
            "10",//汕尾
            "11",//东莞
            "12",//中山
            "13",//江门
            "14",//阳江
            "15",//湛江
            "16",//茂名
            "17",//肇庆
            "18",//清远
            "19",//潮州
            "20",//揭阳
            "21",//云浮

    };

    @Resource
    public GuangDong01Mapper guangDong01Mapper;

    @Resource
    public GdSydw2022Mapper gdSydw2022Mapper;

    @Override
    public List<GuangDong01> selectAll() {
        return guangDong01Mapper.selectAll();
    }

    @Override
    public CommBean<T> update(String cookies , String time) {
        CommBean commBean = new CommBean();
        try {
            getData(cookies ,time ,initMap());
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
                if ((!t.getBenKe().contains("不限")) && (t.getAllNum() / Integer.parseInt(t.getNeedNum())) <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<GuangDong01> results = new ArrayList<>();
            for (GuangDong01 t : all){
                if ((t.getAllNum() / Integer.parseInt(t.getNeedNum())) <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }

    /**
     * 0报名人数
     * @param cookies
     * @param time
     * @return
     */
    @Override
    public List<GuangDong01> checkZero(String cookies, String time) throws Exception {
        String     url        = "https://ggfw.gdhrss.gov.cn/gwyks/exam/details/jobNoSignStatiscs.do";

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
        httpPost.addHeader("Referer" , String.format("https://ggfw.gdhrss.gov.cn/gwyks/center.do?nvt=%s" ,
                                                     time));
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("page","1"));
        nvps.add(new BasicNameValuePair("rows", "1500"));
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
        HashMap<String, GuangDong01> hashMap = initMap();
        List<GuangDong01> result = new ArrayList<>();
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
                System.out.println(rowsBean.toString());
                if (hashMap != null){
                    jobCode = rowsBean.getBfe301();
                    GuangDong01 gov = hashMap.get(jobCode);

                    if (gov != null ){
                        result.add(gov);
                    }
                }else {
                    break;
                }
            }
        }


        return result;
    }

    @Override
    public List<GdSydw2022> selectAllSydw() {
        return gdSydw2022Mapper.selectAll();
    }

    @Override
    public CommBean<T> updateSydw(String cookies, String time) {
        CommBean commBean = new CommBean();
        try {
            List<GdSydw2022> list = gdSydw2022Mapper.selectAll();
            HashMap<String , GdSydw2022> hashMap = new HashMap<>(list.size());
            for(GdSydw2022 gd : list){
                hashMap.put(gd.getJobCode() , gd);
            }

            getDataSydw(cookies ,time ,hashMap);

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
    public List<GdSydw2022> sortAllSydw(int cmp, boolean filter) {
        List<GdSydw2022> all = gdSydw2022Mapper.selectAll();
        if (filter){
            ArrayList<GdSydw2022> results = new ArrayList<>();
            for (GdSydw2022 t : all){
                if ((!t.getZhuanYe().contains("不限")) && (t.getAllNum() / Integer.parseInt(t.getNeedNum())) <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<GdSydw2022> results = new ArrayList<>();
            for (GdSydw2022 t : all){
                if ((t.getAllNum() / Integer.parseInt(t.getNeedNum())) <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }

    @Override
    public List<GdSydw2022> checkZeroSydw(String cookies, String time)
            throws Exception
    {
        return null;
    }

    public HashMap<String, GuangDong01> initMap() {
        List<GuangDong01> list = guangDong01Mapper.selectAll();
        HashMap<String , GuangDong01> hashMap = new HashMap<>(list.size());
        for(GuangDong01 gd : list){
            hashMap.put(gd.getJobCode() , gd);
        }
        return hashMap;
    }

    public void getData(String cookies , String time ,  HashMap<String , GuangDong01> hashMap) throws Exception{
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
        httpPost.addHeader("Referer" , String.format("https://ggfw.gdhrss.gov.cn/gwyks/center.do?nvt=%s" ,
                                                     time));
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

        for (int i = 0; i < ARE_LIST.length; i++) {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("bfa001", "202201"));
            nvps.add(new BasicNameValuePair("bab301", ARE_LIST[i]));
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
                            sb1.append(TextUtils.isEmpty(gov.getIngNum()) ? "" : "," ).append(currentNums + "");
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

    private void getDataSydw(String cookies, String time, HashMap<String , GdSydw2022> hashMap)  throws Exception{
        String     url        = "https://ggfw.gdhrss.gov.cn/sydwbk/exam/details/spQuery.do";

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
        httpPost.addHeader("Referer" , String.format("https://ggfw.gdhrss.gov.cn/sydwbk/center.do?nvt=%s" ,
                                                     time));
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

        for (int i = 0; i < ARE_LIST.length; i++) {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("bfa001", "2210841"));
            nvps.add(new BasicNameValuePair("bab301", ARE_LIST[i]));
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
                        GdSydw2022 gov = hashMap.get(jobCode);


                        if (gov != null ){
                            int currentNums = rowsBean.getAab119();
                            gov.setAllNum(currentNums);

                            StringBuffer sb1 = new StringBuffer(gov.getHasing());
                            sb1.append(TextUtils.isEmpty(gov.getHasing()) ? "" : "," ).append(currentNums + "");
                            gov.setHasing(sb1.toString());

                            gdSydw2022Mapper.updateByPrimaryKey(gov);
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
