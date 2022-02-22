package com.luoxiang.project.po;

public class YunNan2022 implements Comparable<YunNan2022>{
    private Integer jobIndex;

    private String jobCode;

    private String unitName;

    private String jobLeiBie;

    private String jobLevel;

    private String jobName;

    private String jobDesc;

    private String isPolicy;

    private String needNum;

    private String shenFen;

    private String xingBie;

    private String xueLi;

    private String xueWei;

    private String zhuanYe;

    private String shengYuan;

    private String qiTa;

    private String beiZhu;

    private String phone;

    private String web;

    private String kaiKaoBiLi;

    private String shiJuan;

    private String diDian;

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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getJobLeiBie() {
        return jobLeiBie;
    }

    public void setJobLeiBie(String jobLeiBie) {
        this.jobLeiBie = jobLeiBie == null ? null : jobLeiBie.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
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

    public String getIsPolicy() {
        return isPolicy;
    }

    public void setIsPolicy(String isPolicy) {
        this.isPolicy = isPolicy == null ? null : isPolicy.trim();
    }

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public String getShenFen() {
        return shenFen;
    }

    public void setShenFen(String shenFen) {
        this.shenFen = shenFen == null ? null : shenFen.trim();
    }

    public String getXingBie() {
        return xingBie;
    }

    public void setXingBie(String xingBie) {
        this.xingBie = xingBie == null ? null : xingBie.trim();
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

    public String getShengYuan() {
        return shengYuan;
    }

    public void setShengYuan(String shengYuan) {
        this.shengYuan = shengYuan == null ? null : shengYuan.trim();
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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
    }

    public String getKaiKaoBiLi() {
        return kaiKaoBiLi;
    }

    public void setKaiKaoBiLi(String kaiKaoBiLi) {
        this.kaiKaoBiLi = kaiKaoBiLi == null ? null : kaiKaoBiLi.trim();
    }

    public String getShiJuan() {
        return shiJuan;
    }

    public void setShiJuan(String shiJuan) {
        this.shiJuan = shiJuan == null ? null : shiJuan.trim();
    }

    public String getDiDian() {
        return diDian;
    }

    public void setDiDian(String diDian) {
        this.diDian = diDian == null ? null : diDian.trim();
    }


    public void setHasing(String hasing) {
        this.hasing = hasing == null ? null : hasing.trim();
    }

    public String getHasing() {
        if (hasing == null || hasing.equals("")){
            return "";
        }
        return hasing;
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
        return   String.format("单位名称：%s , 职位代码：%s , 需要人数：%s , 现有人数：%d ,变化趋势：%s <br></br> 专业：%s <br></br> 工作地点：%s", unitName + ":" + jobName , jobCode ,needNum , allNum , hasing , zhuanYe, diDian);

    }
    @Override
    public int compareTo(YunNan2022 o) {
        int firstNum = Integer.parseInt(this.getNeedNum());
        int secondNum = Integer.parseInt(o.getNeedNum());
        if (firstNum == secondNum){
            return this.getAllNum() - o.getAllNum();
        }
        int firstI = this.getAllNum() / firstNum ;
        int secondI = o.getAllNum() / secondNum;

        return firstI == secondI ? this.getAllNum() % firstNum - o.getAllNum() % secondNum : firstI - secondI;
    }

}