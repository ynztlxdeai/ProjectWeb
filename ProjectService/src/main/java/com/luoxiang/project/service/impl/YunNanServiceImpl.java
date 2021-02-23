package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiYunNan;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.YunNan202101Mapper;
import com.luoxiang.project.po.YunNan202101;
import com.luoxiang.project.service.YunNanService;

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
 * className:	        YunNanServiceImpl
 * author:	            Luoxiang
 * time:	            2021/2/23	13:18
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/2/23
 * upDateDesc:	        TODO
 */

@Service
public class YunNanServiceImpl implements YunNanService {

    @Resource
    public YunNan202101Mapper yunNan202101Mapper;

    @Override
    public List<YunNan202101> selectAll() {
        return yunNan202101Mapper.selectAll();
    }

    @Override
    public CommBean<T> update() {
        CommBean                      c       = new CommBean();
        List<YunNan202101>             all     = selectAll();
        HashMap<String , YunNan202101> hashMap = new HashMap<>(all.size());
        for (YunNan202101 tmp : all){
            hashMap.put(tmp.getJobCode() , tmp);
        }
        try {
            PoiYunNan.checkHasNums2021(hashMap);
            Iterator<Map.Entry<String , YunNan202101>> iterat = hashMap.entrySet().iterator();
            YunNan202101                               data   = null;
            while (iterat.hasNext()){
                data = iterat.next().getValue();
                if (data == null){
                    continue;
                }
                yunNan202101Mapper.updateByPrimaryKey(data);
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
    public List<YunNan202101> sortAll(int cmp, boolean filter) {
        List<YunNan202101> all  = selectAll();
        if (filter){
            ArrayList<YunNan202101> results = new ArrayList<>();
            for (YunNan202101 t : all){
                if ((!t.getZhuanYe().contains("不限")) && t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }else {
            ArrayList<YunNan202101> results = new ArrayList<>();
            for (YunNan202101 t : all){
                if (t.getAllNum() <= cmp){
                    results.add(t);
                }
            }
            Collections.sort(results);
            return results;
        }
    }
}
