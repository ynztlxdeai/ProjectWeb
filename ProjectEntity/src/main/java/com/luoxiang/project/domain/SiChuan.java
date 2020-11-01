package com.luoxiang.project.domain;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.domain
 * className:	        SiChuan
 * author:	            Luoxiang
 * time:	            2020/10/30	18:50
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/30
 * upDateDesc:	        TODO
 */


public class SiChuan implements Comparable<SiChuan>{
    public String jobCode;
    public String hasing = "";
    public int lastNum;
    public int needNum;
    public String jobName;
    public String unitName;


    @Override
    public int compareTo(SiChuan o) {
        return lastNum - o.lastNum;
    }

    @Override
    public String toString() {
        return String.format("单位名称：%s , 职位名称：%s , 现有人数：%d ,变化趋势：%s", unitName , jobCode , lastNum , hasing);
    }
}
