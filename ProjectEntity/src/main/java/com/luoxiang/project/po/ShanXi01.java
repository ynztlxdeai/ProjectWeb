package com.luoxiang.project.po;

public class ShanXi01 implements Comparable<ShanXi01>{
    private Integer jobIndex;

    private String unitTop;

    private String unitName;

    private String job;

    private String needNum;

    private String jobDesc;

    private String xueLi;

    private String xueWei;

    private String zhuanYe;

    private String jiCeng;

    private String zhengZhi;

    private String beiZhu;

    private Integer allNum;

    private String ingNum;

    public Integer getJobIndex() {
        return jobIndex;
    }

    public void setJobIndex(Integer jobIndex) {
        this.jobIndex = jobIndex;
    }

    public String getUnitTop() {
        return unitTop;
    }

    public void setUnitTop(String unitTop) {
        this.unitTop = unitTop == null ? null : unitTop.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
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

    public String getJiCeng() {
        return jiCeng;
    }

    public void setJiCeng(String jiCeng) {
        this.jiCeng = jiCeng == null ? null : jiCeng.trim();
    }

    public String getZhengZhi() {
        return zhengZhi;
    }

    public void setZhengZhi(String zhengZhi) {
        this.zhengZhi = zhengZhi == null ? null : zhengZhi.trim();
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
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

    public String getIngNum() {
        if (ingNum == null || ingNum.equals("")){
            return "";
        }
        return ingNum;
    }

    public void setIngNum(String ingNum) {
        this.ingNum = ingNum == null ? null : ingNum.trim();
    }

    public String showData() {
        return   String.format("单位名称：%s ,  需要人数：%s , 现有人数：%d ,变化趋势：%s  <br></br> 专业：%s", unitTop + "-" + unitName  ,needNum , allNum , ingNum  , zhuanYe);
    }

    @Override
    public int compareTo(ShanXi01 o) {
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