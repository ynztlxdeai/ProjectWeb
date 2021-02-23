package com.luoxiang.project.po;

public class HeNan202101 implements Comparable<HeNan202101>{
    private Integer jobIndex;

    private String unitName;

    private String jobName;

    private String jobCode;

    private String needNum;

    private String xueLi;

    private String zhuanYe;

    private String years;

    private String gongZuoJingLi;

    private String qiTa;

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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
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

    public String getGongZuoJingLi() {
        return gongZuoJingLi;
    }

    public void setGongZuoJingLi(String gongZuoJingLi) {
        this.gongZuoJingLi = gongZuoJingLi == null ? null : gongZuoJingLi.trim();
    }

    public String getQiTa() {
        return qiTa;
    }

    public void setQiTa(String qiTa) {
        this.qiTa = qiTa == null ? null : qiTa.trim();
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
            return -1;
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
    public int compareTo(HeNan202101 o) {
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