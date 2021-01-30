package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class GuangDong01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuangDong01Example() {
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

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNull() {
            addCriterion("unit_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNotNull() {
            addCriterion("unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeEqualTo(String value) {
            addCriterion("unit_code =", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotEqualTo(String value) {
            addCriterion("unit_code <>", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThan(String value) {
            addCriterion("unit_code >", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_code >=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThan(String value) {
            addCriterion("unit_code <", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("unit_code <=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLike(String value) {
            addCriterion("unit_code like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotLike(String value) {
            addCriterion("unit_code not like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIn(List<String> values) {
            addCriterion("unit_code in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotIn(List<String> values) {
            addCriterion("unit_code not in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeBetween(String value1, String value2) {
            addCriterion("unit_code between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotBetween(String value1, String value2) {
            addCriterion("unit_code not between", value1, value2, "unitCode");
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

        public Criteria andZhuanYeTestIsNull() {
            addCriterion("zhuan_ye_test is null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestIsNotNull() {
            addCriterion("zhuan_ye_test is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestEqualTo(String value) {
            addCriterion("zhuan_ye_test =", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestNotEqualTo(String value) {
            addCriterion("zhuan_ye_test <>", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestGreaterThan(String value) {
            addCriterion("zhuan_ye_test >", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_test >=", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestLessThan(String value) {
            addCriterion("zhuan_ye_test <", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestLessThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_test <=", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestLike(String value) {
            addCriterion("zhuan_ye_test like", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestNotLike(String value) {
            addCriterion("zhuan_ye_test not like", value, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestIn(List<String> values) {
            addCriterion("zhuan_ye_test in", values, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestNotIn(List<String> values) {
            addCriterion("zhuan_ye_test not in", values, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestBetween(String value1, String value2) {
            addCriterion("zhuan_ye_test between", value1, value2, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andZhuanYeTestNotBetween(String value1, String value2) {
            addCriterion("zhuan_ye_test not between", value1, value2, "zhuanYeTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestIsNull() {
            addCriterion("xin_li_test is null");
            return (Criteria) this;
        }

        public Criteria andXinLiTestIsNotNull() {
            addCriterion("xin_li_test is not null");
            return (Criteria) this;
        }

        public Criteria andXinLiTestEqualTo(String value) {
            addCriterion("xin_li_test =", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestNotEqualTo(String value) {
            addCriterion("xin_li_test <>", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestGreaterThan(String value) {
            addCriterion("xin_li_test >", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestGreaterThanOrEqualTo(String value) {
            addCriterion("xin_li_test >=", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestLessThan(String value) {
            addCriterion("xin_li_test <", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestLessThanOrEqualTo(String value) {
            addCriterion("xin_li_test <=", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestLike(String value) {
            addCriterion("xin_li_test like", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestNotLike(String value) {
            addCriterion("xin_li_test not like", value, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestIn(List<String> values) {
            addCriterion("xin_li_test in", values, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestNotIn(List<String> values) {
            addCriterion("xin_li_test not in", values, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestBetween(String value1, String value2) {
            addCriterion("xin_li_test between", value1, value2, "xinLiTest");
            return (Criteria) this;
        }

        public Criteria andXinLiTestNotBetween(String value1, String value2) {
            addCriterion("xin_li_test not between", value1, value2, "xinLiTest");
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

        public Criteria andKaoQuIsNull() {
            addCriterion("kao_qu is null");
            return (Criteria) this;
        }

        public Criteria andKaoQuIsNotNull() {
            addCriterion("kao_qu is not null");
            return (Criteria) this;
        }

        public Criteria andKaoQuEqualTo(String value) {
            addCriterion("kao_qu =", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotEqualTo(String value) {
            addCriterion("kao_qu <>", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuGreaterThan(String value) {
            addCriterion("kao_qu >", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuGreaterThanOrEqualTo(String value) {
            addCriterion("kao_qu >=", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuLessThan(String value) {
            addCriterion("kao_qu <", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuLessThanOrEqualTo(String value) {
            addCriterion("kao_qu <=", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuLike(String value) {
            addCriterion("kao_qu like", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotLike(String value) {
            addCriterion("kao_qu not like", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuIn(List<String> values) {
            addCriterion("kao_qu in", values, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotIn(List<String> values) {
            addCriterion("kao_qu not in", values, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuBetween(String value1, String value2) {
            addCriterion("kao_qu between", value1, value2, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotBetween(String value1, String value2) {
            addCriterion("kao_qu not between", value1, value2, "kaoQu");
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

        public Criteria andIngNumIsNull() {
            addCriterion("ing_num is null");
            return (Criteria) this;
        }

        public Criteria andIngNumIsNotNull() {
            addCriterion("ing_num is not null");
            return (Criteria) this;
        }

        public Criteria andIngNumEqualTo(String value) {
            addCriterion("ing_num =", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumNotEqualTo(String value) {
            addCriterion("ing_num <>", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumGreaterThan(String value) {
            addCriterion("ing_num >", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumGreaterThanOrEqualTo(String value) {
            addCriterion("ing_num >=", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumLessThan(String value) {
            addCriterion("ing_num <", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumLessThanOrEqualTo(String value) {
            addCriterion("ing_num <=", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumLike(String value) {
            addCriterion("ing_num like", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumNotLike(String value) {
            addCriterion("ing_num not like", value, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumIn(List<String> values) {
            addCriterion("ing_num in", values, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumNotIn(List<String> values) {
            addCriterion("ing_num not in", values, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumBetween(String value1, String value2) {
            addCriterion("ing_num between", value1, value2, "ingNum");
            return (Criteria) this;
        }

        public Criteria andIngNumNotBetween(String value1, String value2) {
            addCriterion("ing_num not between", value1, value2, "ingNum");
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