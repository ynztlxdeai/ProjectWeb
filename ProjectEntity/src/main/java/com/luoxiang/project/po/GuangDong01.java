package com.luoxiang.project.po;

public class GuangDong01 implements Comparable<GuangDong01>{
    private Integer jobIndex;

    private String unitName;

    private String unitCode;

    private String job;

    private String jobCode;

    private String jobDesc;

    private String needNum;

    private String xueLi;

    private String xueWei;

    private String benKe;

    private String jiCengJingYan;

    private String zhuanYeTest;

    private String xinLiTest;

    private String chaEKaoCha;

    private String yingJieSheng;

    private String qiTa;

    private String kaoQu;

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

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
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

    public String getBenKe() {
        return benKe;
    }

    public void setBenKe(String benKe) {
        this.benKe = benKe == null ? null : benKe.trim();
    }

    public String getJiCengJingYan() {
        return jiCengJingYan;
    }

    public void setJiCengJingYan(String jiCengJingYan) {
        this.jiCengJingYan = jiCengJingYan == null ? null : jiCengJingYan.trim();
    }

    public String getZhuanYeTest() {
        return zhuanYeTest;
    }

    public void setZhuanYeTest(String zhuanYeTest) {
        this.zhuanYeTest = zhuanYeTest == null ? null : zhuanYeTest.trim();
    }

    public String getXinLiTest() {
        return xinLiTest;
    }

    public void setXinLiTest(String xinLiTest) {
        this.xinLiTest = xinLiTest == null ? null : xinLiTest.trim();
    }

    public String getChaEKaoCha() {
        return chaEKaoCha;
    }

    public void setChaEKaoCha(String chaEKaoCha) {
        this.chaEKaoCha = chaEKaoCha == null ? null : chaEKaoCha.trim();
    }

    public String getYingJieSheng() {
        return yingJieSheng;
    }

    public void setYingJieSheng(String yingJieSheng) {
        this.yingJieSheng = yingJieSheng == null ? null : yingJieSheng.trim();
    }

    public String getQiTa() {
        return qiTa;
    }

    public void setQiTa(String qiTa) {
        this.qiTa = qiTa == null ? null : qiTa.trim();
    }

    public String getKaoQu() {
        return kaoQu;
    }

    public void setKaoQu(String kaoQu) {
        this.kaoQu = kaoQu == null ? null : kaoQu.trim();
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
        if (ingNum == null){
            return "";
        }
        return ingNum;
    }

    public void setIngNum(String ingNum) {
        this.ingNum = ingNum == null ? null : ingNum.trim();
    }

    public String showData() {
        return   String.format("单位名称：%s ,  需要人数：%s , 现有人数：%d ,变化趋势：%s  <br></br> 专业：%s", unitName  ,needNum , allNum , ingNum  , benKe);
    }

    @Override
    public int compareTo(GuangDong01 o) {
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