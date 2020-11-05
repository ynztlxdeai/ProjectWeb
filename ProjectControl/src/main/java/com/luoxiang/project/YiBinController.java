package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.YiBin202002;
import com.luoxiang.project.service.impl.YiBinServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        YiBinController
 * author:	            Luoxiang
 * time:	            2020/10/26	12:20
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/26
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("yibin")
public class YiBinController {

    @Resource
    YiBinServiceImpl yiBinServiceImpl;

    @RequestMapping("update2020_02")
    public @ResponseBody
    CommBean update2020_02(){
        return null;
    }

    @RequestMapping("updateJsp")
    public String updateJsp(Model model, int option , int filter , boolean skip){
        if (!skip){
            yiBinServiceImpl.update();
        }
        List<YiBin202002>   list = new ArrayList<>();
        List<YiBin202002> tmp  = yiBinServiceImpl.selectAll();
        for (YiBin202002 j : tmp){
            if (j.getAllNum() <= filter){
                list.add(j);
            }
        }
        Collections.sort(list);
        StringBuffer            stringBuffer = new StringBuffer();
        stringBuffer.append("<ul>");
        if (option == 0){

            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append("<li>");
                stringBuffer.append(list.get(i).showData());
                stringBuffer.append("</li>");
                stringBuffer.append("<br></br>");
            }

        }else if (option == 1){

            for (YiBin202002 j : list) {
                if (j.getZhuanYe().contains("电子信息")){
                    stringBuffer.append("<li>");
                    stringBuffer.append(j.showData());
                    stringBuffer.append("</li>");
                    stringBuffer.append("<br></br>");
                }
            }

        }else if (option == 2){
            for (YiBin202002 j : list) {
                if (j.getZhuanYe().contains("不限")){
                    stringBuffer.append("<li>");
                    stringBuffer.append(j.showData());
                    stringBuffer.append("</li>");
                    stringBuffer.append("<br></br>");
                }
            }
        }
        stringBuffer.append("</ul>");
        model.addAttribute("comm_data" , stringBuffer.toString());
        return "comm";
    }
}
