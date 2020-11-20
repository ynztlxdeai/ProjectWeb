package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class ShanDong202002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShanDong202002Example() {
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

        public Criteria andJobIndexIsNull() {
            addCriterion("job_index is null");
            return (Criteria) this;
        }

        public Criteria andJobIndexIsNotNull() {
            addCriterion("job_index is not null");
            return (Criteria) this;
        }

        public Criteria andJobIndexEqualTo(Integer value) {
            addCriterion("job_index =", value, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexNotEqualTo(Integer value) {
            addCriterion("job_index <>", value, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexGreaterThan(Integer value) {
            addCriterion("job_index >", value, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_index >=", value, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexLessThan(Integer value) {
            addCriterion("job_index <", value, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexLessThanOrEqualTo(Integer value) {
            addCriterion("job_index <=", value, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexIn(List<Integer> values) {
            addCriterion("job_index in", values, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexNotIn(List<Integer> values) {
            addCriterion("job_index not in", values, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexBetween(Integer value1, Integer value2) {
            addCriterion("job_index between", value1, value2, "jobIndex");
            return (Criteria) this;
        }

        public Criteria andJobIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("job_index not between", value1, value2, "jobIndex");
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

        public Criteria andJobCodeIsNull() {
            addCriterion("job_code is null");
            return (Criteria) this;
        }

        public Criteria andJobCodeIsNotNull() {
            addCriterion("job_code is not null");
            return (Criteria) this;
        }

        public Criteria andJobCodeEqualTo(String value) {
            addCriterion("job_code =", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotEqualTo(String value) {
            addCriterion("job_code <>", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThan(String value) {
            addCriterion("job_code >", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThanOrEqualTo(String value) {
            addCriterion("job_code >=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThan(String value) {
            addCriterion("job_code <", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThanOrEqualTo(String value) {
            addCriterion("job_code <=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLike(String value) {
            addCriterion("job_code like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotLike(String value) {
            addCriterion("job_code not like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeIn(List<String> values) {
            addCriterion("job_code in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotIn(List<String> values) {
            addCriterion("job_code not in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeBetween(String value1, String value2) {
            addCriterion("job_code between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotBetween(String value1, String value2) {
            addCriterion("job_code not between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
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

        public Criteria andJobDescIsNull() {
            addCriterion("job_desc is null");
            return (Criteria) this;
        }

        public Criteria andJobDescIsNotNull() {
            addCriterion("job_desc is not null");
            return (Criteria) this;
        }

        public Criteria andJobDescEqualTo(String value) {
            addCriterion("job_desc =", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotEqualTo(String value) {
            addCriterion("job_desc <>", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThan(String value) {
            addCriterion("job_desc >", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThanOrEqualTo(String value) {
            addCriterion("job_desc >=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThan(String value) {
            addCriterion("job_desc <", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThanOrEqualTo(String value) {
            addCriterion("job_desc <=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLike(String value) {
            addCriterion("job_desc like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotLike(String value) {
            addCriterion("job_desc not like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescIn(List<String> values) {
            addCriterion("job_desc in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotIn(List<String> values) {
            addCriterion("job_desc not in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescBetween(String value1, String value2) {
            addCriterion("job_desc between", value1, value2, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotBetween(String value1, String value2) {
            addCriterion("job_desc not between", value1, value2, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andNeedNumIsNull() {
            addCriterion("need_num is null");
            return (Criteria) this;
        }

        public Criteria andNeedNumIsNotNull() {
            addCriterion("need_num is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNumEqualTo(String value) {
            addCriterion("need_num =", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotEqualTo(String value) {
            addCriterion("need_num <>", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThan(String value) {
            addCriterion("need_num >", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThanOrEqualTo(String value) {
            addCriterion("need_num >=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThan(String value) {
            addCriterion("need_num <", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThanOrEqualTo(String value) {
            addCriterion("need_num <=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLike(String value) {
            addCriterion("need_num like", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotLike(String value) {
            addCriterion("need_num not like", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumIn(List<String> values) {
            addCriterion("need_num in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotIn(List<String> values) {
            addCriterion("need_num not in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumBetween(String value1, String value2) {
            addCriterion("need_num between", value1, value2, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotBetween(String value1, String value2) {
            addCriterion("need_num not between", value1, value2, "needNum");
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

        public Criteria andDaXueZhuanKeIsNull() {
            addCriterion("da_xue_zhuan_ke is null");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeIsNotNull() {
            addCriterion("da_xue_zhuan_ke is not null");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeEqualTo(String value) {
            addCriterion("da_xue_zhuan_ke =", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeNotEqualTo(String value) {
            addCriterion("da_xue_zhuan_ke <>", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeGreaterThan(String value) {
            addCriterion("da_xue_zhuan_ke >", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeGreaterThanOrEqualTo(String value) {
            addCriterion("da_xue_zhuan_ke >=", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeLessThan(String value) {
            addCriterion("da_xue_zhuan_ke <", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeLessThanOrEqualTo(String value) {
            addCriterion("da_xue_zhuan_ke <=", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeLike(String value) {
            addCriterion("da_xue_zhuan_ke like", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeNotLike(String value) {
            addCriterion("da_xue_zhuan_ke not like", value, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeIn(List<String> values) {
            addCriterion("da_xue_zhuan_ke in", values, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeNotIn(List<String> values) {
            addCriterion("da_xue_zhuan_ke not in", values, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeBetween(String value1, String value2) {
            addCriterion("da_xue_zhuan_ke between", value1, value2, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueZhuanKeNotBetween(String value1, String value2) {
            addCriterion("da_xue_zhuan_ke not between", value1, value2, "daXueZhuanKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeIsNull() {
            addCriterion("da_xue_ben_ke is null");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeIsNotNull() {
            addCriterion("da_xue_ben_ke is not null");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeEqualTo(String value) {
            addCriterion("da_xue_ben_ke =", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeNotEqualTo(String value) {
            addCriterion("da_xue_ben_ke <>", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeGreaterThan(String value) {
            addCriterion("da_xue_ben_ke >", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeGreaterThanOrEqualTo(String value) {
            addCriterion("da_xue_ben_ke >=", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeLessThan(String value) {
            addCriterion("da_xue_ben_ke <", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeLessThanOrEqualTo(String value) {
            addCriterion("da_xue_ben_ke <=", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeLike(String value) {
            addCriterion("da_xue_ben_ke like", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeNotLike(String value) {
            addCriterion("da_xue_ben_ke not like", value, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeIn(List<String> values) {
            addCriterion("da_xue_ben_ke in", values, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeNotIn(List<String> values) {
            addCriterion("da_xue_ben_ke not in", values, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeBetween(String value1, String value2) {
            addCriterion("da_xue_ben_ke between", value1, value2, "daXueBenKe");
            return (Criteria) this;
        }

        public Criteria andDaXueBenKeNotBetween(String value1, String value2) {
            addCriterion("da_xue_ben_ke not between", value1, value2, "daXueBenKe");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andJiCengGongZuoIsNull() {
            addCriterion("ji_ceng_gong_zuo is null");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoIsNotNull() {
            addCriterion("ji_ceng_gong_zuo is not null");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoEqualTo(String value) {
            addCriterion("ji_ceng_gong_zuo =", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoNotEqualTo(String value) {
            addCriterion("ji_ceng_gong_zuo <>", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoGreaterThan(String value) {
            addCriterion("ji_ceng_gong_zuo >", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoGreaterThanOrEqualTo(String value) {
            addCriterion("ji_ceng_gong_zuo >=", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoLessThan(String value) {
            addCriterion("ji_ceng_gong_zuo <", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoLessThanOrEqualTo(String value) {
            addCriterion("ji_ceng_gong_zuo <=", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoLike(String value) {
            addCriterion("ji_ceng_gong_zuo like", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoNotLike(String value) {
            addCriterion("ji_ceng_gong_zuo not like", value, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoIn(List<String> values) {
            addCriterion("ji_ceng_gong_zuo in", values, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoNotIn(List<String> values) {
            addCriterion("ji_ceng_gong_zuo not in", values, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoBetween(String value1, String value2) {
            addCriterion("ji_ceng_gong_zuo between", value1, value2, "jiCengGongZuo");
            return (Criteria) this;
        }

        public Criteria andJiCengGongZuoNotBetween(String value1, String value2) {
            addCriterion("ji_ceng_gong_zuo not between", value1, value2, "jiCengGongZuo");
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

        public Criteria andZhuanYeKaoShi2IsNull() {
            addCriterion("zhuan_ye_kao_shi_2 is null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2IsNotNull() {
            addCriterion("zhuan_ye_kao_shi_2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2EqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi_2 =", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2NotEqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi_2 <>", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2GreaterThan(String value) {
            addCriterion("zhuan_ye_kao_shi_2 >", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2GreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi_2 >=", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2LessThan(String value) {
            addCriterion("zhuan_ye_kao_shi_2 <", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2LessThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_kao_shi_2 <=", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2Like(String value) {
            addCriterion("zhuan_ye_kao_shi_2 like", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2NotLike(String value) {
            addCriterion("zhuan_ye_kao_shi_2 not like", value, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2In(List<String> values) {
            addCriterion("zhuan_ye_kao_shi_2 in", values, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2NotIn(List<String> values) {
            addCriterion("zhuan_ye_kao_shi_2 not in", values, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2Between(String value1, String value2) {
            addCriterion("zhuan_ye_kao_shi_2 between", value1, value2, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKaoShi2NotBetween(String value1, String value2) {
            addCriterion("zhuan_ye_kao_shi_2 not between", value1, value2, "zhuanYeKaoShi2");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaIsNull() {
            addCriterion("cha_e_kao_cha is null");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaIsNotNull() {
            addCriterion("cha_e_kao_cha is not null");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaEqualTo(String value) {
            addCriterion("cha_e_kao_cha =", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaNotEqualTo(String value) {
            addCriterion("cha_e_kao_cha <>", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaGreaterThan(String value) {
            addCriterion("cha_e_kao_cha >", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaGreaterThanOrEqualTo(String value) {
            addCriterion("cha_e_kao_cha >=", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaLessThan(String value) {
            addCriterion("cha_e_kao_cha <", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaLessThanOrEqualTo(String value) {
            addCriterion("cha_e_kao_cha <=", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaLike(String value) {
            addCriterion("cha_e_kao_cha like", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaNotLike(String value) {
            addCriterion("cha_e_kao_cha not like", value, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaIn(List<String> values) {
            addCriterion("cha_e_kao_cha in", values, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaNotIn(List<String> values) {
            addCriterion("cha_e_kao_cha not in", values, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaBetween(String value1, String value2) {
            addCriterion("cha_e_kao_cha between", value1, value2, "chaEKaoCha");
            return (Criteria) this;
        }

        public Criteria andChaEKaoChaNotBetween(String value1, String value2) {
            addCriterion("cha_e_kao_cha not between", value1, value2, "chaEKaoCha");
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

        public Criteria andWebIsNull() {
            addCriterion("web is null");
            return (Criteria) this;
        }

        public Criteria andWebIsNotNull() {
            addCriterion("web is not null");
            return (Criteria) this;
        }

        public Criteria andWebEqualTo(String value) {
            addCriterion("web =", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotEqualTo(String value) {
            addCriterion("web <>", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThan(String value) {
            addCriterion("web >", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThanOrEqualTo(String value) {
            addCriterion("web >=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThan(String value) {
            addCriterion("web <", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThanOrEqualTo(String value) {
            addCriterion("web <=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLike(String value) {
            addCriterion("web like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotLike(String value) {
            addCriterion("web not like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebIn(List<String> values) {
            addCriterion("web in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotIn(List<String> values) {
            addCriterion("web not in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebBetween(String value1, String value2) {
            addCriterion("web between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotBetween(String value1, String value2) {
            addCriterion("web not between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNull() {
            addCriterion("phone1 is null");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNotNull() {
            addCriterion("phone1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone1EqualTo(String value) {
            addCriterion("phone1 =", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotEqualTo(String value) {
            addCriterion("phone1 <>", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThan(String value) {
            addCriterion("phone1 >", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("phone1 >=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThan(String value) {
            addCriterion("phone1 <", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThanOrEqualTo(String value) {
            addCriterion("phone1 <=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Like(String value) {
            addCriterion("phone1 like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotLike(String value) {
            addCriterion("phone1 not like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1In(List<String> values) {
            addCriterion("phone1 in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotIn(List<String> values) {
            addCriterion("phone1 not in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Between(String value1, String value2) {
            addCriterion("phone1 between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotBetween(String value1, String value2) {
            addCriterion("phone1 not between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("phone2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("phone2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("phone2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("phone2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("phone2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("phone2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("phone2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("phone2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("phone2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("phone2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("phone2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("phone2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("phone2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone3IsNull() {
            addCriterion("phone3 is null");
            return (Criteria) this;
        }

        public Criteria andPhone3IsNotNull() {
            addCriterion("phone3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone3EqualTo(String value) {
            addCriterion("phone3 =", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotEqualTo(String value) {
            addCriterion("phone3 <>", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3GreaterThan(String value) {
            addCriterion("phone3 >", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3GreaterThanOrEqualTo(String value) {
            addCriterion("phone3 >=", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3LessThan(String value) {
            addCriterion("phone3 <", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3LessThanOrEqualTo(String value) {
            addCriterion("phone3 <=", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3Like(String value) {
            addCriterion("phone3 like", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotLike(String value) {
            addCriterion("phone3 not like", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3In(List<String> values) {
            addCriterion("phone3 in", values, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotIn(List<String> values) {
            addCriterion("phone3 not in", values, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3Between(String value1, String value2) {
            addCriterion("phone3 between", value1, value2, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotBetween(String value1, String value2) {
            addCriterion("phone3 not between", value1, value2, "phone3");
            return (Criteria) this;
        }

        public Criteria andCanNumIsNull() {
            addCriterion("can_num is null");
            return (Criteria) this;
        }

        public Criteria andCanNumIsNotNull() {
            addCriterion("can_num is not null");
            return (Criteria) this;
        }

        public Criteria andCanNumEqualTo(String value) {
            addCriterion("can_num =", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumNotEqualTo(String value) {
            addCriterion("can_num <>", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumGreaterThan(String value) {
            addCriterion("can_num >", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumGreaterThanOrEqualTo(String value) {
            addCriterion("can_num >=", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumLessThan(String value) {
            addCriterion("can_num <", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumLessThanOrEqualTo(String value) {
            addCriterion("can_num <=", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumLike(String value) {
            addCriterion("can_num like", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumNotLike(String value) {
            addCriterion("can_num not like", value, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumIn(List<String> values) {
            addCriterion("can_num in", values, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumNotIn(List<String> values) {
            addCriterion("can_num not in", values, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumBetween(String value1, String value2) {
            addCriterion("can_num between", value1, value2, "canNum");
            return (Criteria) this;
        }

        public Criteria andCanNumNotBetween(String value1, String value2) {
            addCriterion("can_num not between", value1, value2, "canNum");
            return (Criteria) this;
        }

        public Criteria andHasNumIsNull() {
            addCriterion("has_num is null");
            return (Criteria) this;
        }

        public Criteria andHasNumIsNotNull() {
            addCriterion("has_num is not null");
            return (Criteria) this;
        }

        public Criteria andHasNumEqualTo(String value) {
            addCriterion("has_num =", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumNotEqualTo(String value) {
            addCriterion("has_num <>", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumGreaterThan(String value) {
            addCriterion("has_num >", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumGreaterThanOrEqualTo(String value) {
            addCriterion("has_num >=", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumLessThan(String value) {
            addCriterion("has_num <", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumLessThanOrEqualTo(String value) {
            addCriterion("has_num <=", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumLike(String value) {
            addCriterion("has_num like", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumNotLike(String value) {
            addCriterion("has_num not like", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumIn(List<String> values) {
            addCriterion("has_num in", values, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumNotIn(List<String> values) {
            addCriterion("has_num not in", values, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumBetween(String value1, String value2) {
            addCriterion("has_num between", value1, value2, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumNotBetween(String value1, String value2) {
            addCriterion("has_num not between", value1, value2, "hasNum");
            return (Criteria) this;
        }

        public Criteria andIntNumIsNull() {
            addCriterion("int_num is null");
            return (Criteria) this;
        }

        public Criteria andIntNumIsNotNull() {
            addCriterion("int_num is not null");
            return (Criteria) this;
        }

        public Criteria andIntNumEqualTo(Integer value) {
            addCriterion("int_num =", value, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumNotEqualTo(Integer value) {
            addCriterion("int_num <>", value, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumGreaterThan(Integer value) {
            addCriterion("int_num >", value, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("int_num >=", value, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumLessThan(Integer value) {
            addCriterion("int_num <", value, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumLessThanOrEqualTo(Integer value) {
            addCriterion("int_num <=", value, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumIn(List<Integer> values) {
            addCriterion("int_num in", values, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumNotIn(List<Integer> values) {
            addCriterion("int_num not in", values, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumBetween(Integer value1, Integer value2) {
            addCriterion("int_num between", value1, value2, "intNum");
            return (Criteria) this;
        }

        public Criteria andIntNumNotBetween(Integer value1, Integer value2) {
            addCriterion("int_num not between", value1, value2, "intNum");
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