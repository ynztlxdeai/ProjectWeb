package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.ZheJiang02;
import com.luoxiang.project.po.ZheJiang2020;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        ZheJiangService
 * author:	            Luoxiang
 * time:	            2019/12/20	21:28
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/20
 * upDateDesc:	        TODO
 */


public interface ZheJiangService {

    List<ZheJiang02> selectAll();

    CommBean update(int limit);


    List<ZheJiang2020> selectAll2();

    CommBean<T> update2();

    List<ZheJiang2020> sortAll(int cmp, boolean filter);
}
