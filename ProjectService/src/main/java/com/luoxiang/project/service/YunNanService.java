package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.YunNan202101;
import com.luoxiang.project.po.YunNan2022;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        YunNanService
 * author:	            Luoxiang
 * time:	            2021/2/23	13:17
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/23
 * upDateDesc:	        TODO
 */


public interface YunNanService {
    List<YunNan202101> selectAll();

    CommBean<T> update();

    List<YunNan202101> sortAll(int cmp, boolean filter);

    CommBean<T> update2022();

    List<YunNan2022> sortAll2022(int cmp, boolean filter);
}
