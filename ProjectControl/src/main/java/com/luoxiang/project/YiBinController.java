package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.impl.YiBinServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String updateJsp(Model model){

        return "yi_bin";
    }
}
