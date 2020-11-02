package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.SiChuan202002;

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
public interface SiChuan202002Service {

    List<SiChuan202002> selectAll();

    CommBean update(int limit);
}
