package com.luoxiang.project;

import com.luoxiang.project.po.JiangSu;
import com.luoxiang.project.service.JiangSuService;
import com.luoxiang.project.service.impl.JiangSuServiceImpl;

import java.util.List;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project
 * className:	        Test
 * author:	            Luoxiang
 * time:	            2019/10/28	13:32
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/10/28
 * upDateDesc:	        TODO
 */


public class Test {
    public static void main(String[] args){
        JiangSuService jiangSuService = new JiangSuServiceImpl();
        List<JiangSu>  jiangSus       = jiangSuService.selectAll();
        for (int i = 0; i < jiangSus.size(); i++) {
            System.out.println(jiangSus.get(i).getJobCode());
        }
    }
}
