package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiShanXi;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.ShanXi01Mapper;
import com.luoxiang.project.po.ShanXi01;
import com.luoxiang.project.service.ShanXiService;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        ShanXiServiceImpl
 * author:	            Luoxiang
 * time:	            2021/1/30	20:37
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/1/30
 * upDateDesc:	        TODO
 */

@Service
public class ShanXiServiceImpl implements ShanXiService{

    @Resource
    public ShanXi01Mapper shanXi01Mapper;

    @Override
    public List<ShanXi01> selectAll() {
        return shanXi01Mapper.selectAll();
    }

    @Override
    public List<ShanXi01> sortAll(int cmp, boolean filter) {
        List<ShanXi01> all = selectAll();
        if (filter){
            ArrayList<ShanXi01> results = new ArrayList<>();
            for (ShanXi01 t : all){
                if ((!t.getZhuanYe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<ShanXi01> results = new ArrayList<>();
            for (ShanXi01 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }

    @Override
    public CommBean<T> update() {
        CommBean commBean = new CommBean();
        try {
            List<ShanXi01> all = selectAll();
            HashMap<String , ShanXi01> jobs = new HashMap<>();
            for (ShanXi01 t : all){
                jobs.put(t.getUnitName() +"-" + t.getJob() , t);
            }
            PoiShanXi.updateData(jobs);
            Iterator<Map.Entry<String, ShanXi01>> iterator = jobs.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String, ShanXi01> next    = iterator.next();
                ShanXi01                    value   = next.getValue();
                shanXi01Mapper.updateByPrimaryKey(value);
            }
            commBean.setCode(0);
            commBean.setMsg("success");
        }catch (Exception e){
            commBean.setCode(-1);
            commBean.setMsg("error : " + e.getMessage());
        }
        return commBean;
    }


}
