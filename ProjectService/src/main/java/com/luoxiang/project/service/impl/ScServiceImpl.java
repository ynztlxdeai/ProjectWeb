package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiSC;
import com.luoxiang.poi.PoiSC02;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.Sc202001Mapper;
import com.luoxiang.project.mapper.SiChuan202101Mapper;
import com.luoxiang.project.mapper.SiChuan202102Mapper;
import com.luoxiang.project.po.Sc202001;
import com.luoxiang.project.po.SiChuan202101;
import com.luoxiang.project.po.SiChuan202102;
import com.luoxiang.project.service.ScService;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

@Service
public class ScServiceImpl
        implements ScService
{

    @Resource
    Sc202001Mapper sc202001Mapper;

    @Resource
    public SiChuan202101Mapper siChuan202101Mapper;

    @Resource
    public SiChuan202102Mapper siChuan202102Mapper;

    @Override
    public List<Sc202001> selectAll(){

        return sc202001Mapper.selectAll();
    }

    @Override
    public CommBean update(int limit){
        CommBean c = new CommBean();
        List<Sc202001> all = selectAll();
        HashMap<String , Sc202001> hashMap = new HashMap<>(all.size());
        for (Sc202001 tmp : all){
            hashMap.put(tmp.getJobCode() , tmp);
        }
        try {
            PoiSC.checkHasNums(hashMap);
            Iterator<Map.Entry<String , Sc202001>> iterat = hashMap.entrySet().iterator();
            Sc202001 sc202001 = null;
            while (iterat.hasNext()){
               sc202001 = iterat.next().getValue();
               if (sc202001 == null){
                   continue;
               }
               sc202001Mapper.updateByPrimaryKey(sc202001);
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
public List<SiChuan202101> selectAll202101() {
    return siChuan202101Mapper.selectAll();
}

    @Override
    public CommBean<T> update202101() {
        CommBean                       c       = new CommBean();
        List<SiChuan202101>             all     = selectAll202101();
        HashMap<String , SiChuan202101> hashMap = new HashMap<>(all.size());
        for (SiChuan202101 tmp : all){
            hashMap.put(tmp.getJobcode() , tmp);
        }
        try {
            PoiSC02.checkHasNums202101(hashMap);
            Iterator<Map.Entry<String , SiChuan202101>> iterat = hashMap.entrySet().iterator();
            SiChuan202101                               data   = null;
            while (iterat.hasNext()){
                data = iterat.next().getValue();
                if (data == null){
                    continue;
                }
                siChuan202101Mapper.updateByPrimaryKey(data);
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
    public List<SiChuan202101> sortAll202101(int cmp, boolean filter) {
        List<SiChuan202101> all  = selectAll202101();
        if (filter){
            ArrayList<SiChuan202101> results = new ArrayList<>();
            for (SiChuan202101 t : all){
                if ((!t.getZhuanye().contains("不限")) && t.getAllnums() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<SiChuan202101> results = new ArrayList<>();
            for (SiChuan202101 t : all){
                if (t.getAllnums() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }


    /**
     * 2021 02
     */

    @Override
    public List<SiChuan202102> selectAll202102() {
        return siChuan202102Mapper.selectAll();
    }

    @Override
    public CommBean<T> update202102() {
        CommBean                       c       = new CommBean();
        List<SiChuan202102>             all     = selectAll202102();
        HashMap<String , SiChuan202102> hashMap = new HashMap<>(all.size());
        for (SiChuan202102 tmp : all){
            hashMap.put(tmp.getJobCode() , tmp);
        }
        try {
            PoiSC02.checkHasNums202102(hashMap);
            Iterator<Map.Entry<String , SiChuan202102>> iterat = hashMap.entrySet().iterator();
            SiChuan202102                               data   = null;
            while (iterat.hasNext()){
                data = iterat.next().getValue();
                if (data == null){
                    continue;
                }
                siChuan202102Mapper.updateByPrimaryKey(data);
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
    public List<SiChuan202102> sortAll202102(int cmp, boolean filter) {
        List<SiChuan202102> all  = selectAll202102();
        if (filter){
            ArrayList<SiChuan202102> results = new ArrayList<>();
            for (SiChuan202102 t : all){
                if ((!t.getZhuanYe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<SiChuan202102> results = new ArrayList<>();
            for (SiChuan202102 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }
}
