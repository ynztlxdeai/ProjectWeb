package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiGX;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.GuangXi202101Mapper;
import com.luoxiang.project.po.GuangXi202101;
import com.luoxiang.project.service.GuangXiService;

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
 * className:	        GuangXiServiceImpl
 * author:	            Luoxiang
 * time:	            2021/2/25	13:34
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/25
 * upDateDesc:	        TODO
 */


@Service
public class GuangXiServiceImpl implements GuangXiService{
    
    @Resource
    public GuangXi202101Mapper guangXi202101Mapper;
    
    @Override
    public CommBean<T> update202101() {
        CommBean                        c       = new CommBean();
        List<GuangXi202101>             all     = selectAll202101();
        HashMap<String , GuangXi202101> hashMap = new HashMap<>(all.size());
        for (GuangXi202101 tmp : all){
            hashMap.put(tmp.getJobCode() , tmp);
        }
        try {
            PoiGX.checkHasNums202101(hashMap);
            Iterator<Map.Entry<String , GuangXi202101>> iterat = hashMap.entrySet().iterator();
            GuangXi202101                               data   = null;
            while (iterat.hasNext()){
                data = iterat.next().getValue();
                if (data == null){
                    continue;
                }
                guangXi202101Mapper.updateByPrimaryKey(data);
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
    public List<GuangXi202101> selectAll202101() {
        return guangXi202101Mapper.selectAll();
    }

    @Override
    public List<GuangXi202101> sortAll202101(int cmp, boolean filter) {
        List<GuangXi202101> all  = selectAll202101();
        if (filter){
            ArrayList<GuangXi202101> results = new ArrayList<>();
            for (GuangXi202101 t : all){
                if ((!t.getZhuanYe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<GuangXi202101> results = new ArrayList<>();
            for (GuangXi202101 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }
}
