package com.luoxiang.project.bean;

import java.io.Serializable;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.bean
 * className:	        MianYang202101
 * author:	            Luoxiang
 * time:	            2021/4/17	10:54
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2021/4/17
 * upDateDesc:	        TODO
 */
public class MianYang202101 implements Serializable , Comparable<MianYang202101>{

    public String unitName;
    public String jobCode;
    public String zhuanYe;
    public int needNum;
    public int allNum = 0;
    public String ingNum = "";

    public String showData() {
        return   String.format("单位名称：%s ,  需要人数：%s , 现有人数：%d ,变化趋势：%s , 职位代码：%s  <br></br> 专业：%s", unitName  ,needNum , allNum , ingNum  ,jobCode ,  zhuanYe);
    }

    @Override
    public int compareTo(MianYang202101 o) {
        int firstNum = this.needNum;
        int secondNum = o.needNum;
        if (firstNum == secondNum){
            return this.allNum - o.allNum;
        }
        int firstI = this.allNum / firstNum ;
        int secondI = o.allNum / secondNum;

        return firstI == secondI ? this.allNum % firstNum - o.allNum % secondNum : firstI - secondI;
    }
}