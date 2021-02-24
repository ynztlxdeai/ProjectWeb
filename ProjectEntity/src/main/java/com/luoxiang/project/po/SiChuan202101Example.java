package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class SiChuan202101Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiChuan202101Example() {
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

        public Criteria andJobindexIsNull() {
            addCriterion("jobIndex is null");
            return (Criteria) this;
        }

        public Criteria andJobindexIsNotNull() {
            addCriterion("jobIndex is not null");
            return (Criteria) this;
        }

        public Criteria andJobindexEqualTo(Integer value) {
            addCriterion("jobIndex =", value, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexNotEqualTo(Integer value) {
            addCriterion("jobIndex <>", value, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexGreaterThan(Integer value) {
            addCriterion("jobIndex >", value, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobIndex >=", value, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexLessThan(Integer value) {
            addCriterion("jobIndex <", value, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexLessThanOrEqualTo(Integer value) {
            addCriterion("jobIndex <=", value, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexIn(List<Integer> values) {
            addCriterion("jobIndex in", values, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexNotIn(List<Integer> values) {
            addCriterion("jobIndex not in", values, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexBetween(Integer value1, Integer value2) {
            addCriterion("jobIndex between", value1, value2, "jobindex");
            return (Criteria) this;
        }

        public Criteria andJobindexNotBetween(Integer value1, Integer value2) {
            addCriterion("jobIndex not between", value1, value2, "jobindex");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("unitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("unitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("unitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("unitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("unitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("unitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("unitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("unitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("unitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("unitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("unitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("unitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("unitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("unitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andJobleibieIsNull() {
            addCriterion("jobLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andJobleibieIsNotNull() {
            addCriterion("jobLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andJobleibieEqualTo(String value) {
            addCriterion("jobLeiBie =", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieNotEqualTo(String value) {
            addCriterion("jobLeiBie <>", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieGreaterThan(String value) {
            addCriterion("jobLeiBie >", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieGreaterThanOrEqualTo(String value) {
            addCriterion("jobLeiBie >=", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieLessThan(String value) {
            addCriterion("jobLeiBie <", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieLessThanOrEqualTo(String value) {
            addCriterion("jobLeiBie <=", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieLike(String value) {
            addCriterion("jobLeiBie like", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieNotLike(String value) {
            addCriterion("jobLeiBie not like", value, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieIn(List<String> values) {
            addCriterion("jobLeiBie in", values, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieNotIn(List<String> values) {
            addCriterion("jobLeiBie not in", values, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieBetween(String value1, String value2) {
            addCriterion("jobLeiBie between", value1, value2, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobleibieNotBetween(String value1, String value2) {
            addCriterion("jobLeiBie not between", value1, value2, "jobleibie");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobName not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andNeednumIsNull() {
            addCriterion("needNum is null");
            return (Criteria) this;
        }

        public Criteria andNeednumIsNotNull() {
            addCriterion("needNum is not null");
            return (Criteria) this;
        }

        public Criteria andNeednumEqualTo(String value) {
            addCriterion("needNum =", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumNotEqualTo(String value) {
            addCriterion("needNum <>", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumGreaterThan(String value) {
            addCriterion("needNum >", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumGreaterThanOrEqualTo(String value) {
            addCriterion("needNum >=", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumLessThan(String value) {
            addCriterion("needNum <", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumLessThanOrEqualTo(String value) {
            addCriterion("needNum <=", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumLike(String value) {
            addCriterion("needNum like", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumNotLike(String value) {
            addCriterion("needNum not like", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumIn(List<String> values) {
            addCriterion("needNum in", values, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumNotIn(List<String> values) {
            addCriterion("needNum not in", values, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumBetween(String value1, String value2) {
            addCriterion("needNum between", value1, value2, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumNotBetween(String value1, String value2) {
            addCriterion("needNum not between", value1, value2, "neednum");
            return (Criteria) this;
        }

        public Criteria andJoblevelIsNull() {
            addCriterion("jobLevel is null");
            return (Criteria) this;
        }

        public Criteria andJoblevelIsNotNull() {
            addCriterion("jobLevel is not null");
            return (Criteria) this;
        }

        public Criteria andJoblevelEqualTo(String value) {
            addCriterion("jobLevel =", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelNotEqualTo(String value) {
            addCriterion("jobLevel <>", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelGreaterThan(String value) {
            addCriterion("jobLevel >", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelGreaterThanOrEqualTo(String value) {
            addCriterion("jobLevel >=", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelLessThan(String value) {
            addCriterion("jobLevel <", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelLessThanOrEqualTo(String value) {
            addCriterion("jobLevel <=", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelLike(String value) {
            addCriterion("jobLevel like", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelNotLike(String value) {
            addCriterion("jobLevel not like", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelIn(List<String> values) {
            addCriterion("jobLevel in", values, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelNotIn(List<String> values) {
            addCriterion("jobLevel not in", values, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelBetween(String value1, String value2) {
            addCriterion("jobLevel between", value1, value2, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelNotBetween(String value1, String value2) {
            addCriterion("jobLevel not between", value1, value2, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJobcodeIsNull() {
            addCriterion("jobCode is null");
            return (Criteria) this;
        }

        public Criteria andJobcodeIsNotNull() {
            addCriterion("jobCode is not null");
            return (Criteria) this;
        }

        public Criteria andJobcodeEqualTo(String value) {
            addCriterion("jobCode =", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotEqualTo(String value) {
            addCriterion("jobCode <>", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThan(String value) {
            addCriterion("jobCode >", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThanOrEqualTo(String value) {
            addCriterion("jobCode >=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThan(String value) {
            addCriterion("jobCode <", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThanOrEqualTo(String value) {
            addCriterion("jobCode <=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLike(String value) {
            addCriterion("jobCode like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotLike(String value) {
            addCriterion("jobCode not like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeIn(List<String> values) {
            addCriterion("jobCode in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotIn(List<String> values) {
            addCriterion("jobCode not in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeBetween(String value1, String value2) {
            addCriterion("jobCode between", value1, value2, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotBetween(String value1, String value2) {
            addCriterion("jobCode not between", value1, value2, "jobcode");
            return (Criteria) this;
        }

        public Criteria andFanweiIsNull() {
            addCriterion("fanWei is null");
            return (Criteria) this;
        }

        public Criteria andFanweiIsNotNull() {
            addCriterion("fanWei is not null");
            return (Criteria) this;
        }

        public Criteria andFanweiEqualTo(String value) {
            addCriterion("fanWei =", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiNotEqualTo(String value) {
            addCriterion("fanWei <>", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiGreaterThan(String value) {
            addCriterion("fanWei >", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiGreaterThanOrEqualTo(String value) {
            addCriterion("fanWei >=", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiLessThan(String value) {
            addCriterion("fanWei <", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiLessThanOrEqualTo(String value) {
            addCriterion("fanWei <=", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiLike(String value) {
            addCriterion("fanWei like", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiNotLike(String value) {
            addCriterion("fanWei not like", value, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiIn(List<String> values) {
            addCriterion("fanWei in", values, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiNotIn(List<String> values) {
            addCriterion("fanWei not in", values, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiBetween(String value1, String value2) {
            addCriterion("fanWei between", value1, value2, "fanwei");
            return (Criteria) this;
        }

        public Criteria andFanweiNotBetween(String value1, String value2) {
            addCriterion("fanWei not between", value1, value2, "fanwei");
            return (Criteria) this;
        }

        public Criteria andDuixiangIsNull() {
            addCriterion("duiXiang is null");
            return (Criteria) this;
        }

        public Criteria andDuixiangIsNotNull() {
            addCriterion("duiXiang is not null");
            return (Criteria) this;
        }

        public Criteria andDuixiangEqualTo(String value) {
            addCriterion("duiXiang =", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangNotEqualTo(String value) {
            addCriterion("duiXiang <>", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangGreaterThan(String value) {
            addCriterion("duiXiang >", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangGreaterThanOrEqualTo(String value) {
            addCriterion("duiXiang >=", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangLessThan(String value) {
            addCriterion("duiXiang <", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangLessThanOrEqualTo(String value) {
            addCriterion("duiXiang <=", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangLike(String value) {
            addCriterion("duiXiang like", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangNotLike(String value) {
            addCriterion("duiXiang not like", value, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangIn(List<String> values) {
            addCriterion("duiXiang in", values, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangNotIn(List<String> values) {
            addCriterion("duiXiang not in", values, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangBetween(String value1, String value2) {
            addCriterion("duiXiang between", value1, value2, "duixiang");
            return (Criteria) this;
        }

        public Criteria andDuixiangNotBetween(String value1, String value2) {
            addCriterion("duiXiang not between", value1, value2, "duixiang");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("xueLi is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("xueLi is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("xueLi =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("xueLi <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("xueLi >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("xueLi >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("xueLi <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("xueLi <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("xueLi like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("xueLi not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("xueLi in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("xueLi not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("xueLi between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("xueLi not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNull() {
            addCriterion("xueWei is null");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNotNull() {
            addCriterion("xueWei is not null");
            return (Criteria) this;
        }

        public Criteria andXueweiEqualTo(String value) {
            addCriterion("xueWei =", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotEqualTo(String value) {
            addCriterion("xueWei <>", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThan(String value) {
            addCriterion("xueWei >", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThanOrEqualTo(String value) {
            addCriterion("xueWei >=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThan(String value) {
            addCriterion("xueWei <", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThanOrEqualTo(String value) {
            addCriterion("xueWei <=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLike(String value) {
            addCriterion("xueWei like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotLike(String value) {
            addCriterion("xueWei not like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiIn(List<String> values) {
            addCriterion("xueWei in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotIn(List<String> values) {
            addCriterion("xueWei not in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiBetween(String value1, String value2) {
            addCriterion("xueWei between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotBetween(String value1, String value2) {
            addCriterion("xueWei not between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("zhuanYe is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("zhuanYe is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("zhuanYe =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("zhuanYe <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("zhuanYe >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("zhuanYe >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("zhuanYe <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("zhuanYe <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("zhuanYe like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("zhuanYe not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("zhuanYe in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("zhuanYe not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("zhuanYe between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("zhuanYe not between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beiZhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beiZhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beiZhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beiZhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beiZhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beiZhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beiZhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beiZhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beiZhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beiZhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beiZhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beiZhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beiZhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beiZhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andLessyearsIsNull() {
            addCriterion("lessYears is null");
            return (Criteria) this;
        }

        public Criteria andLessyearsIsNotNull() {
            addCriterion("lessYears is not null");
            return (Criteria) this;
        }

        public Criteria andLessyearsEqualTo(String value) {
            addCriterion("lessYears =", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsNotEqualTo(String value) {
            addCriterion("lessYears <>", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsGreaterThan(String value) {
            addCriterion("lessYears >", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsGreaterThanOrEqualTo(String value) {
            addCriterion("lessYears >=", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsLessThan(String value) {
            addCriterion("lessYears <", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsLessThanOrEqualTo(String value) {
            addCriterion("lessYears <=", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsLike(String value) {
            addCriterion("lessYears like", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsNotLike(String value) {
            addCriterion("lessYears not like", value, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsIn(List<String> values) {
            addCriterion("lessYears in", values, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsNotIn(List<String> values) {
            addCriterion("lessYears not in", values, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsBetween(String value1, String value2) {
            addCriterion("lessYears between", value1, value2, "lessyears");
            return (Criteria) this;
        }

        public Criteria andLessyearsNotBetween(String value1, String value2) {
            addCriterion("lessYears not between", value1, value2, "lessyears");
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

        public Criteria andInernameIsNull() {
            addCriterion("inerName is null");
            return (Criteria) this;
        }

        public Criteria andInernameIsNotNull() {
            addCriterion("inerName is not null");
            return (Criteria) this;
        }

        public Criteria andInernameEqualTo(String value) {
            addCriterion("inerName =", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameNotEqualTo(String value) {
            addCriterion("inerName <>", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameGreaterThan(String value) {
            addCriterion("inerName >", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameGreaterThanOrEqualTo(String value) {
            addCriterion("inerName >=", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameLessThan(String value) {
            addCriterion("inerName <", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameLessThanOrEqualTo(String value) {
            addCriterion("inerName <=", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameLike(String value) {
            addCriterion("inerName like", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameNotLike(String value) {
            addCriterion("inerName not like", value, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameIn(List<String> values) {
            addCriterion("inerName in", values, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameNotIn(List<String> values) {
            addCriterion("inerName not in", values, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameBetween(String value1, String value2) {
            addCriterion("inerName between", value1, value2, "inername");
            return (Criteria) this;
        }

        public Criteria andInernameNotBetween(String value1, String value2) {
            addCriterion("inerName not between", value1, value2, "inername");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNull() {
            addCriterion("jobDesc is null");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNotNull() {
            addCriterion("jobDesc is not null");
            return (Criteria) this;
        }

        public Criteria andJobdescEqualTo(String value) {
            addCriterion("jobDesc =", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotEqualTo(String value) {
            addCriterion("jobDesc <>", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThan(String value) {
            addCriterion("jobDesc >", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThanOrEqualTo(String value) {
            addCriterion("jobDesc >=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThan(String value) {
            addCriterion("jobDesc <", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThanOrEqualTo(String value) {
            addCriterion("jobDesc <=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLike(String value) {
            addCriterion("jobDesc like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotLike(String value) {
            addCriterion("jobDesc not like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescIn(List<String> values) {
            addCriterion("jobDesc in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotIn(List<String> values) {
            addCriterion("jobDesc not in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescBetween(String value1, String value2) {
            addCriterion("jobDesc between", value1, value2, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotBetween(String value1, String value2) {
            addCriterion("jobDesc not between", value1, value2, "jobdesc");
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

        public Criteria andAllnumsIsNull() {
            addCriterion("allNums is null");
            return (Criteria) this;
        }

        public Criteria andAllnumsIsNotNull() {
            addCriterion("allNums is not null");
            return (Criteria) this;
        }

        public Criteria andAllnumsEqualTo(Integer value) {
            addCriterion("allNums =", value, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsNotEqualTo(Integer value) {
            addCriterion("allNums <>", value, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsGreaterThan(Integer value) {
            addCriterion("allNums >", value, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("allNums >=", value, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsLessThan(Integer value) {
            addCriterion("allNums <", value, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsLessThanOrEqualTo(Integer value) {
            addCriterion("allNums <=", value, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsIn(List<Integer> values) {
            addCriterion("allNums in", values, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsNotIn(List<Integer> values) {
            addCriterion("allNums not in", values, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsBetween(Integer value1, Integer value2) {
            addCriterion("allNums between", value1, value2, "allnums");
            return (Criteria) this;
        }

        public Criteria andAllnumsNotBetween(Integer value1, Integer value2) {
            addCriterion("allNums not between", value1, value2, "allnums");
            return (Criteria) this;
        }

        public Criteria andFenshuIsNull() {
            addCriterion("fenShu is null");
            return (Criteria) this;
        }

        public Criteria andFenshuIsNotNull() {
            addCriterion("fenShu is not null");
            return (Criteria) this;
        }

        public Criteria andFenshuEqualTo(String value) {
            addCriterion("fenShu =", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuNotEqualTo(String value) {
            addCriterion("fenShu <>", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuGreaterThan(String value) {
            addCriterion("fenShu >", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuGreaterThanOrEqualTo(String value) {
            addCriterion("fenShu >=", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuLessThan(String value) {
            addCriterion("fenShu <", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuLessThanOrEqualTo(String value) {
            addCriterion("fenShu <=", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuLike(String value) {
            addCriterion("fenShu like", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuNotLike(String value) {
            addCriterion("fenShu not like", value, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuIn(List<String> values) {
            addCriterion("fenShu in", values, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuNotIn(List<String> values) {
            addCriterion("fenShu not in", values, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuBetween(String value1, String value2) {
            addCriterion("fenShu between", value1, value2, "fenshu");
            return (Criteria) this;
        }

        public Criteria andFenshuNotBetween(String value1, String value2) {
            addCriterion("fenShu not between", value1, value2, "fenshu");
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