package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class Sc202001Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sc202001Example() {
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

        public Criteria andNeiSheJiGouIsNull() {
            addCriterion("nei_she_ji_gou is null");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouIsNotNull() {
            addCriterion("nei_she_ji_gou is not null");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouEqualTo(String value) {
            addCriterion("nei_she_ji_gou =", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouNotEqualTo(String value) {
            addCriterion("nei_she_ji_gou <>", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouGreaterThan(String value) {
            addCriterion("nei_she_ji_gou >", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouGreaterThanOrEqualTo(String value) {
            addCriterion("nei_she_ji_gou >=", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouLessThan(String value) {
            addCriterion("nei_she_ji_gou <", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouLessThanOrEqualTo(String value) {
            addCriterion("nei_she_ji_gou <=", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouLike(String value) {
            addCriterion("nei_she_ji_gou like", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouNotLike(String value) {
            addCriterion("nei_she_ji_gou not like", value, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouIn(List<String> values) {
            addCriterion("nei_she_ji_gou in", values, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouNotIn(List<String> values) {
            addCriterion("nei_she_ji_gou not in", values, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouBetween(String value1, String value2) {
            addCriterion("nei_she_ji_gou between", value1, value2, "neiSheJiGou");
            return (Criteria) this;
        }

        public Criteria andNeiSheJiGouNotBetween(String value1, String value2) {
            addCriterion("nei_she_ji_gou not between", value1, value2, "neiSheJiGou");
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

        public Criteria andZhiWuIsNull() {
            addCriterion("zhi_wu is null");
            return (Criteria) this;
        }

        public Criteria andZhiWuIsNotNull() {
            addCriterion("zhi_wu is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWuEqualTo(String value) {
            addCriterion("zhi_wu =", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotEqualTo(String value) {
            addCriterion("zhi_wu <>", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuGreaterThan(String value) {
            addCriterion("zhi_wu >", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wu >=", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuLessThan(String value) {
            addCriterion("zhi_wu <", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuLessThanOrEqualTo(String value) {
            addCriterion("zhi_wu <=", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuLike(String value) {
            addCriterion("zhi_wu like", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotLike(String value) {
            addCriterion("zhi_wu not like", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuIn(List<String> values) {
            addCriterion("zhi_wu in", values, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotIn(List<String> values) {
            addCriterion("zhi_wu not in", values, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuBetween(String value1, String value2) {
            addCriterion("zhi_wu between", value1, value2, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotBetween(String value1, String value2) {
            addCriterion("zhi_wu not between", value1, value2, "zhiWu");
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

        public Criteria andZhaoLuFanWeiIsNull() {
            addCriterion("zhao_lu_fan_wei is null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiIsNotNull() {
            addCriterion("zhao_lu_fan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiEqualTo(String value) {
            addCriterion("zhao_lu_fan_wei =", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiNotEqualTo(String value) {
            addCriterion("zhao_lu_fan_wei <>", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiGreaterThan(String value) {
            addCriterion("zhao_lu_fan_wei >", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_lu_fan_wei >=", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiLessThan(String value) {
            addCriterion("zhao_lu_fan_wei <", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiLessThanOrEqualTo(String value) {
            addCriterion("zhao_lu_fan_wei <=", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiLike(String value) {
            addCriterion("zhao_lu_fan_wei like", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiNotLike(String value) {
            addCriterion("zhao_lu_fan_wei not like", value, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiIn(List<String> values) {
            addCriterion("zhao_lu_fan_wei in", values, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiNotIn(List<String> values) {
            addCriterion("zhao_lu_fan_wei not in", values, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiBetween(String value1, String value2) {
            addCriterion("zhao_lu_fan_wei between", value1, value2, "zhaoLuFanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuFanWeiNotBetween(String value1, String value2) {
            addCriterion("zhao_lu_fan_wei not between", value1, value2, "zhaoLuFanWei");
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

        public Criteria andTrendIsNull() {
            addCriterion("trend is null");
            return (Criteria) this;
        }

        public Criteria andTrendIsNotNull() {
            addCriterion("trend is not null");
            return (Criteria) this;
        }

        public Criteria andTrendEqualTo(String value) {
            addCriterion("trend =", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotEqualTo(String value) {
            addCriterion("trend <>", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThan(String value) {
            addCriterion("trend >", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThanOrEqualTo(String value) {
            addCriterion("trend >=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThan(String value) {
            addCriterion("trend <", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThanOrEqualTo(String value) {
            addCriterion("trend <=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLike(String value) {
            addCriterion("trend like", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotLike(String value) {
            addCriterion("trend not like", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendIn(List<String> values) {
            addCriterion("trend in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotIn(List<String> values) {
            addCriterion("trend not in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendBetween(String value1, String value2) {
            addCriterion("trend between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotBetween(String value1, String value2) {
            addCriterion("trend not between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andTotalNumsIsNull() {
            addCriterion("total_nums is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumsIsNotNull() {
            addCriterion("total_nums is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumsEqualTo(Integer value) {
            addCriterion("total_nums =", value, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsNotEqualTo(Integer value) {
            addCriterion("total_nums <>", value, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsGreaterThan(Integer value) {
            addCriterion("total_nums >", value, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_nums >=", value, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsLessThan(Integer value) {
            addCriterion("total_nums <", value, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsLessThanOrEqualTo(Integer value) {
            addCriterion("total_nums <=", value, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsIn(List<Integer> values) {
            addCriterion("total_nums in", values, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsNotIn(List<Integer> values) {
            addCriterion("total_nums not in", values, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsBetween(Integer value1, Integer value2) {
            addCriterion("total_nums between", value1, value2, "totalNums");
            return (Criteria) this;
        }

        public Criteria andTotalNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_nums not between", value1, value2, "totalNums");
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