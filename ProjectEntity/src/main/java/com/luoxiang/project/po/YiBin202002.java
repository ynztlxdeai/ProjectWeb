package com.luoxiang.project.po;

public class YiBin202002 implements Comparable<YiBin202002>{
    private Integer indexCode;

    private String zhaoPingDanWei;

    private String jobName;

    private String gangWeiLeiBie;

    private String jobCode;

    private String needNum;

    private String xueLi;

    private String zhuanYe;

    private String nianLing;

    private String qiTa;

    private String kaiKaoBiLi;

    private String xinLiSuZhi;

    private String gongGongKeMu;

    private String zhuanYeKeMu;

    private String mianShiXingShi;

    private String yueDing;

    private String current;

    private Integer allNum;

    public Integer getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(Integer indexCode) {
        this.indexCode = indexCode;
    }

    public String getZhaoPingDanWei() {
        return zhaoPingDanWei;
    }

    public void setZhaoPingDanWei(String zhaoPingDanWei) {
        this.zhaoPingDanWei = zhaoPingDanWei == null ? null : zhaoPingDanWei.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getGangWeiLeiBie() {
        return gangWeiLeiBie;
    }

    public void setGangWeiLeiBie(String gangWeiLeiBie) {
        this.gangWeiLeiBie = gangWeiLeiBie == null ? null : gangWeiLeiBie.trim();
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

    public String getNianLing() {
        return nianLing;
    }

    public void setNianLing(String nianLing) {
        this.nianLing = nianLing == null ? null : nianLing.trim();
    }

    public String getQiTa() {
        return qiTa;
    }

    public void setQiTa(String qiTa) {
        this.qiTa = qiTa == null ? null : qiTa.trim();
    }

    public String getKaiKaoBiLi() {
        return kaiKaoBiLi;
    }

    public void setKaiKaoBiLi(String kaiKaoBiLi) {
        this.kaiKaoBiLi = kaiKaoBiLi == null ? null : kaiKaoBiLi.trim();
    }

    public String getXinLiSuZhi() {
        return xinLiSuZhi;
    }

    public void setXinLiSuZhi(String xinLiSuZhi) {
        this.xinLiSuZhi = xinLiSuZhi == null ? null : xinLiSuZhi.trim();
    }

    public String getGongGongKeMu() {
        return gongGongKeMu;
    }

    public void setGongGongKeMu(String gongGongKeMu) {
        this.gongGongKeMu = gongGongKeMu == null ? null : gongGongKeMu.trim();
    }

    public String getZhuanYeKeMu() {
        return zhuanYeKeMu;
    }

    public void setZhuanYeKeMu(String zhuanYeKeMu) {
        this.zhuanYeKeMu = zhuanYeKeMu == null ? null : zhuanYeKeMu.trim();
    }

    public String getMianShiXingShi() {
        return mianShiXingShi;
    }

    public void setMianShiXingShi(String mianShiXingShi) {
        this.mianShiXingShi = mianShiXingShi == null ? null : mianShiXingShi.trim();
    }

    public String getYueDing() {
        return yueDing;
    }

    public void setYueDing(String yueDing) {
        this.yueDing = yueDing == null ? null : yueDing.trim();
    }

    public String getCurrent() {
        if (current == null || "".equals(current)){
            return "";
        }
        return current;
    }

    public void setCurrent(String current) {
        this.current = current == null ? null : current.trim();
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
        return   String.format("单位名称：%s ,职位code：%s ,需要人数：%s , 现有人数：%d ,变化趋势：%s <br></br> 专业：%s", zhaoPingDanWei  ,jobCode,needNum , allNum , current , zhuanYe);
    }

    @Override
    public int compareTo(YiBin202002 o) {
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