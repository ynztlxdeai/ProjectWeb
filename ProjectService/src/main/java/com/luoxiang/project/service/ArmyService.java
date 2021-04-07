package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.Jd2021;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        ArmyService
 * author:	            Luoxiang
 * time:	            2021/4/7	11:29
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/4/7
 * upDateDesc:	        TODO
 */


public interface ArmyService {
    CommBean<T> update2021();

    List<Jd2021> selectAll2021();

    List<Jd2021> sortAll2021(int cmp);
}
