package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.ShanDongService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
