package com.luoxiang.project.po;

public class JiangSu2022 implements Comparable<JiangSu2022>{
    private Integer jobIndex;

    private String liShuGuanXi;

    private String diQuDaiMa;

    private String diQuMingCheng;

    private String danWeiDaiMa;

    private String danWeiMingCheng;

    private String zhiWeiDaiMa;

    private String zhiWeiMingCheng;

    private String zhiWeiJianJie;

    private String zhiWeiLeiBie;

    private String kaiKaoBiLie;

    private String zhaoKaoRenShu;

    private String xueLi;

    private String zhuanYe;

    private String jobCode;

    private String qiTa;

    private Integer allNum;

    private String ingNum;

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

    public String getDiQuDaiMa() {
        return diQuDaiMa;
    }

    public void setDiQuDaiMa(String diQuDaiMa) {
        this.diQuDaiMa = diQuDaiMa == null ? null : diQuDaiMa.trim();
    }

    public String getDiQuMingCheng() {
        return diQuMingCheng;
    }

    public void setDiQuMingCheng(String diQuMingCheng) {
        this.diQuMingCheng = diQuMingCheng == null ? null : diQuMingCheng.trim();
    }

    public String getDanWeiDaiMa() {
        return danWeiDaiMa;
    }

    public void setDanWeiDaiMa(String danWeiDaiMa) {
        this.danWeiDaiMa = danWeiDaiMa == null ? null : danWeiDaiMa.trim();
    }

    public String getDanWeiMingCheng() {
        return danWeiMingCheng;
    }

    public void setDanWeiMingCheng(String danWeiMingCheng) {
        this.danWeiMingCheng = danWeiMingCheng == null ? null : danWeiMingCheng.trim();
    }

    public String getZhiWeiDaiMa() {
        return zhiWeiDaiMa;
    }

    public void setZhiWeiDaiMa(String zhiWeiDaiMa) {
        this.zhiWeiDaiMa = zhiWeiDaiMa == null ? null : zhiWeiDaiMa.trim();
    }

    public String getZhiWeiMingCheng() {
        return zhiWeiMingCheng;
    }

    public void setZhiWeiMingCheng(String zhiWeiMingCheng) {
        this.zhiWeiMingCheng = zhiWeiMingCheng == null ? null : zhiWeiMingCheng.trim();
    }

    public String getZhiWeiJianJie() {
        return zhiWeiJianJie;
    }

    public void setZhiWeiJianJie(String zhiWeiJianJie) {
        this.zhiWeiJianJie = zhiWeiJianJie == null ? null : zhiWeiJianJie.trim();
    }

    public String getZhiWeiLeiBie() {
        return zhiWeiLeiBie;
    }

    public void setZhiWeiLeiBie(String zhiWeiLeiBie) {
        this.zhiWeiLeiBie = zhiWeiLeiBie == null ? null : zhiWeiLeiBie.trim();
    }

    public String getKaiKaoBiLie() {
        return kaiKaoBiLie;
    }

    public void setKaiKaoBiLie(String kaiKaoBiLie) {
        this.kaiKaoBiLie = kaiKaoBiLie == null ? null : kaiKaoBiLie.trim();
    }

    public String getZhaoKaoRenShu() {
        return zhaoKaoRenShu;
    }

    public void setZhaoKaoRenShu(String zhaoKaoRenShu) {
        this.zhaoKaoRenShu = zhaoKaoRenShu == null ? null : zhaoKaoRenShu.trim();
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

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getQiTa() {
        return qiTa;
    }

    public void setQiTa(String qiTa) {
        this.qiTa = qiTa == null ? null : qiTa.trim();
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public String getIngNum() {
        return ingNum;
    }

    public void setIngNum(String ingNum) {
        this.ingNum = ingNum == null ? null : ingNum.trim();
    }

    @Override
    public int compareTo(JiangSu2022 o) {
        int firstNum = Integer.parseInt(this.getZhaoKaoRenShu());
        int secondNum = Integer.parseInt(o.getZhaoKaoRenShu());
        if (firstNum == secondNum){
            return this.getAllNum() - o.getAllNum();
        }
        int firstI = this.getAllNum() / firstNum ;
        int secondI = o.getAllNum() / secondNum;

        return firstI == secondI ? this.getAllNum() % firstNum - o.getAllNum() % secondNum : firstI - secondI;
    }

    public String showData(){
        return   String.format("单位名称：%s , 职位代码：%s , 需要人数：%s , 现有人数：%d ,变化趋势：%s <br></br> 专业：%s", danWeiMingCheng , jobCode ,zhaoKaoRenShu , allNum , ingNum , zhuanYe);
    }
}