package com.luoxiang.project;

import com.luoxiang.project.po.ShanXi01;
import com.luoxiang.project.service.ShanXiService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        ShanXiController
 * author:	            Luoxiang
 * time:	            2021/1/30	20:31
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("shanxi")
public class ShanXiController {

    @Resource
    public ShanXiService shanXiServiceImpl;


    @RequestMapping("update")
    public String update(Model model , int cmp , boolean filter , boolean skip){
        if (!skip){
            shanXiServiceImpl.update();
        }

        List<ShanXi01> all = shanXiServiceImpl.sortAll(cmp , filter);


        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        for (ShanXi01 gov : all) {
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
