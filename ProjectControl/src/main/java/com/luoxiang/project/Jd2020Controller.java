package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.Jd2020Service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
