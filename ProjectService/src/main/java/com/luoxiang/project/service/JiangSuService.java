package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.JiangSu;
import com.luoxiang.project.po.JiangSu202002;
import com.luoxiang.project.po.JiangSu202002Sh;
import com.luoxiang.project.po.JiangSu2022;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        JiangSuService
 * author:	            Luoxiang
 * time:	            2019/10/28	13:17
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/10/28
 * upDateDesc:	        TODO
 */


public interface JiangSuService {
    List<JiangSu> selectAll();

    CommBean update();

    List<JiangSu202002> selectAll2();

    CommBean update2();

    CommBean update3();

    List<JiangSu202002Sh> selectAll3();




    List<JiangSu2022> selectAll2022();

    CommBean<T> update2022();

    List<JiangSu2022> sortAll2022(int cmp, boolean filter);

}
