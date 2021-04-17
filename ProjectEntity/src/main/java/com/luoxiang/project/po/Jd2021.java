package com.luoxiang.project.po;

public class Jd2021 implements Comparable<Jd2021>{
    private Integer jobIndex;

    private String jobCode;

    private String unitCode;

    private String unitName;

    private String jobLevel;

    private String jobName;

    private String jobDesc;

    private String needNum;

    private String inSplit;

    private String laiYuan;

    private String xueLi;

    private String xueWei;

    private String zhuanYe;

    private String zhuanYeTest;

    private String zhiCheng1;

    private String zhiCheng2;

    private String zhiYe1;

    private String zhiYe2;

    private String qiTa;

    private String diDian;

    private Integer hasNum;

    private String phone;

    private String ingNum;

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

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public String getInSplit() {
        return inSplit;
    }

    public void setInSplit(String inSplit) {
        this.inSplit = inSplit == null ? null : inSplit.trim();
    }

    public String getLaiYuan() {
        return laiYuan;
    }

    public void setLaiYuan(String laiYuan) {
        this.laiYuan = laiYuan == null ? null : laiYuan.trim();
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

    public String getZhuanYeTest() {
        return zhuanYeTest;
    }

    public void setZhuanYeTest(String zhuanYeTest) {
        this.zhuanYeTest = zhuanYeTest == null ? null : zhuanYeTest.trim();
    }

    public String getZhiCheng1() {
        return zhiCheng1;
    }

    public void setZhiCheng1(String zhiCheng1) {
        this.zhiCheng1 = zhiCheng1 == null ? null : zhiCheng1.trim();
    }

    public String getZhiCheng2() {
        return zhiCheng2;
    }

    public void setZhiCheng2(String zhiCheng2) {
        this.zhiCheng2 = zhiCheng2 == null ? null : zhiCheng2.trim();
    }

    public String getZhiYe1() {
        return zhiYe1;
    }

    public void setZhiYe1(String zhiYe1) {
        this.zhiYe1 = zhiYe1 == null ? null : zhiYe1.trim();
    }

    public String getZhiYe2() {
        return zhiYe2;
    }

    public void setZhiYe2(String zhiYe2) {
        this.zhiYe2 = zhiYe2 == null ? null : zhiYe2.trim();
    }

    public String getQiTa() {
        return qiTa;
    }

    public void setQiTa(String qiTa) {
        this.qiTa = qiTa == null ? null : qiTa.trim();
    }

    public String getDiDian() {
        return diDian;
    }

    public void setDiDian(String diDian) {
        this.diDian = diDian == null ? null : diDian.trim();
    }

    public Integer getHasNum() {
        if (hasNum == null){
            return 0;
        }
        return hasNum;
    }

    public void setHasNum(Integer hasNum) {
        this.hasNum = hasNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public String showData(){
        return   String.format("单位名称：%s , 职位代码：%s , 需要人数：%s , 现有人数：%d ,地点：%s,变化趋势：%s <br></br> 专业：%s", unitName , jobCode ,needNum ,hasNum ,diDian, ingNum , zhuanYe);
    }

    @Override
    public int compareTo(Jd2021 o) {
        int firstNum = Integer.parseInt(this.getNeedNum());
        int secondNum = Integer.parseInt(o.getNeedNum());
        if (firstNum == secondNum){
            return this.getHasNum() - o.getHasNum();
        }
        int firstI = this.getHasNum() / firstNum ;
        int secondI = o.getHasNum() / secondNum;

        return firstI == secondI ? this.getHasNum() % firstNum - o.getHasNum() % secondNum : firstI - secondI;
    }
}