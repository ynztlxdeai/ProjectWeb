package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiYiBin;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.YiBin202002Mapper;
import com.luoxiang.project.po.YiBin202002;
import com.luoxiang.project.service.YiBinService;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        YiBinServiceImpl
 * author:	            Luoxiang
 * time:	            2020/10/26	12:24
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/26
 * upDateDesc:	        TODO
 */

@Service
public class YiBinServiceImpl implements YiBinService {
    @Resource
    YiBin202002Mapper yiBin202002Mapper;


    @Override
    public List<YiBin202002> selectAll() {
        return yiBin202002Mapper.selectAll();
    }

    @Override
    public CommBean update() {
        CommBean commBean = new CommBean();
        List<YiBin202002> yiBin202002s = selectAll();
        HashMap<String,YiBin202002> map = new HashMap<>();
        for (YiBin202002 y : yiBin202002s){
            map.put(y.getJobCode() , y);
        }
        try {
            PoiYiBin.checkHasNums2(map);
            Iterator<Map.Entry<String, YiBin202002>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                YiBin202002 value = iterator.next().getValue();
                yiBin202002Mapper.updateByPrimaryKey(value);
            }
            commBean.setCode(0);
            commBean.setMsg("success");
        } catch (Exception e) {
            commBean.setCode(-1);
            commBean.setMsg(e.getMessage());
            e.printStackTrace();
        }

        return commBean;
    }
}
