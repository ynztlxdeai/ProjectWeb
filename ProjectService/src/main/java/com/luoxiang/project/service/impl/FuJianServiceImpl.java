package com.luoxiang.project.service.impl;

import com.google.gson.Gson;
import com.luoxiang.project.bean.FuJianBean;
import com.luoxiang.project.service.FuJianService;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        FuJianServiceImpl
 * author:	            Luoxiang
 * time:	            2021/2/23	9:12
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/23
 * upDateDesc:	        TODO
 */


public class FuJianServiceImpl implements FuJianService {


    @Override
    public List<FuJianBean> getData() {
        HttpClient httpClient = HttpClients.createDefault();

        String cookies = "UM_distinctid=177be961af91be-0b01419ca33a5e-4353760-144000-177be961afa9a5; insert_cookie-47873-sf_xy617_SKWEB_80=HEEFBLKMFAAA; CNZZDATA1906642=cnzz_eid%3D2089672354-1613808383-null%26ntime%3D1614040771; ASP.NET_SessionId=4ssub0s1dhyjhscvqoiosy4u";
        String     url        = "http://gwy.rst.fujian.gov.cn/z/api.aspx?action=PositionSearch&page=1&unitCode=&unitName=&unitType=undefined&unitArea=&unitLevel=&positionCode=&positionName=&departmentId=undefined&examType=&eduStatus=&hJLocation=&sex=undefined&jobYear=&nation=&political=&degree=&eduType=&specialPosition=&specialXQPosition=&specialty=&number=&age=&jsoncallback=jQuery19105137989443658759_1614042513827&_=%d";
        long current = 1614042513830l;
        int page = 1;
        HttpPost httpPost = new HttpPost(String.format(url , current));
        httpPost.addHeader("Accept" , "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01");
        httpPost.addHeader("Accept-Encoding" , "gzip, deflate");
        httpPost.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
        httpPost.addHeader("Connection" , "keep-alive");
        httpPost.addHeader("Content-Type" , "application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.addHeader("Cookie" ,cookies );
        httpPost.addHeader("Host" , "ggfw.gdhrss.gov.cn");
        httpPost.addHeader("Origin" , "gwy.rst.fujian.gov.cn");
        httpPost.addHeader("Referer" , "http://gwy.rst.fujian.gov.cn/position");
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

        for (int i = 0; i < 345; i++) {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("action", "PositionSearch"));
            nvps.add(new BasicNameValuePair("page", page+"" ));
            nvps.add(new BasicNameValuePair("unitCode",""));
            nvps.add(new BasicNameValuePair("unitName", ""));
            nvps.add(new BasicNameValuePair("unitType", "undefined"));
            nvps.add(new BasicNameValuePair("unitArea", ""));
            nvps.add(new BasicNameValuePair("unitLevel", ""));
            nvps.add(new BasicNameValuePair("positionCode", ""));
            nvps.add(new BasicNameValuePair("positionName", ""));
            nvps.add(new BasicNameValuePair("departmentId", ""));
            nvps.add(new BasicNameValuePair("examType", ""));
            nvps.add(new BasicNameValuePair("eduStatus", ""));
            nvps.add(new BasicNameValuePair("hJLocation", ""));
            nvps.add(new BasicNameValuePair("sex", "undefined"));
            nvps.add(new BasicNameValuePair("jobYear", ""));
            nvps.add(new BasicNameValuePair("nation", ""));
            nvps.add(new BasicNameValuePair("political", ""));
            nvps.add(new BasicNameValuePair("degree", ""));
            nvps.add(new BasicNameValuePair("eduType", ""));
            nvps.add(new BasicNameValuePair("specialPosition", ""));
            nvps.add(new BasicNameValuePair("specialXQPosition", ""));
            nvps.add(new BasicNameValuePair("specialty", ""));
            nvps.add(new BasicNameValuePair("number", ""));
            nvps.add(new BasicNameValuePair("age", ""));
            nvps.add(new BasicNameValuePair("jsoncallback", "jQuery19105137989443658759_1614042513827 _: " + current));


            HttpResponse response = null;
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
                response = httpClient.execute(httpPost);
                HttpEntity   entity   = response.getEntity();
                if (entity != null) {
                    String s = EntityUtils.toString(entity, "UTF-8");
                    EntityUtils.consume(entity);
                    JSONObject jsonObject = JSONObject.fromObject(s);
                    Object     rows       = jsonObject.get("Rows");


                    Gson       gson = new Gson();
                   // FuJianBean bean = gson.fromJson(s, FuJianBean.class);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}
