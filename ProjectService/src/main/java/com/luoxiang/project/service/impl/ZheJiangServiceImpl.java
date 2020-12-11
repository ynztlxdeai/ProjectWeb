package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiZheJiang;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.bean.ZhejiangItem;
import com.luoxiang.project.mapper.ZheJiang02Mapper;
import com.luoxiang.project.mapper.ZheJiang2020Mapper;
import com.luoxiang.project.po.ZheJiang02;
import com.luoxiang.project.po.ZheJiang2020;
import com.luoxiang.project.service.ZheJiangService;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        ZheJiangServiceImpl
 * author:	            Luoxiang
 * time:	            2019/12/20	21:45
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/20
 * upDateDesc:	        TODO
 */

@Service
public class ZheJiangServiceImpl implements ZheJiangService {

    @Resource
    ZheJiang02Mapper zheJiang02Mapper;

    @Resource
    ZheJiang2020Mapper zheJiang2020Mapper;

    @Override
    public List<ZheJiang02> selectAll() {
        return zheJiang02Mapper.selectAll();
    }

    @Override
    public CommBean update(int limit) {
        List<ZheJiang02>          list = selectAll();
        HashMap<String , ZheJiang02> allMap    = new HashMap<>(list.size());
        HashMap<String , Integer> result    = new HashMap<>();
        for (ZheJiang02 tmp : list){
            allMap.put(tmp.getJobCode() , tmp);
            result.put(tmp.getJobCode() , tmp.getHasNums());
        }
        CommBean commBean = new CommBean();
        try {
            List<String>                         listEx   = PoiZheJiang.checkHasNums(result);
            Iterator<Map.Entry<String, Integer>> iterator = result.entrySet().iterator();
            List<ZhejiangItem> items = new ArrayList<>();
            while (iterator.hasNext()){
                Map.Entry<String, Integer> next = iterator.next();
                Integer                    value = next.getValue();
                String                     key  = next.getKey();

                ZheJiang02 zheJiang02 = allMap.get(key);

                if (value <= limit && zheJiang02.getZhuanYe().contains("电子信息工程")){
                    ZhejiangItem item = new ZhejiangItem();
                    item.hasNums = value;
                    item.jobCode = zheJiang02.getJobCode();
                    item.jobName = zheJiang02.getJobName();
                    item.needNums = zheJiang02.getZhaoKaoRenShu();
                    item.unitName = zheJiang02.getZhaoLuDanWei();
                    items.add(item);
                }
                if (value > zheJiang02.getHasNums()){
                    zheJiang02.setHasNums(value);
                    zheJiang02Mapper.updateByPrimaryKey(zheJiang02);
                }
            }
            commBean.setCode(zheJiang02Mapper.selectAll().size());
            commBean.setMsg("成功");


            commBean.setData(items);
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg(e.getMessage());
        }


        return commBean;
    }

    @Override
    public List<ZheJiang2020> selectAll2() {
        return zheJiang2020Mapper.selectAll();
    }

    @Override
    public CommBean<T> update2() {
        List<ZheJiang2020> zheJiang2020s = selectAll2();
        HashMap<String , ZheJiang2020> map = new HashMap<>(zheJiang2020s.size());
        for (ZheJiang2020 tmp : zheJiang2020s){
            map.put(tmp.getJobCode() , tmp);
        }
        CommBean<T> commBean = new CommBean<>();
        try {
            PoiZheJiang.check2020(map);
            Iterator<Map.Entry<String, ZheJiang2020>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                ZheJiang2020 value = iterator.next().getValue();
                zheJiang2020Mapper.updateByPrimaryKey(value);
            }
            commBean.setCode(0);
        } catch (Exception e) {
            e.printStackTrace();
            commBean.setCode(-1);
            commBean.setMsg(e.getMessage());
        }
        return commBean;
    }

    @Override
    public List<ZheJiang2020> sortAll(int cmp, boolean filter) {
        return null;
    }
}
