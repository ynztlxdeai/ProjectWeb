package com.luoxiang.project.po;

public class SiChuan202102 implements Comparable<SiChuan202102> {
    private Integer jobIndex;

    private String jobCode;

    private String jobUnit;

    private String jobInner;

    private String jobName;

    private String jobDesc;

    private String jobLevel;

    private String needNum;

    private String jobWhere;

    private String jobWho;

    private String xueLi;

    private String xueWei;

    private String zhuanYe;

    private String qiTa;

    private String beiZhu;

    private String phone;

    private String hasing;

    private Integer allNum;

    public Integer getJobIndex() {
        return jobIndex;
    }

    public void setJobIndex(Integer jobIndex) {
        this.jobIndex = jobIndex;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getJobUnit() {
        return jobUnit;
    }

    public void setJobUnit(String jobUnit) {
        this.jobUnit = jobUnit == null ? null : jobUnit.trim();
    }

    public String getJobInner() {
        return jobInner;
    }

    public void setJobInner(String jobInner) {
        this.jobInner = jobInner == null ? null : jobInner.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public String getJobWhere() {
        return jobWhere;
    }

    public void setJobWhere(String jobWhere) {
        this.jobWhere = jobWhere == null ? null : jobWhere.trim();
    }

    public String getJobWho() {
        return jobWho;
    }

    public void setJobWho(String jobWho) {
        this.jobWho = jobWho == null ? null : jobWho.trim();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public Integer getAllNum() {
        if (allNum == null){
            return 0;
        }
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    @Override
    public int compareTo(SiChuan202102 o) {
        int firstNum = Integer.parseInt(this.getNeedNum());
        int secondNum = Integer.parseInt(o.getNeedNum());
        if (firstNum == secondNum){
            return this.getAllNum() - o.getAllNum();
        }
        int firstI = this.getAllNum() / firstNum ;
        int secondI = o.getAllNum() / secondNum;

        return firstI == secondI ? this.getAllNum() % firstNum - o.getAllNum() % secondNum : firstI - secondI;
    }

    public String showData(){
        return   String.format("单位名称：%s , 职位代码：%s , 需要人数：%s , 现有人数：%d ,变化趋势：%s <br></br> 专业：%s", jobUnit , jobCode ,needNum , allNum , hasing , zhuanYe);
    }
}