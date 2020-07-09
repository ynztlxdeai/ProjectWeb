package com.luoxiang.project;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.GxStatus;
import com.luoxiang.project.service.Gx2020Service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        Gx2020Controller
 * author:	            Luoxiang
 * time:	            2020/7/10	7:22
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/10
 * upDateDesc:	        TODO
 */
@Controller
@RequestMapping("gx_2020_01")
public class Gx2020Controller {
    @Resource
    Gx2020Service gx2020ServiceImpl;

    @RequestMapping("update")
    public @ResponseBody
    CommBean<HashMap<String , ArrayList<GxStatus>>> update(){
        return gx2020ServiceImpl.update();
    }

}
