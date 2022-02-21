package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiHuBei;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.HuBei202101Mapper;
import com.luoxiang.project.mapper.HuBei202201Mapper;
import com.luoxiang.project.po.HuBei202101;
import com.luoxiang.project.po.HuBei202201;
import com.luoxiang.project.service.HuBeiService;

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
 * className:	        HuBeiServiceImpl
 * author:	            Luoxiang
 * time:	            2021/2/20	18:25
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/20
 * upDateDesc:	        TODO
 */

@Service
public class HuBeiServiceImpl implements HuBeiService {

    @Resource
    public HuBei202101Mapper huBei202101Mapper;

    @Resource
    public HuBei202201Mapper huBei202201Mapper;

    @Override
    public List<HuBei202101> selectAll() {
        return huBei202101Mapper.selectAll();
    }

    @Override
    public CommBean<T> update() {
        CommBean                   c       = new CommBean();
        List<HuBei202101>             all     = selectAll();
        HashMap<String , HuBei202101> hashMap = new HashMap<>(all.size());
        for (HuBei202101 tmp : all){
            hashMap.put(tmp.getJobCode() , tmp);
        }
        try {
            PoiHuBei.checkHasNums(hashMap);
            Iterator<Map.Entry<String , HuBei202101>> iterat   = hashMap.entrySet().iterator();
            HuBei202101                               data = null;
            while (iterat.hasNext()){
                data = iterat.next().getValue();
                if (data == null){
                    continue;
                }
                huBei202101Mapper.updateByPrimaryKey(data);
            }
            c.setCode(0);
            c.setMsg("finish");
        }catch (Exception e){
            c.setMsg(e.toString());
            c.setCode(-1);
        }

        return c;
    }

    @Override
    public List<HuBei202101> sortAll(int cmp, boolean filter) {
        List<HuBei202101> all  = selectAll();
        if (filter){
            ArrayList<HuBei202101> results = new ArrayList<>();
            for (HuBei202101 t : all){
                if ((!t.getZhuanYe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<HuBei202101> results = new ArrayList<>();
            for (HuBei202101 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }

    @Override
    public CommBean update2022() {
        CommBean                        c       = new CommBean();
        List<HuBei202201>             all     = huBei202201Mapper.selectAll();
        HashMap<String , HuBei202201> hashMap = new HashMap<>(all.size());
        for (HuBei202201 tmp : all){
            hashMap.put(tmp.getJobCode() , tmp);
        }
        try {
            PoiHuBei.checkHasNums2022(hashMap);
            Iterator<Map.Entry<String , HuBei202201>> iterat = hashMap.entrySet().iterator();
            HuBei202201                               data   = null;
            while (iterat.hasNext()){
                data = iterat.next().getValue();
                if (data == null){
                    continue;
                }
                huBei202201Mapper.updateByPrimaryKey(data);
            }
            c.setCode(0);
            c.setMsg("finish");
        }catch (Exception e){
            c.setMsg(e.toString());
            c.setCode(-1);
        }

        return c;
    }

    @Override
    public List<HuBei202201> sortAll2022(int cmp, boolean filter) {
        List<HuBei202201> all = huBei202201Mapper.selectAll();
        if (filter){
            ArrayList<HuBei202201> results = new ArrayList<>();
            for (HuBei202201 t : all){
                if ((!t.getZhuanYe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<HuBei202201> results = new ArrayList<>();
            for (HuBei202201 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }
}
