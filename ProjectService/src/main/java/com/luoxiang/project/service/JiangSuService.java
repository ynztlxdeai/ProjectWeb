package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.JiangSu;
import com.luoxiang.project.po.JiangSu202002;

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
}
