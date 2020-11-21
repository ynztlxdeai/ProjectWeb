package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.SDGov;
import com.luoxiang.project.po.ShanDong202002;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        ShanDongService
 * author:	            Luoxiang
 * time:	            2020/5/8	15:13
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/5/8
 * upDateDesc:	        TODO
 */
public interface ShanDongService {
    List<SDGov> selectAll();

    List<ShanDong202002> selectAll2();

    List<ShanDong202002> sortAll(int mode);

    CommBean update(String cookies);

    CommBean<List<ShanDong202002>> update2();
}
