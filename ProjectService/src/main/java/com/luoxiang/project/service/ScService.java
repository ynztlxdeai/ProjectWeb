package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.Sc202001;
import com.luoxiang.project.po.SiChuan202101;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        ScService
 * author:	            Luoxiang
 * time:	            2020/6/14	9:50
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/6/14
 * upDateDesc:	        TODO
 */
public interface ScService {
    List<Sc202001> selectAll();

    CommBean update(int limit);

    List<SiChuan202101> selectAll202101();

    CommBean<T> update202101();

    List<SiChuan202101> sortAll202101(int cmp, boolean filter);
}
