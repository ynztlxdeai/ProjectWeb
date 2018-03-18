package com.luoxiang.project.service.impl;

import com.luoxiang.project.HttpClientUtil;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.BaomingqingkuangMapper;
import com.luoxiang.project.mapper.LastYearMapper;
import com.luoxiang.project.po.Baomingqingkuang;
import com.luoxiang.project.po.LastYear;
import com.luoxiang.project.service.GwyService;

import org.springframework.stereotype.Service;

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

@Service
public class GwyServiceImpl
        implements GwyService
{

    @Resource
    BaomingqingkuangMapper baomingqingkuangMapper;

    @Resource
    LastYearMapper lastYearMapper;

    @Override
    public HashMap<String, Baomingqingkuang> initMap() {
        List<Baomingqingkuang> baomingqingkuangs = baomingqingkuangMapper.selectAll();
        HashMap<String , Baomingqingkuang> hashMap = new HashMap<>(baomingqingkuangs.size());
        for(Baomingqingkuang bmqk : baomingqingkuangs){
            hashMap.put(bmqk.getJobcode() , bmqk);
        }

        return hashMap;
    }

    @Override
    public HashMap<String, LastYear> initMapLast() {
        List<LastYear> baomingqingkuangs = lastYearMapper.selectAll();
        HashMap<String , LastYear> hashMap = new HashMap<>(baomingqingkuangs.size());
        for(LastYear bmqk : baomingqingkuangs){
            hashMap.put(bmqk.getJobcode() , bmqk);
        }

        return hashMap;
    }

    @Override
    public CommBean update(String cookies) {
        HashMap<String, Baomingqingkuang> hashMap = initMap();
        CommBean commBean = new CommBean();
        try {
            HttpClientUtil.getData(cookies , hashMap , baomingqingkuangMapper);
            commBean.setCode(0);
            commBean.setMsg("Success");
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg("ERROR : " + e.getMessage());
        }
        return commBean;
    }

    @Override
    public CommBean updateLast(String cookies) {
        HashMap<String, LastYear> hashMap  = initMapLast();
        CommBean                  commBean = new CommBean();
        try {
            HttpClientUtil.getDataLast(cookies , hashMap , lastYearMapper);
            commBean.setCode(0);
            commBean.setMsg("Success");
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg("ERROR : " + e.getMessage());
        }
        return commBean;
    }
}
