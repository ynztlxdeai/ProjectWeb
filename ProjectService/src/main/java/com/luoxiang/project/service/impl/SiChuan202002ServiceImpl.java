package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiSC02;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.SiChuan202002Mapper;
import com.luoxiang.project.po.SiChuan202002;
import com.luoxiang.project.service.SiChuan202002Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        SiChuan202002ServiceImpl
 * author:	            Luoxiang
 * time:	            2020/11/2	9:33
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/2
 * upDateDesc:	        TODO
 */


@Service
public class SiChuan202002ServiceImpl implements SiChuan202002Service {

    @Resource
    public SiChuan202002Mapper siChuan202002Mapper;

    @Override
    public List<SiChuan202002> selectAll() {
        return siChuan202002Mapper.selectAll();
    }

    @Override
    public CommBean update(int limit) {
        CommBean                   c       = new CommBean();
        List<SiChuan202002>             all     = selectAll();
        HashMap<String , SiChuan202002> hashMap = new HashMap<>(all.size());
        for (SiChuan202002 tmp : all){
            hashMap.put(tmp.getJobcode() , tmp);
        }
        try {
            PoiSC02.checkHasNums2(hashMap);
            Iterator<Map.Entry<String , SiChuan202002>> iterat   = hashMap.entrySet().iterator();
            SiChuan202002                               sc202001 = null;
            while (iterat.hasNext()){
                sc202001 = iterat.next().getValue();
                if (sc202001 == null){
                    continue;
                }
                siChuan202002Mapper.updateByPrimaryKey(sc202001);
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
