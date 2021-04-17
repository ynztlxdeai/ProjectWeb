package com.luoxiang.project.service.impl;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.Jd2021Mapper;
import com.luoxiang.project.po.Jd2021;
import com.luoxiang.project.service.ArmyService;

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
import org.apache.http.util.TextUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        ArmyServiceImpl
 * author:	            Luoxiang
 * time:	            2021/4/7	11:41
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/4/7
 * upDateDesc:	        TODO
 */

@Service
public class ArmyServiceImpl implements ArmyService{

    @Resource
    public Jd2021Mapper jd2021Mapper;

    public HashMap<String , Jd2021> initMap(){
        HashMap<String , Jd2021> map = new HashMap<>();
        List<Jd2021> list = selectAll2021();
        for (Jd2021 t : list){
            map.put(t.getJobCode() , t);
        }
        return map;
    }

    @Override
    public CommBean<T> update2021() {
        CommBean c = new CommBean();
        HashMap<String , Jd2021> map = initMap();

        String examid = "5083fd4b2a75e4d1";
        String cookies ="JSESSIONID=D059E499F348AA9BB62F63B9784E60FA; JSESSIONID=E1D999BC7127334B90DD8A10A2A15283; Hm_lvt_ad65617c1b92d555455e06647127f54e=1618206013,1618285347,1618305628,1618384299; Hm_lpvt_ad65617c1b92d555455e06647127f54e=1618384299; SERVERID=880059588a55f185595138ace36a36c8|1618384311|1618285345";
        String url = "http://182.92.48.172/qjwzwb/stuchooseexam/getPositionInfo.htm";
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost   httpPost   = new HttpPost(url);
        httpPost.addHeader("Accept" , "*/*");
        httpPost.addHeader("Accept-Encoding" , "gzip, deflate");
        httpPost.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
        httpPost.addHeader("Connection" , "keep-alive");
        httpPost.addHeader("Content-Type" , "application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.addHeader("Cookie" ,cookies );
        httpPost.addHeader("Host" , "182.92.48.172");
        httpPost.addHeader("Origin" , "http://182.92.48.172");
        httpPost.addHeader("Referer" , "http://182.92.48.172/qjwzwb/stuchooseexam/selectPosition.htm?examstupid=1015&userid=eba0061d8b638835&bmid=3f74e811b87eddc5&examid=5083fd4b2a75e4d1");
        httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
        httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

        Iterator<Map.Entry<String, Jd2021>> iterator = map.entrySet().iterator();
        Jd2021 tmp = null;
        while (iterator.hasNext()){
            tmp = iterator.next().getValue();
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("zwdm", tmp.getJobCode()));
            nvps.add(new BasicNameValuePair("examid", examid));
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
                HttpResponse response = httpClient.execute(httpPost);
                HttpEntity   entity   = response.getEntity();
                if (entity != null){
                    String       s        = EntityUtils.toString(entity, "UTF-8");
                    if (TextUtils.isEmpty(s)){
                        continue;
                    }
                    JSONObject j = JSONObject.fromObject(s);
                    int num = j.getInt("zwbkrs");
                    tmp.setHasNum(num);
                    StringBuffer buffer = new StringBuffer(tmp.getIngNum());
                    buffer.append(TextUtils.isEmpty(tmp.getIngNum()) ? "" : "," ).append(num + "");
                    tmp.setIngNum(buffer.toString());
                    jd2021Mapper.updateByPrimaryKey(tmp);
                }
            }catch (Exception e){

            }
        }

        return c;
    }

    @Override
    public List<Jd2021> selectAll2021() {
        return jd2021Mapper.selectAll();
    }

    @Override
    public List<Jd2021> sortAll2021(int cmp) {
        List<Jd2021> all = selectAll2021();

        ArrayList<Jd2021> results = new ArrayList<>();
        for (Jd2021 t : all){
            if (t.getHasNum() <= cmp){
                results.add(t);
            }
        }
        Collections.sort(results);
        return results;
    }


}
