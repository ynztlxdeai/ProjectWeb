package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.Jd2020JnBean;
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
        String cookies = "JSESSIONID=61557A9EE1DE293DBF92D71AD3E7B76F; JSESSIONID=BC9E2546EE148D6F2B9DDC63BC767FAA; Hm_lvt_ad65617c1b92d555455e06647127f54e=1602316457,1602330094,1602470811,1602483393; Hm_lpvt_ad65617c1b92d555455e06647127f54e=1602483393; SERVERID=c067d38b3d290d8792062bcde9fddf61|1602484040|1602483391";
        String examid = "71005279ef64a0ac";
        CommBean<ArrayList<Jd2020JnBean>> commBean =  jd2020ServiceImpl.updateJN(cookies , examid);
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<Jd2020JnBean>           data     = commBean.getData();
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
        model.addAttribute("jdwz_data" , stringBuffer.toString());
        return "jdwz";
    }

    /**
     *
     *
     <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
     <html>
     <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Insert title here</title>
     </head>
     <body>
     <form method="post" action="${pageContext.request.contextPath }/enterprise/updateUsername">
     <h2>文件上传</h2>
     文件:<input type="txt" name="txt"/><br/><br/>
     <input type="submit" value="上传"/>
     </form>
     </body>
     </html>

     * @return
     */
    @RequestMapping("updateJNHtml")
    public String updateJNHtml(){
        String                            cookies  = "JSESSIONID=61557A9EE1DE293DBF92D71AD3E7B76F; JSESSIONID=BC9E2546EE148D6F2B9DDC63BC767FAA; Hm_lvt_ad65617c1b92d555455e06647127f54e=1602316457,1602330094,1602470811,1602483393; Hm_lpvt_ad65617c1b92d555455e06647127f54e=1602483393; SERVERID=c067d38b3d290d8792062bcde9fddf61|1602484040|1602483391";
        String                            examid   = "71005279ef64a0ac";
        CommBean<ArrayList<Jd2020JnBean>> commBean =  jd2020ServiceImpl.updateJN(cookies , examid);
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<Jd2020JnBean>           data     = commBean.getData();
        stringBuffer.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        stringBuffer.append("<title>Insert title here</title>");
        stringBuffer.append("</head>");
        stringBuffer.append("<body>");
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
        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }
}
