package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.ShanXi01;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        ShanXiService
 * author:	            Luoxiang
 * time:	            2021/1/30	20:37
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:	        TODO
 */


public interface ShanXiService {
    List<ShanXi01> selectAll();

    List<ShanXi01> sortAll(int cmp , boolean filter);

    CommBean<T> update();
}
