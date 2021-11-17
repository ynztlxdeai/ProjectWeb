package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiJiangSu;
import com.luoxiang.poi.PoiReader;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.JiangSu202002Mapper;
import com.luoxiang.project.mapper.JiangSu202002ShMapper;
import com.luoxiang.project.mapper.JiangSu2022Mapper;
import com.luoxiang.project.mapper.JiangSuMapper;
import com.luoxiang.project.po.JiangSu;
import com.luoxiang.project.po.JiangSu202002;
import com.luoxiang.project.po.JiangSu202002Sh;
import com.luoxiang.project.po.JiangSu2022;
import com.luoxiang.project.service.JiangSuService;

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

    @Resource
    JiangSu202002Mapper jiangSu202002Mapper;

    @Resource
    JiangSu202002ShMapper jiangSu202002ShMapper;

    @Resource
    JiangSu2022Mapper jiangSu2022Mapper;

    @Override
    public List<JiangSu> selectAll() {
        return jiangSuMapper.selectAll();
    }

    @Override
    public CommBean update() {
        List<JiangSu> list = jiangSuMapper.selectAll();
        HashMap<String , JiangSu> allMap = new HashMap<>(list.size());
        HashMap<String , Integer> result = new HashMap<>();
        for (JiangSu tmp : list){
            allMap.put(tmp.getJobCode() , tmp);
            result.put(tmp.getJobCode() , tmp.getHasNums());
        }
        CommBean commBean = new CommBean();
        try {
            List<String> listEx = PoiReader.checkHasNums(result);
            Iterator<Map.Entry<String, Integer>> iterator = result.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String, Integer> next = iterator.next();
                Integer                    value = next.getValue();
                String                     key  = next.getKey();
                JiangSu                    jiangSu = allMap.get(key);
                if (value == jiangSu.getHasNums()){
                    continue;
                }
                jiangSu.setHasNums(value);
                jiangSuMapper.updateByPrimaryKey(jiangSu);
            }
            commBean.setCode(jiangSuMapper.selectAll().size());
            commBean.setMsg("成功");
            commBean.setData(listEx);
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg(e.getMessage());
        }


        return commBean;
    }

    @Override
    public List<JiangSu202002> selectAll2() {
        return jiangSu202002Mapper.selectAll();
    }

    @Override
    public CommBean update2() {
        List<JiangSu202002> jiangSu202002s = selectAll2();
        CommBean commBean = new CommBean();
        try {
            HashMap<String , JiangSu202002> maps = new HashMap<>();
            for (JiangSu202002 j : jiangSu202002s){
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(j.getDiQuCode()).append(j.getUnitCode()).append(j.getJobCode());
                maps.put(stringBuffer.toString() , j);
            }

            PoiJiangSu.updateData(maps);
            Iterator<Map.Entry<String, JiangSu202002>> iterator = maps.entrySet().iterator();
            while (iterator.hasNext()){
                JiangSu202002 value = iterator.next().getValue();
                jiangSu202002Mapper.updateByPrimaryKey(value);
            }
            commBean.setCode(0);
        }catch (Exception e){
            commBean.setCode(-1);
            commBean.setMsg(e.getMessage());
        }
        return commBean;
    }

    @Override
    public CommBean update3() {
        List<JiangSu202002Sh> jiangSu202002s = selectAll3();
        CommBean commBean = new CommBean();
        try {
            HashMap<String , JiangSu202002Sh> maps = new HashMap<>();
            for (JiangSu202002Sh j : jiangSu202002s){
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(j.getDiQuCode()).append(j.getUnitCode()).append(j.getJobCode());
                maps.put(stringBuffer.toString() , j);
            }

            PoiJiangSu.updateData2(maps);
            Iterator<Map.Entry<String, JiangSu202002Sh>> iterator = maps.entrySet().iterator();
            while (iterator.hasNext()){
                JiangSu202002Sh value = iterator.next().getValue();
                jiangSu202002ShMapper.updateByPrimaryKey(value);
            }
            commBean.setCode(0);
        }catch (Exception e){
            commBean.setCode(-1);
            commBean.setMsg(e.getMessage());
        }
        return commBean;
    }

    @Override
    public List<JiangSu202002Sh> selectAll3() {
        return jiangSu202002ShMapper.selectAll();
    }






    @Override
    public List<JiangSu2022> selectAll2022() {
        return jiangSu2022Mapper.selectAll();
    }

    @Override
    public CommBean<T> update2022() {
        CommBean                       c       = new CommBean();
        List<JiangSu2022>             all     = selectAll2022();
        HashMap<String , JiangSu2022> hashMap = new HashMap<>(all.size());
        for (JiangSu2022 tmp : all){

            hashMap.put(tmp.getDiQuDaiMa() + tmp.getDanWeiDaiMa() + tmp.getZhiWeiDaiMa(), tmp);
        }
        try {
            PoiJiangSu.checkHasNums2022(hashMap);
            Iterator<Map.Entry<String , JiangSu2022>> iterat = hashMap.entrySet().iterator();
            JiangSu2022                               data   = null;
            while (iterat.hasNext()){
                data = iterat.next().getValue();
                if (data == null){
                    continue;
                }
                jiangSu2022Mapper.updateByPrimaryKey(data);
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
    public List<JiangSu2022> sortAll2022(int cmp, boolean filter) {
        List<JiangSu2022> all  = selectAll2022();
        if (filter){
            ArrayList<JiangSu2022> results = new ArrayList<>();
            for (JiangSu2022 t : all){
                if ((!t.getZhuanYe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<JiangSu2022> results = new ArrayList<>();
            for (JiangSu2022 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }
}
