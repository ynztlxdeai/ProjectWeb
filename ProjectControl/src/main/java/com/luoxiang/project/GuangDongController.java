package com.luoxiang.project;

import com.luoxiang.project.po.GdSydw2022;
import com.luoxiang.project.po.GuangDong01;
import com.luoxiang.project.service.GuangDongService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        GuangDongController
 * author:	            Luoxiang
 * time:	            2021/1/30	11:40
 * desc:
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:
 */

@Controller
@RequestMapping("guangdong")
public class GuangDongController {

    @Resource
    public GuangDongService guangDongServiceImpl;

    @RequestMapping("update")
    public String update(Model model ,String cookies ,  int cmp , boolean filter , boolean skip , String time){
        //http://localhost:8080/guangdong/update?skip=false&time=1638165322590&filter=false&cmp=5&cookies=JSESSIONID=B81qQwjtb2hOKmQloSfYx_tpZPfVDLlfBJpHUWmWnSeZ6MVH98GO!1327406713
        if (!skip){
            guangDongServiceImpl.update(cookies , time);
        }

        List<GuangDong01> all = guangDongServiceImpl.sortAll(cmp , filter);


        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (GuangDong01 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }

    @RequestMapping("get_zero")
    public String getZero(Model model ,String cookies , String time){
        //http://localhost:8080/guangdong/get_zero?time=1638165322590&cookies=JSESSIONID=B81qQwjtb2hOKmQloSfYx_tpZPfVDLlfBJpHUWmWnSeZ6MVH98GO!1327406713
        List<GuangDong01> all = null;
        try {
            all = guangDongServiceImpl.checkZero(cookies , time);
            StringBuffer            stringBuffer = new StringBuffer();
            stringBuffer.append("<ul>");
            for (GuangDong01 gov : all) {
                stringBuffer.append("<li>");
                stringBuffer.append(gov.showData());
                stringBuffer.append("</li>");
                stringBuffer.append("<br></br>");
            }
            stringBuffer.append("</ul>");

            model.addAttribute("comm_data" , stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("comm_data" , e.getMessage());
        }

        return "comm";
    }



    @RequestMapping("update/sydw")
    public String updateSydw(Model model ,String cookies ,  int cmp , boolean filter , boolean skip , String time){
        //http://localhost:8080/guangdong/update/sydw?skip=false&time=1648510584380&filter=false&cmp=5&cookies=JSESSIONID=QJHS1XMmLAoRHbcqFnY55v9WUX044atvv-OgLuoF7rMfp8Zbdzof!1907289670; JSESSIONID=zuDQ6nNm_OnM3_5c2xGVE9OapqDns5yz28f3i7EulmWPMZM-yN4t!-331356933
        if (!skip){
            guangDongServiceImpl.updateSydw(cookies , time);
        }

        List<GdSydw2022> all = guangDongServiceImpl.sortAllSydw(cmp , filter);


        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (GdSydw2022 gov : all) {
            stringBuffer.append("<li>");
            stringBuffer.append(gov.showData());
            stringBuffer.append("</li>");
            stringBuffer.append("<br></br>");
        }
        stringBuffer.append("</ul>");

        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }
}
