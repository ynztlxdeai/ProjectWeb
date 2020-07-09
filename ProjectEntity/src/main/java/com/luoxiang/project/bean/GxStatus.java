package com.luoxiang.project.bean;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.bean
 * className:	        GxStatus
 * author:	            Luoxiang
 * time:	            2020/7/10	7:07
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/7/10
 * upDateDesc:	        TODO
 */


public class GxStatus {
    public String jobCode ;
    public String job;
    public double needNums;
    public double baoKaoNums;
    public double VerityNums;
    public double passNums;
    public double payNums;
    public String fileIndex ;

    @Override
    public String toString() {
        return "GxStatus{" + "职位代码='" + jobCode + '\'' + ", 职位='" + job + '\'' + ", 招考人数='" + needNums + '\'' + ", 报考人数='" + baoKaoNums + '\'' + ", 确认人数='" + VerityNums + '\'' + ", 通过审核人数='" + passNums + '\'' + ", 支付人数='" + payNums + '\'' + '}';
    }
}
