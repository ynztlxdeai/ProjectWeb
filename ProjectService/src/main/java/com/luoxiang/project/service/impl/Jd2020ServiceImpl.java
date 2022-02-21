package com.luoxiang.project.service.impl;

import com.google.gson.Gson;
import com.luoxiang.poi.PoiWenZhi;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.Jd2020JnBean;
import com.luoxiang.project.bean.JdWzBean;
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

    @Override
    public CommBean updateWZ(String cookies, String examid) {
        CommBean commBean = new CommBean();
        try {
            commBean.setCode(0);
            String[] codes = {
                    //"2022000758",
                    //"54D2E0A83BBA3ABFB27AF7A4B6E2293CF35E8B7E0F1AFBAB",
                    //"2022000814",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC6B5BC90FE1A0A6849",
                    //"2022000819",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC66FC88666E3C6A479",
                    //"2022000830",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC6C48673FD52346514",
                    //"2022000832",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC6B724F83D93237351",
                    //"2022000836",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC6D3DB26CAFA71D878",
                    //"2022000858",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC6F35E8B7E0F1AFBAB",
                    //"2022000882",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC6DC12092CBA2012D0",
                    //"2022000892",
                    //"54D2E0A83BBA3ABF56FC6D5186F9EBC6BAFDF8B169157015",
                    //"2022000906",
                    //"54D2E0A83BBA3ABF59FD87DD7993D057FF815F49CDD11CDA",
                    //"2022001282",
                        "54D2E0A83BBA3ABF689BE5C7B889CC28DC12092CBA2012D0",
                    //"2022001565",
                    //"54D2E0A83BBA3ABF098D69A025981508B4224CCCDE939F3F",
                    //"2022002029",
                    //"54D2E0A83BBA3ABFDB51CB3A3B4F3EF6AE68E5C3EB94A630",
                    //"2022002036",
                    //"54D2E0A83BBA3ABFDB51CB3A3B4F3EF6D3DB26CAFA71D878",
                    //"2022002038",
                    //"54D2E0A83BBA3ABFDB51CB3A3B4F3EF68D9DCCDE65969DBE",
                    //"2022002041",
                    //"54D2E0A83BBA3ABFDB51CB3A3B4F3EF6F9DA6F3C8AA0B509",
                    //"2022002042",
                    //"54D2E0A83BBA3ABFDB51CB3A3B4F3EF64EDC64AC128E7C88",
                    //"2022002517",
                    //"54D2E0A83BBA3ABFEC7AB89DEAC57DCFB8EDEBA264DF775B",
                    //"2022002858",
                    //"54D2E0A83BBA3ABF23280471A0390EE8F35E8B7E0F1AFBAB",
                    //"2022003289",
                    //"54D2E0A83BBA3ABFB5B56D4CDB4B96F3BF6263FAFEF8750F",
                    //"2022003560",
                        "54D2E0A83BBA3ABFE16EC1FD3472D1D37A86363874D5851A",
                    //"2022004199",
                    //"54D2E0A83BBA3ABF739996979434CEA3D314826C74CB1083",
                    //"2022004203",
                    //"54D2E0A83BBA3ABF4C6298A090F60A772ABFE6B08D99E1E7",
                    //"2022004205",
                    //"54D2E0A83BBA3ABF4C6298A090F60A776CE478D1E3703C19",
                    //"2022004216",
                        "54D2E0A83BBA3ABF4C6298A090F60A7711AFBF80CA4F3F94",
                    //"2022004220",
                        "54D2E0A83BBA3ABF4C6298A090F60A77625D8D62ADAD4C98",
                    //"2022004540",
                    //"54D2E0A83BBA3ABF91A64C8D4742B69E802EA02F643464A4",
                    //"2022004603",
                    //"54D2E0A83BBA3ABFE8DC4C7650C3FDCA2ABFE6B08D99E1E7",
                    //"2022004649",
                    //"54D2E0A83BBA3ABFE8DC4C7650C3FDCA66C04406854B1CC9",
                    //"2022004778",
                    //"54D2E0A83BBA3ABF0B5FC58E15F2D0083085151D2DD27A66",
                    //"2022004779",
                    //"54D2E0A83BBA3ABF0B5FC58E15F2D00836AB662944A108BB",
                    //"2022004962",
                    //"54D2E0A83BBA3ABFA97269D7DDBF2337A6C4D37E3852CD86",
                    //"2022005005",
                    //"54D2E0A83BBA3ABF824FF49F8B153FC46CE478D1E3703C19",
                    //"2022005029",
                    //"54D2E0A83BBA3ABF824FF49F8B153FC4AE68E5C3EB94A630",
                    //"2022005243",
                        "54D2E0A83BBA3ABF1386745BDAD71C550400CBA8F815E69F",
                    //"2022005642",
                    //"54D2E0A83BBA3ABF782C7223625E79F24EDC64AC128E7C88",
                    //"2022005654",
                        "54D2E0A83BBA3ABF782C7223625E79F2D10B9E47413B9793",
                    //"2022006477",
                        "54D2E0A83BBA3ABF52C146200CDE4AEBD619B8EDBB6AEFFD",
                    //"2022007992",
                    //"54D2E0A83BBA3ABF729103EEA61612BFBAFDF8B169157015",
                    //"2022008021",
                    //"54D2E0A83BBA3ABF46ECEA580DCC401A83A27DE9DCF0B672",
                    //"2022008025",
                        "54D2E0A83BBA3ABF46ECEA580DCC401A8A24BFDBA8569BFA",
                    //"2022008207",
                    //"54D2E0A83BBA3ABF7EAAC11C7948DF13F4D4E80490EEDD31",
                    //"2022008208",
                    //"54D2E0A83BBA3ABF7EAAC11C7948DF13FB93283B37951FB9",
                    //"2022008209",
                    //"54D2E0A83BBA3ABF7EAAC11C7948DF13EE67022ACC293AB8",
                    //"2022008210",
                    //"54D2E0A83BBA3ABF7EAAC11C7948DF13B13A67EE8889DAD1",
                    //"2022008211",
                    //"54D2E0A83BBA3ABF7EAAC11C7948DF13B0AB5CBA0ACB78EF",
                    //"2022008212",
                    //"54D2E0A83BBA3ABF7EAAC11C7948DF1366D44AA4516D69B3",
                    //"2022009476",
                    //"54D2E0A83BBA3ABF427ADF160DFA17A0EADAA44A008207D8",
                    //"2022009781",
                    //"54D2E0A83BBA3ABF2FD548F021FF26378D2484FB32FB1656",
                    //"2022010188",
                        "54D2E0A83BBA3ABF48156E022C52E92E796EDE17E5A16517",
                    //"2022010204",
                    //"54D2E0A83BBA3ABFEA33A5363C5206066F24F2F2FEDAB7E9",
                    //"2022010269",
                    //"54D2E0A83BBA3ABFEA33A5363C52060673F709715D1537FC",
                    //"2022010394",
                    //"54D2E0A83BBA3ABF6815F48CE96300FF5E432E9029C276DA",
                    //"2022011267",
                        "54D2E0A83BBA3ABF3ABFAB1A93DDAE85047FEB7C00D1F1E1",
                    //"2022011268",
                        "54D2E0A83BBA3ABF3ABFAB1A93DDAE85EB64282CCCE86A7A",
                    //"2022012450",
                    //"54D2E0A83BBA3ABF86E4B96C4DB65791247003E9B5B0443F",
                    //"2022012547",
                    //"54D2E0A83BBA3ABF0AE3AC7027A7EE34A10AFA8FB21BC45A",
                    //"2022012585",
                    //"54D2E0A83BBA3ABF0AE3AC7027A7EE34CBC492CA88724801",
                    //"2022012587",
                    //"54D2E0A83BBA3ABF0AE3AC7027A7EE34380710ECF1653E95",
                    //"2022012673",
                    //"54D2E0A83BBA3ABF05C77340B4B7772BA2B3DC34C3DF5751",
                    //"2022012675",
                    //"54D2E0A83BBA3ABF05C77340B4B7772B0D34CB6029359B3C",
                    //"2022012677",
                    //"54D2E0A83BBA3ABF05C77340B4B7772BD619B8EDBB6AEFFD",
                    //"2022012818",
                    //    "54D2E0A83BBA3ABF3FD885E94DF2415E899628C77D40EE24",
                    //"2022012911",
                    //"54D2E0A83BBA3ABF94DC8E43FDD397EEB0AB5CBA0ACB78EF",
                    //"2022013055",
                    //"54D2E0A83BBA3ABF06046169D213A6D3C2B7CD1717C8D958",
                    //"2022013255",
                    //"54D2E0A83BBA3ABF8CAC7E08184F76C1C2B7CD1717C8D958",
                    //"2022013263",
                        "54D2E0A83BBA3ABF8CAC7E08184F76C1E518814510891E4D",
                    //"2022013880",
                    //"54D2E0A83BBA3ABF20069C570021111D81ADA098414BD04E",
                    //"2022013881",
                    //"54D2E0A83BBA3ABF20069C570021111D8D2484FB32FB1656",
                    //"2022014076",
                    //"54D2E0A83BBA3ABFC3C02EDAF008F2C9EADAA44A008207D8",
                    //"2022014078",
                    //"54D2E0A83BBA3ABFC3C02EDAF008F2C93085151D2DD27A66",
                    //"2022014121",
                        "54D2E0A83BBA3ABF38233CC38850F52083A27DE9DCF0B672",
                    //"2022014138",
                    //"54D2E0A83BBA3ABF38233CC38850F5208D9DCCDE65969DBE",
                    //"2022014589",
                        "54D2E0A83BBA3ABFAF6215E6976F7083BF6263FAFEF8750F",
                    //"2022014637",
                    //"54D2E0A83BBA3ABF463E473CFDB8C6004567BAB95F48F40A",
                    //"2022014683",
                    //"54D2E0A83BBA3ABF463E473CFDB8C600FBD6796804912319",
                    //"2022015503",
                    //"54D2E0A83BBA3ABF80E7B65F165A84EB2ABFE6B08D99E1E7",
                    //"2022015928",
                    //"54D2E0A83BBA3ABF8D3770BE7A6F293FA2BCD06041BA58A2",
                    //"2022016454",
                        "54D2E0A83BBA3ABF03B8203A1E85957BD10B9E47413B9793",
                    //"2022018333",
                    //"54D2E0A83BBA3ABFE92869A8933FA7CD67BED4A4144A82E8",
                    //"2022019201",
                    //"54D2E0A83BBA3ABFF55644B94FB933D1B136D89349A49E09",
                    //"2022019210",
                    //"54D2E0A83BBA3ABFF55644B94FB933D1B13A67EE8889DAD1",
            };
            String   url        = "http://39.107.108.81/qjwzwb/stuchooseexam/getPositionInfo.htm";
            HttpClient      httpClient = HttpClients.createDefault();
            HttpPost httpPost   = new HttpPost(url);
            httpPost.addHeader("Accept" , "*/*");
            httpPost.addHeader("Accept-Encoding" , "gzip, deflate");
            httpPost.addHeader("Accept-Language" , "zh-CN,zh;q=0.9");
            httpPost.addHeader("Connection" , "keep-alive");
            httpPost.addHeader("Content-Type" , "application/x-www-form-urlencoded; charset=UTF-8");
            httpPost.addHeader("Cookie" ,cookies );
            httpPost.addHeader("Host" , "39.107.108.81");
            httpPost.addHeader("Origin" , "http://39.107.108.81");
            httpPost.addHeader("Referer" , "http://39.107.108.81/qjwzwb/stuchooseexam/selectPosition.htm?examstupid=1015&userid=b4e0385b83a0c32f&bmid=f01c111b8799f1a9&examid=5083fd4b2a75e4d1");
            httpPost.addHeader("User-Agent" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
            httpPost.addHeader("X-Requested-With" , "XMLHttpRequest");

            ArrayList<JdWzBean> list = new ArrayList<>(codes.length);
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
                    JdWzBean                jd2020JnBean = gson.fromJson(s, JdWzBean.class);
                    list.add(jd2020JnBean);
                }
            }

            Collections.sort(list);
            commBean.setData(list);
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
                "L906439",
                "L904032"
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
