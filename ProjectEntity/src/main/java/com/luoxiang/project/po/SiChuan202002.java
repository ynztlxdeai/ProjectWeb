package com.luoxiang.project.po;

public class SiChuan202002 {
    private Integer jobindex;

    private String unitname;

    private String jobleibie;

    private String jobname;

    private String neednum;

    private String joblevel;

    private String jobcode;

    private String fanwei;

    private String duixiang;

    private String xueli;

    private String xuewei;

    private String zhuanye;

    private String others;

    private String beizhu;

    private String lessyears;

    private String phone;

    private String inername;

    private String jobdesc;

    private String hasing;

    private Integer allnums;

    public Integer getJobindex() {
        return jobindex;
    }

    public void setJobindex(Integer jobindex) {
        this.jobindex = jobindex;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getJobleibie() {
        return jobleibie;
    }

    public void setJobleibie(String jobleibie) {
        this.jobleibie = jobleibie == null ? null : jobleibie.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getNeednum() {
        return neednum;
    }

    public void setNeednum(String neednum) {
        this.neednum = neednum == null ? null : neednum.trim();
    }

    public String getJoblevel() {
        return joblevel;
    }

    public void setJoblevel(String joblevel) {
        this.joblevel = joblevel == null ? null : joblevel.trim();
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode == null ? null : jobcode.trim();
    }

    public String getFanwei() {
        return fanwei;
    }

    public void setFanwei(String fanwei) {
        this.fanwei = fanwei == null ? null : fanwei.trim();
    }

    public String getDuixiang() {
        return duixiang;
    }

    public void setDuixiang(String duixiang) {
        this.duixiang = duixiang == null ? null : duixiang.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getXuewei() {
        return xuewei;
    }

    public void setXuewei(String xuewei) {
        this.xuewei = xuewei == null ? null : xuewei.trim();
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye == null ? null : zhuanye.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getLessyears() {
        return lessyears;
    }

    public void setLessyears(String lessyears) {
        this.lessyears = lessyears == null ? null : lessyears.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getInername() {
        return inername;
    }

    public void setInername(String inername) {
        this.inername = inername == null ? null : inername.trim();
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc == null ? null : jobdesc.trim();
    }

    public String getHasing() {
        if (hasing == null || hasing.equals("")){
            return "";
        }
        return hasing;
    }

    public void setHasing(String hasing) {
        this.hasing = hasing == null ? null : hasing.trim();
    }

    public Integer getAllnums() {
        if (allnums == null){
            return 0;
        }
        return allnums;
    }

    public void setAllnums(Integer allnums) {
        this.allnums = allnums;
    }
}