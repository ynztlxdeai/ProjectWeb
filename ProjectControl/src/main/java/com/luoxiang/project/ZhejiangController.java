package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.ZheJiangService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        ZhejiangController
 * author:	            Luoxiang
 * time:	            2019/12/20	22:05
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/20
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("zhejiang")
public class ZhejiangController {
    @Resource
    public ZheJiangService zheJiangServiceImpl;


    @RequestMapping("update")
    public @ResponseBody
    CommBean update(int limit){
        return zheJiangServiceImpl.update(limit);
    }
}
