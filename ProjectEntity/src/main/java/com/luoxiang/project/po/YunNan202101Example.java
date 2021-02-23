package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class YunNan202101Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunNan202101Example() {
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

        public Criteria andUnitClassIsNull() {
            addCriterion("unit_class is null");
            return (Criteria) this;
        }

        public Criteria andUnitClassIsNotNull() {
            addCriterion("unit_class is not null");
            return (Criteria) this;
        }

        public Criteria andUnitClassEqualTo(String value) {
            addCriterion("unit_class =", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassNotEqualTo(String value) {
            addCriterion("unit_class <>", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassGreaterThan(String value) {
            addCriterion("unit_class >", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassGreaterThanOrEqualTo(String value) {
            addCriterion("unit_class >=", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassLessThan(String value) {
            addCriterion("unit_class <", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassLessThanOrEqualTo(String value) {
            addCriterion("unit_class <=", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassLike(String value) {
            addCriterion("unit_class like", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassNotLike(String value) {
            addCriterion("unit_class not like", value, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassIn(List<String> values) {
            addCriterion("unit_class in", values, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassNotIn(List<String> values) {
            addCriterion("unit_class not in", values, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassBetween(String value1, String value2) {
            addCriterion("unit_class between", value1, value2, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitClassNotBetween(String value1, String value2) {
            addCriterion("unit_class not between", value1, value2, "unitClass");
            return (Criteria) this;
        }

        public Criteria andUnitLevelIsNull() {
            addCriterion("unit_level is null");
            return (Criteria) this;
        }

        public Criteria andUnitLevelIsNotNull() {
            addCriterion("unit_level is not null");
            return (Criteria) this;
        }

        public Criteria andUnitLevelEqualTo(String value) {
            addCriterion("unit_level =", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelNotEqualTo(String value) {
            addCriterion("unit_level <>", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelGreaterThan(String value) {
            addCriterion("unit_level >", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelGreaterThanOrEqualTo(String value) {
            addCriterion("unit_level >=", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelLessThan(String value) {
            addCriterion("unit_level <", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelLessThanOrEqualTo(String value) {
            addCriterion("unit_level <=", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelLike(String value) {
            addCriterion("unit_level like", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelNotLike(String value) {
            addCriterion("unit_level not like", value, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelIn(List<String> values) {
            addCriterion("unit_level in", values, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelNotIn(List<String> values) {
            addCriterion("unit_level not in", values, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelBetween(String value1, String value2) {
            addCriterion("unit_level between", value1, value2, "unitLevel");
            return (Criteria) this;
        }

        public Criteria andUnitLevelNotBetween(String value1, String value2) {
            addCriterion("unit_level not between", value1, value2, "unitLevel");
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

        public Criteria andDaLeiIsNull() {
            addCriterion("da_lei is null");
            return (Criteria) this;
        }

        public Criteria andDaLeiIsNotNull() {
            addCriterion("da_lei is not null");
            return (Criteria) this;
        }

        public Criteria andDaLeiEqualTo(String value) {
            addCriterion("da_lei =", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiNotEqualTo(String value) {
            addCriterion("da_lei <>", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiGreaterThan(String value) {
            addCriterion("da_lei >", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiGreaterThanOrEqualTo(String value) {
            addCriterion("da_lei >=", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiLessThan(String value) {
            addCriterion("da_lei <", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiLessThanOrEqualTo(String value) {
            addCriterion("da_lei <=", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiLike(String value) {
            addCriterion("da_lei like", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiNotLike(String value) {
            addCriterion("da_lei not like", value, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiIn(List<String> values) {
            addCriterion("da_lei in", values, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiNotIn(List<String> values) {
            addCriterion("da_lei not in", values, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiBetween(String value1, String value2) {
            addCriterion("da_lei between", value1, value2, "daLei");
            return (Criteria) this;
        }

        public Criteria andDaLeiNotBetween(String value1, String value2) {
            addCriterion("da_lei not between", value1, value2, "daLei");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengIsNull() {
            addCriterion("xuan_diao_sheng is null");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengIsNotNull() {
            addCriterion("xuan_diao_sheng is not null");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengEqualTo(String value) {
            addCriterion("xuan_diao_sheng =", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengNotEqualTo(String value) {
            addCriterion("xuan_diao_sheng <>", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengGreaterThan(String value) {
            addCriterion("xuan_diao_sheng >", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengGreaterThanOrEqualTo(String value) {
            addCriterion("xuan_diao_sheng >=", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengLessThan(String value) {
            addCriterion("xuan_diao_sheng <", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengLessThanOrEqualTo(String value) {
            addCriterion("xuan_diao_sheng <=", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengLike(String value) {
            addCriterion("xuan_diao_sheng like", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengNotLike(String value) {
            addCriterion("xuan_diao_sheng not like", value, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengIn(List<String> values) {
            addCriterion("xuan_diao_sheng in", values, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengNotIn(List<String> values) {
            addCriterion("xuan_diao_sheng not in", values, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengBetween(String value1, String value2) {
            addCriterion("xuan_diao_sheng between", value1, value2, "xuanDiaoSheng");
            return (Criteria) this;
        }

        public Criteria andXuanDiaoShengNotBetween(String value1, String value2) {
            addCriterion("xuan_diao_sheng not between", value1, value2, "xuanDiaoSheng");
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

        public Criteria andIsFaGuanIsNull() {
            addCriterion("is_fa_guan is null");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanIsNotNull() {
            addCriterion("is_fa_guan is not null");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanEqualTo(String value) {
            addCriterion("is_fa_guan =", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanNotEqualTo(String value) {
            addCriterion("is_fa_guan <>", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanGreaterThan(String value) {
            addCriterion("is_fa_guan >", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanGreaterThanOrEqualTo(String value) {
            addCriterion("is_fa_guan >=", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanLessThan(String value) {
            addCriterion("is_fa_guan <", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanLessThanOrEqualTo(String value) {
            addCriterion("is_fa_guan <=", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanLike(String value) {
            addCriterion("is_fa_guan like", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanNotLike(String value) {
            addCriterion("is_fa_guan not like", value, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanIn(List<String> values) {
            addCriterion("is_fa_guan in", values, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanNotIn(List<String> values) {
            addCriterion("is_fa_guan not in", values, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanBetween(String value1, String value2) {
            addCriterion("is_fa_guan between", value1, value2, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsFaGuanNotBetween(String value1, String value2) {
            addCriterion("is_fa_guan not between", value1, value2, "isFaGuan");
            return (Criteria) this;
        }

        public Criteria andIsXianJiIsNull() {
            addCriterion("is_xian_ji is null");
            return (Criteria) this;
        }

        public Criteria andIsXianJiIsNotNull() {
            addCriterion("is_xian_ji is not null");
            return (Criteria) this;
        }

        public Criteria andIsXianJiEqualTo(String value) {
            addCriterion("is_xian_ji =", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiNotEqualTo(String value) {
            addCriterion("is_xian_ji <>", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiGreaterThan(String value) {
            addCriterion("is_xian_ji >", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiGreaterThanOrEqualTo(String value) {
            addCriterion("is_xian_ji >=", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiLessThan(String value) {
            addCriterion("is_xian_ji <", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiLessThanOrEqualTo(String value) {
            addCriterion("is_xian_ji <=", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiLike(String value) {
            addCriterion("is_xian_ji like", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiNotLike(String value) {
            addCriterion("is_xian_ji not like", value, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiIn(List<String> values) {
            addCriterion("is_xian_ji in", values, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiNotIn(List<String> values) {
            addCriterion("is_xian_ji not in", values, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiBetween(String value1, String value2) {
            addCriterion("is_xian_ji between", value1, value2, "isXianJi");
            return (Criteria) this;
        }

        public Criteria andIsXianJiNotBetween(String value1, String value2) {
            addCriterion("is_xian_ji not between", value1, value2, "isXianJi");
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

        public Criteria andMinZuIsNull() {
            addCriterion("min_zu is null");
            return (Criteria) this;
        }

        public Criteria andMinZuIsNotNull() {
            addCriterion("min_zu is not null");
            return (Criteria) this;
        }

        public Criteria andMinZuEqualTo(String value) {
            addCriterion("min_zu =", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotEqualTo(String value) {
            addCriterion("min_zu <>", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuGreaterThan(String value) {
            addCriterion("min_zu >", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuGreaterThanOrEqualTo(String value) {
            addCriterion("min_zu >=", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuLessThan(String value) {
            addCriterion("min_zu <", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuLessThanOrEqualTo(String value) {
            addCriterion("min_zu <=", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuLike(String value) {
            addCriterion("min_zu like", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotLike(String value) {
            addCriterion("min_zu not like", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuIn(List<String> values) {
            addCriterion("min_zu in", values, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotIn(List<String> values) {
            addCriterion("min_zu not in", values, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuBetween(String value1, String value2) {
            addCriterion("min_zu between", value1, value2, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotBetween(String value1, String value2) {
            addCriterion("min_zu not between", value1, value2, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNameIsNull() {
            addCriterion("min_zu_name is null");
            return (Criteria) this;
        }

        public Criteria andMinZuNameIsNotNull() {
            addCriterion("min_zu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMinZuNameEqualTo(String value) {
            addCriterion("min_zu_name =", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameNotEqualTo(String value) {
            addCriterion("min_zu_name <>", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameGreaterThan(String value) {
            addCriterion("min_zu_name >", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameGreaterThanOrEqualTo(String value) {
            addCriterion("min_zu_name >=", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameLessThan(String value) {
            addCriterion("min_zu_name <", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameLessThanOrEqualTo(String value) {
            addCriterion("min_zu_name <=", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameLike(String value) {
            addCriterion("min_zu_name like", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameNotLike(String value) {
            addCriterion("min_zu_name not like", value, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameIn(List<String> values) {
            addCriterion("min_zu_name in", values, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameNotIn(List<String> values) {
            addCriterion("min_zu_name not in", values, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameBetween(String value1, String value2) {
            addCriterion("min_zu_name between", value1, value2, "minZuName");
            return (Criteria) this;
        }

        public Criteria andMinZuNameNotBetween(String value1, String value2) {
            addCriterion("min_zu_name not between", value1, value2, "minZuName");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrIsNull() {
            addCriterion("xue_li_attr is null");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrIsNotNull() {
            addCriterion("xue_li_attr is not null");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrEqualTo(String value) {
            addCriterion("xue_li_attr =", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrNotEqualTo(String value) {
            addCriterion("xue_li_attr <>", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrGreaterThan(String value) {
            addCriterion("xue_li_attr >", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrGreaterThanOrEqualTo(String value) {
            addCriterion("xue_li_attr >=", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrLessThan(String value) {
            addCriterion("xue_li_attr <", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrLessThanOrEqualTo(String value) {
            addCriterion("xue_li_attr <=", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrLike(String value) {
            addCriterion("xue_li_attr like", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrNotLike(String value) {
            addCriterion("xue_li_attr not like", value, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrIn(List<String> values) {
            addCriterion("xue_li_attr in", values, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrNotIn(List<String> values) {
            addCriterion("xue_li_attr not in", values, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrBetween(String value1, String value2) {
            addCriterion("xue_li_attr between", value1, value2, "xueLiAttr");
            return (Criteria) this;
        }

        public Criteria andXueLiAttrNotBetween(String value1, String value2) {
            addCriterion("xue_li_attr not between", value1, value2, "xueLiAttr");
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

        public Criteria andHuJiIsNull() {
            addCriterion("hu_ji is null");
            return (Criteria) this;
        }

        public Criteria andHuJiIsNotNull() {
            addCriterion("hu_ji is not null");
            return (Criteria) this;
        }

        public Criteria andHuJiEqualTo(String value) {
            addCriterion("hu_ji =", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotEqualTo(String value) {
            addCriterion("hu_ji <>", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiGreaterThan(String value) {
            addCriterion("hu_ji >", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiGreaterThanOrEqualTo(String value) {
            addCriterion("hu_ji >=", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiLessThan(String value) {
            addCriterion("hu_ji <", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiLessThanOrEqualTo(String value) {
            addCriterion("hu_ji <=", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiLike(String value) {
            addCriterion("hu_ji like", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotLike(String value) {
            addCriterion("hu_ji not like", value, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiIn(List<String> values) {
            addCriterion("hu_ji in", values, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotIn(List<String> values) {
            addCriterion("hu_ji not in", values, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiBetween(String value1, String value2) {
            addCriterion("hu_ji between", value1, value2, "huJi");
            return (Criteria) this;
        }

        public Criteria andHuJiNotBetween(String value1, String value2) {
            addCriterion("hu_ji not between", value1, value2, "huJi");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuIsNull() {
            addCriterion("ji_ceng_xiang_mu is null");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuIsNotNull() {
            addCriterion("ji_ceng_xiang_mu is not null");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuEqualTo(String value) {
            addCriterion("ji_ceng_xiang_mu =", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuNotEqualTo(String value) {
            addCriterion("ji_ceng_xiang_mu <>", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuGreaterThan(String value) {
            addCriterion("ji_ceng_xiang_mu >", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuGreaterThanOrEqualTo(String value) {
            addCriterion("ji_ceng_xiang_mu >=", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuLessThan(String value) {
            addCriterion("ji_ceng_xiang_mu <", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuLessThanOrEqualTo(String value) {
            addCriterion("ji_ceng_xiang_mu <=", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuLike(String value) {
            addCriterion("ji_ceng_xiang_mu like", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuNotLike(String value) {
            addCriterion("ji_ceng_xiang_mu not like", value, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuIn(List<String> values) {
            addCriterion("ji_ceng_xiang_mu in", values, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuNotIn(List<String> values) {
            addCriterion("ji_ceng_xiang_mu not in", values, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuBetween(String value1, String value2) {
            addCriterion("ji_ceng_xiang_mu between", value1, value2, "jiCengXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiCengXiangMuNotBetween(String value1, String value2) {
            addCriterion("ji_ceng_xiang_mu not between", value1, value2, "jiCengXiangMu");
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

        public Criteria andFaLvIsNull() {
            addCriterion("fa_lv is null");
            return (Criteria) this;
        }

        public Criteria andFaLvIsNotNull() {
            addCriterion("fa_lv is not null");
            return (Criteria) this;
        }

        public Criteria andFaLvEqualTo(String value) {
            addCriterion("fa_lv =", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvNotEqualTo(String value) {
            addCriterion("fa_lv <>", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvGreaterThan(String value) {
            addCriterion("fa_lv >", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvGreaterThanOrEqualTo(String value) {
            addCriterion("fa_lv >=", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvLessThan(String value) {
            addCriterion("fa_lv <", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvLessThanOrEqualTo(String value) {
            addCriterion("fa_lv <=", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvLike(String value) {
            addCriterion("fa_lv like", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvNotLike(String value) {
            addCriterion("fa_lv not like", value, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvIn(List<String> values) {
            addCriterion("fa_lv in", values, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvNotIn(List<String> values) {
            addCriterion("fa_lv not in", values, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvBetween(String value1, String value2) {
            addCriterion("fa_lv between", value1, value2, "faLv");
            return (Criteria) this;
        }

        public Criteria andFaLvNotBetween(String value1, String value2) {
            addCriterion("fa_lv not between", value1, value2, "faLv");
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

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaIsNull() {
            addCriterion("phone_area is null");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaIsNotNull() {
            addCriterion("phone_area is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaEqualTo(String value) {
            addCriterion("phone_area =", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaNotEqualTo(String value) {
            addCriterion("phone_area <>", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaGreaterThan(String value) {
            addCriterion("phone_area >", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaGreaterThanOrEqualTo(String value) {
            addCriterion("phone_area >=", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaLessThan(String value) {
            addCriterion("phone_area <", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaLessThanOrEqualTo(String value) {
            addCriterion("phone_area <=", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaLike(String value) {
            addCriterion("phone_area like", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaNotLike(String value) {
            addCriterion("phone_area not like", value, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaIn(List<String> values) {
            addCriterion("phone_area in", values, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaNotIn(List<String> values) {
            addCriterion("phone_area not in", values, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaBetween(String value1, String value2) {
            addCriterion("phone_area between", value1, value2, "phoneArea");
            return (Criteria) this;
        }

        public Criteria andPhoneAreaNotBetween(String value1, String value2) {
            addCriterion("phone_area not between", value1, value2, "phoneArea");
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

        public Criteria andKaiKaoIsNull() {
            addCriterion("kai_kao is null");
            return (Criteria) this;
        }

        public Criteria andKaiKaoIsNotNull() {
            addCriterion("kai_kao is not null");
            return (Criteria) this;
        }

        public Criteria andKaiKaoEqualTo(String value) {
            addCriterion("kai_kao =", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoNotEqualTo(String value) {
            addCriterion("kai_kao <>", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoGreaterThan(String value) {
            addCriterion("kai_kao >", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoGreaterThanOrEqualTo(String value) {
            addCriterion("kai_kao >=", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoLessThan(String value) {
            addCriterion("kai_kao <", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoLessThanOrEqualTo(String value) {
            addCriterion("kai_kao <=", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoLike(String value) {
            addCriterion("kai_kao like", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoNotLike(String value) {
            addCriterion("kai_kao not like", value, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoIn(List<String> values) {
            addCriterion("kai_kao in", values, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoNotIn(List<String> values) {
            addCriterion("kai_kao not in", values, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBetween(String value1, String value2) {
            addCriterion("kai_kao between", value1, value2, "kaiKao");
            return (Criteria) this;
        }

        public Criteria andKaiKaoNotBetween(String value1, String value2) {
            addCriterion("kai_kao not between", value1, value2, "kaiKao");
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