package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.Jd2020JnBean;
import com.luoxiang.project.bean.JdWzBean;
import com.luoxiang.project.service.Jd2020Service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        Jd2020Controller
 * author:	            Luoxiang
 * time:	            2020/7/9	14:41
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/9
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("jd_2020")
public class Jd2020Controller {

    @Resource
    Jd2020Service jd2020ServiceImpl;

    @RequestMapping("update")
    public @ResponseBody
    CommBean update(){
       return jd2020ServiceImpl.update();
    }

    @RequestMapping("updateJN")
    public @ResponseBody
    CommBean updateJN(){
        String cookies = "JSESSIONID=61557A9EE1DE293DBF92D71AD3E7B76F; JSESSIONID=BC9E2546EE148D6F2B9DDC63BC767FAA; Hm_lvt_ad65617c1b92d555455e06647127f54e=1602316457,1602330094,1602470811,1602483393; Hm_lpvt_ad65617c1b92d555455e06647127f54e=1602483393; SERVERID=c067d38b3d290d8792062bcde9fddf61|1602484040|1602483391";
        String examid = "71005279ef64a0ac";
        return jd2020ServiceImpl.updateJN(cookies , examid);
    }

    @RequestMapping("updateJNJsp")
    public String updateJNJsp(Model model){
        String cookies = "JSESSIONID=CDB78B8340E39380C5F52D35993F356B; JSESSIONID=BC9E2546EE148D6F2B9DDC63BC767FAA; Hm_lvt_ad65617c1b92d555455e06647127f54e=1602316457,1602330094,1602470811,1602483393; Hm_lpvt_ad65617c1b92d555455e06647127f54e=1602742206; SERVERID=bd86a84024ed8a496627fcea0473731c|1602742218|1602730530";
        String examid = "71005279ef64a0ac";
        CommBean<ArrayList<Jd2020JnBean>> commBean =  jd2020ServiceImpl.updateJN(cookies , examid);
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<Jd2020JnBean>           data     = commBean.getData();
        stringBuffer.append("<ul>");
        for (int i = 0; i < data.size(); i++) {
            /**
             *
             <ul>
             <li>咖啡</li>
             <li>茶</li>
             <li>牛奶</li>
             </ul>
             */
            stringBuffer.append("<li>");
            stringBuffer.append(data.get(i).toString());
            stringBuffer.append("</li>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("jdwz_data" , stringBuffer.toString());
        return "jdwz";
    }

    @RequestMapping("jd_2022")
    public String jd_2022(Model model ){
        String cookies = "JSESSIONID=79CFD33D1A74BBF8DB511989623FB70D; JSESSIONID=DC87FC4B5019C0295B0073C2C22A6237; Hm_lvt_ad65617c1b92d555455e06647127f54e=1638682905; acw_tc=0bcb2f1916387490510084302e7e8d8e676f0ea7326e1d2d89eb6d31da17df; Hm_lpvt_ad65617c1b92d555455e06647127f54e=1638749052; SERVERID=90287bf69426875f6e070cfa9166afa9|1638749102|1638749051";
        String examid = "5083fd4b2a75e4d1";
        CommBean<ArrayList<JdWzBean>> commBean     =  jd2020ServiceImpl.updateWZ(cookies , examid);
        StringBuffer                  stringBuffer = new StringBuffer();
        ArrayList<JdWzBean>       data         = commBean.getData();
        stringBuffer.append("<ul>");
        for (int i = 0; i < data.size(); i++) {
            /**
             *
             <ul>
             <li>咖啡</li>
             <li>茶</li>
             <li>牛奶</li>
             </ul>
             */
            stringBuffer.append("<li>");
            stringBuffer.append(data.get(i).show());
            stringBuffer.append("</li>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("jdwz_data" , stringBuffer.toString());
        return "jdwz";
    }

}
