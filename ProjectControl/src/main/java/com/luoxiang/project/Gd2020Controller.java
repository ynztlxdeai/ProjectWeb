package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.Gd2020Service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        Gd2020Controller
 * author:	            Luoxiang
 * time:	            2020/7/9	10:09
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/9
 * upDateDesc:	        TODO
 */

@Controller
@RequestMapping("gd_2020")
public class Gd2020Controller {

    @Resource
    Gd2020Service gd2020ServiceImpl;

    @RequestMapping("update")
    public @ResponseBody
    CommBean update(String cookies){
        //http://localhost:8080/gd_2020/update?cookies=JSESSIONID=YKMxbJid2CVZsWHEc1GaVQ4vWnMYjXXuQy2y934G5RbvZBGtTqUT!1577052419
        return gd2020ServiceImpl.update(cookies);
    }
}
