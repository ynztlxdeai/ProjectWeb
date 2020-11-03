package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.JiangSuService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String update202002(Model model){
        CommBean commBean = jiangSuServiceImpl.update2();

        return "comm";
    }
}
