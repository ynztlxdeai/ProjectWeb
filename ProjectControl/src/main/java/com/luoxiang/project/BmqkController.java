package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.GwyService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * projectName: 	    ProjectWeb
 * packageName:	        com.luoxiang.project
 * className:	        BmqkController
 * author:	            Luoxiang
 * time:	            2018/3/18	9:31
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2018/3/18
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("start")
public class BmqkController {
    @Resource
    public GwyService gwyServiceImpl;


    @RequestMapping("update")
    public @ResponseBody
    CommBean update(String cookies){
        return gwyServiceImpl.update(cookies);
    }

    @RequestMapping("updateLast")
    public @ResponseBody
    CommBean updateLast(String cookies){
        //http://localhost:8080/start/updateLast?cookies=JSESSIONID=_BQ3VPkugH89P2UNlm-pjOEB0aSw8EHFYtV1nY_D0JQ_yMYYICNx!-1501360179
        return gwyServiceImpl.updateLast(cookies);
    }


}
