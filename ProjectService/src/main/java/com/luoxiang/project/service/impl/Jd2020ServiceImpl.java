package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiWenZhi;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.Jd202001Mapper;
import com.luoxiang.project.po.Jd202001;
import com.luoxiang.project.service.Jd2020Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        Jd2020ServiceImpl
 * author:	            Luoxiang
 * time:	            2020/7/9	15:04
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/9
 * upDateDesc:	        TODO
 */

@Service
public  class Jd2020ServiceImpl implements Jd2020Service{

    @Resource
    Jd202001Mapper jd202001Mapper;

    @Override
    public CommBean update() {
        CommBean commBean = new CommBean();
        try {
            List<Jd202001> list = PoiWenZhi.checkHasNums(initMap());
            commBean.setCode(0);
            commBean.setData(list);
            commBean.setMsg("Success");
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg("ERROR : " + e.getMessage());
        }
        return commBean;
    }

    public HashMap<String, Jd202001> initMap() {
        List<Jd202001>           list    = jd202001Mapper.selectAll();
        HashMap<String , Jd202001> hashMap = new HashMap<>(list.size());
        for(Jd202001 gd : list){
            hashMap.put(gd.getJobCode() , gd);
        }
        return hashMap;
    }
}
