package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.service.GuangDongService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        GuangDongController
 * author:	            Luoxiang
 * time:	            2021/1/30	11:40
 * desc:
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:
 */

@Controller
@RequestMapping("guangdong")
public class GuangDongController {

    @Resource
    public GuangDongService guangDongServiceImpl;

    @RequestMapping("update")
    public @ResponseBody
    CommBean update(String cookies){
        //http://localhost:8080/gd_2020/update?cookies=JSESSIONID=YKMxbJid2CVZsWHEc1GaVQ4vWnMYjXXuQy2y934G5RbvZBGtTqUT!1577052419
        return guangDongServiceImpl.update(cookies);
    }
}
