package com.luoxiang.project.domain;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.domain
 * className:	        ShenZheng2020
 * author:	            Luoxiang
 * time:	            2020/11/15	22:19
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/15
 * upDateDesc:	        TODO
 */


public class ShenZheng2020 implements Comparable<ShenZheng2020>{
    public String jobCode;
    public int needNums;
    public int currentNums;
    public String hasing;
    public String jobName;
    public String firstUnit;
    public String secondUnit;

    @Override
    public String toString() {
        return String.format("职位名称：%s , 职位代码： %s ,  上级单位：%s , 招考单位：%s <br></br> 总人数：%d , 需要人数：%d , 进度：%s <br></br>",
                             jobName , jobCode , firstUnit , secondUnit , currentNums , needNums , hasing);
    }

    @Override
    public int compareTo(ShenZheng2020 o) {
        if (this.needNums == o.needNums){
            return this.currentNums - o.currentNums;
        }
        int firstI = this.currentNums / this.needNums ;
        int secondI = o.currentNums / o.needNums;

        return firstI == secondI ? this.currentNums % this.needNums - o.currentNums % o.needNums : firstI - secondI;
    }
}
