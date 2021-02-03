package com.luoxiang.project;

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
        //http://localhost:8080/gd_2020/update?cookies=JSESSIONID=YKMxbJid2CVZsWHEc1GaVQ4vWnMYjXXuQy2y934G5RbvZBGtTqUT!1577052419
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
}
