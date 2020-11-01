package com.luoxiang.project.domain;

import java.io.Serializable;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.domain
 * className:	        TableSiChuan
 * author:	            Luoxiang
 * time:	            2020/11/1	17:46
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/11/1
 * upDateDesc:	        TODO
 */


public class TableSiChuan implements Serializable {
    //单位名称/招录机关
    public String unitName;
    //职位类别
    public String jobLeiBie;
    //职位名称
        public String jobName;
    //录用名额
    public int needNum;
    //拟任职务
    public String jobLevel;
    //职位编码
    public String jobCode;
    //招收范围
    public String fanWei;
    //招收对象
    public String duiXiang;
    //学历
    public String xueLi;
    //学位
    public String xueWei;
    //专业
    public String zhuanYe;
    //其他
    public String others;
    //备注
    public String beiZhu;
    //最低服务年限规定
    public String lessYears;
    //政策咨询电话
    public String phone;
    //内设机构
    public String inerName ;
    //职位简介
    public String jobDesc;

    @Override
    public String toString() {
        return "TableSiChuan{" + "unitName='" + unitName + '\'' + ", jobLeiBie='" + jobLeiBie + '\'' + ", jobName='" + jobName + '\'' + ", needNum=" + needNum + ", jobLevel='" + jobLevel + '\'' + ", jobCode='" + jobCode + '\'' + ", fanWei='" + fanWei + '\'' + ", duiXiang='" + duiXiang + '\'' + ", xueLi='" + xueLi + '\'' + ", xueWei='" + xueWei + '\'' + ", zhuanYe='" + zhuanYe + '\'' + ", others='" + others + '\'' + ", beiZhu='" + beiZhu + '\'' + ", lessYears='" + lessYears + '\'' + ", phone='" + phone + '\'' + ", inerName='" + inerName + '\'' + ", jobDesc='" + jobDesc + '\'' + '}';
    }

    public String showData(){

        return String.format("");
    }
}
