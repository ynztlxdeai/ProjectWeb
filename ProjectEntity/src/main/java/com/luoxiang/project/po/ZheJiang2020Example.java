package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class ZheJiang2020Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZheJiang2020Example() {
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

        public Criteria andJobClass1IsNull() {
            addCriterion("job_class_1 is null");
            return (Criteria) this;
        }

        public Criteria andJobClass1IsNotNull() {
            addCriterion("job_class_1 is not null");
            return (Criteria) this;
        }

        public Criteria andJobClass1EqualTo(String value) {
            addCriterion("job_class_1 =", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1NotEqualTo(String value) {
            addCriterion("job_class_1 <>", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1GreaterThan(String value) {
            addCriterion("job_class_1 >", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1GreaterThanOrEqualTo(String value) {
            addCriterion("job_class_1 >=", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1LessThan(String value) {
            addCriterion("job_class_1 <", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1LessThanOrEqualTo(String value) {
            addCriterion("job_class_1 <=", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1Like(String value) {
            addCriterion("job_class_1 like", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1NotLike(String value) {
            addCriterion("job_class_1 not like", value, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1In(List<String> values) {
            addCriterion("job_class_1 in", values, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1NotIn(List<String> values) {
            addCriterion("job_class_1 not in", values, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1Between(String value1, String value2) {
            addCriterion("job_class_1 between", value1, value2, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass1NotBetween(String value1, String value2) {
            addCriterion("job_class_1 not between", value1, value2, "jobClass1");
            return (Criteria) this;
        }

        public Criteria andJobClass2IsNull() {
            addCriterion("job_class_2 is null");
            return (Criteria) this;
        }

        public Criteria andJobClass2IsNotNull() {
            addCriterion("job_class_2 is not null");
            return (Criteria) this;
        }

        public Criteria andJobClass2EqualTo(String value) {
            addCriterion("job_class_2 =", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2NotEqualTo(String value) {
            addCriterion("job_class_2 <>", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2GreaterThan(String value) {
            addCriterion("job_class_2 >", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2GreaterThanOrEqualTo(String value) {
            addCriterion("job_class_2 >=", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2LessThan(String value) {
            addCriterion("job_class_2 <", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2LessThanOrEqualTo(String value) {
            addCriterion("job_class_2 <=", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2Like(String value) {
            addCriterion("job_class_2 like", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2NotLike(String value) {
            addCriterion("job_class_2 not like", value, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2In(List<String> values) {
            addCriterion("job_class_2 in", values, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2NotIn(List<String> values) {
            addCriterion("job_class_2 not in", values, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2Between(String value1, String value2) {
            addCriterion("job_class_2 between", value1, value2, "jobClass2");
            return (Criteria) this;
        }

        public Criteria andJobClass2NotBetween(String value1, String value2) {
            addCriterion("job_class_2 not between", value1, value2, "jobClass2");
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

        public Criteria andShenFenIsNull() {
            addCriterion("shen_fen is null");
            return (Criteria) this;
        }

        public Criteria andShenFenIsNotNull() {
            addCriterion("shen_fen is not null");
            return (Criteria) this;
        }

        public Criteria andShenFenEqualTo(String value) {
            addCriterion("shen_fen =", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenNotEqualTo(String value) {
            addCriterion("shen_fen <>", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenGreaterThan(String value) {
            addCriterion("shen_fen >", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenGreaterThanOrEqualTo(String value) {
            addCriterion("shen_fen >=", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenLessThan(String value) {
            addCriterion("shen_fen <", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenLessThanOrEqualTo(String value) {
            addCriterion("shen_fen <=", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenLike(String value) {
            addCriterion("shen_fen like", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenNotLike(String value) {
            addCriterion("shen_fen not like", value, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenIn(List<String> values) {
            addCriterion("shen_fen in", values, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenNotIn(List<String> values) {
            addCriterion("shen_fen not in", values, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenBetween(String value1, String value2) {
            addCriterion("shen_fen between", value1, value2, "shenFen");
            return (Criteria) this;
        }

        public Criteria andShenFenNotBetween(String value1, String value2) {
            addCriterion("shen_fen not between", value1, value2, "shenFen");
            return (Criteria) this;
        }

        public Criteria andZhengZhiIsNull() {
            addCriterion("zheng_zhi is null");
            return (Criteria) this;
        }

        public Criteria andZhengZhiIsNotNull() {
            addCriterion("zheng_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andZhengZhiEqualTo(String value) {
            addCriterion("zheng_zhi =", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiNotEqualTo(String value) {
            addCriterion("zheng_zhi <>", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiGreaterThan(String value) {
            addCriterion("zheng_zhi >", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiGreaterThanOrEqualTo(String value) {
            addCriterion("zheng_zhi >=", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiLessThan(String value) {
            addCriterion("zheng_zhi <", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiLessThanOrEqualTo(String value) {
            addCriterion("zheng_zhi <=", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiLike(String value) {
            addCriterion("zheng_zhi like", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiNotLike(String value) {
            addCriterion("zheng_zhi not like", value, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiIn(List<String> values) {
            addCriterion("zheng_zhi in", values, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiNotIn(List<String> values) {
            addCriterion("zheng_zhi not in", values, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiBetween(String value1, String value2) {
            addCriterion("zheng_zhi between", value1, value2, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andZhengZhiNotBetween(String value1, String value2) {
            addCriterion("zheng_zhi not between", value1, value2, "zhengZhi");
            return (Criteria) this;
        }

        public Criteria andMingZuIsNull() {
            addCriterion("ming_zu is null");
            return (Criteria) this;
        }

        public Criteria andMingZuIsNotNull() {
            addCriterion("ming_zu is not null");
            return (Criteria) this;
        }

        public Criteria andMingZuEqualTo(String value) {
            addCriterion("ming_zu =", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuNotEqualTo(String value) {
            addCriterion("ming_zu <>", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuGreaterThan(String value) {
            addCriterion("ming_zu >", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuGreaterThanOrEqualTo(String value) {
            addCriterion("ming_zu >=", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuLessThan(String value) {
            addCriterion("ming_zu <", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuLessThanOrEqualTo(String value) {
            addCriterion("ming_zu <=", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuLike(String value) {
            addCriterion("ming_zu like", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuNotLike(String value) {
            addCriterion("ming_zu not like", value, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuIn(List<String> values) {
            addCriterion("ming_zu in", values, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuNotIn(List<String> values) {
            addCriterion("ming_zu not in", values, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuBetween(String value1, String value2) {
            addCriterion("ming_zu between", value1, value2, "mingZu");
            return (Criteria) this;
        }

        public Criteria andMingZuNotBetween(String value1, String value2) {
            addCriterion("ming_zu not between", value1, value2, "mingZu");
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

        public Criteria andXinLiIsNull() {
            addCriterion("xin_li is null");
            return (Criteria) this;
        }

        public Criteria andXinLiIsNotNull() {
            addCriterion("xin_li is not null");
            return (Criteria) this;
        }

        public Criteria andXinLiEqualTo(String value) {
            addCriterion("xin_li =", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiNotEqualTo(String value) {
            addCriterion("xin_li <>", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiGreaterThan(String value) {
            addCriterion("xin_li >", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiGreaterThanOrEqualTo(String value) {
            addCriterion("xin_li >=", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiLessThan(String value) {
            addCriterion("xin_li <", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiLessThanOrEqualTo(String value) {
            addCriterion("xin_li <=", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiLike(String value) {
            addCriterion("xin_li like", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiNotLike(String value) {
            addCriterion("xin_li not like", value, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiIn(List<String> values) {
            addCriterion("xin_li in", values, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiNotIn(List<String> values) {
            addCriterion("xin_li not in", values, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiBetween(String value1, String value2) {
            addCriterion("xin_li between", value1, value2, "xinLi");
            return (Criteria) this;
        }

        public Criteria andXinLiNotBetween(String value1, String value2) {
            addCriterion("xin_li not between", value1, value2, "xinLi");
            return (Criteria) this;
        }

        public Criteria andTiNengIsNull() {
            addCriterion("ti_neng is null");
            return (Criteria) this;
        }

        public Criteria andTiNengIsNotNull() {
            addCriterion("ti_neng is not null");
            return (Criteria) this;
        }

        public Criteria andTiNengEqualTo(String value) {
            addCriterion("ti_neng =", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengNotEqualTo(String value) {
            addCriterion("ti_neng <>", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengGreaterThan(String value) {
            addCriterion("ti_neng >", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengGreaterThanOrEqualTo(String value) {
            addCriterion("ti_neng >=", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengLessThan(String value) {
            addCriterion("ti_neng <", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengLessThanOrEqualTo(String value) {
            addCriterion("ti_neng <=", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengLike(String value) {
            addCriterion("ti_neng like", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengNotLike(String value) {
            addCriterion("ti_neng not like", value, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengIn(List<String> values) {
            addCriterion("ti_neng in", values, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengNotIn(List<String> values) {
            addCriterion("ti_neng not in", values, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengBetween(String value1, String value2) {
            addCriterion("ti_neng between", value1, value2, "tiNeng");
            return (Criteria) this;
        }

        public Criteria andTiNengNotBetween(String value1, String value2) {
            addCriterion("ti_neng not between", value1, value2, "tiNeng");
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