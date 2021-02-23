package com.luoxiang.net;

import com.google.gson.Gson;
import com.luoxiang.file.JsonFileUtil;
import com.luoxiang.project.bean.FuJianBean;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.net
 * className:	        FuJianNet
 * author:	            Luoxiang
 * time:	            2021/2/23	9:33
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/23
 * upDateDesc:	        TODO
 */


public class FuJianNet {
    public static void main(String[] args){

    }

    public static List<FuJianBean> getData() {
        HttpClient httpClient = HttpClients.createDefault();

        String   cookies  = "UM_distinctid=177be961af91be-0b01419ca33a5e-4353760-144000-177be961afa9a5; insert_cookie-47873-sf_xy617_SKWEB_80=HEEFBLKMFAAA; CNZZDATA1906642=cnzz_eid%3D2089672354-1613808383-null%26ntime%3D1614040771; ASP.NET_SessionId=4ssub0s1dhyjhscvqoiosy4u";
        String   url      = "http://gwy.rst.fujian.gov.cn/z/api.aspx?action=PositionSearch&page=%d&unitCode=&unitName=&unitType=undefined&unitArea=&unitLevel=&positionCode=&positionName=&departmentId=undefined&examType=&eduStatus=&hJLocation=&sex=undefined&jobYear=&nation=&political=&degree=&eduType=&specialPosition=&specialXQPosition=&specialty=&number=&age=&jsoncallback=jQuery19105137989443658759_1614042513827&_=%d";
        long     current  = 1614042513838l;
        int      page     = 1;
        Gson gson = new Gson();
        ArrayList<FuJianBean> list = new ArrayList<>();
        for (int i = 0; i < 345; i++) {
            HttpGet httpPost = new HttpGet(String.format(url , page , current));
            httpPost.addHeader("Accept" , "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01");
            httpPost.addHeader("Accept-Encoding" , "gzip, deflate");
            httpPost.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
            httpPost.addHeader("Connection" , "keep-alive");
            httpPost.addHeader("Content-Type" , "application/x-www-form-urlencoded; charset=UTF-8");
            httpPost.addHeader("Cookie" ,cookies );
            httpPost.addHeader("Host" , "gwy.rst.fujian.gov.cn");
            httpPost.addHeader("Referer" , "http://gwy.rst.fujian.gov.cn/position");
            httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
            httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

            HttpResponse response = null;
            try {
                response = httpClient.execute(httpPost);
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String s = EntityUtils.toString(entity, "UTF-8");
                    EntityUtils.consume(entity);

                    s = s.substring(s.indexOf("(") + 1 , s.length() - 1);

                    JSONObject jsonObject = JSONObject.fromObject(s);
                    Object     rows       = jsonObject.get("Rows");


                    Document document = Jsoup.parse(rows.toString());
                    Elements tables      = document.getElementsByTag("table");
                    FuJianBean bean = null;
                    for (Element e : tables){
                        Elements trs = e.getElementsByTag("tr");
                        bean = new FuJianBean();
                        bean.unit_code_name = trs.get(0).getElementsByTag("td").get(1).ownText();
                        bean.job_code_name = trs.get(0).getElementsByTag("td").get(3).ownText();
                        bean.unit_parent = trs.get(1).getElementsByTag("td").get(1).ownText();
                        bean.unit_area = trs.get(1).getElementsByTag("td").get(3).ownText();
                        bean.job_addr = trs.get(2).getElementsByTag("td").get(1).ownText();
                        bean.job_level = trs.get(2).getElementsByTag("td").get(3).ownText();
                        bean.test_class = trs.get(3).getElementsByTag("td").get(1).ownText();
                        bean.need_num = trs.get(3).getElementsByTag("td").get(3).ownText();
                        bean.fan_wei = trs.get(4).getElementsByTag("td").get(1).ownText();
                        bean.chu_sheng_y_m = trs.get(4).getElementsByTag("td").get(3).ownText();
                        bean.sex = trs.get(5).getElementsByTag("td").get(1).ownText();
                        bean.min_zu = trs.get(5).getElementsByTag("td").get(3).ownText();
                        bean.zheng_zhi = trs.get(6).getElementsByTag("td").get(1).ownText();
                        bean.xue_li = trs.get(6).getElementsByTag("td").get(3).ownText();
                        bean.xue_wei = trs.get(7).getElementsByTag("td").get(1).ownText();
                        bean.xue_li_class = trs.get(7).getElementsByTag("td").get(3).ownText();
                        bean.job_yao_qiu = trs.get(8).getElementsByTag("td").get(1).ownText();
                        bean.zhuan_men_job = trs.get(8).getElementsByTag("td").get(3).ownText();
                        bean.zhuan_ye = trs.get(9).getElementsByTag("td").get(1).ownText();
                        bean.job_desc = trs.get(10).getElementsByTag("td").get(1).ownText();
                        bean.qi_ta = trs.get(11).getElementsByTag("td").get(1).ownText();
                        bean.bei_zhu = trs.get(12).getElementsByTag("td").get(1).ownText();
                        if (trs.size() > 13){
                            bean.phone = trs.get(13).getElementsByTag("td").get(1).ownText();
                        }else {
                            bean.phone = "";
                        }

                        list.add(bean);
                    }


                    // FuJianBean bean = gson.fromJson(s, FuJianBean.class);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            page++;
            current++;

        }
        String s = gson.toJson(list);
        s = s.replace("<\\/tr>" , "");
        s = s.replace("<\\/td>" , "");
        try {
            JsonFileUtil.writeFile(new File("C:\\Users\\Vincent\\Downloads\\2021\\1.txt") , s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}
