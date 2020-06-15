package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiSC;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.Sc202001Mapper;
import com.luoxiang.project.po.Sc202001;
import com.luoxiang.project.service.ScService;

import org.springframework.stereotype.Service;

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
}
