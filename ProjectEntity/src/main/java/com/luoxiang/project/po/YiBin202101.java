package com.luoxiang.project.po;

public class YiBin202101 implements Comparable<YiBin202101>{
    private Integer jobIndex;

    private String unitName;

    private String jobName;

    private String jobLevel;

    private String jobCode;

    private String needNum;

    private String xueLi;

    private String zhuanYe;

    private String years;

    private String other;

    private String biLi;

    private String xinLiTest;

    private String allTest;

    private String perTest;

    private String mianShi;

    private String yueDing;

    private Integer allNum;

    private String ingNum;

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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
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

    public String getZhuanYe() {
        return zhuanYe;
    }

    public void setZhuanYe(String zhuanYe) {
        this.zhuanYe = zhuanYe == null ? null : zhuanYe.trim();
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years == null ? null : years.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getBiLi() {
        return biLi;
    }

    public void setBiLi(String biLi) {
        this.biLi = biLi == null ? null : biLi.trim();
    }

    public String getXinLiTest() {
        return xinLiTest;
    }

    public void setXinLiTest(String xinLiTest) {
        this.xinLiTest = xinLiTest == null ? null : xinLiTest.trim();
    }

    public String getAllTest() {
        return allTest;
    }

    public void setAllTest(String allTest) {
        this.allTest = allTest == null ? null : allTest.trim();
    }

    public String getPerTest() {
        return perTest;
    }

    public void setPerTest(String perTest) {
        this.perTest = perTest == null ? null : perTest.trim();
    }

    public String getMianShi() {
        return mianShi;
    }

    public void setMianShi(String mianShi) {
        this.mianShi = mianShi == null ? null : mianShi.trim();
    }

    public String getYueDing() {
        return yueDing;
    }

    public void setYueDing(String yueDing) {
        this.yueDing = yueDing == null ? null : yueDing.trim();
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public String getIngNum() {
        return ingNum;
    }

    public void setIngNum(String ingNum) {
        this.ingNum = ingNum == null ? null : ingNum.trim();
    }

    public String showData() {
        return   String.format("单位名称：%s ,需要人数：%s , 现有人数：%d ,变化趋势：%s <br></br> 专业：%s", unitName  ,needNum , allNum , ingNum , zhuanYe);
    }

    @Override
    public int compareTo(YiBin202101 o) {
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