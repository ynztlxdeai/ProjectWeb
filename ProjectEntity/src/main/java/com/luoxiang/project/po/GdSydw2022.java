package com.luoxiang.project.po;

public class GdSydw2022 implements Comparable<GdSydw2022> {
    private Integer jobIndex;

    private String kaoQu;

    private String unitCode;

    private String jobCode;

    private String unitName;

    private String jobName;

    private String jobDesc;

    private String level;

    private String needNum;

    private String kaoShengLeiBie;

    private String xueLi;

    private String xueWei;

    private String zhuanYe;

    private String jingLi;

    private String zhunRu;

    private String zhengShu;

    private String hasing;

    private Integer allNum;

    public Integer getJobIndex() {
        return jobIndex;
    }

    public void setJobIndex(Integer jobIndex) {
        this.jobIndex = jobIndex;
    }

    public String getKaoQu() {
        return kaoQu;
    }

    public void setKaoQu(String kaoQu) {
        this.kaoQu = kaoQu == null ? null : kaoQu.trim();
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public String getKaoShengLeiBie() {
        return kaoShengLeiBie;
    }

    public void setKaoShengLeiBie(String kaoShengLeiBie) {
        this.kaoShengLeiBie = kaoShengLeiBie == null ? null : kaoShengLeiBie.trim();
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

    public String getJingLi() {
        return jingLi;
    }

    public void setJingLi(String jingLi) {
        this.jingLi = jingLi == null ? null : jingLi.trim();
    }

    public String getZhunRu() {
        return zhunRu;
    }

    public void setZhunRu(String zhunRu) {
        this.zhunRu = zhunRu == null ? null : zhunRu.trim();
    }

    public String getZhengShu() {
        return zhengShu;
    }

    public void setZhengShu(String zhengShu) {
        this.zhengShu = zhengShu == null ? null : zhengShu.trim();
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
        return   String.format("单位名称：%s ,  工作地点：%s , 需要人数：%s , 现有人数：%d ,变化趋势：%s , 职位代码：%s  <br></br> 专业：%s <br></br> 工作岗位：%s <br></br> 工作描述：%s  <br></br> 其他条件：%s",
                               unitName ,kaoQu,needNum , allNum , hasing  ,jobCode ,  zhuanYe , jobName , jobDesc , jingLi + " <br></br> " + zhengShu);
    }

    @Override
    public int compareTo(GdSydw2022 o) {
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