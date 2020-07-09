package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class Gx202001Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Gx202001Example() {
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

        public Criteria andIndexIdIsNull() {
            addCriterion("index_id is null");
            return (Criteria) this;
        }

        public Criteria andIndexIdIsNotNull() {
            addCriterion("index_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndexIdEqualTo(Integer value) {
            addCriterion("index_id =", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotEqualTo(Integer value) {
            addCriterion("index_id <>", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThan(Integer value) {
            addCriterion("index_id >", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_id >=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThan(Integer value) {
            addCriterion("index_id <", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThanOrEqualTo(Integer value) {
            addCriterion("index_id <=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdIn(List<Integer> values) {
            addCriterion("index_id in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotIn(List<Integer> values) {
            addCriterion("index_id not in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdBetween(Integer value1, Integer value2) {
            addCriterion("index_id between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotBetween(Integer value1, Integer value2) {
            addCriterion("index_id not between", value1, value2, "indexId");
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

        public Criteria andDanWeiIsNull() {
            addCriterion("dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andDanWeiIsNotNull() {
            addCriterion("dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andDanWeiEqualTo(String value) {
            addCriterion("dan_wei =", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotEqualTo(String value) {
            addCriterion("dan_wei <>", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiGreaterThan(String value) {
            addCriterion("dan_wei >", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("dan_wei >=", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiLessThan(String value) {
            addCriterion("dan_wei <", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiLessThanOrEqualTo(String value) {
            addCriterion("dan_wei <=", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiLike(String value) {
            addCriterion("dan_wei like", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotLike(String value) {
            addCriterion("dan_wei not like", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiIn(List<String> values) {
            addCriterion("dan_wei in", values, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotIn(List<String> values) {
            addCriterion("dan_wei not in", values, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiBetween(String value1, String value2) {
            addCriterion("dan_wei between", value1, value2, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotBetween(String value1, String value2) {
            addCriterion("dan_wei not between", value1, value2, "danWei");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiIsNull() {
            addCriterion("ji_gou_ceng_ji is null");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiIsNotNull() {
            addCriterion("ji_gou_ceng_ji is not null");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiEqualTo(String value) {
            addCriterion("ji_gou_ceng_ji =", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiNotEqualTo(String value) {
            addCriterion("ji_gou_ceng_ji <>", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiGreaterThan(String value) {
            addCriterion("ji_gou_ceng_ji >", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiGreaterThanOrEqualTo(String value) {
            addCriterion("ji_gou_ceng_ji >=", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiLessThan(String value) {
            addCriterion("ji_gou_ceng_ji <", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiLessThanOrEqualTo(String value) {
            addCriterion("ji_gou_ceng_ji <=", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiLike(String value) {
            addCriterion("ji_gou_ceng_ji like", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiNotLike(String value) {
            addCriterion("ji_gou_ceng_ji not like", value, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiIn(List<String> values) {
            addCriterion("ji_gou_ceng_ji in", values, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiNotIn(List<String> values) {
            addCriterion("ji_gou_ceng_ji not in", values, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiBetween(String value1, String value2) {
            addCriterion("ji_gou_ceng_ji between", value1, value2, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andJiGouCengJiNotBetween(String value1, String value2) {
            addCriterion("ji_gou_ceng_ji not between", value1, value2, "jiGouCengJi");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingIsNull() {
            addCriterion("xi_tong_shu_xing is null");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingIsNotNull() {
            addCriterion("xi_tong_shu_xing is not null");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingEqualTo(String value) {
            addCriterion("xi_tong_shu_xing =", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingNotEqualTo(String value) {
            addCriterion("xi_tong_shu_xing <>", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingGreaterThan(String value) {
            addCriterion("xi_tong_shu_xing >", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingGreaterThanOrEqualTo(String value) {
            addCriterion("xi_tong_shu_xing >=", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingLessThan(String value) {
            addCriterion("xi_tong_shu_xing <", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingLessThanOrEqualTo(String value) {
            addCriterion("xi_tong_shu_xing <=", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingLike(String value) {
            addCriterion("xi_tong_shu_xing like", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingNotLike(String value) {
            addCriterion("xi_tong_shu_xing not like", value, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingIn(List<String> values) {
            addCriterion("xi_tong_shu_xing in", values, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingNotIn(List<String> values) {
            addCriterion("xi_tong_shu_xing not in", values, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingBetween(String value1, String value2) {
            addCriterion("xi_tong_shu_xing between", value1, value2, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andXiTongShuXingNotBetween(String value1, String value2) {
            addCriterion("xi_tong_shu_xing not between", value1, value2, "xiTongShuXing");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiIsNull() {
            addCriterion("dan_wei_xing_zhi is null");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiIsNotNull() {
            addCriterion("dan_wei_xing_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiEqualTo(String value) {
            addCriterion("dan_wei_xing_zhi =", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiNotEqualTo(String value) {
            addCriterion("dan_wei_xing_zhi <>", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiGreaterThan(String value) {
            addCriterion("dan_wei_xing_zhi >", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiGreaterThanOrEqualTo(String value) {
            addCriterion("dan_wei_xing_zhi >=", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiLessThan(String value) {
            addCriterion("dan_wei_xing_zhi <", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiLessThanOrEqualTo(String value) {
            addCriterion("dan_wei_xing_zhi <=", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiLike(String value) {
            addCriterion("dan_wei_xing_zhi like", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiNotLike(String value) {
            addCriterion("dan_wei_xing_zhi not like", value, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiIn(List<String> values) {
            addCriterion("dan_wei_xing_zhi in", values, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiNotIn(List<String> values) {
            addCriterion("dan_wei_xing_zhi not in", values, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiBetween(String value1, String value2) {
            addCriterion("dan_wei_xing_zhi between", value1, value2, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andDanWeiXingZhiNotBetween(String value1, String value2) {
            addCriterion("dan_wei_xing_zhi not between", value1, value2, "danWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
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

        public Criteria andKaoShiLeiXingIsNull() {
            addCriterion("kao_shi_lei_xing is null");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingIsNotNull() {
            addCriterion("kao_shi_lei_xing is not null");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingEqualTo(String value) {
            addCriterion("kao_shi_lei_xing =", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingNotEqualTo(String value) {
            addCriterion("kao_shi_lei_xing <>", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingGreaterThan(String value) {
            addCriterion("kao_shi_lei_xing >", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingGreaterThanOrEqualTo(String value) {
            addCriterion("kao_shi_lei_xing >=", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingLessThan(String value) {
            addCriterion("kao_shi_lei_xing <", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingLessThanOrEqualTo(String value) {
            addCriterion("kao_shi_lei_xing <=", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingLike(String value) {
            addCriterion("kao_shi_lei_xing like", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingNotLike(String value) {
            addCriterion("kao_shi_lei_xing not like", value, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingIn(List<String> values) {
            addCriterion("kao_shi_lei_xing in", values, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingNotIn(List<String> values) {
            addCriterion("kao_shi_lei_xing not in", values, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingBetween(String value1, String value2) {
            addCriterion("kao_shi_lei_xing between", value1, value2, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andKaoShiLeiXingNotBetween(String value1, String value2) {
            addCriterion("kao_shi_lei_xing not between", value1, value2, "kaoShiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangIsNull() {
            addCriterion("zhao_kao_dui_xiang is null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangIsNotNull() {
            addCriterion("zhao_kao_dui_xiang is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangEqualTo(String value) {
            addCriterion("zhao_kao_dui_xiang =", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangNotEqualTo(String value) {
            addCriterion("zhao_kao_dui_xiang <>", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangGreaterThan(String value) {
            addCriterion("zhao_kao_dui_xiang >", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_kao_dui_xiang >=", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangLessThan(String value) {
            addCriterion("zhao_kao_dui_xiang <", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangLessThanOrEqualTo(String value) {
            addCriterion("zhao_kao_dui_xiang <=", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangLike(String value) {
            addCriterion("zhao_kao_dui_xiang like", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangNotLike(String value) {
            addCriterion("zhao_kao_dui_xiang not like", value, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangIn(List<String> values) {
            addCriterion("zhao_kao_dui_xiang in", values, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangNotIn(List<String> values) {
            addCriterion("zhao_kao_dui_xiang not in", values, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangBetween(String value1, String value2) {
            addCriterion("zhao_kao_dui_xiang between", value1, value2, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDuiXiangNotBetween(String value1, String value2) {
            addCriterion("zhao_kao_dui_xiang not between", value1, value2, "zhaoKaoDuiXiang");
            return (Criteria) this;
        }

        public Criteria andNeedNumsIsNull() {
            addCriterion("need_nums is null");
            return (Criteria) this;
        }

        public Criteria andNeedNumsIsNotNull() {
            addCriterion("need_nums is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNumsEqualTo(String value) {
            addCriterion("need_nums =", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsNotEqualTo(String value) {
            addCriterion("need_nums <>", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsGreaterThan(String value) {
            addCriterion("need_nums >", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsGreaterThanOrEqualTo(String value) {
            addCriterion("need_nums >=", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsLessThan(String value) {
            addCriterion("need_nums <", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsLessThanOrEqualTo(String value) {
            addCriterion("need_nums <=", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsLike(String value) {
            addCriterion("need_nums like", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsNotLike(String value) {
            addCriterion("need_nums not like", value, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsIn(List<String> values) {
            addCriterion("need_nums in", values, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsNotIn(List<String> values) {
            addCriterion("need_nums not in", values, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsBetween(String value1, String value2) {
            addCriterion("need_nums between", value1, value2, "needNums");
            return (Criteria) this;
        }

        public Criteria andNeedNumsNotBetween(String value1, String value2) {
            addCriterion("need_nums not between", value1, value2, "needNums");
            return (Criteria) this;
        }

        public Criteria andJianJieIsNull() {
            addCriterion("jian_jie is null");
            return (Criteria) this;
        }

        public Criteria andJianJieIsNotNull() {
            addCriterion("jian_jie is not null");
            return (Criteria) this;
        }

        public Criteria andJianJieEqualTo(String value) {
            addCriterion("jian_jie =", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieNotEqualTo(String value) {
            addCriterion("jian_jie <>", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieGreaterThan(String value) {
            addCriterion("jian_jie >", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieGreaterThanOrEqualTo(String value) {
            addCriterion("jian_jie >=", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieLessThan(String value) {
            addCriterion("jian_jie <", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieLessThanOrEqualTo(String value) {
            addCriterion("jian_jie <=", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieLike(String value) {
            addCriterion("jian_jie like", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieNotLike(String value) {
            addCriterion("jian_jie not like", value, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieIn(List<String> values) {
            addCriterion("jian_jie in", values, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieNotIn(List<String> values) {
            addCriterion("jian_jie not in", values, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieBetween(String value1, String value2) {
            addCriterion("jian_jie between", value1, value2, "jianJie");
            return (Criteria) this;
        }

        public Criteria andJianJieNotBetween(String value1, String value2) {
            addCriterion("jian_jie not between", value1, value2, "jianJie");
            return (Criteria) this;
        }

        public Criteria andZhuanYeIsNull() {
            addCriterion("zhuan_ye is null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeIsNotNull() {
            addCriterion("zhuan_ye is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeEqualTo(String value) {
            addCriterion("zhuan_ye =", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeNotEqualTo(String value) {
            addCriterion("zhuan_ye <>", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeGreaterThan(String value) {
            addCriterion("zhuan_ye >", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ye >=", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeLessThan(String value) {
            addCriterion("zhuan_ye <", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeLessThanOrEqualTo(String value) {
            addCriterion("zhuan_ye <=", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeLike(String value) {
            addCriterion("zhuan_ye like", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeNotLike(String value) {
            addCriterion("zhuan_ye not like", value, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeIn(List<String> values) {
            addCriterion("zhuan_ye in", values, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeNotIn(List<String> values) {
            addCriterion("zhuan_ye not in", values, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeBetween(String value1, String value2) {
            addCriterion("zhuan_ye between", value1, value2, "zhuanYe");
            return (Criteria) this;
        }

        public Criteria andZhuanYeNotBetween(String value1, String value2) {
            addCriterion("zhuan_ye not between", value1, value2, "zhuanYe");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanIsNull() {
            addCriterion("ji_ceng_jing_yan is null");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanIsNotNull() {
            addCriterion("ji_ceng_jing_yan is not null");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan =", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan <>", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanGreaterThan(String value) {
            addCriterion("ji_ceng_jing_yan >", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanGreaterThanOrEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan >=", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanLessThan(String value) {
            addCriterion("ji_ceng_jing_yan <", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanLessThanOrEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan <=", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanLike(String value) {
            addCriterion("ji_ceng_jing_yan like", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotLike(String value) {
            addCriterion("ji_ceng_jing_yan not like", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanIn(List<String> values) {
            addCriterion("ji_ceng_jing_yan in", values, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotIn(List<String> values) {
            addCriterion("ji_ceng_jing_yan not in", values, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanBetween(String value1, String value2) {
            addCriterion("ji_ceng_jing_yan between", value1, value2, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotBetween(String value1, String value2) {
            addCriterion("ji_ceng_jing_yan not between", value1, value2, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andYingJieShengIsNull() {
            addCriterion("ying_jie_sheng is null");
            return (Criteria) this;
        }

        public Criteria andYingJieShengIsNotNull() {
            addCriterion("ying_jie_sheng is not null");
            return (Criteria) this;
        }

        public Criteria andYingJieShengEqualTo(String value) {
            addCriterion("ying_jie_sheng =", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengNotEqualTo(String value) {
            addCriterion("ying_jie_sheng <>", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengGreaterThan(String value) {
            addCriterion("ying_jie_sheng >", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengGreaterThanOrEqualTo(String value) {
            addCriterion("ying_jie_sheng >=", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengLessThan(String value) {
            addCriterion("ying_jie_sheng <", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengLessThanOrEqualTo(String value) {
            addCriterion("ying_jie_sheng <=", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengLike(String value) {
            addCriterion("ying_jie_sheng like", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengNotLike(String value) {
            addCriterion("ying_jie_sheng not like", value, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengIn(List<String> values) {
            addCriterion("ying_jie_sheng in", values, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengNotIn(List<String> values) {
            addCriterion("ying_jie_sheng not in", values, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengBetween(String value1, String value2) {
            addCriterion("ying_jie_sheng between", value1, value2, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andYingJieShengNotBetween(String value1, String value2) {
            addCriterion("ying_jie_sheng not between", value1, value2, "yingJieSheng");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiIsNull() {
            addCriterion("jing_que_zhi_wei is null");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiIsNotNull() {
            addCriterion("jing_que_zhi_wei is not null");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiEqualTo(String value) {
            addCriterion("jing_que_zhi_wei =", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiNotEqualTo(String value) {
            addCriterion("jing_que_zhi_wei <>", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiGreaterThan(String value) {
            addCriterion("jing_que_zhi_wei >", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiGreaterThanOrEqualTo(String value) {
            addCriterion("jing_que_zhi_wei >=", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiLessThan(String value) {
            addCriterion("jing_que_zhi_wei <", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiLessThanOrEqualTo(String value) {
            addCriterion("jing_que_zhi_wei <=", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiLike(String value) {
            addCriterion("jing_que_zhi_wei like", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiNotLike(String value) {
            addCriterion("jing_que_zhi_wei not like", value, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiIn(List<String> values) {
            addCriterion("jing_que_zhi_wei in", values, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiNotIn(List<String> values) {
            addCriterion("jing_que_zhi_wei not in", values, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiBetween(String value1, String value2) {
            addCriterion("jing_que_zhi_wei between", value1, value2, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingQueZhiWeiNotBetween(String value1, String value2) {
            addCriterion("jing_que_zhi_wei not between", value1, value2, "jingQueZhiWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiIsNull() {
            addCriterion("jing_cha_gang_wei is null");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiIsNotNull() {
            addCriterion("jing_cha_gang_wei is not null");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiEqualTo(String value) {
            addCriterion("jing_cha_gang_wei =", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiNotEqualTo(String value) {
            addCriterion("jing_cha_gang_wei <>", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiGreaterThan(String value) {
            addCriterion("jing_cha_gang_wei >", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiGreaterThanOrEqualTo(String value) {
            addCriterion("jing_cha_gang_wei >=", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiLessThan(String value) {
            addCriterion("jing_cha_gang_wei <", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiLessThanOrEqualTo(String value) {
            addCriterion("jing_cha_gang_wei <=", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiLike(String value) {
            addCriterion("jing_cha_gang_wei like", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiNotLike(String value) {
            addCriterion("jing_cha_gang_wei not like", value, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiIn(List<String> values) {
            addCriterion("jing_cha_gang_wei in", values, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiNotIn(List<String> values) {
            addCriterion("jing_cha_gang_wei not in", values, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiBetween(String value1, String value2) {
            addCriterion("jing_cha_gang_wei between", value1, value2, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andJingChaGangWeiNotBetween(String value1, String value2) {
            addCriterion("jing_cha_gang_wei not between", value1, value2, "jingChaGangWei");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuIsNull() {
            addCriterion("bian_yuan_di_qu is null");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuIsNotNull() {
            addCriterion("bian_yuan_di_qu is not null");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuEqualTo(String value) {
            addCriterion("bian_yuan_di_qu =", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuNotEqualTo(String value) {
            addCriterion("bian_yuan_di_qu <>", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuGreaterThan(String value) {
            addCriterion("bian_yuan_di_qu >", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuGreaterThanOrEqualTo(String value) {
            addCriterion("bian_yuan_di_qu >=", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuLessThan(String value) {
            addCriterion("bian_yuan_di_qu <", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuLessThanOrEqualTo(String value) {
            addCriterion("bian_yuan_di_qu <=", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuLike(String value) {
            addCriterion("bian_yuan_di_qu like", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuNotLike(String value) {
            addCriterion("bian_yuan_di_qu not like", value, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuIn(List<String> values) {
            addCriterion("bian_yuan_di_qu in", values, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuNotIn(List<String> values) {
            addCriterion("bian_yuan_di_qu not in", values, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuBetween(String value1, String value2) {
            addCriterion("bian_yuan_di_qu between", value1, value2, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andBianYuanDiQuNotBetween(String value1, String value2) {
            addCriterion("bian_yuan_di_qu not between", value1, value2, "bianYuanDiQu");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiIsNull() {
            addCriterion("he_bing_zhi_wei is null");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiIsNotNull() {
            addCriterion("he_bing_zhi_wei is not null");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiEqualTo(String value) {
            addCriterion("he_bing_zhi_wei =", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiNotEqualTo(String value) {
            addCriterion("he_bing_zhi_wei <>", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiGreaterThan(String value) {
            addCriterion("he_bing_zhi_wei >", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiGreaterThanOrEqualTo(String value) {
            addCriterion("he_bing_zhi_wei >=", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiLessThan(String value) {
            addCriterion("he_bing_zhi_wei <", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiLessThanOrEqualTo(String value) {
            addCriterion("he_bing_zhi_wei <=", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiLike(String value) {
            addCriterion("he_bing_zhi_wei like", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiNotLike(String value) {
            addCriterion("he_bing_zhi_wei not like", value, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiIn(List<String> values) {
            addCriterion("he_bing_zhi_wei in", values, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiNotIn(List<String> values) {
            addCriterion("he_bing_zhi_wei not in", values, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiBetween(String value1, String value2) {
            addCriterion("he_bing_zhi_wei between", value1, value2, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andHeBingZhiWeiNotBetween(String value1, String value2) {
            addCriterion("he_bing_zhi_wei not between", value1, value2, "heBingZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiIsNull() {
            addCriterion("zhuan_ye_ce_shi is null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiIsNotNull() {
            addCriterion("zhuan_ye_ce_shi is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi =", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi <>", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiGreaterThan(String value) {
            addCriterion("zhuan_ye_ce_shi >", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi >=", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiLessThan(String value) {
            addCriterion("zhuan_ye_ce_shi <", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiLessThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi <=", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiLike(String value) {
            addCriterion("zhuan_ye_ce_shi like", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotLike(String value) {
            addCriterion("zhuan_ye_ce_shi not like", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiIn(List<String> values) {
            addCriterion("zhuan_ye_ce_shi in", values, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotIn(List<String> values) {
            addCriterion("zhuan_ye_ce_shi not in", values, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiBetween(String value1, String value2) {
            addCriterion("zhuan_ye_ce_shi between", value1, value2, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotBetween(String value1, String value2) {
            addCriterion("zhuan_ye_ce_shi not between", value1, value2, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andQiTaIsNull() {
            addCriterion("qi_ta is null");
            return (Criteria) this;
        }

        public Criteria andQiTaIsNotNull() {
            addCriterion("qi_ta is not null");
            return (Criteria) this;
        }

        public Criteria andQiTaEqualTo(String value) {
            addCriterion("qi_ta =", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaNotEqualTo(String value) {
            addCriterion("qi_ta <>", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaGreaterThan(String value) {
            addCriterion("qi_ta >", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaGreaterThanOrEqualTo(String value) {
            addCriterion("qi_ta >=", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaLessThan(String value) {
            addCriterion("qi_ta <", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaLessThanOrEqualTo(String value) {
            addCriterion("qi_ta <=", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaLike(String value) {
            addCriterion("qi_ta like", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaNotLike(String value) {
            addCriterion("qi_ta not like", value, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaIn(List<String> values) {
            addCriterion("qi_ta in", values, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaNotIn(List<String> values) {
            addCriterion("qi_ta not in", values, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaBetween(String value1, String value2) {
            addCriterion("qi_ta between", value1, value2, "qiTa");
            return (Criteria) this;
        }

        public Criteria andQiTaNotBetween(String value1, String value2) {
            addCriterion("qi_ta not between", value1, value2, "qiTa");
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

        public Criteria andShenChaDanWeiIsNull() {
            addCriterion("shen_cha_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiIsNotNull() {
            addCriterion("shen_cha_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiEqualTo(String value) {
            addCriterion("shen_cha_dan_wei =", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiNotEqualTo(String value) {
            addCriterion("shen_cha_dan_wei <>", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiGreaterThan(String value) {
            addCriterion("shen_cha_dan_wei >", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("shen_cha_dan_wei >=", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiLessThan(String value) {
            addCriterion("shen_cha_dan_wei <", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiLessThanOrEqualTo(String value) {
            addCriterion("shen_cha_dan_wei <=", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiLike(String value) {
            addCriterion("shen_cha_dan_wei like", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiNotLike(String value) {
            addCriterion("shen_cha_dan_wei not like", value, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiIn(List<String> values) {
            addCriterion("shen_cha_dan_wei in", values, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiNotIn(List<String> values) {
            addCriterion("shen_cha_dan_wei not in", values, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiBetween(String value1, String value2) {
            addCriterion("shen_cha_dan_wei between", value1, value2, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andShenChaDanWeiNotBetween(String value1, String value2) {
            addCriterion("shen_cha_dan_wei not between", value1, value2, "shenChaDanWei");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNull() {
            addCriterion("phone_1 is null");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNotNull() {
            addCriterion("phone_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone1EqualTo(String value) {
            addCriterion("phone_1 =", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotEqualTo(String value) {
            addCriterion("phone_1 <>", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThan(String value) {
            addCriterion("phone_1 >", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("phone_1 >=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThan(String value) {
            addCriterion("phone_1 <", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThanOrEqualTo(String value) {
            addCriterion("phone_1 <=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Like(String value) {
            addCriterion("phone_1 like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotLike(String value) {
            addCriterion("phone_1 not like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1In(List<String> values) {
            addCriterion("phone_1 in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotIn(List<String> values) {
            addCriterion("phone_1 not in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Between(String value1, String value2) {
            addCriterion("phone_1 between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotBetween(String value1, String value2) {
            addCriterion("phone_1 not between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("phone_2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("phone_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("phone_2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("phone_2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("phone_2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("phone_2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("phone_2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("phone_2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("phone_2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("phone_2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("phone_2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("phone_2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("phone_2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("phone_2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andChuanZhenIsNull() {
            addCriterion("chuan_zhen is null");
            return (Criteria) this;
        }

        public Criteria andChuanZhenIsNotNull() {
            addCriterion("chuan_zhen is not null");
            return (Criteria) this;
        }

        public Criteria andChuanZhenEqualTo(String value) {
            addCriterion("chuan_zhen =", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotEqualTo(String value) {
            addCriterion("chuan_zhen <>", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenGreaterThan(String value) {
            addCriterion("chuan_zhen >", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenGreaterThanOrEqualTo(String value) {
            addCriterion("chuan_zhen >=", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenLessThan(String value) {
            addCriterion("chuan_zhen <", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenLessThanOrEqualTo(String value) {
            addCriterion("chuan_zhen <=", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenLike(String value) {
            addCriterion("chuan_zhen like", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotLike(String value) {
            addCriterion("chuan_zhen not like", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenIn(List<String> values) {
            addCriterion("chuan_zhen in", values, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotIn(List<String> values) {
            addCriterion("chuan_zhen not in", values, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenBetween(String value1, String value2) {
            addCriterion("chuan_zhen between", value1, value2, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotBetween(String value1, String value2) {
            addCriterion("chuan_zhen not between", value1, value2, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiIsNull() {
            addCriterion("cai_liao_di_zhi is null");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiIsNotNull() {
            addCriterion("cai_liao_di_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiEqualTo(String value) {
            addCriterion("cai_liao_di_zhi =", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiNotEqualTo(String value) {
            addCriterion("cai_liao_di_zhi <>", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiGreaterThan(String value) {
            addCriterion("cai_liao_di_zhi >", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiGreaterThanOrEqualTo(String value) {
            addCriterion("cai_liao_di_zhi >=", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiLessThan(String value) {
            addCriterion("cai_liao_di_zhi <", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiLessThanOrEqualTo(String value) {
            addCriterion("cai_liao_di_zhi <=", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiLike(String value) {
            addCriterion("cai_liao_di_zhi like", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiNotLike(String value) {
            addCriterion("cai_liao_di_zhi not like", value, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiIn(List<String> values) {
            addCriterion("cai_liao_di_zhi in", values, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiNotIn(List<String> values) {
            addCriterion("cai_liao_di_zhi not in", values, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiBetween(String value1, String value2) {
            addCriterion("cai_liao_di_zhi between", value1, value2, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoDiZhiNotBetween(String value1, String value2) {
            addCriterion("cai_liao_di_zhi not between", value1, value2, "caiLiaoDiZhi");
            return (Criteria) this;
        }

        public Criteria andYouBianIsNull() {
            addCriterion("you_bian is null");
            return (Criteria) this;
        }

        public Criteria andYouBianIsNotNull() {
            addCriterion("you_bian is not null");
            return (Criteria) this;
        }

        public Criteria andYouBianEqualTo(String value) {
            addCriterion("you_bian =", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotEqualTo(String value) {
            addCriterion("you_bian <>", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianGreaterThan(String value) {
            addCriterion("you_bian >", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianGreaterThanOrEqualTo(String value) {
            addCriterion("you_bian >=", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianLessThan(String value) {
            addCriterion("you_bian <", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianLessThanOrEqualTo(String value) {
            addCriterion("you_bian <=", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianLike(String value) {
            addCriterion("you_bian like", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotLike(String value) {
            addCriterion("you_bian not like", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianIn(List<String> values) {
            addCriterion("you_bian in", values, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotIn(List<String> values) {
            addCriterion("you_bian not in", values, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianBetween(String value1, String value2) {
            addCriterion("you_bian between", value1, value2, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotBetween(String value1, String value2) {
            addCriterion("you_bian not between", value1, value2, "youBian");
            return (Criteria) this;
        }

        public Criteria andJgcodeIsNull() {
            addCriterion("jgCode is null");
            return (Criteria) this;
        }

        public Criteria andJgcodeIsNotNull() {
            addCriterion("jgCode is not null");
            return (Criteria) this;
        }

        public Criteria andJgcodeEqualTo(String value) {
            addCriterion("jgCode =", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeNotEqualTo(String value) {
            addCriterion("jgCode <>", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeGreaterThan(String value) {
            addCriterion("jgCode >", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("jgCode >=", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeLessThan(String value) {
            addCriterion("jgCode <", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeLessThanOrEqualTo(String value) {
            addCriterion("jgCode <=", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeLike(String value) {
            addCriterion("jgCode like", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeNotLike(String value) {
            addCriterion("jgCode not like", value, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeIn(List<String> values) {
            addCriterion("jgCode in", values, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeNotIn(List<String> values) {
            addCriterion("jgCode not in", values, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeBetween(String value1, String value2) {
            addCriterion("jgCode between", value1, value2, "jgcode");
            return (Criteria) this;
        }

        public Criteria andJgcodeNotBetween(String value1, String value2) {
            addCriterion("jgCode not between", value1, value2, "jgcode");
            return (Criteria) this;
        }

        public Criteria andHasNumsIsNull() {
            addCriterion("has_nums is null");
            return (Criteria) this;
        }

        public Criteria andHasNumsIsNotNull() {
            addCriterion("has_nums is not null");
            return (Criteria) this;
        }

        public Criteria andHasNumsEqualTo(Integer value) {
            addCriterion("has_nums =", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsNotEqualTo(Integer value) {
            addCriterion("has_nums <>", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsGreaterThan(Integer value) {
            addCriterion("has_nums >", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_nums >=", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsLessThan(Integer value) {
            addCriterion("has_nums <", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsLessThanOrEqualTo(Integer value) {
            addCriterion("has_nums <=", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsIn(List<Integer> values) {
            addCriterion("has_nums in", values, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsNotIn(List<Integer> values) {
            addCriterion("has_nums not in", values, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsBetween(Integer value1, Integer value2) {
            addCriterion("has_nums between", value1, value2, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("has_nums not between", value1, value2, "hasNums");
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