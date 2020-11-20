package com.luoxiang.project.service.impl;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.SDGovMapper;
import com.luoxiang.project.mapper.ShanDong202002Mapper;
import com.luoxiang.project.po.SDGov;
import com.luoxiang.project.po.ShanDong202002;
import com.luoxiang.project.service.ShanDongService;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.util.TextUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        SDServiceImpl
 * author:	            Luoxiang
 * time:	            2020/5/8	15:15
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/5/8
 * upDateDesc:	        TODO
 */
@Service
public class ShanDongServiceImpl
        implements ShanDongService {

    @Resource
    SDGovMapper sDGovMapper;

    @Resource
    ShanDong202002Mapper shanDong202002Mapper;

    @Override
    public List<SDGov> selectAll() {
        return sDGovMapper.selectAll();
    }

    @Override
    public List<ShanDong202002> selectAll2() {
        return shanDong202002Mapper.selectAll();
    }

    @Override
    public CommBean<List<ShanDong202002>> update2() {
        CommBean   commBean   = new CommBean();
        String    url        = "http://182.92.48.100:81/sdgwy21/bmtj/bmtj.html";
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost   httpPost   = new HttpPost(url);
        httpPost.addHeader("Cookie" ,"SERVERID=2671e8ba135b07792c420e855485b2da|1588918658|1588916196;Path=/" );

        try {

            HttpResponse response =  httpClient.execute(httpPost);
            HttpEntity   entity   = response.getEntity();
            if (entity != null) {
                String   s     = EntityUtils.toString(entity, "UTF-8");
                Document doc   = Jsoup.parse(s);
                Elements table = doc.getElementsByClass("table_style3");
                Elements trs   = table.select("tr");

                List<ShanDong202002> all = selectAll2();
                HashMap<String , ShanDong202002> jobCodePosition = new HashMap<>(all.size());
                ShanDong202002 gov = null;
                for (int i = 0 ; i < all.size() ; i++){
                    gov = all.get(i);
                    if (TextUtils.isEmpty(gov.getJobCode())){
                        continue;
                    }
                    if (!jobCodePosition.containsKey(gov.getJobCode())){
                        jobCodePosition.put(gov.getJobCode() , gov);
                    }
                }



                for (Element element : trs){
                    String jobCode = element.child(2).text();
                    if (jobCodePosition.containsKey(jobCode)){
                        String pass_check = element.child(5).text();
                        String pass_pay = element.child(6).text();

                        int pass_check_int =Integer.parseInt( pass_check.replace("+","").replace("-",""));
                        int pass_pay_int = Integer.parseInt(pass_pay.replace("+","").replace("-",""));

                        gov = jobCodePosition.get(jobCode);
                        int need  = Integer.parseInt(gov.getNeedNum());
                        int intNum = need * pass_pay_int;
                        if (pass_pay.contains("-")){
                            intNum--;
                        }
                        gov.setIntNum(intNum);

                        StringBuffer sb1 = new StringBuffer(gov.getCanNum());
                        sb1.append(pass_check).append(",");
                        gov.setCanNum(sb1.toString());

                        sb1 = new StringBuffer(gov.getHasNum());
                        sb1.append(pass_pay).append(",");
                        gov.setHasNum(sb1.toString());

                        shanDong202002Mapper.updateByPrimaryKey(gov);
                        //jobCodePosition.replace(jobCode , gov)
                    }

                }


            }

            //Document     doc      =Jsoup.parse(response.getEntity().getContent().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return commBean;
    }

    @Override
    public  CommBean update(String cookies) {
        CommBean   commBean   = new CommBean();
        String    url        = "http://182.92.48.100:81/sdgwy20/bmtj/bmtj.html";
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost   httpPost   = new HttpPost(url);
        httpPost.addHeader("Cookie" ,"SERVERID=2671e8ba135b07792c420e855485b2da|1588918658|1588916196;Path=/" );

        try {

            HttpResponse response =  httpClient.execute(httpPost);
            HttpEntity   entity   = response.getEntity();
            if (entity != null) {
                String   s     = EntityUtils.toString(entity, "UTF-8");
                Document doc   = Jsoup.parse(s);
                Elements table = doc.getElementsByClass("table_style3");
                Elements trs   = table.select("tr");

                List<SDGov> all = selectAll();
                HashMap<String , Integer> jobCodePosition = new HashMap<>(all.size());
                SDGov gov = null;
                for (int i = 0 ; i < all.size() ; i++){
                    gov = all.get(i);
                    if (TextUtils.isEmpty(gov.getZhiWeiDaiMa())){
                        continue;
                    }
                    if (!jobCodePosition.containsKey(gov.getZhiWeiDaiMa())){
                        jobCodePosition.put(gov.getZhiWeiDaiMa() , i);
                    }
                }



                for (Element element : trs){
                    String jobCode = element.child(2).text();
                    if (jobCodePosition.containsKey(jobCode)){
                        String pass_check = element.child(5).text();
                        String pass_pay = element.child(6).text();

                        int pass_check_int =Integer.parseInt( pass_check.replace("+","").replace("-",""));
                        int pass_pay_int = Integer.parseInt(pass_pay.replace("+","").replace("-",""));

                        int index = jobCodePosition.get(jobCode);
                        gov = all.get(index);
                        int need  = Integer.parseInt(gov.getLuYongJiHua());
                        if (!pass_check.equals(gov.getPassCheck())){
                            gov.setPassCheck(pass_check);

                            gov.setPassCheckInt(pass_check_int * need);
                            sDGovMapper.updateByPrimaryKey(gov);
                        }
                        if (!pass_pay.equals(gov.getPassPay())){
                            gov.setPassPay(pass_pay);
                            gov.setPassPayInt(pass_pay_int * need);
                            sDGovMapper.updateByPrimaryKey(gov);
                        }

                    }

                }


            }

            //Document     doc      =Jsoup.parse(response.getEntity().getContent().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return commBean;
    }
}
