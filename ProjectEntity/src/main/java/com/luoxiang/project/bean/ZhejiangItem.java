package com.luoxiang.project.bean;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.bean
 * className:	        ZhejiangItem
 * author:	            Luoxiang
 * time:	            2019/12/20	22:15
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2019/12/20
 * upDateDesc:	        TODO
 */


public class ZhejiangItem {
    public String jobCode;
    public String jobName;
    public String unitName;
    public String needNums;
    public int hasNums;

    @Override
    public String toString() {
        return "ZhejiangItem{" + "jobCode='" + jobCode + '\'' + ", jobName='" + jobName + '\'' + ", unitName='" + unitName + '\'' + ", needNums='" + needNums + '\'' + ", hasNums=" + hasNums + '}' + "\n";
    }
}
