package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class SDGovExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SDGovExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanIsNull() {
            addCriterion("zhao_lu_ji_guan is null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanIsNotNull() {
            addCriterion("zhao_lu_ji_guan is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanEqualTo(String value) {
            addCriterion("zhao_lu_ji_guan =", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanNotEqualTo(String value) {
            addCriterion("zhao_lu_ji_guan <>", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanGreaterThan(String value) {
            addCriterion("zhao_lu_ji_guan >", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_lu_ji_guan >=", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanLessThan(String value) {
            addCriterion("zhao_lu_ji_guan <", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanLessThanOrEqualTo(String value) {
            addCriterion("zhao_lu_ji_guan <=", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanLike(String value) {
            addCriterion("zhao_lu_ji_guan like", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanNotLike(String value) {
            addCriterion("zhao_lu_ji_guan not like", value, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanIn(List<String> values) {
            addCriterion("zhao_lu_ji_guan in", values, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanNotIn(List<String> values) {
            addCriterion("zhao_lu_ji_guan not in", values, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanBetween(String value1, String value2) {
            addCriterion("zhao_lu_ji_guan between", value1, value2, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andZhaoLuJiGuanNotBetween(String value1, String value2) {
            addCriterion("zhao_lu_ji_guan not between", value1, value2, "zhaoLuJiGuan");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiIsNull() {
            addCriterion("yong_ren_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiIsNotNull() {
            addCriterion("yong_ren_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiEqualTo(String value) {
            addCriterion("yong_ren_dan_wei =", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiNotEqualTo(String value) {
            addCriterion("yong_ren_dan_wei <>", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiGreaterThan(String value) {
            addCriterion("yong_ren_dan_wei >", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("yong_ren_dan_wei >=", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiLessThan(String value) {
            addCriterion("yong_ren_dan_wei <", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiLessThanOrEqualTo(String value) {
            addCriterion("yong_ren_dan_wei <=", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiLike(String value) {
            addCriterion("yong_ren_dan_wei like", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiNotLike(String value) {
            addCriterion("yong_ren_dan_wei not like", value, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiIn(List<String> values) {
            addCriterion("yong_ren_dan_wei in", values, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiNotIn(List<String> values) {
            addCriterion("yong_ren_dan_wei not in", values, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiBetween(String value1, String value2) {
            addCriterion("yong_ren_dan_wei between", value1, value2, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andYongRenDanWeiNotBetween(String value1, String value2) {
            addCriterion("yong_ren_dan_wei not between", value1, value2, "yongRenDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaIsNull() {
            addCriterion("zhi_wei_dai_ma is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaIsNotNull() {
            addCriterion("zhi_wei_dai_ma is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma =", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma <>", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaGreaterThan(String value) {
            addCriterion("zhi_wei_dai_ma >", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma >=", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaLessThan(String value) {
            addCriterion("zhi_wei_dai_ma <", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma <=", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaLike(String value) {
            addCriterion("zhi_wei_dai_ma like", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotLike(String value) {
            addCriterion("zhi_wei_dai_ma not like", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaIn(List<String> values) {
            addCriterion("zhi_wei_dai_ma in", values, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotIn(List<String> values) {
            addCriterion("zhi_wei_dai_ma not in", values, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaBetween(String value1, String value2) {
            addCriterion("zhi_wei_dai_ma between", value1, value2, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_dai_ma not between", value1, value2, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengIsNull() {
            addCriterion("zhi_wei_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengIsNotNull() {
            addCriterion("zhi_wei_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng =", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng <>", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengGreaterThan(String value) {
            addCriterion("zhi_wei_ming_cheng >", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng >=", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengLessThan(String value) {
            addCriterion("zhi_wei_ming_cheng <", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng <=", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengLike(String value) {
            addCriterion("zhi_wei_ming_cheng like", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotLike(String value) {
            addCriterion("zhi_wei_ming_cheng not like", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengIn(List<String> values) {
            addCriterion("zhi_wei_ming_cheng in", values, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotIn(List<String> values) {
            addCriterion("zhi_wei_ming_cheng not in", values, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengBetween(String value1, String value2) {
            addCriterion("zhi_wei_ming_cheng between", value1, value2, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_ming_cheng not between", value1, value2, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieIsNull() {
            addCriterion("kao_shi_lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieIsNotNull() {
            addCriterion("kao_shi_lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieEqualTo(String value) {
            addCriterion("kao_shi_lei_bie =", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieNotEqualTo(String value) {
            addCriterion("kao_shi_lei_bie <>", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieGreaterThan(String value) {
            addCriterion("kao_shi_lei_bie >", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("kao_shi_lei_bie >=", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieLessThan(String value) {
            addCriterion("kao_shi_lei_bie <", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieLessThanOrEqualTo(String value) {
            addCriterion("kao_shi_lei_bie <=", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieLike(String value) {
            addCriterion("kao_shi_lei_bie like", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieNotLike(String value) {
            addCriterion("kao_shi_lei_bie not like", value, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieIn(List<String> values) {
            addCriterion("kao_shi_lei_bie in", values, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieNotIn(List<String> values) {
            addCriterion("kao_shi_lei_bie not in", values, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieBetween(String value1, String value2) {
            addCriterion("kao_shi_lei_bie between", value1, value2, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiBieNotBetween(String value1, String value2) {
            addCriterion("kao_shi_lei_bie not between", value1, value2, "kaoShiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieIsNull() {
            addCriterion("zhi_wei_jian_jie is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieIsNotNull() {
            addCriterion("zhi_wei_jian_jie is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie =", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie <>", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieGreaterThan(String value) {
            addCriterion("zhi_wei_jian_jie >", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie >=", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieLessThan(String value) {
            addCriterion("zhi_wei_jian_jie <", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie <=", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieLike(String value) {
            addCriterion("zhi_wei_jian_jie like", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotLike(String value) {
            addCriterion("zhi_wei_jian_jie not like", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieIn(List<String> values) {
            addCriterion("zhi_wei_jian_jie in", values, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotIn(List<String> values) {
            addCriterion("zhi_wei_jian_jie not in", values, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieBetween(String value1, String value2) {
            addCriterion("zhi_wei_jian_jie between", value1, value2, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_jian_jie not between", value1, value2, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaIsNull() {
            addCriterion("lu_yong_ji_hua is null");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaIsNotNull() {
            addCriterion("lu_yong_ji_hua is not null");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaEqualTo(String value) {
            addCriterion("lu_yong_ji_hua =", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaNotEqualTo(String value) {
            addCriterion("lu_yong_ji_hua <>", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaGreaterThan(String value) {
            addCriterion("lu_yong_ji_hua >", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaGreaterThanOrEqualTo(String value) {
            addCriterion("lu_yong_ji_hua >=", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaLessThan(String value) {
            addCriterion("lu_yong_ji_hua <", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaLessThanOrEqualTo(String value) {
            addCriterion("lu_yong_ji_hua <=", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaLike(String value) {
            addCriterion("lu_yong_ji_hua like", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaNotLike(String value) {
            addCriterion("lu_yong_ji_hua not like", value, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaIn(List<String> values) {
            addCriterion("lu_yong_ji_hua in", values, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaNotIn(List<String> values) {
            addCriterion("lu_yong_ji_hua not in", values, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaBetween(String value1, String value2) {
            addCriterion("lu_yong_ji_hua between", value1, value2, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andLuYongJiHuaNotBetween(String value1, String value2) {
            addCriterion("lu_yong_ji_hua not between", value1, value2, "luYongJiHua");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangIsNull() {
            addCriterion("zhao_lu_dui_xiang is null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangIsNotNull() {
            addCriterion("zhao_lu_dui_xiang is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangEqualTo(String value) {
            addCriterion("zhao_lu_dui_xiang =", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangNotEqualTo(String value) {
            addCriterion("zhao_lu_dui_xiang <>", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangGreaterThan(String value) {
            addCriterion("zhao_lu_dui_xiang >", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_lu_dui_xiang >=", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangLessThan(String value) {
            addCriterion("zhao_lu_dui_xiang <", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangLessThanOrEqualTo(String value) {
            addCriterion("zhao_lu_dui_xiang <=", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangLike(String value) {
            addCriterion("zhao_lu_dui_xiang like", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangNotLike(String value) {
            addCriterion("zhao_lu_dui_xiang not like", value, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangIn(List<String> values) {
            addCriterion("zhao_lu_dui_xiang in", values, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangNotIn(List<String> values) {
            addCriterion("zhao_lu_dui_xiang not in", values, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangBetween(String value1, String value2) {
            addCriterion("zhao_lu_dui_xiang between", value1, value2, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDuiXiangNotBetween(String value1, String value2) {
            addCriterion("zhao_lu_dui_xiang not between", value1, value2, "zhaoLuDuiXiang");
            return (Criteria) this;
        }

        public Criteria andXueLiIsNull() {
            addCriterion("xue_li is null");
            return (Criteria) this;
        }

        public Criteria andXueLiIsNotNull() {
            addCriterion("xue_li is not null");
            return (Criteria) this;
        }

        public Criteria andXueLiEqualTo(String value) {
            addCriterion("xue_li =", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiNotEqualTo(String value) {
            addCriterion("xue_li <>", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiGreaterThan(String value) {
            addCriterion("xue_li >", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiGreaterThanOrEqualTo(String value) {
            addCriterion("xue_li >=", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiLessThan(String value) {
            addCriterion("xue_li <", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiLessThanOrEqualTo(String value) {
            addCriterion("xue_li <=", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiLike(String value) {
            addCriterion("xue_li like", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiNotLike(String value) {
            addCriterion("xue_li not like", value, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiIn(List<String> values) {
            addCriterion("xue_li in", values, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiNotIn(List<String> values) {
            addCriterion("xue_li not in", values, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiBetween(String value1, String value2) {
            addCriterion("xue_li between", value1, value2, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueLiNotBetween(String value1, String value2) {
            addCriterion("xue_li not between", value1, value2, "xueLi");
            return (Criteria) this;
        }

        public Criteria andXueWeiIsNull() {
            addCriterion("xue_wei is null");
            return (Criteria) this;
        }

        public Criteria andXueWeiIsNotNull() {
            addCriterion("xue_wei is not null");
            return (Criteria) this;
        }

        public Criteria andXueWeiEqualTo(String value) {
            addCriterion("xue_wei =", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiNotEqualTo(String value) {
            addCriterion("xue_wei <>", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiGreaterThan(String value) {
            addCriterion("xue_wei >", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiGreaterThanOrEqualTo(String value) {
            addCriterion("xue_wei >=", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiLessThan(String value) {
            addCriterion("xue_wei <", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiLessThanOrEqualTo(String value) {
            addCriterion("xue_wei <=", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiLike(String value) {
            addCriterion("xue_wei like", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiNotLike(String value) {
            addCriterion("xue_wei not like", value, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiIn(List<String> values) {
            addCriterion("xue_wei in", values, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiNotIn(List<String> values) {
            addCriterion("xue_wei not in", values, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiBetween(String value1, String value2) {
            addCriterion("xue_wei between", value1, value2, "xueWei");
            return (Criteria) this;
        }

        public Criteria andXueWeiNotBetween(String value1, String value2) {
            addCriterion("xue_wei not between", value1, value2, "xueWei");
            return (Criteria) this;
        }

        public Criteria andZhuanKeIsNull() {
            addCriterion("zhuan_ke is null");
            return (Criteria) this;
        }

        public Criteria andZhuanKeIsNotNull() {
            addCriterion("zhuan_ke is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanKeEqualTo(String value) {
            addCriterion("zhuan_ke =", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeNotEqualTo(String value) {
            addCriterion("zhuan_ke <>", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeGreaterThan(String value) {
            addCriterion("zhuan_ke >", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ke >=", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeLessThan(String value) {
            addCriterion("zhuan_ke <", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeLessThanOrEqualTo(String value) {
            addCriterion("zhuan_ke <=", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeLike(String value) {
            addCriterion("zhuan_ke like", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeNotLike(String value) {
            addCriterion("zhuan_ke not like", value, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeIn(List<String> values) {
            addCriterion("zhuan_ke in", values, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeNotIn(List<String> values) {
            addCriterion("zhuan_ke not in", values, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeBetween(String value1, String value2) {
            addCriterion("zhuan_ke between", value1, value2, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andZhuanKeNotBetween(String value1, String value2) {
            addCriterion("zhuan_ke not between", value1, value2, "zhuanKe");
            return (Criteria) this;
        }

        public Criteria andBenKeIsNull() {
            addCriterion("ben_ke is null");
            return (Criteria) this;
        }

        public Criteria andBenKeIsNotNull() {
            addCriterion("ben_ke is not null");
            return (Criteria) this;
        }

        public Criteria andBenKeEqualTo(String value) {
            addCriterion("ben_ke =", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeNotEqualTo(String value) {
            addCriterion("ben_ke <>", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeGreaterThan(String value) {
            addCriterion("ben_ke >", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeGreaterThanOrEqualTo(String value) {
            addCriterion("ben_ke >=", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeLessThan(String value) {
            addCriterion("ben_ke <", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeLessThanOrEqualTo(String value) {
            addCriterion("ben_ke <=", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeLike(String value) {
            addCriterion("ben_ke like", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeNotLike(String value) {
            addCriterion("ben_ke not like", value, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeIn(List<String> values) {
            addCriterion("ben_ke in", values, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeNotIn(List<String> values) {
            addCriterion("ben_ke not in", values, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeBetween(String value1, String value2) {
            addCriterion("ben_ke between", value1, value2, "benKe");
            return (Criteria) this;
        }

        public Criteria andBenKeNotBetween(String value1, String value2) {
            addCriterion("ben_ke not between", value1, value2, "benKe");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengIsNull() {
            addCriterion("yan_jiu_sheng is null");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengIsNotNull() {
            addCriterion("yan_jiu_sheng is not null");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengEqualTo(String value) {
            addCriterion("yan_jiu_sheng =", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengNotEqualTo(String value) {
            addCriterion("yan_jiu_sheng <>", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengGreaterThan(String value) {
            addCriterion("yan_jiu_sheng >", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengGreaterThanOrEqualTo(String value) {
            addCriterion("yan_jiu_sheng >=", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengLessThan(String value) {
            addCriterion("yan_jiu_sheng <", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengLessThanOrEqualTo(String value) {
            addCriterion("yan_jiu_sheng <=", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengLike(String value) {
            addCriterion("yan_jiu_sheng like", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengNotLike(String value) {
            addCriterion("yan_jiu_sheng not like", value, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengIn(List<String> values) {
            addCriterion("yan_jiu_sheng in", values, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengNotIn(List<String> values) {
            addCriterion("yan_jiu_sheng not in", values, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengBetween(String value1, String value2) {
            addCriterion("yan_jiu_sheng between", value1, value2, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andYanJiuShengNotBetween(String value1, String value2) {
            addCriterion("yan_jiu_sheng not between", value1, value2, "yanJiuSheng");
            return (Criteria) this;
        }

        public Criteria andXingBieIsNull() {
            addCriterion("xing_bie is null");
            return (Criteria) this;
        }

        public Criteria andXingBieIsNotNull() {
            addCriterion("xing_bie is not null");
            return (Criteria) this;
        }

        public Criteria andXingBieEqualTo(String value) {
            addCriterion("xing_bie =", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotEqualTo(String value) {
            addCriterion("xing_bie <>", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieGreaterThan(String value) {
            addCriterion("xing_bie >", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieGreaterThanOrEqualTo(String value) {
            addCriterion("xing_bie >=", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLessThan(String value) {
            addCriterion("xing_bie <", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLessThanOrEqualTo(String value) {
            addCriterion("xing_bie <=", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLike(String value) {
            addCriterion("xing_bie like", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotLike(String value) {
            addCriterion("xing_bie not like", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieIn(List<String> values) {
            addCriterion("xing_bie in", values, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotIn(List<String> values) {
            addCriterion("xing_bie not in", values, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieBetween(String value1, String value2) {
            addCriterion("xing_bie between", value1, value2, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotBetween(String value1, String value2) {
            addCriterion("xing_bie not between", value1, value2, "xingBie");
            return (Criteria) this;
        }

        public Criteria andHuJiIsNull() {
            addCriterion("hu_ji is null");
            return (Criteria) this;
        }

        public Criteria andHuJiIsNotNull() {
            addCriterion("hu_ji is not null");
            return (Criteria) this;
        }

        public Criteria andHuJiEqualTo(String value) {
            addCriterion("hu_ji =", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotEqualTo(String value) {
            addCriterion("hu_ji <>", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiGreaterThan(String value) {
            addCriterion("hu_ji >", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiGreaterThanOrEqualTo(String value) {
            addCriterion("hu_ji >=", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiLessThan(String value) {
            addCriterion("hu_ji <", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiLessThanOrEqualTo(String value) {
            addCriterion("hu_ji <=", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiLike(String value) {
            addCriterion("hu_ji like", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotLike(String value) {
            addCriterion("hu_ji not like", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiIn(List<String> values) {
            addCriterion("hu_ji in", values, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotIn(List<String> values) {
            addCriterion("hu_ji not in", values, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiBetween(String value1, String value2) {
            addCriterion("hu_ji between", value1, value2, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotBetween(String value1, String value2) {
            addCriterion("hu_ji not between", value1, value2, "huJi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoIsNull() {
            addCriterion("zheng_zhi_mian_mao is null");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoIsNotNull() {
            addCriterion("zheng_zhi_mian_mao is not null");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao =", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao <>", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoGreaterThan(String value) {
            addCriterion("zheng_zhi_mian_mao >", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoGreaterThanOrEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao >=", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoLessThan(String value) {
            addCriterion("zheng_zhi_mian_mao <", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoLessThanOrEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao <=", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoLike(String value) {
            addCriterion("zheng_zhi_mian_mao like", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotLike(String value) {
            addCriterion("zheng_zhi_mian_mao not like", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoIn(List<String> values) {
            addCriterion("zheng_zhi_mian_mao in", values, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotIn(List<String> values) {
            addCriterion("zheng_zhi_mian_mao not in", values, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoBetween(String value1, String value2) {
            addCriterion("zheng_zhi_mian_mao between", value1, value2, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotBetween(String value1, String value2) {
            addCriterion("zheng_zhi_mian_mao not between", value1, value2, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianIsNull() {
            addCriterion("gong_zuo_nian_xian is null");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianIsNotNull() {
            addCriterion("gong_zuo_nian_xian is not null");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianEqualTo(String value) {
            addCriterion("gong_zuo_nian_xian =", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianNotEqualTo(String value) {
            addCriterion("gong_zuo_nian_xian <>", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianGreaterThan(String value) {
            addCriterion("gong_zuo_nian_xian >", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianGreaterThanOrEqualTo(String value) {
            addCriterion("gong_zuo_nian_xian >=", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianLessThan(String value) {
            addCriterion("gong_zuo_nian_xian <", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianLessThanOrEqualTo(String value) {
            addCriterion("gong_zuo_nian_xian <=", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianLike(String value) {
            addCriterion("gong_zuo_nian_xian like", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianNotLike(String value) {
            addCriterion("gong_zuo_nian_xian not like", value, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianIn(List<String> values) {
            addCriterion("gong_zuo_nian_xian in", values, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianNotIn(List<String> values) {
            addCriterion("gong_zuo_nian_xian not in", values, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianBetween(String value1, String value2) {
            addCriterion("gong_zuo_nian_xian between", value1, value2, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andGongZuoNianXianNotBetween(String value1, String value2) {
            addCriterion("gong_zuo_nian_xian not between", value1, value2, "gongZuoNianXian");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiIsNull() {
            addCriterion("zhuan_ye_kao_shi is null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiIsNotNull() {
            addCriterion("zhuan_ye_kao_shi is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiEqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi =", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiNotEqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi <>", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiGreaterThan(String value) {
            addCriterion("zhuan_ye_kao_shi >", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi >=", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiLessThan(String value) {
            addCriterion("zhuan_ye_kao_shi <", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiLessThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi <=", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiLike(String value) {
            addCriterion("zhuan_ye_kao_shi like", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiNotLike(String value) {
            addCriterion("zhuan_ye_kao_shi not like", value, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiIn(List<String> values) {
            addCriterion("zhuan_ye_kao_shi in", values, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiNotIn(List<String> values) {
            addCriterion("zhuan_ye_kao_shi not in", values, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiBetween(String value1, String value2) {
            addCriterion("zhuan_ye_kao_shi between", value1, value2, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShiNotBetween(String value1, String value2) {
            addCriterion("zhuan_ye_kao_shi not between", value1, value2, "zhuanYeKaoShi");
            return (Criteria) this;
        }

        public Criteria andTiJianIsNull() {
            addCriterion("ti_jian is null");
            return (Criteria) this;
        }

        public Criteria andTiJianIsNotNull() {
            addCriterion("ti_jian is not null");
            return (Criteria) this;
        }

        public Criteria andTiJianEqualTo(String value) {
            addCriterion("ti_jian =", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianNotEqualTo(String value) {
            addCriterion("ti_jian <>", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianGreaterThan(String value) {
            addCriterion("ti_jian >", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianGreaterThanOrEqualTo(String value) {
            addCriterion("ti_jian >=", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianLessThan(String value) {
            addCriterion("ti_jian <", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianLessThanOrEqualTo(String value) {
            addCriterion("ti_jian <=", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianLike(String value) {
            addCriterion("ti_jian like", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianNotLike(String value) {
            addCriterion("ti_jian not like", value, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianIn(List<String> values) {
            addCriterion("ti_jian in", values, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianNotIn(List<String> values) {
            addCriterion("ti_jian not in", values, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianBetween(String value1, String value2) {
            addCriterion("ti_jian between", value1, value2, "tiJian");
            return (Criteria) this;
        }

        public Criteria andTiJianNotBetween(String value1, String value2) {
            addCriterion("ti_jian not between", value1, value2, "tiJian");
            return (Criteria) this;
        }

        public Criteria andDiDianIsNull() {
            addCriterion("di_dian is null");
            return (Criteria) this;
        }

        public Criteria andDiDianIsNotNull() {
            addCriterion("di_dian is not null");
            return (Criteria) this;
        }

        public Criteria andDiDianEqualTo(String value) {
            addCriterion("di_dian =", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianNotEqualTo(String value) {
            addCriterion("di_dian <>", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianGreaterThan(String value) {
            addCriterion("di_dian >", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianGreaterThanOrEqualTo(String value) {
            addCriterion("di_dian >=", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianLessThan(String value) {
            addCriterion("di_dian <", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianLessThanOrEqualTo(String value) {
            addCriterion("di_dian <=", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianLike(String value) {
            addCriterion("di_dian like", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianNotLike(String value) {
            addCriterion("di_dian not like", value, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianIn(List<String> values) {
            addCriterion("di_dian in", values, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianNotIn(List<String> values) {
            addCriterion("di_dian not in", values, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianBetween(String value1, String value2) {
            addCriterion("di_dian between", value1, value2, "diDian");
            return (Criteria) this;
        }

        public Criteria andDiDianNotBetween(String value1, String value2) {
            addCriterion("di_dian not between", value1, value2, "diDian");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIsNull() {
            addCriterion("bei_zhu is null");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIsNotNull() {
            addCriterion("bei_zhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeiZhuEqualTo(String value) {
            addCriterion("bei_zhu =", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotEqualTo(String value) {
            addCriterion("bei_zhu <>", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuGreaterThan(String value) {
            addCriterion("bei_zhu >", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuGreaterThanOrEqualTo(String value) {
            addCriterion("bei_zhu >=", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLessThan(String value) {
            addCriterion("bei_zhu <", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLessThanOrEqualTo(String value) {
            addCriterion("bei_zhu <=", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLike(String value) {
            addCriterion("bei_zhu like", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotLike(String value) {
            addCriterion("bei_zhu not like", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIn(List<String> values) {
            addCriterion("bei_zhu in", values, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotIn(List<String> values) {
            addCriterion("bei_zhu not in", values, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuBetween(String value1, String value2) {
            addCriterion("bei_zhu between", value1, value2, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotBetween(String value1, String value2) {
            addCriterion("bei_zhu not between", value1, value2, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andWangZhanIsNull() {
            addCriterion("wang_zhan is null");
            return (Criteria) this;
        }

        public Criteria andWangZhanIsNotNull() {
            addCriterion("wang_zhan is not null");
            return (Criteria) this;
        }

        public Criteria andWangZhanEqualTo(String value) {
            addCriterion("wang_zhan =", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanNotEqualTo(String value) {
            addCriterion("wang_zhan <>", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanGreaterThan(String value) {
            addCriterion("wang_zhan >", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanGreaterThanOrEqualTo(String value) {
            addCriterion("wang_zhan >=", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanLessThan(String value) {
            addCriterion("wang_zhan <", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanLessThanOrEqualTo(String value) {
            addCriterion("wang_zhan <=", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanLike(String value) {
            addCriterion("wang_zhan like", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanNotLike(String value) {
            addCriterion("wang_zhan not like", value, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanIn(List<String> values) {
            addCriterion("wang_zhan in", values, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanNotIn(List<String> values) {
            addCriterion("wang_zhan not in", values, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanBetween(String value1, String value2) {
            addCriterion("wang_zhan between", value1, value2, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andWangZhanNotBetween(String value1, String value2) {
            addCriterion("wang_zhan not between", value1, value2, "wangZhan");
            return (Criteria) this;
        }

        public Criteria andDianHua1IsNull() {
            addCriterion("dian_hua_1 is null");
            return (Criteria) this;
        }

        public Criteria andDianHua1IsNotNull() {
            addCriterion("dian_hua_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDianHua1EqualTo(String value) {
            addCriterion("dian_hua_1 =", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1NotEqualTo(String value) {
            addCriterion("dian_hua_1 <>", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1GreaterThan(String value) {
            addCriterion("dian_hua_1 >", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1GreaterThanOrEqualTo(String value) {
            addCriterion("dian_hua_1 >=", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1LessThan(String value) {
            addCriterion("dian_hua_1 <", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1LessThanOrEqualTo(String value) {
            addCriterion("dian_hua_1 <=", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1Like(String value) {
            addCriterion("dian_hua_1 like", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1NotLike(String value) {
            addCriterion("dian_hua_1 not like", value, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1In(List<String> values) {
            addCriterion("dian_hua_1 in", values, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1NotIn(List<String> values) {
            addCriterion("dian_hua_1 not in", values, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1Between(String value1, String value2) {
            addCriterion("dian_hua_1 between", value1, value2, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua1NotBetween(String value1, String value2) {
            addCriterion("dian_hua_1 not between", value1, value2, "dianHua1");
            return (Criteria) this;
        }

        public Criteria andDianHua2IsNull() {
            addCriterion("dian_hua_2 is null");
            return (Criteria) this;
        }

        public Criteria andDianHua2IsNotNull() {
            addCriterion("dian_hua_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDianHua2EqualTo(String value) {
            addCriterion("dian_hua_2 =", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2NotEqualTo(String value) {
            addCriterion("dian_hua_2 <>", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2GreaterThan(String value) {
            addCriterion("dian_hua_2 >", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2GreaterThanOrEqualTo(String value) {
            addCriterion("dian_hua_2 >=", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2LessThan(String value) {
            addCriterion("dian_hua_2 <", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2LessThanOrEqualTo(String value) {
            addCriterion("dian_hua_2 <=", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2Like(String value) {
            addCriterion("dian_hua_2 like", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2NotLike(String value) {
            addCriterion("dian_hua_2 not like", value, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2In(List<String> values) {
            addCriterion("dian_hua_2 in", values, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2NotIn(List<String> values) {
            addCriterion("dian_hua_2 not in", values, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2Between(String value1, String value2) {
            addCriterion("dian_hua_2 between", value1, value2, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andDianHua2NotBetween(String value1, String value2) {
            addCriterion("dian_hua_2 not between", value1, value2, "dianHua2");
            return (Criteria) this;
        }

        public Criteria andPassCheckIsNull() {
            addCriterion("pass_check is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckIsNotNull() {
            addCriterion("pass_check is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckEqualTo(String value) {
            addCriterion("pass_check =", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckNotEqualTo(String value) {
            addCriterion("pass_check <>", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckGreaterThan(String value) {
            addCriterion("pass_check >", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckGreaterThanOrEqualTo(String value) {
            addCriterion("pass_check >=", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckLessThan(String value) {
            addCriterion("pass_check <", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckLessThanOrEqualTo(String value) {
            addCriterion("pass_check <=", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckLike(String value) {
            addCriterion("pass_check like", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckNotLike(String value) {
            addCriterion("pass_check not like", value, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckIn(List<String> values) {
            addCriterion("pass_check in", values, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckNotIn(List<String> values) {
            addCriterion("pass_check not in", values, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckBetween(String value1, String value2) {
            addCriterion("pass_check between", value1, value2, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassCheckNotBetween(String value1, String value2) {
            addCriterion("pass_check not between", value1, value2, "passCheck");
            return (Criteria) this;
        }

        public Criteria andPassPayIsNull() {
            addCriterion("pass_pay is null");
            return (Criteria) this;
        }

        public Criteria andPassPayIsNotNull() {
            addCriterion("pass_pay is not null");
            return (Criteria) this;
        }

        public Criteria andPassPayEqualTo(String value) {
            addCriterion("pass_pay =", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayNotEqualTo(String value) {
            addCriterion("pass_pay <>", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayGreaterThan(String value) {
            addCriterion("pass_pay >", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayGreaterThanOrEqualTo(String value) {
            addCriterion("pass_pay >=", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayLessThan(String value) {
            addCriterion("pass_pay <", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayLessThanOrEqualTo(String value) {
            addCriterion("pass_pay <=", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayLike(String value) {
            addCriterion("pass_pay like", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayNotLike(String value) {
            addCriterion("pass_pay not like", value, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayIn(List<String> values) {
            addCriterion("pass_pay in", values, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayNotIn(List<String> values) {
            addCriterion("pass_pay not in", values, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayBetween(String value1, String value2) {
            addCriterion("pass_pay between", value1, value2, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayNotBetween(String value1, String value2) {
            addCriterion("pass_pay not between", value1, value2, "passPay");
            return (Criteria) this;
        }

        public Criteria andPassPayIntIsNull() {
            addCriterion("pass_pay_int is null");
            return (Criteria) this;
        }

        public Criteria andPassPayIntIsNotNull() {
            addCriterion("pass_pay_int is not null");
            return (Criteria) this;
        }

        public Criteria andPassPayIntEqualTo(Integer value) {
            addCriterion("pass_pay_int =", value, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntNotEqualTo(Integer value) {
            addCriterion("pass_pay_int <>", value, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntGreaterThan(Integer value) {
            addCriterion("pass_pay_int >", value, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_pay_int >=", value, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntLessThan(Integer value) {
            addCriterion("pass_pay_int <", value, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntLessThanOrEqualTo(Integer value) {
            addCriterion("pass_pay_int <=", value, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntIn(List<Integer> values) {
            addCriterion("pass_pay_int in", values, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntNotIn(List<Integer> values) {
            addCriterion("pass_pay_int not in", values, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntBetween(Integer value1, Integer value2) {
            addCriterion("pass_pay_int between", value1, value2, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassPayIntNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_pay_int not between", value1, value2, "passPayInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntIsNull() {
            addCriterion("pass_check_int is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntIsNotNull() {
            addCriterion("pass_check_int is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntEqualTo(Integer value) {
            addCriterion("pass_check_int =", value, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntNotEqualTo(Integer value) {
            addCriterion("pass_check_int <>", value, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntGreaterThan(Integer value) {
            addCriterion("pass_check_int >", value, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_check_int >=", value, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntLessThan(Integer value) {
            addCriterion("pass_check_int <", value, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntLessThanOrEqualTo(Integer value) {
            addCriterion("pass_check_int <=", value, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntIn(List<Integer> values) {
            addCriterion("pass_check_int in", values, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntNotIn(List<Integer> values) {
            addCriterion("pass_check_int not in", values, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntBetween(Integer value1, Integer value2) {
            addCriterion("pass_check_int between", value1, value2, "passCheckInt");
            return (Criteria) this;
        }

        public Criteria andPassCheckIntNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_check_int not between", value1, value2, "passCheckInt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}