package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.Baomingqingkuang;
import com.luoxiang.project.po.LastYear;

import java.util.HashMap;

/**
 * projectName: 	    ProjectWeb
 * packageName:	        com.luoxiang.project.service
 * className:	        GwyService
 * author:	            Luoxiang
 * time:	            2018/3/18	8:51
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2018/3/18
 * upDateDesc:	        TODO
 */


public interface GwyService {
    HashMap<String , Baomingqingkuang> initMap();

    public HashMap<String, LastYear> initMapLast();

    CommBean update(String cookies);

    CommBean updateLast(String cookies);
}
