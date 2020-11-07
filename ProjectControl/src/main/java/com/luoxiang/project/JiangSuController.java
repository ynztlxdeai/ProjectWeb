package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.JiangSu202002;
import com.luoxiang.project.po.JiangSu202002Sh;
import com.luoxiang.project.service.JiangSuService;

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
 * className:	        JiangSuController
 * author:	            Luoxiang
 * time:	            2019/10/28	13:16
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/10/28
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("jiangsu")
public class JiangSuController {

    @Resource
    public JiangSuService jiangSuServiceImpl;


    @RequestMapping("update")
    public @ResponseBody
    CommBean update(){
        return jiangSuServiceImpl.update();
    }

    @RequestMapping("update202002")
    public String update202002(Model model , int option , int filter , boolean skip){
        if (!skip){
            jiangSuServiceImpl.update2();
        }
        List<JiangSu202002> list = new ArrayList<>();
        List<JiangSu202002> tmp = jiangSuServiceImpl.selectAll2();
        for (JiangSu202002 j : tmp){
            if (j.getAllNum() / Integer.parseInt(j.getNeedNum()) <= filter){
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

            for (JiangSu202002 j : list) {
                if (j.getZhuanYe().contains("电子信息")){
                    stringBuffer.append("<li>");
                    stringBuffer.append(j.showData());
                    stringBuffer.append("</li>");
                    stringBuffer.append("<br></br>");
                }
            }

        }else if (option == 2){
            for (JiangSu202002 j : list) {
                if (j.getZhuanYe().contains("不限")){
                    stringBuffer.append("<li>");
                    stringBuffer.append(j.showData());
                    stringBuffer.append("</li>");
                    stringBuffer.append("<br></br>");
                }
            }
        }else if (option == 3){
            for (JiangSu202002 j : list) {
                String name = j.getUnitName();
                if (name.contains("公安") || name.contains("监狱") || name.contains("戒毒") ){
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


    @RequestMapping("update202002sh")
    public String update202002Sh(Model model , int option , int filter , boolean skip){
        if (!skip){
            jiangSuServiceImpl.update3();
        }
        List<JiangSu202002Sh> list = new ArrayList<>();
        List<JiangSu202002Sh>   tmp  = jiangSuServiceImpl.selectAll3();
        for (JiangSu202002Sh j : tmp){
            if (j.getAllNum() / Integer.parseInt(j.getNeedNum()) <= filter){
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

            for (JiangSu202002Sh j : list) {
                if (j.getZhuanYe().contains("电子信息")){
                    stringBuffer.append("<li>");
                    stringBuffer.append(j.showData());
                    stringBuffer.append("</li>");
                    stringBuffer.append("<br></br>");
                }
            }

        }else if (option == 2){
            for (JiangSu202002Sh j : list) {
                if (j.getZhuanYe().contains("不限")){
                    stringBuffer.append("<li>");
                    stringBuffer.append(j.showData());
                    stringBuffer.append("</li>");
                    stringBuffer.append("<br></br>");
                }
            }
        }else if (option == 3){
            for (JiangSu202002Sh j : list) {
                String name = j.getUnitName();
                if (name.contains("公安") || name.contains("监狱") || name.contains("戒毒") ){
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
