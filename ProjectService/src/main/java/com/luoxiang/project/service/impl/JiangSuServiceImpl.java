package com.luoxiang.project.service.impl;

import com.luoxiang.poi.PoiReader;
import com.luoxiang.project.bean.CommBean;
import com.luoxiang.project.mapper.JiangSuMapper;
import com.luoxiang.project.po.JiangSu;
import com.luoxiang.project.service.JiangSuService;

import org.springframework.stereotype.Service;

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
}
