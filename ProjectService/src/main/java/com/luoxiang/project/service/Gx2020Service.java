package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.GxStatus;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        Gx2020Service
 * author:	            Luoxiang
 * time:	            2020/7/10	7:03
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/10
 * upDateDesc:	        TODO
 */


public interface Gx2020Service {
    CommBean<HashMap<String , ArrayList<GxStatus>>> update();
}
