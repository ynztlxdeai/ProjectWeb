package com.luoxiang.project.bean;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.bean
 * className:	        Jd2020JnBean
 * author:	            Luoxiang
 * time:	            2020/10/12	14:42
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/12
 * upDateDesc:	        TODO
 */

public class Jd2020JnBean implements Comparable<Jd2020JnBean>{

    private int id;
    private String zwdm;
    private String zwmc;
    private String zpdwmc;
    private int    zprs;
    private String work_limit;
    private int    zwbkrs;
    private String work_place;

    public int getId() { return id;}

    public void setId(int id) { this.id = id;}

    public String getZwdm() { return zwdm;}

    public void setZwdm(String zwdm) { this.zwdm = zwdm;}

    public String getZwmc() { return zwmc;}

    public void setZwmc(String zwmc) { this.zwmc = zwmc;}

    public String getZpdwmc() { return zpdwmc;}

    public void setZpdwmc(String zpdwmc) { this.zpdwmc = zpdwmc;}

    public int getZprs() { return zprs;}

    public void setZprs(int zprs) { this.zprs = zprs;}

    public String getWork_limit() { return work_limit;}

    public void setWork_limit(String work_limit) { this.work_limit = work_limit;}

    public int getZwbkrs() { return zwbkrs;}

    public void setZwbkrs(int zwbkrs) { this.zwbkrs = zwbkrs;}

    public String getWork_place() {
        return work_place;
    }

    public void setWork_place(String work_place) {
        this.work_place = work_place;
    }

    @Override
    public int compareTo(Jd2020JnBean o) {
        return this.zwbkrs / this.zprs - o.zwbkrs / o.zprs;
    }

    @Override
    public String toString() {
        return "职位代码:" + zwdm + ",职位名称:" + zwmc + ",工作地点:" + work_place + ",招聘人数:" + zprs + ",现有人数:" + zwbkrs;
    }
}
