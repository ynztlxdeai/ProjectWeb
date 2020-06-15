package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.ScService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        Gov2020Controller
 * author:	            Luoxiang
 * time:	            2020/6/14	10:23
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/6/14
 * upDateDesc:	        TODO
 */
@Controller
@RequestMapping("gov2020")
public class Gov2020Controller {
    @Resource
    public ScService scServiceImpl;

    @RequestMapping("update")
    public @ResponseBody
    CommBean update(){
        return scServiceImpl.update(0);
    }
}
