package com.luoxiang.project.po;

public class ZheJiang2020 implements Comparable<ZheJiang2020>{
    private Integer jobIndex;

    private String unitName;

    private String jobCode;

    private String jobName;

    private String jobLevel;

    private String jobClass1;

    private String jobClass2;

    private String needNum;

    private String phone;

    private String jobDesc;

    private String xueLi;

    private String xueWei;

    private String sex;

    private String shenFen;

    private String zhengZhi;

    private String mingZu;

    private String years;

    private String zhuanYe;

    private String xinLi;

    private String tiNeng;

    private String zhuanYeTest;

    private String beiZhu;

    private Integer allNum;

    private String hasing;

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

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public String getJobClass1() {
        return jobClass1;
    }

    public void setJobClass1(String jobClass1) {
        this.jobClass1 = jobClass1 == null ? null : jobClass1.trim();
    }

    public String getJobClass2() {
        return jobClass2;
    }

    public void setJobClass2(String jobClass2) {
        this.jobClass2 = jobClass2 == null ? null : jobClass2.trim();
    }

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getShenFen() {
        return shenFen;
    }

    public void setShenFen(String shenFen) {
        this.shenFen = shenFen == null ? null : shenFen.trim();
    }

    public String getZhengZhi() {
        return zhengZhi;
    }

    public void setZhengZhi(String zhengZhi) {
        this.zhengZhi = zhengZhi == null ? null : zhengZhi.trim();
    }

    public String getMingZu() {
        return mingZu;
    }

    public void setMingZu(String mingZu) {
        this.mingZu = mingZu == null ? null : mingZu.trim();
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years == null ? null : years.trim();
    }

    public String getZhuanYe() {
        return zhuanYe;
    }

    public void setZhuanYe(String zhuanYe) {
        this.zhuanYe = zhuanYe == null ? null : zhuanYe.trim();
    }

    public String getXinLi() {
        return xinLi;
    }

    public void setXinLi(String xinLi) {
        this.xinLi = xinLi == null ? null : xinLi.trim();
    }

    public String getTiNeng() {
        return tiNeng;
    }

    public void setTiNeng(String tiNeng) {
        this.tiNeng = tiNeng == null ? null : tiNeng.trim();
    }

    public String getZhuanYeTest() {
        return zhuanYeTest;
    }

    public void setZhuanYeTest(String zhuanYeTest) {
        this.zhuanYeTest = zhuanYeTest == null ? null : zhuanYeTest.trim();
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
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

    @Override
    public int compareTo(ZheJiang2020 o) {
        if (Integer.parseInt(this.needNum) == Integer.parseInt(o.needNum)){
            return this.allNum - o.allNum;
        }
        int firstI = this.allNum / Integer.parseInt(this.needNum) ;
        int secondI = o.allNum / Integer.parseInt(o.needNum);

        return firstI == secondI ? this.allNum % Integer.parseInt(this.needNum) - o.allNum % Integer.parseInt(o.needNum) : firstI - secondI;

    }

    @Override
    public String toString() {
        return String.format("单位：%s , 代码: %s , 招录人数:%s , 进度：%s <br></br> 专业:%s <br></br>" , unitName , jobCode , needNum , hasing , zhuanYe);
    }
}