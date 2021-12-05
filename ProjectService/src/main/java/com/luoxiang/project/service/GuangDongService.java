package com.luoxiang.project.service;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.po.GuangDong01;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service
 * className:	        GuangDongService
 * author:	            Luoxiang
 * time:	            2021/1/30	11:49
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:	        TODO
 */


public interface GuangDongService {

    List<GuangDong01> selectAll();

    CommBean<T> update(String cookies, String time);

    List<GuangDong01> sortAll(int cmp, boolean filter);

    List<GuangDong01> checkZero(String cookies, String time)
            throws Exception;
}
