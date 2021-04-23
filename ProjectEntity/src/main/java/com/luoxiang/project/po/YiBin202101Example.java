package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class YiBin202101Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YiBin202101Example() {
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

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andBiLiIsNull() {
            addCriterion("bi_li is null");
            return (Criteria) this;
        }

        public Criteria andBiLiIsNotNull() {
            addCriterion("bi_li is not null");
            return (Criteria) this;
        }

        public Criteria andBiLiEqualTo(String value) {
            addCriterion("bi_li =", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiNotEqualTo(String value) {
            addCriterion("bi_li <>", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiGreaterThan(String value) {
            addCriterion("bi_li >", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiGreaterThanOrEqualTo(String value) {
            addCriterion("bi_li >=", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiLessThan(String value) {
            addCriterion("bi_li <", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiLessThanOrEqualTo(String value) {
            addCriterion("bi_li <=", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiLike(String value) {
            addCriterion("bi_li like", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiNotLike(String value) {
            addCriterion("bi_li not like", value, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiIn(List<String> values) {
            addCriterion("bi_li in", values, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiNotIn(List<String> values) {
            addCriterion("bi_li not in", values, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiBetween(String value1, String value2) {
            addCriterion("bi_li between", value1, value2, "biLi");
            return (Criteria) this;
        }

        public Criteria andBiLiNotBetween(String value1, String value2) {
            addCriterion("bi_li not between", value1, value2, "biLi");
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

        public Criteria andAllTestIsNull() {
            addCriterion("all_test is null");
            return (Criteria) this;
        }

        public Criteria andAllTestIsNotNull() {
            addCriterion("all_test is not null");
            return (Criteria) this;
        }

        public Criteria andAllTestEqualTo(String value) {
            addCriterion("all_test =", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestNotEqualTo(String value) {
            addCriterion("all_test <>", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestGreaterThan(String value) {
            addCriterion("all_test >", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestGreaterThanOrEqualTo(String value) {
            addCriterion("all_test >=", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestLessThan(String value) {
            addCriterion("all_test <", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestLessThanOrEqualTo(String value) {
            addCriterion("all_test <=", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestLike(String value) {
            addCriterion("all_test like", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestNotLike(String value) {
            addCriterion("all_test not like", value, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestIn(List<String> values) {
            addCriterion("all_test in", values, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestNotIn(List<String> values) {
            addCriterion("all_test not in", values, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestBetween(String value1, String value2) {
            addCriterion("all_test between", value1, value2, "allTest");
            return (Criteria) this;
        }

        public Criteria andAllTestNotBetween(String value1, String value2) {
            addCriterion("all_test not between", value1, value2, "allTest");
            return (Criteria) this;
        }

        public Criteria andPerTestIsNull() {
            addCriterion("per_test is null");
            return (Criteria) this;
        }

        public Criteria andPerTestIsNotNull() {
            addCriterion("per_test is not null");
            return (Criteria) this;
        }

        public Criteria andPerTestEqualTo(String value) {
            addCriterion("per_test =", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestNotEqualTo(String value) {
            addCriterion("per_test <>", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestGreaterThan(String value) {
            addCriterion("per_test >", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestGreaterThanOrEqualTo(String value) {
            addCriterion("per_test >=", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestLessThan(String value) {
            addCriterion("per_test <", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestLessThanOrEqualTo(String value) {
            addCriterion("per_test <=", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestLike(String value) {
            addCriterion("per_test like", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestNotLike(String value) {
            addCriterion("per_test not like", value, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestIn(List<String> values) {
            addCriterion("per_test in", values, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestNotIn(List<String> values) {
            addCriterion("per_test not in", values, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestBetween(String value1, String value2) {
            addCriterion("per_test between", value1, value2, "perTest");
            return (Criteria) this;
        }

        public Criteria andPerTestNotBetween(String value1, String value2) {
            addCriterion("per_test not between", value1, value2, "perTest");
            return (Criteria) this;
        }

        public Criteria andMianShiIsNull() {
            addCriterion("mian_shi is null");
            return (Criteria) this;
        }

        public Criteria andMianShiIsNotNull() {
            addCriterion("mian_shi is not null");
            return (Criteria) this;
        }

        public Criteria andMianShiEqualTo(String value) {
            addCriterion("mian_shi =", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiNotEqualTo(String value) {
            addCriterion("mian_shi <>", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiGreaterThan(String value) {
            addCriterion("mian_shi >", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiGreaterThanOrEqualTo(String value) {
            addCriterion("mian_shi >=", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiLessThan(String value) {
            addCriterion("mian_shi <", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiLessThanOrEqualTo(String value) {
            addCriterion("mian_shi <=", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiLike(String value) {
            addCriterion("mian_shi like", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiNotLike(String value) {
            addCriterion("mian_shi not like", value, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiIn(List<String> values) {
            addCriterion("mian_shi in", values, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiNotIn(List<String> values) {
            addCriterion("mian_shi not in", values, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiBetween(String value1, String value2) {
            addCriterion("mian_shi between", value1, value2, "mianShi");
            return (Criteria) this;
        }

        public Criteria andMianShiNotBetween(String value1, String value2) {
            addCriterion("mian_shi not between", value1, value2, "mianShi");
            return (Criteria) this;
        }

        public Criteria andYueDingIsNull() {
            addCriterion("yue_ding is null");
            return (Criteria) this;
        }

        public Criteria andYueDingIsNotNull() {
            addCriterion("yue_ding is not null");
            return (Criteria) this;
        }

        public Criteria andYueDingEqualTo(String value) {
            addCriterion("yue_ding =", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingNotEqualTo(String value) {
            addCriterion("yue_ding <>", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingGreaterThan(String value) {
            addCriterion("yue_ding >", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingGreaterThanOrEqualTo(String value) {
            addCriterion("yue_ding >=", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingLessThan(String value) {
            addCriterion("yue_ding <", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingLessThanOrEqualTo(String value) {
            addCriterion("yue_ding <=", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingLike(String value) {
            addCriterion("yue_ding like", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingNotLike(String value) {
            addCriterion("yue_ding not like", value, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingIn(List<String> values) {
            addCriterion("yue_ding in", values, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingNotIn(List<String> values) {
            addCriterion("yue_ding not in", values, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingBetween(String value1, String value2) {
            addCriterion("yue_ding between", value1, value2, "yueDing");
            return (Criteria) this;
        }

        public Criteria andYueDingNotBetween(String value1, String value2) {
            addCriterion("yue_ding not between", value1, value2, "yueDing");
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