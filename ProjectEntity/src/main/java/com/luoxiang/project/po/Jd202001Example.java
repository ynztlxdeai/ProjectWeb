package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class Jd202001Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Jd202001Example() {
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

        public Criteria andJobSplitIsNull() {
            addCriterion("job_split is null");
            return (Criteria) this;
        }

        public Criteria andJobSplitIsNotNull() {
            addCriterion("job_split is not null");
            return (Criteria) this;
        }

        public Criteria andJobSplitEqualTo(String value) {
            addCriterion("job_split =", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitNotEqualTo(String value) {
            addCriterion("job_split <>", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitGreaterThan(String value) {
            addCriterion("job_split >", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitGreaterThanOrEqualTo(String value) {
            addCriterion("job_split >=", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitLessThan(String value) {
            addCriterion("job_split <", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitLessThanOrEqualTo(String value) {
            addCriterion("job_split <=", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitLike(String value) {
            addCriterion("job_split like", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitNotLike(String value) {
            addCriterion("job_split not like", value, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitIn(List<String> values) {
            addCriterion("job_split in", values, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitNotIn(List<String> values) {
            addCriterion("job_split not in", values, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitBetween(String value1, String value2) {
            addCriterion("job_split between", value1, value2, "jobSplit");
            return (Criteria) this;
        }

        public Criteria andJobSplitNotBetween(String value1, String value2) {
            addCriterion("job_split not between", value1, value2, "jobSplit");
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

        public Criteria andRuWeiBiLiIsNull() {
            addCriterion("ru_wei_bi_li is null");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiIsNotNull() {
            addCriterion("ru_wei_bi_li is not null");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiEqualTo(String value) {
            addCriterion("ru_wei_bi_li =", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiNotEqualTo(String value) {
            addCriterion("ru_wei_bi_li <>", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiGreaterThan(String value) {
            addCriterion("ru_wei_bi_li >", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiGreaterThanOrEqualTo(String value) {
            addCriterion("ru_wei_bi_li >=", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiLessThan(String value) {
            addCriterion("ru_wei_bi_li <", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiLessThanOrEqualTo(String value) {
            addCriterion("ru_wei_bi_li <=", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiLike(String value) {
            addCriterion("ru_wei_bi_li like", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiNotLike(String value) {
            addCriterion("ru_wei_bi_li not like", value, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiIn(List<String> values) {
            addCriterion("ru_wei_bi_li in", values, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiNotIn(List<String> values) {
            addCriterion("ru_wei_bi_li not in", values, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiBetween(String value1, String value2) {
            addCriterion("ru_wei_bi_li between", value1, value2, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andRuWeiBiLiNotBetween(String value1, String value2) {
            addCriterion("ru_wei_bi_li not between", value1, value2, "ruWeiBiLi");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieIsNull() {
            addCriterion("lai_yuan_lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieIsNotNull() {
            addCriterion("lai_yuan_lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieEqualTo(String value) {
            addCriterion("lai_yuan_lei_bie =", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieNotEqualTo(String value) {
            addCriterion("lai_yuan_lei_bie <>", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieGreaterThan(String value) {
            addCriterion("lai_yuan_lei_bie >", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("lai_yuan_lei_bie >=", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieLessThan(String value) {
            addCriterion("lai_yuan_lei_bie <", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieLessThanOrEqualTo(String value) {
            addCriterion("lai_yuan_lei_bie <=", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieLike(String value) {
            addCriterion("lai_yuan_lei_bie like", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieNotLike(String value) {
            addCriterion("lai_yuan_lei_bie not like", value, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieIn(List<String> values) {
            addCriterion("lai_yuan_lei_bie in", values, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieNotIn(List<String> values) {
            addCriterion("lai_yuan_lei_bie not in", values, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieBetween(String value1, String value2) {
            addCriterion("lai_yuan_lei_bie between", value1, value2, "laiYuanLeiBie");
            return (Criteria) this;
        }

        public Criteria andLaiYuanLeiBieNotBetween(String value1, String value2) {
            addCriterion("lai_yuan_lei_bie not between", value1, value2, "laiYuanLeiBie");
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

        public Criteria andKaoShiKeMuIsNull() {
            addCriterion("kao_shi_ke_mu is null");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuIsNotNull() {
            addCriterion("kao_shi_ke_mu is not null");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuEqualTo(String value) {
            addCriterion("kao_shi_ke_mu =", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuNotEqualTo(String value) {
            addCriterion("kao_shi_ke_mu <>", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuGreaterThan(String value) {
            addCriterion("kao_shi_ke_mu >", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuGreaterThanOrEqualTo(String value) {
            addCriterion("kao_shi_ke_mu >=", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuLessThan(String value) {
            addCriterion("kao_shi_ke_mu <", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuLessThanOrEqualTo(String value) {
            addCriterion("kao_shi_ke_mu <=", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuLike(String value) {
            addCriterion("kao_shi_ke_mu like", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuNotLike(String value) {
            addCriterion("kao_shi_ke_mu not like", value, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuIn(List<String> values) {
            addCriterion("kao_shi_ke_mu in", values, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuNotIn(List<String> values) {
            addCriterion("kao_shi_ke_mu not in", values, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuBetween(String value1, String value2) {
            addCriterion("kao_shi_ke_mu between", value1, value2, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andKaoShiKeMuNotBetween(String value1, String value2) {
            addCriterion("kao_shi_ke_mu not between", value1, value2, "kaoShiKeMu");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeIsNull() {
            addCriterion("ji_shu_zi_ge is null");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeIsNotNull() {
            addCriterion("ji_shu_zi_ge is not null");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeEqualTo(String value) {
            addCriterion("ji_shu_zi_ge =", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeNotEqualTo(String value) {
            addCriterion("ji_shu_zi_ge <>", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeGreaterThan(String value) {
            addCriterion("ji_shu_zi_ge >", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeGreaterThanOrEqualTo(String value) {
            addCriterion("ji_shu_zi_ge >=", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeLessThan(String value) {
            addCriterion("ji_shu_zi_ge <", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeLessThanOrEqualTo(String value) {
            addCriterion("ji_shu_zi_ge <=", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeLike(String value) {
            addCriterion("ji_shu_zi_ge like", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeNotLike(String value) {
            addCriterion("ji_shu_zi_ge not like", value, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeIn(List<String> values) {
            addCriterion("ji_shu_zi_ge in", values, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeNotIn(List<String> values) {
            addCriterion("ji_shu_zi_ge not in", values, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeBetween(String value1, String value2) {
            addCriterion("ji_shu_zi_ge between", value1, value2, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andJiShuZiGeNotBetween(String value1, String value2) {
            addCriterion("ji_shu_zi_ge not between", value1, value2, "jiShuZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeIsNull() {
            addCriterion("zhi_ye_zi_ge is null");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeIsNotNull() {
            addCriterion("zhi_ye_zi_ge is not null");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeEqualTo(String value) {
            addCriterion("zhi_ye_zi_ge =", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeNotEqualTo(String value) {
            addCriterion("zhi_ye_zi_ge <>", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeGreaterThan(String value) {
            addCriterion("zhi_ye_zi_ge >", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_ye_zi_ge >=", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeLessThan(String value) {
            addCriterion("zhi_ye_zi_ge <", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeLessThanOrEqualTo(String value) {
            addCriterion("zhi_ye_zi_ge <=", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeLike(String value) {
            addCriterion("zhi_ye_zi_ge like", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeNotLike(String value) {
            addCriterion("zhi_ye_zi_ge not like", value, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeIn(List<String> values) {
            addCriterion("zhi_ye_zi_ge in", values, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeNotIn(List<String> values) {
            addCriterion("zhi_ye_zi_ge not in", values, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeBetween(String value1, String value2) {
            addCriterion("zhi_ye_zi_ge between", value1, value2, "zhiYeZiGe");
            return (Criteria) this;
        }

        public Criteria andZhiYeZiGeNotBetween(String value1, String value2) {
            addCriterion("zhi_ye_zi_ge not between", value1, value2, "zhiYeZiGe");
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

        public Criteria andDianHuaIsNull() {
            addCriterion("dian_hua is null");
            return (Criteria) this;
        }

        public Criteria andDianHuaIsNotNull() {
            addCriterion("dian_hua is not null");
            return (Criteria) this;
        }

        public Criteria andDianHuaEqualTo(String value) {
            addCriterion("dian_hua =", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaNotEqualTo(String value) {
            addCriterion("dian_hua <>", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaGreaterThan(String value) {
            addCriterion("dian_hua >", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaGreaterThanOrEqualTo(String value) {
            addCriterion("dian_hua >=", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaLessThan(String value) {
            addCriterion("dian_hua <", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaLessThanOrEqualTo(String value) {
            addCriterion("dian_hua <=", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaLike(String value) {
            addCriterion("dian_hua like", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaNotLike(String value) {
            addCriterion("dian_hua not like", value, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaIn(List<String> values) {
            addCriterion("dian_hua in", values, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaNotIn(List<String> values) {
            addCriterion("dian_hua not in", values, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaBetween(String value1, String value2) {
            addCriterion("dian_hua between", value1, value2, "dianHua");
            return (Criteria) this;
        }

        public Criteria andDianHuaNotBetween(String value1, String value2) {
            addCriterion("dian_hua not between", value1, value2, "dianHua");
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