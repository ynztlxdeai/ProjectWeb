package com.luoxiang.project.po;

public class HuBei202101 implements Comparable<HuBei202101>{
    private Integer jobIndex;

    private String unitName;

    private String jiGuanName;

    private String jiGouLevel;

    private String job;

    private String jobCode;

    private String jobDesc;

    private String needNum;

    private String xueLi;

    private String xueWei;

    private String zhuanYe;

    private String xueWeiSecond;

    private String duiXiang;

    private String years;

    private String zhengZhi;

    private String sex;

    private String huJi;

    private String qiTa;

    private String zhuanYeTest;

    private String mianShiTest;

    private String jinQue;

    private String canGong;

    private String kaoCha;

    private String beiZhu;

    private String ingNum;

    private Integer allNum;

    public Integer getJobIndex() {
        return jobIndex;
    }

    public void setJobIndex(Integer jobIndex) {
        this.jobIndex = jobIndex;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getJiGuanName() {
        return jiGuanName;
    }

    public void setJiGuanName(String jiGuanName) {
        this.jiGuanName = jiGuanName == null ? null : jiGuanName.trim();
    }

    public String getJiGouLevel() {
        return jiGouLevel;
    }

    public void setJiGouLevel(String jiGouLevel) {
        this.jiGouLevel = jiGouLevel == null ? null : jiGouLevel.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public String getXueLi() {
        return xueLi;
    }

    public void setXueLi(String xueLi) {
        this.xueLi = xueLi == null ? null : xueLi.trim();
    }

    public String getXueWei() {
        return xueWei;
    }

    public void setXueWei(String xueWei) {
        this.xueWei = xueWei == null ? null : xueWei.trim();
    }

    public String getZhuanYe() {
        return zhuanYe;
    }

    public void setZhuanYe(String zhuanYe) {
        this.zhuanYe = zhuanYe == null ? null : zhuanYe.trim();
    }

    public String getXueWeiSecond() {
        return xueWeiSecond;
    }

    public void setXueWeiSecond(String xueWeiSecond) {
        this.xueWeiSecond = xueWeiSecond == null ? null : xueWeiSecond.trim();
    }

    public String getDuiXiang() {
        return duiXiang;
    }

    public void setDuiXiang(String duiXiang) {
        this.duiXiang = duiXiang == null ? null : duiXiang.trim();
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years == null ? null : years.trim();
    }

    public String getZhengZhi() {
        return zhengZhi;
    }

    public void setZhengZhi(String zhengZhi) {
        this.zhengZhi = zhengZhi == null ? null : zhengZhi.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getHuJi() {
        return huJi;
    }

    public void setHuJi(String huJi) {
        this.huJi = huJi == null ? null : huJi.trim();
    }

    public String getQiTa() {
        return qiTa;
    }

    public void setQiTa(String qiTa) {
        this.qiTa = qiTa == null ? null : qiTa.trim();
    }

    public String getZhuanYeTest() {
        return zhuanYeTest;
    }

    public void setZhuanYeTest(String zhuanYeTest) {
        this.zhuanYeTest = zhuanYeTest == null ? null : zhuanYeTest.trim();
    }

    public String getMianShiTest() {
        return mianShiTest;
    }

    public void setMianShiTest(String mianShiTest) {
        this.mianShiTest = mianShiTest == null ? null : mianShiTest.trim();
    }

    public String getJinQue() {
        return jinQue;
    }

    public void setJinQue(String jinQue) {
        this.jinQue = jinQue == null ? null : jinQue.trim();
    }

    public String getCanGong() {
        return canGong;
    }

    public void setCanGong(String canGong) {
        this.canGong = canGong == null ? null : canGong.trim();
    }

    public String getKaoCha() {
        return kaoCha;
    }

    public void setKaoCha(String kaoCha) {
        this.kaoCha = kaoCha == null ? null : kaoCha.trim();
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
    }

    public String getIngNum() {
        if (ingNum == null){
            return "";
        }
        return ingNum;
    }

    public void setIngNum(String ingNum) {
        this.ingNum = ingNum == null ? null : ingNum.trim();
    }

    public Integer getAllNum() {
        if (allNum == null){
            return 0;
        }
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public String showData() {
        return   String.format("单位名称：%s ,  需要人数：%s , 现有人数：%d ,变化趋势：%s , 职位代码：%s  <br></br> 专业：%s", unitName  ,needNum , allNum , ingNum  ,jobCode ,  zhuanYe);
    }

    @Override
    public int compareTo(HuBei202101 o) {
        int firstNum = Integer.parseInt(this.needNum);
        int secondNum = Integer.parseInt(o.needNum);
        if (firstNum == secondNum){
            return this.allNum - o.allNum;
        }
        int firstI = this.allNum / firstNum ;
        int secondI = o.allNum / secondNum;

        return firstI == secondI ? this.allNum % firstNum - o.allNum % secondNum : firstI - secondI;
    }
}