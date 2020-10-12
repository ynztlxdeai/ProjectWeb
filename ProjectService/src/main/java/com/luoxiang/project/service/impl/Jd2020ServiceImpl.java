package com.luoxiang.project.service.impl;

import com.google.gson.Gson;
import com.luoxiang.poi.PoiWenZhi;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.Jd2020JnBean;
import com.luoxiang.project.mapper.Jd202001Mapper;
import com.luoxiang.project.po.Jd202001;
import com.luoxiang.project.service.Jd2020Service;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.http.util.TextUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        Jd2020ServiceImpl
 * author:	            Luoxiang
 * time:	            2020/7/9	15:04
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/9
 * upDateDesc:	        TODO
 */

@Service
public  class Jd2020ServiceImpl implements Jd2020Service{

    @Resource
    Jd202001Mapper jd202001Mapper;

    @Override
    public CommBean update() {
        CommBean commBean = new CommBean();
        try {
            List<Jd202001> list = PoiWenZhi.checkHasNums(initMap());
            commBean.setCode(0);
            commBean.setData(list);
            commBean.setMsg("Success");
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg("ERROR : " + e.getMessage());
        }
        return commBean;
    }

    @Override
    public CommBean updateJN(String cookies, String examid) {
        CommBean commBean = new CommBean();
        try {
            commBean.setCode(0);
            commBean.setData(getData(cookies , examid));
            commBean.setMsg("Success");
        }catch (Exception e){
            commBean.setMsg(e.getMessage());
            commBean.setCode(-1);
        }
        return commBean;
    }

    public HashMap<String, Jd202001> initMap() {
        List<Jd202001>           list    = jd202001Mapper.selectAll();
        HashMap<String , Jd202001> hashMap = new HashMap<>(list.size());
        for(Jd202001 gd : list){
            hashMap.put(gd.getJobCode() , gd);
        }
        return hashMap;
    }









    public ArrayList<Jd2020JnBean> getData(String cookies , String examid) throws Exception{
        String[] codes = {
                "L906237",
                "L906295",
                "L906381",
                "L906068",
                "L906239",
                "L906238",
                "L906126",
                "L906128",
                "L906118",
                "L906168",
                "L906467",
                "L906471",
                "L906327",
                "L905902",
                "L906243",
                "L906242",
                "L903763",
                "L906425",
                "L906087",
                "L906367",
                "L906340",
                "L906255",
                "L906224",
                "L906301",
                "L906208",
                "L903741",
                "L906121",
                "L906104",
                "L906102",
                "L906437",
                "L906439"
                };
        String   url        = "http://182.92.48.145:82/tyzpwb/stuchooseexam/getPositionInfo.htm";
        HttpClient      httpClient = HttpClients.createDefault();
        HttpPost httpPost   = new HttpPost(url);
        httpPost.addHeader("Accept" , "*/*");
        httpPost.addHeader("Accept-Encoding" , "gzip, deflate");
        httpPost.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
        httpPost.addHeader("Connection" , "keep-alive");
        httpPost.addHeader("Content-Type" , "application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.addHeader("Cookie" ,cookies );
        httpPost.addHeader("Host" , "182.92.48.145:82");
        httpPost.addHeader("Origin" , "http://182.92.48.145:82");
        httpPost.addHeader("Referer" , "http://182.92.48.145:82/tyzpwb/stuchooseexam/selectPosition.htm?examstupid=1015&userid=2d284dfa8421c9fa&bmid=d2c0fced176c5581&examid=71005279ef64a0ac");
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

        ArrayList<Jd2020JnBean> list = new ArrayList<>(codes.length);

        for (int i = 0; i < codes.length; i++) {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("zwdm", codes[i]));
            nvps.add(new BasicNameValuePair("examid", examid));

            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity   entity   = response.getEntity();
            if (entity != null){
                String       s        = EntityUtils.toString(entity, "UTF-8");
                if (TextUtils.isEmpty(s)){
                    continue;
                }
                EntityUtils.consume(entity);
                Gson                      gson       = new Gson();
                Jd2020JnBean                jd2020JnBean = gson.fromJson(s, Jd2020JnBean.class);
                list.add(jd2020JnBean);
            }
        }

        Collections.sort(list);
        //Thread.sleep(30);
        return list;
    }


}
