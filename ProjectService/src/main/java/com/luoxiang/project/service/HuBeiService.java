package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.HuBei202101;
import com.luoxiang.project.po.HuBei202201;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        HuBeiService
 * author:	            Luoxiang
 * time:	            2021/2/20	18:24
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/20
 * upDateDesc:	        TODO
 */


public interface HuBeiService {
    List<HuBei202101> selectAll();

    CommBean<T> update();

    List<HuBei202101> sortAll(int cmp, boolean filter);

    CommBean update2022();

    List<HuBei202201> sortAll2022(int cmp, boolean filter);
}
