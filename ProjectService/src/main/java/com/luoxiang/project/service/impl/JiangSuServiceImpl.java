package com.luoxiang.project.service.impl;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.JiangSuMapper;
import com.luoxiang.project.po.JiangSu;
import com.luoxiang.project.service.JiangSuService;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        JiangSuImpl
 * author:	            Luoxiang
 * time:	            2019/10/28	13:18
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/10/28
 * upDateDesc:	        TODO
 */

@Service
public class JiangSuServiceImpl
        implements JiangSuService{

    @Resource
    JiangSuMapper jiangSuMapper;

    @Override
    public List<JiangSu> selectAll() {
        return jiangSuMapper.selectAll();
    }

    @Override
    public CommBean update() {

        CommBean commBean = new CommBean();
        commBean.setCode(jiangSuMapper.selectAll().size());
        commBean.setMsg("成功");

        return commBean;
    }
}
