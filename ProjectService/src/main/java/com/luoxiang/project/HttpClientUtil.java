package com.luoxiang.project;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName: 	    ProjectWeb
 * packageName:	        com.luoxiang
 * className:	        HttpClientUtil
 * author:	            Luoxiang
 * time:	            2018/3/17	22:12
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2018/3/17
 * upDateDesc:	        TODO
 */


public class HttpClientUtil {
    public static void main(String[] args){



        getData("JSESSIONID=yAYz9HG9GjK63Iy-8dByLyeKbaixt9f0C1gK6g8QwsvfEf8XZF1i!1739900296");
    }

    private static void getData(String cookies) {
        String     url        = "http://ggfw.gdhrss.gov.cn/gwyks/exam/details/spQuery.do";
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost   httpPost   = new HttpPost(url);
        httpPost.addHeader("Accept" , "application/json, text/javascript, */*; q=0.01");
        httpPost.addHeader("Accept-Encoding" , "gzip, deflate");
        httpPost.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
        httpPost.addHeader("Connection" , "keep-alive");
        // httpPost.addHeader("Content-Length" , "38");
        httpPost.addHeader("Content-Type" , "application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.addHeader("Cookie" ,cookies );
        httpPost.addHeader("Host" , "ggfw.gdhrss.gov.cn");
        httpPost.addHeader("Origin" , "http://ggfw.gdhrss.gov.cn");
        httpPost.addHeader("Referer" , "http://ggfw.gdhrss.gov.cn/gwyks/center.do?nvt=1521290163915&ticket=ST-22342-3CiIKGRedK1eedQxtDfn-cas");
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.162 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");
    /*    BasicHttpParams params = new BasicHttpParams();

        params.setParameter("bfa001","201801");
        params.setParameter("bab301","01");
        params.setParameter("page","1");
        params.setParameter("rows","50");*/

        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("bfa001", "201801"));
        nvps.add(new BasicNameValuePair("bab301", "01"));
        nvps.add(new BasicNameValuePair("page", "1"));
        nvps.add(new BasicNameValuePair("rows", "50"));
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));


            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity   entity   = response.getEntity();
            if (entity != null){
                String       s        = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);
                System.out.println(s);
            }



        } catch (Exception e) {

        }
    }
}
