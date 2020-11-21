package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.ShanDong202002;
import com.luoxiang.project.po.ShanDong202002Sh;
import com.luoxiang.project.service.ShanDongService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        ShandongController
 * author:	            Luoxiang
 * time:	            2020/5/8	14:00
 * desc:
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/5/8
 * upDateDesc:
 */

@Controller
@RequestMapping("shandong")
public class ShandongController {

    @Resource
    public ShanDongService shanDongServiceImpl;

    @RequestMapping("refresh")
    public @ResponseBody
    CommBean update(String cookies){

        return shanDongServiceImpl.update(cookies);
    }

    @RequestMapping("refresh_sd_202002")
    public String refreshSd202002(Model model , boolean skip , int cmp , boolean filter){
        try {
            if (!skip){
                shanDongServiceImpl.update2();
            }
            List<ShanDong202002> result = shanDongServiceImpl.sortAll(cmp , filter);


            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<ul>");
            Iterator<ShanDong202002> iterator = result.iterator();
            while (iterator.hasNext()){
                ShanDong202002 value = iterator.next();
                stringBuffer.append("<li>");
                stringBuffer.append(value.toString());
                stringBuffer.append("</li>");
            }
            stringBuffer.append("</ul>");
            model.addAttribute("comm_data" , stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("comm_data" , e.getMessage());
        }
        return "comm";
    }

    @RequestMapping("refresh_sd_202002_sh")
    public String refreshSd202002Sh(Model model , boolean skip , int cmp , boolean filter){
        try {
            if (!skip){
                shanDongServiceImpl.update3();
            }
            List<ShanDong202002Sh> result = shanDongServiceImpl.sortAll2(cmp , filter);


            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<ul>");
            Iterator<ShanDong202002Sh> iterator = result.iterator();
            while (iterator.hasNext()){
                ShanDong202002Sh value = iterator.next();
                stringBuffer.append("<li>");
                stringBuffer.append(value.toString());
                stringBuffer.append("</li>");
            }
            stringBuffer.append("</ul>");
            model.addAttribute("comm_data" , stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("comm_data" , e.getMessage());
        }
        return "comm";
    }
}
