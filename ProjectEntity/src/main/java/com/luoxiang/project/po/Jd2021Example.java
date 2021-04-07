package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class Jd2021Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Jd2021Example() {
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

        public Criteria andJobLevelIsNull() {
            addCriterion("job_level is null");
            return (Criteria) this;
        }

        public Criteria andJobLevelIsNotNull() {
            addCriterion("job_level is not null");
            return (Criteria) this;
        }

        public Criteria andJobLevelEqualTo(String value) {
            addCriterion("job_level =", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotEqualTo(String value) {
            addCriterion("job_level <>", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThan(String value) {
            addCriterion("job_level >", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThanOrEqualTo(String value) {
            addCriterion("job_level >=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThan(String value) {
            addCriterion("job_level <", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThanOrEqualTo(String value) {
            addCriterion("job_level <=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLike(String value) {
            addCriterion("job_level like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotLike(String value) {
            addCriterion("job_level not like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelIn(List<String> values) {
            addCriterion("job_level in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotIn(List<String> values) {
            addCriterion("job_level not in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelBetween(String value1, String value2) {
            addCriterion("job_level between", value1, value2, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotBetween(String value1, String value2) {
            addCriterion("job_level not between", value1, value2, "jobLevel");
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

        public Criteria andInSplitIsNull() {
            addCriterion("in_split is null");
            return (Criteria) this;
        }

        public Criteria andInSplitIsNotNull() {
            addCriterion("in_split is not null");
            return (Criteria) this;
        }

        public Criteria andInSplitEqualTo(String value) {
            addCriterion("in_split =", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitNotEqualTo(String value) {
            addCriterion("in_split <>", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitGreaterThan(String value) {
            addCriterion("in_split >", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitGreaterThanOrEqualTo(String value) {
            addCriterion("in_split >=", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitLessThan(String value) {
            addCriterion("in_split <", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitLessThanOrEqualTo(String value) {
            addCriterion("in_split <=", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitLike(String value) {
            addCriterion("in_split like", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitNotLike(String value) {
            addCriterion("in_split not like", value, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitIn(List<String> values) {
            addCriterion("in_split in", values, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitNotIn(List<String> values) {
            addCriterion("in_split not in", values, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitBetween(String value1, String value2) {
            addCriterion("in_split between", value1, value2, "inSplit");
            return (Criteria) this;
        }

        public Criteria andInSplitNotBetween(String value1, String value2) {
            addCriterion("in_split not between", value1, value2, "inSplit");
            return (Criteria) this;
        }

        public Criteria andLaiYuanIsNull() {
            addCriterion("lai_yuan is null");
            return (Criteria) this;
        }

        public Criteria andLaiYuanIsNotNull() {
            addCriterion("lai_yuan is not null");
            return (Criteria) this;
        }

        public Criteria andLaiYuanEqualTo(String value) {
            addCriterion("lai_yuan =", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanNotEqualTo(String value) {
            addCriterion("lai_yuan <>", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanGreaterThan(String value) {
            addCriterion("lai_yuan >", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanGreaterThanOrEqualTo(String value) {
            addCriterion("lai_yuan >=", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLessThan(String value) {
            addCriterion("lai_yuan <", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLessThanOrEqualTo(String value) {
            addCriterion("lai_yuan <=", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLike(String value) {
            addCriterion("lai_yuan like", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanNotLike(String value) {
            addCriterion("lai_yuan not like", value, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanIn(List<String> values) {
            addCriterion("lai_yuan in", values, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanNotIn(List<String> values) {
            addCriterion("lai_yuan not in", values, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanBetween(String value1, String value2) {
            addCriterion("lai_yuan between", value1, value2, "laiYuan");
            return (Criteria) this;
        }

        public Criteria andLaiYuanNotBetween(String value1, String value2) {
            addCriterion("lai_yuan not between", value1, value2, "laiYuan");
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

        public Criteria andZhiCheng1IsNull() {
            addCriterion("zhi_cheng_1 is null");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1IsNotNull() {
            addCriterion("zhi_cheng_1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1EqualTo(String value) {
            addCriterion("zhi_cheng_1 =", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1NotEqualTo(String value) {
            addCriterion("zhi_cheng_1 <>", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1GreaterThan(String value) {
            addCriterion("zhi_cheng_1 >", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1GreaterThanOrEqualTo(String value) {
            addCriterion("zhi_cheng_1 >=", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1LessThan(String value) {
            addCriterion("zhi_cheng_1 <", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1LessThanOrEqualTo(String value) {
            addCriterion("zhi_cheng_1 <=", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1Like(String value) {
            addCriterion("zhi_cheng_1 like", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1NotLike(String value) {
            addCriterion("zhi_cheng_1 not like", value, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1In(List<String> values) {
            addCriterion("zhi_cheng_1 in", values, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1NotIn(List<String> values) {
            addCriterion("zhi_cheng_1 not in", values, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1Between(String value1, String value2) {
            addCriterion("zhi_cheng_1 between", value1, value2, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng1NotBetween(String value1, String value2) {
            addCriterion("zhi_cheng_1 not between", value1, value2, "zhiCheng1");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2IsNull() {
            addCriterion("zhi_cheng_2 is null");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2IsNotNull() {
            addCriterion("zhi_cheng_2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2EqualTo(String value) {
            addCriterion("zhi_cheng_2 =", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2NotEqualTo(String value) {
            addCriterion("zhi_cheng_2 <>", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2GreaterThan(String value) {
            addCriterion("zhi_cheng_2 >", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2GreaterThanOrEqualTo(String value) {
            addCriterion("zhi_cheng_2 >=", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2LessThan(String value) {
            addCriterion("zhi_cheng_2 <", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2LessThanOrEqualTo(String value) {
            addCriterion("zhi_cheng_2 <=", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2Like(String value) {
            addCriterion("zhi_cheng_2 like", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2NotLike(String value) {
            addCriterion("zhi_cheng_2 not like", value, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2In(List<String> values) {
            addCriterion("zhi_cheng_2 in", values, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2NotIn(List<String> values) {
            addCriterion("zhi_cheng_2 not in", values, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2Between(String value1, String value2) {
            addCriterion("zhi_cheng_2 between", value1, value2, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiCheng2NotBetween(String value1, String value2) {
            addCriterion("zhi_cheng_2 not between", value1, value2, "zhiCheng2");
            return (Criteria) this;
        }

        public Criteria andZhiYe1IsNull() {
            addCriterion("zhi_ye_1 is null");
            return (Criteria) this;
        }

        public Criteria andZhiYe1IsNotNull() {
            addCriterion("zhi_ye_1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhiYe1EqualTo(String value) {
            addCriterion("zhi_ye_1 =", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1NotEqualTo(String value) {
            addCriterion("zhi_ye_1 <>", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1GreaterThan(String value) {
            addCriterion("zhi_ye_1 >", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1GreaterThanOrEqualTo(String value) {
            addCriterion("zhi_ye_1 >=", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1LessThan(String value) {
            addCriterion("zhi_ye_1 <", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1LessThanOrEqualTo(String value) {
            addCriterion("zhi_ye_1 <=", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1Like(String value) {
            addCriterion("zhi_ye_1 like", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1NotLike(String value) {
            addCriterion("zhi_ye_1 not like", value, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1In(List<String> values) {
            addCriterion("zhi_ye_1 in", values, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1NotIn(List<String> values) {
            addCriterion("zhi_ye_1 not in", values, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1Between(String value1, String value2) {
            addCriterion("zhi_ye_1 between", value1, value2, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe1NotBetween(String value1, String value2) {
            addCriterion("zhi_ye_1 not between", value1, value2, "zhiYe1");
            return (Criteria) this;
        }

        public Criteria andZhiYe2IsNull() {
            addCriterion("zhi_ye_2 is null");
            return (Criteria) this;
        }

        public Criteria andZhiYe2IsNotNull() {
            addCriterion("zhi_ye_2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhiYe2EqualTo(String value) {
            addCriterion("zhi_ye_2 =", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2NotEqualTo(String value) {
            addCriterion("zhi_ye_2 <>", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2GreaterThan(String value) {
            addCriterion("zhi_ye_2 >", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2GreaterThanOrEqualTo(String value) {
            addCriterion("zhi_ye_2 >=", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2LessThan(String value) {
            addCriterion("zhi_ye_2 <", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2LessThanOrEqualTo(String value) {
            addCriterion("zhi_ye_2 <=", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2Like(String value) {
            addCriterion("zhi_ye_2 like", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2NotLike(String value) {
            addCriterion("zhi_ye_2 not like", value, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2In(List<String> values) {
            addCriterion("zhi_ye_2 in", values, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2NotIn(List<String> values) {
            addCriterion("zhi_ye_2 not in", values, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2Between(String value1, String value2) {
            addCriterion("zhi_ye_2 between", value1, value2, "zhiYe2");
            return (Criteria) this;
        }

        public Criteria andZhiYe2NotBetween(String value1, String value2) {
            addCriterion("zhi_ye_2 not between", value1, value2, "zhiYe2");
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

        public Criteria andHasNumIsNull() {
            addCriterion("has_num is null");
            return (Criteria) this;
        }

        public Criteria andHasNumIsNotNull() {
            addCriterion("has_num is not null");
            return (Criteria) this;
        }

        public Criteria andHasNumEqualTo(Integer value) {
            addCriterion("has_num =", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumNotEqualTo(Integer value) {
            addCriterion("has_num <>", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumGreaterThan(Integer value) {
            addCriterion("has_num >", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_num >=", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumLessThan(Integer value) {
            addCriterion("has_num <", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumLessThanOrEqualTo(Integer value) {
            addCriterion("has_num <=", value, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumIn(List<Integer> values) {
            addCriterion("has_num in", values, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumNotIn(List<Integer> values) {
            addCriterion("has_num not in", values, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumBetween(Integer value1, Integer value2) {
            addCriterion("has_num between", value1, value2, "hasNum");
            return (Criteria) this;
        }

        public Criteria andHasNumNotBetween(Integer value1, Integer value2) {
            addCriterion("has_num not between", value1, value2, "hasNum");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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