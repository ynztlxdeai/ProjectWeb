package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class BaomingqingkuangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaomingqingkuangExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobunitIsNull() {
            addCriterion("JobUnit is null");
            return (Criteria) this;
        }

        public Criteria andJobunitIsNotNull() {
            addCriterion("JobUnit is not null");
            return (Criteria) this;
        }

        public Criteria andJobunitEqualTo(String value) {
            addCriterion("JobUnit =", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitNotEqualTo(String value) {
            addCriterion("JobUnit <>", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitGreaterThan(String value) {
            addCriterion("JobUnit >", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitGreaterThanOrEqualTo(String value) {
            addCriterion("JobUnit >=", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitLessThan(String value) {
            addCriterion("JobUnit <", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitLessThanOrEqualTo(String value) {
            addCriterion("JobUnit <=", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitLike(String value) {
            addCriterion("JobUnit like", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitNotLike(String value) {
            addCriterion("JobUnit not like", value, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitIn(List<String> values) {
            addCriterion("JobUnit in", values, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitNotIn(List<String> values) {
            addCriterion("JobUnit not in", values, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitBetween(String value1, String value2) {
            addCriterion("JobUnit between", value1, value2, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobunitNotBetween(String value1, String value2) {
            addCriterion("JobUnit not between", value1, value2, "jobunit");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("Job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("Job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("Job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("Job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("Job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("Job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("Job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("Job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("Job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("Job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("Job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("Job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("Job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("Job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobcodeIsNull() {
            addCriterion("JobCode is null");
            return (Criteria) this;
        }

        public Criteria andJobcodeIsNotNull() {
            addCriterion("JobCode is not null");
            return (Criteria) this;
        }

        public Criteria andJobcodeEqualTo(String value) {
            addCriterion("JobCode =", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotEqualTo(String value) {
            addCriterion("JobCode <>", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThan(String value) {
            addCriterion("JobCode >", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThanOrEqualTo(String value) {
            addCriterion("JobCode >=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThan(String value) {
            addCriterion("JobCode <", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThanOrEqualTo(String value) {
            addCriterion("JobCode <=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLike(String value) {
            addCriterion("JobCode like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotLike(String value) {
            addCriterion("JobCode not like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeIn(List<String> values) {
            addCriterion("JobCode in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotIn(List<String> values) {
            addCriterion("JobCode not in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeBetween(String value1, String value2) {
            addCriterion("JobCode between", value1, value2, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotBetween(String value1, String value2) {
            addCriterion("JobCode not between", value1, value2, "jobcode");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("Numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("Numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(Integer value) {
            addCriterion("Numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Integer value) {
            addCriterion("Numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Integer value) {
            addCriterion("Numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("Numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Integer value) {
            addCriterion("Numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("Numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Integer> values) {
            addCriterion("Numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Integer> values) {
            addCriterion("Numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Integer value1, Integer value2) {
            addCriterion("Numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("Numbers not between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumIsNull() {
            addCriterion("NeedPersionNum is null");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumIsNotNull() {
            addCriterion("NeedPersionNum is not null");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumEqualTo(Integer value) {
            addCriterion("NeedPersionNum =", value, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumNotEqualTo(Integer value) {
            addCriterion("NeedPersionNum <>", value, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumGreaterThan(Integer value) {
            addCriterion("NeedPersionNum >", value, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("NeedPersionNum >=", value, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumLessThan(Integer value) {
            addCriterion("NeedPersionNum <", value, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumLessThanOrEqualTo(Integer value) {
            addCriterion("NeedPersionNum <=", value, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumIn(List<Integer> values) {
            addCriterion("NeedPersionNum in", values, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumNotIn(List<Integer> values) {
            addCriterion("NeedPersionNum not in", values, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumBetween(Integer value1, Integer value2) {
            addCriterion("NeedPersionNum between", value1, value2, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andNeedpersionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("NeedPersionNum not between", value1, value2, "needpersionnum");
            return (Criteria) this;
        }

        public Criteria andTestareIsNull() {
            addCriterion("TestAre is null");
            return (Criteria) this;
        }

        public Criteria andTestareIsNotNull() {
            addCriterion("TestAre is not null");
            return (Criteria) this;
        }

        public Criteria andTestareEqualTo(String value) {
            addCriterion("TestAre =", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareNotEqualTo(String value) {
            addCriterion("TestAre <>", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareGreaterThan(String value) {
            addCriterion("TestAre >", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareGreaterThanOrEqualTo(String value) {
            addCriterion("TestAre >=", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareLessThan(String value) {
            addCriterion("TestAre <", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareLessThanOrEqualTo(String value) {
            addCriterion("TestAre <=", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareLike(String value) {
            addCriterion("TestAre like", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareNotLike(String value) {
            addCriterion("TestAre not like", value, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareIn(List<String> values) {
            addCriterion("TestAre in", values, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareNotIn(List<String> values) {
            addCriterion("TestAre not in", values, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareBetween(String value1, String value2) {
            addCriterion("TestAre between", value1, value2, "testare");
            return (Criteria) this;
        }

        public Criteria andTestareNotBetween(String value1, String value2) {
            addCriterion("TestAre not between", value1, value2, "testare");
            return (Criteria) this;
        }

        public Criteria andPerfessionalIsNull() {
            addCriterion("Perfessional is null");
            return (Criteria) this;
        }

        public Criteria andPerfessionalIsNotNull() {
            addCriterion("Perfessional is not null");
            return (Criteria) this;
        }

        public Criteria andPerfessionalEqualTo(String value) {
            addCriterion("Perfessional =", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalNotEqualTo(String value) {
            addCriterion("Perfessional <>", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalGreaterThan(String value) {
            addCriterion("Perfessional >", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("Perfessional >=", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalLessThan(String value) {
            addCriterion("Perfessional <", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalLessThanOrEqualTo(String value) {
            addCriterion("Perfessional <=", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalLike(String value) {
            addCriterion("Perfessional like", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalNotLike(String value) {
            addCriterion("Perfessional not like", value, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalIn(List<String> values) {
            addCriterion("Perfessional in", values, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalNotIn(List<String> values) {
            addCriterion("Perfessional not in", values, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalBetween(String value1, String value2) {
            addCriterion("Perfessional between", value1, value2, "perfessional");
            return (Criteria) this;
        }

        public Criteria andPerfessionalNotBetween(String value1, String value2) {
            addCriterion("Perfessional not between", value1, value2, "perfessional");
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