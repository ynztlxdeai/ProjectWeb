package com.luoxiang.project;

import com.google.gson.Gson;
import com.luoxiang.project.bean.ServerBean;
import com.luoxiang.project.mapper.BaomingqingkuangMapper;
import com.luoxiang.project.po.Baomingqingkuang;

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
import java.util.HashMap;
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

    public static Integer page = 1;

    public static Integer rows = 1500;

    public static String[] are = {
            "11",//东莞
            "21",//云浮
            "05",//佛山
            "01",//广州
            "09",//惠州
            "20",//揭阳
            "08",//梅州
            "04",//汕头
            "10",//汕尾
            "13",//江门
            "07",//河源
            "02",//深圳
            "18",//清远
            "15",//湛江
            "19",//潮州
            "03",//珠海
            "99",//省直
            "17",//肇庆
            "16",//茂名
            "14",//阳江
            "06"
            //韶关

    };

    public static void main(String[] args){


        try {
            getData("JSESSIONID=rc02odV4e01r0uuEPklUTtY_yX8BtJIR2ew2Ah--6sHVejLwrfou!-1814372133" , null , null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getData(String cookies , HashMap<String , Baomingqingkuang> hashMap ,
                               BaomingqingkuangMapper baomingqingkuangMapper) throws  Exception{
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



        for (int i = 0; i < are.length; i++) {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("bfa001", "201801"));
            nvps.add(new BasicNameValuePair("bab301", are[i]));
            nvps.add(new BasicNameValuePair("page", page.toString()));
            nvps.add(new BasicNameValuePair("rows", rows.toString()));

                httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
                HttpResponse response = httpClient.execute(httpPost);
                HttpEntity   entity   = response.getEntity();
                if (entity != null){
                    String       s        = EntityUtils.toString(entity, "UTF-8");
                    EntityUtils.consume(entity);
                    Gson gson = new Gson();
                    ServerBean serverBean = gson.fromJson(s, ServerBean.class);
                   // ServerBean serverBean = JSONUtils.toBean(s, ServerBean.class);
                    List<ServerBean.RowsBean> rows = serverBean.getRows();
                    String jobCode = null;
                    for (ServerBean.RowsBean rowsBean : rows) {
                        if (hashMap != null){
                            jobCode = rowsBean.getBfe301();
                            Baomingqingkuang baomingqingkuang = hashMap.get(jobCode);

                            int currentNums = rowsBean.getAab119();
                            if (baomingqingkuang != null ){
                                if (baomingqingkuang != null && baomingqingkuang.getNumbers() != currentNums){
                                    baomingqingkuang.setNumbers(currentNums);


                                    baomingqingkuangMapper.updateByPrimaryKey(baomingqingkuang);
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
}
