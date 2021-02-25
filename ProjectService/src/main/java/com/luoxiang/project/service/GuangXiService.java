package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.GuangXi202101;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        GuangXiService
 * author:	            Luoxiang
 * time:	            2021/2/25	13:33
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/25
 * upDateDesc:	        TODO
 */


public interface GuangXiService {
    CommBean<T> update202101();
    List<GuangXi202101> selectAll202101();
    List<GuangXi202101> sortAll202101(int cmp, boolean filter);


}
