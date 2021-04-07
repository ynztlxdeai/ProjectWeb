package com.luoxiang.project.service.impl;

import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.Jd2021Mapper;
import com.luoxiang.project.po.Jd2021;
import com.luoxiang.project.service.ArmyService;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        ArmyServiceImpl
 * author:	            Luoxiang
 * time:	            2021/4/7	11:41
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/4/7
 * upDateDesc:	        TODO
 */

@Service
public class ArmyServiceImpl implements ArmyService{

    @Resource
    public Jd2021Mapper jd2021Mapper;

    @Override
    public CommBean<T> update2021() {
        return null;
    }

    @Override
    public List<Jd2021> selectAll2021() {
        return jd2021Mapper.selectAll();
    }

    @Override
    public List<Jd2021> sortAll2021(int cmp) {
        List<Jd2021> all = selectAll2021();

        ArrayList<Jd2021> results = new ArrayList<>();
        for (Jd2021 t : all){
            if (t.getHasNum() <= cmp){
                results.add(t);
            }
        }
        Collections.sort(results);
        return results;
    }


}
