package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiGX;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.GxStatus;
import com.luoxiang.project.mapper.Gx202001Mapper;
import com.luoxiang.project.po.Gx202001;
import com.luoxiang.project.service.Gx2020Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        Gx2020ServiceImpl
 * author:	            Luoxiang
 * time:	            2020/7/10	7:04
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/10
 * upDateDesc:	        TODO
 */

@Service
public class Gx2020ServiceImpl implements Gx2020Service {


    @Resource
    public Gx202001Mapper gx202001Mapper;

    public HashMap<String, Gx202001> initMap() {
        List<Gx202001> list = gx202001Mapper.selectAll();
        HashMap<String , Gx202001> hashMap = new HashMap<>(list.size());
        for(Gx202001 gd : list){
            hashMap.put(gd.getJobCode() , gd);
        }
        return hashMap;
    }


    @Override
    public CommBean<HashMap<String , ArrayList<GxStatus>>> update() {
        CommBean<HashMap<String , ArrayList<GxStatus>>> commBean = new CommBean<HashMap<String , ArrayList<GxStatus>>>();
        try {
            HashMap<String , ArrayList<GxStatus>> resultMap = PoiGX.checkHasNums(initMap());
            commBean.setData(resultMap);
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
