package com.luoxiang.project.po;

public class JiangSu202002Sh implements Comparable<JiangSu202002Sh>{
    private Integer jobIndex;

    private String liShuGuanXi;

    private String diQuCode;

    private String diQuName;

    private String unitCode;

    private String unitName;

    private String jobCode;

    private String jobName;

    private String jobDesc;

    private String jobLeiBie;

    private String kaiKaoBiLi;

    private String needNum;

    private String xueLi;

    private String zhuanYe;

    private String qiTa;

    private String hasing;

    private Integer allNum;

    public Integer getJobIndex() {
        return jobIndex;
    }

    public void setJobIndex(Integer jobIndex) {
        this.jobIndex = jobIndex;
    }

    public String getLiShuGuanXi() {
        return liShuGuanXi;
    }

    public void setLiShuGuanXi(String liShuGuanXi) {
        this.liShuGuanXi = liShuGuanXi == null ? null : liShuGuanXi.trim();
    }

    public String getDiQuCode() {
        return diQuCode;
    }

    public void setDiQuCode(String diQuCode) {
        this.diQuCode = diQuCode == null ? null : diQuCode.trim();
    }

    public String getDiQuName() {
        return diQuName;
    }

    public void setDiQuName(String diQuName) {
        this.diQuName = diQuName == null ? null : diQuName.trim();
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
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

    public String getJobLeiBie() {
        return jobLeiBie;
    }

    public void setJobLeiBie(String jobLeiBie) {
        this.jobLeiBie = jobLeiBie == null ? null : jobLeiBie.trim();
    }

    public String getKaiKaoBiLi() {
        return kaiKaoBiLi;
    }

    public void setKaiKaoBiLi(String kaiKaoBiLi) {
        this.kaiKaoBiLi = kaiKaoBiLi == null ? null : kaiKaoBiLi.trim();
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

    public String getQiTa() {
        return qiTa;
    }

    public void setQiTa(String qiTa) {
        this.qiTa = qiTa == null ? null : qiTa.trim();
    }



    public String getHasing() {
        if (hasing == null || "".equals(hasing)){
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

    public String showData() {
        return   String.format("单位名称：%s , 地区：%s , 需要人数：%s , 现有人数：%d ,变化趋势：%s , 代码：%s <br></br> 专业：%s", unitName , diQuName ,needNum , allNum , hasing , jobCode , zhuanYe);
    }

    @Override
    public int compareTo(JiangSu202002Sh o) {
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