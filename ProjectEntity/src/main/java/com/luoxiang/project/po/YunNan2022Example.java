package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class YunNan2022Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunNan2022Example() {
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

        public Criteria andJobLeiBieIsNull() {
            addCriterion("job_lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieIsNotNull() {
            addCriterion("job_lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieEqualTo(String value) {
            addCriterion("job_lei_bie =", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotEqualTo(String value) {
            addCriterion("job_lei_bie <>", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieGreaterThan(String value) {
            addCriterion("job_lei_bie >", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("job_lei_bie >=", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieLessThan(String value) {
            addCriterion("job_lei_bie <", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieLessThanOrEqualTo(String value) {
            addCriterion("job_lei_bie <=", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieLike(String value) {
            addCriterion("job_lei_bie like", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotLike(String value) {
            addCriterion("job_lei_bie not like", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieIn(List<String> values) {
            addCriterion("job_lei_bie in", values, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotIn(List<String> values) {
            addCriterion("job_lei_bie not in", values, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieBetween(String value1, String value2) {
            addCriterion("job_lei_bie between", value1, value2, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotBetween(String value1, String value2) {
            addCriterion("job_lei_bie not between", value1, value2, "jobLeiBie");
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

        public Criteria andIsPolicyIsNull() {
            addCriterion("is_policy is null");
            return (Criteria) this;
        }

        public Criteria andIsPolicyIsNotNull() {
            addCriterion("is_policy is not null");
            return (Criteria) this;
        }

        public Criteria andIsPolicyEqualTo(String value) {
            addCriterion("is_policy =", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyNotEqualTo(String value) {
            addCriterion("is_policy <>", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyGreaterThan(String value) {
            addCriterion("is_policy >", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("is_policy >=", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyLessThan(String value) {
            addCriterion("is_policy <", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyLessThanOrEqualTo(String value) {
            addCriterion("is_policy <=", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyLike(String value) {
            addCriterion("is_policy like", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyNotLike(String value) {
            addCriterion("is_policy not like", value, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyIn(List<String> values) {
            addCriterion("is_policy in", values, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyNotIn(List<String> values) {
            addCriterion("is_policy not in", values, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyBetween(String value1, String value2) {
            addCriterion("is_policy between", value1, value2, "isPolicy");
            return (Criteria) this;
        }

        public Criteria andIsPolicyNotBetween(String value1, String value2) {
            addCriterion("is_policy not between", value1, value2, "isPolicy");
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

        public Criteria andShengYuanIsNull() {
            addCriterion("sheng_yuan is null");
            return (Criteria) this;
        }

        public Criteria andShengYuanIsNotNull() {
            addCriterion("sheng_yuan is not null");
            return (Criteria) this;
        }

        public Criteria andShengYuanEqualTo(String value) {
            addCriterion("sheng_yuan =", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanNotEqualTo(String value) {
            addCriterion("sheng_yuan <>", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanGreaterThan(String value) {
            addCriterion("sheng_yuan >", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_yuan >=", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanLessThan(String value) {
            addCriterion("sheng_yuan <", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanLessThanOrEqualTo(String value) {
            addCriterion("sheng_yuan <=", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanLike(String value) {
            addCriterion("sheng_yuan like", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanNotLike(String value) {
            addCriterion("sheng_yuan not like", value, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanIn(List<String> values) {
            addCriterion("sheng_yuan in", values, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanNotIn(List<String> values) {
            addCriterion("sheng_yuan not in", values, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanBetween(String value1, String value2) {
            addCriterion("sheng_yuan between", value1, value2, "shengYuan");
            return (Criteria) this;
        }

        public Criteria andShengYuanNotBetween(String value1, String value2) {
            addCriterion("sheng_yuan not between", value1, value2, "shengYuan");
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

        public Criteria andKaiKaoBiLiIsNull() {
            addCriterion("kai_kao_bi_li is null");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiIsNotNull() {
            addCriterion("kai_kao_bi_li is not null");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiEqualTo(String value) {
            addCriterion("kai_kao_bi_li =", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiNotEqualTo(String value) {
            addCriterion("kai_kao_bi_li <>", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiGreaterThan(String value) {
            addCriterion("kai_kao_bi_li >", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiGreaterThanOrEqualTo(String value) {
            addCriterion("kai_kao_bi_li >=", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiLessThan(String value) {
            addCriterion("kai_kao_bi_li <", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiLessThanOrEqualTo(String value) {
            addCriterion("kai_kao_bi_li <=", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiLike(String value) {
            addCriterion("kai_kao_bi_li like", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiNotLike(String value) {
            addCriterion("kai_kao_bi_li not like", value, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiIn(List<String> values) {
            addCriterion("kai_kao_bi_li in", values, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiNotIn(List<String> values) {
            addCriterion("kai_kao_bi_li not in", values, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiBetween(String value1, String value2) {
            addCriterion("kai_kao_bi_li between", value1, value2, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLiNotBetween(String value1, String value2) {
            addCriterion("kai_kao_bi_li not between", value1, value2, "kaiKaoBiLi");
            return (Criteria) this;
        }

        public Criteria andShiJuanIsNull() {
            addCriterion("shi_juan is null");
            return (Criteria) this;
        }

        public Criteria andShiJuanIsNotNull() {
            addCriterion("shi_juan is not null");
            return (Criteria) this;
        }

        public Criteria andShiJuanEqualTo(String value) {
            addCriterion("shi_juan =", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanNotEqualTo(String value) {
            addCriterion("shi_juan <>", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanGreaterThan(String value) {
            addCriterion("shi_juan >", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanGreaterThanOrEqualTo(String value) {
            addCriterion("shi_juan >=", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanLessThan(String value) {
            addCriterion("shi_juan <", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanLessThanOrEqualTo(String value) {
            addCriterion("shi_juan <=", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanLike(String value) {
            addCriterion("shi_juan like", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanNotLike(String value) {
            addCriterion("shi_juan not like", value, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanIn(List<String> values) {
            addCriterion("shi_juan in", values, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanNotIn(List<String> values) {
            addCriterion("shi_juan not in", values, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanBetween(String value1, String value2) {
            addCriterion("shi_juan between", value1, value2, "shiJuan");
            return (Criteria) this;
        }

        public Criteria andShiJuanNotBetween(String value1, String value2) {
            addCriterion("shi_juan not between", value1, value2, "shiJuan");
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