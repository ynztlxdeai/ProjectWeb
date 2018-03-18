package com.luoxiang.project.service.impl;

import com.luoxiang.project.mapper.BaomingqingkuangMapper;
import com.luoxiang.project.po.Baomingqingkuang;
import com.luoxiang.project.service.GwyService;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    ProjectWeb
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        GwyServiceImpl
 * author:	            Luoxiang
 * time:	            2018/3/18	8:54
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2018/3/18
 * upDateDesc:	        TODO
 */


public class GwyServiceImpl
        implements GwyService
{

    @Resource
    BaomingqingkuangMapper baomingqingkuangMapper;

    @Override
    public HashMap<String, Baomingqingkuang> initMap() {
        List<Baomingqingkuang> baomingqingkuangs = baomingqingkuangMapper.selectAll();
        HashMap<String , Baomingqingkuang> hashMap = new HashMap<>(baomingqingkuangs.size());
        for(Baomingqingkuang bmqk : baomingqingkuangs){
            hashMap.put(bmqk.getJobcode() , bmqk);
        }

        return hashMap;
    }
}
