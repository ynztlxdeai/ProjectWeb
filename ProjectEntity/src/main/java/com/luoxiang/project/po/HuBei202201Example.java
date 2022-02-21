package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class HuBei202201Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuBei202201Example() {
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

        public Criteria andJiGouNameIsNull() {
            addCriterion("ji_gou_name is null");
            return (Criteria) this;
        }

        public Criteria andJiGouNameIsNotNull() {
            addCriterion("ji_gou_name is not null");
            return (Criteria) this;
        }

        public Criteria andJiGouNameEqualTo(String value) {
            addCriterion("ji_gou_name =", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameNotEqualTo(String value) {
            addCriterion("ji_gou_name <>", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameGreaterThan(String value) {
            addCriterion("ji_gou_name >", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameGreaterThanOrEqualTo(String value) {
            addCriterion("ji_gou_name >=", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameLessThan(String value) {
            addCriterion("ji_gou_name <", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameLessThanOrEqualTo(String value) {
            addCriterion("ji_gou_name <=", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameLike(String value) {
            addCriterion("ji_gou_name like", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameNotLike(String value) {
            addCriterion("ji_gou_name not like", value, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameIn(List<String> values) {
            addCriterion("ji_gou_name in", values, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameNotIn(List<String> values) {
            addCriterion("ji_gou_name not in", values, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameBetween(String value1, String value2) {
            addCriterion("ji_gou_name between", value1, value2, "jiGouName");
            return (Criteria) this;
        }

        public Criteria andJiGouNameNotBetween(String value1, String value2) {
            addCriterion("ji_gou_name not between", value1, value2, "jiGouName");
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

        public Criteria andJiCengIsNull() {
            addCriterion("ji_ceng is null");
            return (Criteria) this;
        }

        public Criteria andJiCengIsNotNull() {
            addCriterion("ji_ceng is not null");
            return (Criteria) this;
        }

        public Criteria andJiCengEqualTo(String value) {
            addCriterion("ji_ceng =", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengNotEqualTo(String value) {
            addCriterion("ji_ceng <>", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengGreaterThan(String value) {
            addCriterion("ji_ceng >", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengGreaterThanOrEqualTo(String value) {
            addCriterion("ji_ceng >=", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengLessThan(String value) {
            addCriterion("ji_ceng <", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengLessThanOrEqualTo(String value) {
            addCriterion("ji_ceng <=", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengLike(String value) {
            addCriterion("ji_ceng like", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengNotLike(String value) {
            addCriterion("ji_ceng not like", value, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengIn(List<String> values) {
            addCriterion("ji_ceng in", values, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengNotIn(List<String> values) {
            addCriterion("ji_ceng not in", values, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengBetween(String value1, String value2) {
            addCriterion("ji_ceng between", value1, value2, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andJiCengNotBetween(String value1, String value2) {
            addCriterion("ji_ceng not between", value1, value2, "jiCeng");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(String value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(String value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(String value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(String value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(String value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(String value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLike(String value) {
            addCriterion("years like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotLike(String value) {
            addCriterion("years not like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<String> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<String> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(String value1, String value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(String value1, String value2) {
            addCriterion("years not between", value1, value2, "years");
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

        public Criteria andCanGongIsNull() {
            addCriterion("can_gong is null");
            return (Criteria) this;
        }

        public Criteria andCanGongIsNotNull() {
            addCriterion("can_gong is not null");
            return (Criteria) this;
        }

        public Criteria andCanGongEqualTo(String value) {
            addCriterion("can_gong =", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotEqualTo(String value) {
            addCriterion("can_gong <>", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongGreaterThan(String value) {
            addCriterion("can_gong >", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongGreaterThanOrEqualTo(String value) {
            addCriterion("can_gong >=", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongLessThan(String value) {
            addCriterion("can_gong <", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongLessThanOrEqualTo(String value) {
            addCriterion("can_gong <=", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongLike(String value) {
            addCriterion("can_gong like", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotLike(String value) {
            addCriterion("can_gong not like", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongIn(List<String> values) {
            addCriterion("can_gong in", values, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotIn(List<String> values) {
            addCriterion("can_gong not in", values, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongBetween(String value1, String value2) {
            addCriterion("can_gong between", value1, value2, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotBetween(String value1, String value2) {
            addCriterion("can_gong not between", value1, value2, "canGong");
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

        public Criteria andAllNumIsNull() {
            addCriterion("all_num is null");
            return (Criteria) this;
        }

        public Criteria andAllNumIsNotNull() {
            addCriterion("all_num is not null");
            return (Criteria) this;
        }

        public Criteria andAllNumEqualTo(Integer value) {
            addCriterion("all_num =", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotEqualTo(Integer value) {
            addCriterion("all_num <>", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThan(Integer value) {
            addCriterion("all_num >", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_num >=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThan(Integer value) {
            addCriterion("all_num <", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThanOrEqualTo(Integer value) {
            addCriterion("all_num <=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumIn(List<Integer> values) {
            addCriterion("all_num in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotIn(List<Integer> values) {
            addCriterion("all_num not in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumBetween(Integer value1, Integer value2) {
            addCriterion("all_num between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotBetween(Integer value1, Integer value2) {
            addCriterion("all_num not between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andHasingIsNull() {
            addCriterion("hasing is null");
            return (Criteria) this;
        }

        public Criteria andHasingIsNotNull() {
            addCriterion("hasing is not null");
            return (Criteria) this;
        }

        public Criteria andHasingEqualTo(String value) {
            addCriterion("hasing =", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingNotEqualTo(String value) {
            addCriterion("hasing <>", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingGreaterThan(String value) {
            addCriterion("hasing >", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingGreaterThanOrEqualTo(String value) {
            addCriterion("hasing >=", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingLessThan(String value) {
            addCriterion("hasing <", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingLessThanOrEqualTo(String value) {
            addCriterion("hasing <=", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingLike(String value) {
            addCriterion("hasing like", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingNotLike(String value) {
            addCriterion("hasing not like", value, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingIn(List<String> values) {
            addCriterion("hasing in", values, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingNotIn(List<String> values) {
            addCriterion("hasing not in", values, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingBetween(String value1, String value2) {
            addCriterion("hasing between", value1, value2, "hasing");
            return (Criteria) this;
        }

        public Criteria andHasingNotBetween(String value1, String value2) {
            addCriterion("hasing not between", value1, value2, "hasing");
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