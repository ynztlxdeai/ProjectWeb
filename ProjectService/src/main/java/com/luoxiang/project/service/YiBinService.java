package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.YiBin202002;
import com.luoxiang.project.po.YiBin202101;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        YiBinService
 * author:	            Luoxiang
 * time:	            2020/10/26	12:24
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/26
 * upDateDesc:	        TODO
 */


public interface YiBinService {
    List<YiBin202002> selectAll();

    CommBean update();

    List<YiBin202101> sortAll202101(int cmp , boolean filter);

    CommBean<T> update202101();
}
