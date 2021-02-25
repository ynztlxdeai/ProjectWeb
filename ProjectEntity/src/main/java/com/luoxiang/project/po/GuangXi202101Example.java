package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class GuangXi202101Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuangXi202101Example() {
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

        public Criteria andJiGuanNameIsNull() {
            addCriterion("ji_guan_name is null");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameIsNotNull() {
            addCriterion("ji_guan_name is not null");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameEqualTo(String value) {
            addCriterion("ji_guan_name =", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameNotEqualTo(String value) {
            addCriterion("ji_guan_name <>", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameGreaterThan(String value) {
            addCriterion("ji_guan_name >", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameGreaterThanOrEqualTo(String value) {
            addCriterion("ji_guan_name >=", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameLessThan(String value) {
            addCriterion("ji_guan_name <", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameLessThanOrEqualTo(String value) {
            addCriterion("ji_guan_name <=", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameLike(String value) {
            addCriterion("ji_guan_name like", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameNotLike(String value) {
            addCriterion("ji_guan_name not like", value, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameIn(List<String> values) {
            addCriterion("ji_guan_name in", values, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameNotIn(List<String> values) {
            addCriterion("ji_guan_name not in", values, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameBetween(String value1, String value2) {
            addCriterion("ji_guan_name between", value1, value2, "jiGuanName");
            return (Criteria) this;
        }

        public Criteria andJiGuanNameNotBetween(String value1, String value2) {
            addCriterion("ji_guan_name not between", value1, value2, "jiGuanName");
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

        public Criteria andJiGouLevelIsNull() {
            addCriterion("ji_gou_level is null");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelIsNotNull() {
            addCriterion("ji_gou_level is not null");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelEqualTo(String value) {
            addCriterion("ji_gou_level =", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelNotEqualTo(String value) {
            addCriterion("ji_gou_level <>", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelGreaterThan(String value) {
            addCriterion("ji_gou_level >", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ji_gou_level >=", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelLessThan(String value) {
            addCriterion("ji_gou_level <", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelLessThanOrEqualTo(String value) {
            addCriterion("ji_gou_level <=", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelLike(String value) {
            addCriterion("ji_gou_level like", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelNotLike(String value) {
            addCriterion("ji_gou_level not like", value, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelIn(List<String> values) {
            addCriterion("ji_gou_level in", values, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelNotIn(List<String> values) {
            addCriterion("ji_gou_level not in", values, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelBetween(String value1, String value2) {
            addCriterion("ji_gou_level between", value1, value2, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andJiGouLevelNotBetween(String value1, String value2) {
            addCriterion("ji_gou_level not between", value1, value2, "jiGouLevel");
            return (Criteria) this;
        }

        public Criteria andAttrIsNull() {
            addCriterion("attr is null");
            return (Criteria) this;
        }

        public Criteria andAttrIsNotNull() {
            addCriterion("attr is not null");
            return (Criteria) this;
        }

        public Criteria andAttrEqualTo(String value) {
            addCriterion("attr =", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotEqualTo(String value) {
            addCriterion("attr <>", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThan(String value) {
            addCriterion("attr >", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThanOrEqualTo(String value) {
            addCriterion("attr >=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThan(String value) {
            addCriterion("attr <", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThanOrEqualTo(String value) {
            addCriterion("attr <=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLike(String value) {
            addCriterion("attr like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotLike(String value) {
            addCriterion("attr not like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrIn(List<String> values) {
            addCriterion("attr in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotIn(List<String> values) {
            addCriterion("attr not in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrBetween(String value1, String value2) {
            addCriterion("attr between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotBetween(String value1, String value2) {
            addCriterion("attr not between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrIsNull() {
            addCriterion("unit_attr is null");
            return (Criteria) this;
        }

        public Criteria andUnitAttrIsNotNull() {
            addCriterion("unit_attr is not null");
            return (Criteria) this;
        }

        public Criteria andUnitAttrEqualTo(String value) {
            addCriterion("unit_attr =", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrNotEqualTo(String value) {
            addCriterion("unit_attr <>", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrGreaterThan(String value) {
            addCriterion("unit_attr >", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrGreaterThanOrEqualTo(String value) {
            addCriterion("unit_attr >=", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrLessThan(String value) {
            addCriterion("unit_attr <", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrLessThanOrEqualTo(String value) {
            addCriterion("unit_attr <=", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrLike(String value) {
            addCriterion("unit_attr like", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrNotLike(String value) {
            addCriterion("unit_attr not like", value, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrIn(List<String> values) {
            addCriterion("unit_attr in", values, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrNotIn(List<String> values) {
            addCriterion("unit_attr not in", values, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrBetween(String value1, String value2) {
            addCriterion("unit_attr between", value1, value2, "unitAttr");
            return (Criteria) this;
        }

        public Criteria andUnitAttrNotBetween(String value1, String value2) {
            addCriterion("unit_attr not between", value1, value2, "unitAttr");
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

        public Criteria andJobClassIsNull() {
            addCriterion("job_class is null");
            return (Criteria) this;
        }

        public Criteria andJobClassIsNotNull() {
            addCriterion("job_class is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassEqualTo(String value) {
            addCriterion("job_class =", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotEqualTo(String value) {
            addCriterion("job_class <>", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassGreaterThan(String value) {
            addCriterion("job_class >", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassGreaterThanOrEqualTo(String value) {
            addCriterion("job_class >=", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLessThan(String value) {
            addCriterion("job_class <", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLessThanOrEqualTo(String value) {
            addCriterion("job_class <=", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLike(String value) {
            addCriterion("job_class like", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotLike(String value) {
            addCriterion("job_class not like", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassIn(List<String> values) {
            addCriterion("job_class in", values, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotIn(List<String> values) {
            addCriterion("job_class not in", values, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassBetween(String value1, String value2) {
            addCriterion("job_class between", value1, value2, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotBetween(String value1, String value2) {
            addCriterion("job_class not between", value1, value2, "jobClass");
            return (Criteria) this;
        }

        public Criteria andDuiXiangIsNull() {
            addCriterion("dui_xiang is null");
            return (Criteria) this;
        }

        public Criteria andDuiXiangIsNotNull() {
            addCriterion("dui_xiang is not null");
            return (Criteria) this;
        }

        public Criteria andDuiXiangEqualTo(String value) {
            addCriterion("dui_xiang =", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangNotEqualTo(String value) {
            addCriterion("dui_xiang <>", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangGreaterThan(String value) {
            addCriterion("dui_xiang >", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangGreaterThanOrEqualTo(String value) {
            addCriterion("dui_xiang >=", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangLessThan(String value) {
            addCriterion("dui_xiang <", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangLessThanOrEqualTo(String value) {
            addCriterion("dui_xiang <=", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangLike(String value) {
            addCriterion("dui_xiang like", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangNotLike(String value) {
            addCriterion("dui_xiang not like", value, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangIn(List<String> values) {
            addCriterion("dui_xiang in", values, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangNotIn(List<String> values) {
            addCriterion("dui_xiang not in", values, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangBetween(String value1, String value2) {
            addCriterion("dui_xiang between", value1, value2, "duiXiang");
            return (Criteria) this;
        }

        public Criteria andDuiXiangNotBetween(String value1, String value2) {
            addCriterion("dui_xiang not between", value1, value2, "duiXiang");
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

        public Criteria andTwoYearsIsNull() {
            addCriterion("two_years is null");
            return (Criteria) this;
        }

        public Criteria andTwoYearsIsNotNull() {
            addCriterion("two_years is not null");
            return (Criteria) this;
        }

        public Criteria andTwoYearsEqualTo(String value) {
            addCriterion("two_years =", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsNotEqualTo(String value) {
            addCriterion("two_years <>", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsGreaterThan(String value) {
            addCriterion("two_years >", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsGreaterThanOrEqualTo(String value) {
            addCriterion("two_years >=", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsLessThan(String value) {
            addCriterion("two_years <", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsLessThanOrEqualTo(String value) {
            addCriterion("two_years <=", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsLike(String value) {
            addCriterion("two_years like", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsNotLike(String value) {
            addCriterion("two_years not like", value, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsIn(List<String> values) {
            addCriterion("two_years in", values, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsNotIn(List<String> values) {
            addCriterion("two_years not in", values, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsBetween(String value1, String value2) {
            addCriterion("two_years between", value1, value2, "twoYears");
            return (Criteria) this;
        }

        public Criteria andTwoYearsNotBetween(String value1, String value2) {
            addCriterion("two_years not between", value1, value2, "twoYears");
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

        public Criteria andJinQueIsNull() {
            addCriterion("jin_que is null");
            return (Criteria) this;
        }

        public Criteria andJinQueIsNotNull() {
            addCriterion("jin_que is not null");
            return (Criteria) this;
        }

        public Criteria andJinQueEqualTo(String value) {
            addCriterion("jin_que =", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueNotEqualTo(String value) {
            addCriterion("jin_que <>", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueGreaterThan(String value) {
            addCriterion("jin_que >", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueGreaterThanOrEqualTo(String value) {
            addCriterion("jin_que >=", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueLessThan(String value) {
            addCriterion("jin_que <", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueLessThanOrEqualTo(String value) {
            addCriterion("jin_que <=", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueLike(String value) {
            addCriterion("jin_que like", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueNotLike(String value) {
            addCriterion("jin_que not like", value, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueIn(List<String> values) {
            addCriterion("jin_que in", values, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueNotIn(List<String> values) {
            addCriterion("jin_que not in", values, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueBetween(String value1, String value2) {
            addCriterion("jin_que between", value1, value2, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJinQueNotBetween(String value1, String value2) {
            addCriterion("jin_que not between", value1, value2, "jinQue");
            return (Criteria) this;
        }

        public Criteria andJingChaIsNull() {
            addCriterion("jing_cha is null");
            return (Criteria) this;
        }

        public Criteria andJingChaIsNotNull() {
            addCriterion("jing_cha is not null");
            return (Criteria) this;
        }

        public Criteria andJingChaEqualTo(String value) {
            addCriterion("jing_cha =", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaNotEqualTo(String value) {
            addCriterion("jing_cha <>", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaGreaterThan(String value) {
            addCriterion("jing_cha >", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaGreaterThanOrEqualTo(String value) {
            addCriterion("jing_cha >=", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaLessThan(String value) {
            addCriterion("jing_cha <", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaLessThanOrEqualTo(String value) {
            addCriterion("jing_cha <=", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaLike(String value) {
            addCriterion("jing_cha like", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaNotLike(String value) {
            addCriterion("jing_cha not like", value, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaIn(List<String> values) {
            addCriterion("jing_cha in", values, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaNotIn(List<String> values) {
            addCriterion("jing_cha not in", values, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaBetween(String value1, String value2) {
            addCriterion("jing_cha between", value1, value2, "jingCha");
            return (Criteria) this;
        }

        public Criteria andJingChaNotBetween(String value1, String value2) {
            addCriterion("jing_cha not between", value1, value2, "jingCha");
            return (Criteria) this;
        }

        public Criteria andPianYuanIsNull() {
            addCriterion("pian_yuan is null");
            return (Criteria) this;
        }

        public Criteria andPianYuanIsNotNull() {
            addCriterion("pian_yuan is not null");
            return (Criteria) this;
        }

        public Criteria andPianYuanEqualTo(String value) {
            addCriterion("pian_yuan =", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanNotEqualTo(String value) {
            addCriterion("pian_yuan <>", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanGreaterThan(String value) {
            addCriterion("pian_yuan >", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanGreaterThanOrEqualTo(String value) {
            addCriterion("pian_yuan >=", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanLessThan(String value) {
            addCriterion("pian_yuan <", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanLessThanOrEqualTo(String value) {
            addCriterion("pian_yuan <=", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanLike(String value) {
            addCriterion("pian_yuan like", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanNotLike(String value) {
            addCriterion("pian_yuan not like", value, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanIn(List<String> values) {
            addCriterion("pian_yuan in", values, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanNotIn(List<String> values) {
            addCriterion("pian_yuan not in", values, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanBetween(String value1, String value2) {
            addCriterion("pian_yuan between", value1, value2, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andPianYuanNotBetween(String value1, String value2) {
            addCriterion("pian_yuan not between", value1, value2, "pianYuan");
            return (Criteria) this;
        }

        public Criteria andHeBingIsNull() {
            addCriterion("he_bing is null");
            return (Criteria) this;
        }

        public Criteria andHeBingIsNotNull() {
            addCriterion("he_bing is not null");
            return (Criteria) this;
        }

        public Criteria andHeBingEqualTo(String value) {
            addCriterion("he_bing =", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingNotEqualTo(String value) {
            addCriterion("he_bing <>", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingGreaterThan(String value) {
            addCriterion("he_bing >", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingGreaterThanOrEqualTo(String value) {
            addCriterion("he_bing >=", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingLessThan(String value) {
            addCriterion("he_bing <", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingLessThanOrEqualTo(String value) {
            addCriterion("he_bing <=", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingLike(String value) {
            addCriterion("he_bing like", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingNotLike(String value) {
            addCriterion("he_bing not like", value, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingIn(List<String> values) {
            addCriterion("he_bing in", values, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingNotIn(List<String> values) {
            addCriterion("he_bing not in", values, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingBetween(String value1, String value2) {
            addCriterion("he_bing between", value1, value2, "heBing");
            return (Criteria) this;
        }

        public Criteria andHeBingNotBetween(String value1, String value2) {
            addCriterion("he_bing not between", value1, value2, "heBing");
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

        public Criteria andShenChaIsNull() {
            addCriterion("shen_cha is null");
            return (Criteria) this;
        }

        public Criteria andShenChaIsNotNull() {
            addCriterion("shen_cha is not null");
            return (Criteria) this;
        }

        public Criteria andShenChaEqualTo(String value) {
            addCriterion("shen_cha =", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaNotEqualTo(String value) {
            addCriterion("shen_cha <>", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaGreaterThan(String value) {
            addCriterion("shen_cha >", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaGreaterThanOrEqualTo(String value) {
            addCriterion("shen_cha >=", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaLessThan(String value) {
            addCriterion("shen_cha <", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaLessThanOrEqualTo(String value) {
            addCriterion("shen_cha <=", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaLike(String value) {
            addCriterion("shen_cha like", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaNotLike(String value) {
            addCriterion("shen_cha not like", value, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaIn(List<String> values) {
            addCriterion("shen_cha in", values, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaNotIn(List<String> values) {
            addCriterion("shen_cha not in", values, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaBetween(String value1, String value2) {
            addCriterion("shen_cha between", value1, value2, "shenCha");
            return (Criteria) this;
        }

        public Criteria andShenChaNotBetween(String value1, String value2) {
            addCriterion("shen_cha not between", value1, value2, "shenCha");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNull() {
            addCriterion("phone_1 is null");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNotNull() {
            addCriterion("phone_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone1EqualTo(String value) {
            addCriterion("phone_1 =", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotEqualTo(String value) {
            addCriterion("phone_1 <>", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThan(String value) {
            addCriterion("phone_1 >", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("phone_1 >=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThan(String value) {
            addCriterion("phone_1 <", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThanOrEqualTo(String value) {
            addCriterion("phone_1 <=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Like(String value) {
            addCriterion("phone_1 like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotLike(String value) {
            addCriterion("phone_1 not like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1In(List<String> values) {
            addCriterion("phone_1 in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotIn(List<String> values) {
            addCriterion("phone_1 not in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Between(String value1, String value2) {
            addCriterion("phone_1 between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotBetween(String value1, String value2) {
            addCriterion("phone_1 not between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("phone_2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("phone_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("phone_2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("phone_2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("phone_2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("phone_2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("phone_2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("phone_2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("phone_2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("phone_2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("phone_2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("phone_2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("phone_2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("phone_2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andFoxIsNull() {
            addCriterion("fox is null");
            return (Criteria) this;
        }

        public Criteria andFoxIsNotNull() {
            addCriterion("fox is not null");
            return (Criteria) this;
        }

        public Criteria andFoxEqualTo(String value) {
            addCriterion("fox =", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotEqualTo(String value) {
            addCriterion("fox <>", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxGreaterThan(String value) {
            addCriterion("fox >", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxGreaterThanOrEqualTo(String value) {
            addCriterion("fox >=", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxLessThan(String value) {
            addCriterion("fox <", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxLessThanOrEqualTo(String value) {
            addCriterion("fox <=", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxLike(String value) {
            addCriterion("fox like", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotLike(String value) {
            addCriterion("fox not like", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxIn(List<String> values) {
            addCriterion("fox in", values, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotIn(List<String> values) {
            addCriterion("fox not in", values, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxBetween(String value1, String value2) {
            addCriterion("fox between", value1, value2, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotBetween(String value1, String value2) {
            addCriterion("fox not between", value1, value2, "fox");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andYouBianIsNull() {
            addCriterion("you_bian is null");
            return (Criteria) this;
        }

        public Criteria andYouBianIsNotNull() {
            addCriterion("you_bian is not null");
            return (Criteria) this;
        }

        public Criteria andYouBianEqualTo(String value) {
            addCriterion("you_bian =", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotEqualTo(String value) {
            addCriterion("you_bian <>", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianGreaterThan(String value) {
            addCriterion("you_bian >", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianGreaterThanOrEqualTo(String value) {
            addCriterion("you_bian >=", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianLessThan(String value) {
            addCriterion("you_bian <", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianLessThanOrEqualTo(String value) {
            addCriterion("you_bian <=", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianLike(String value) {
            addCriterion("you_bian like", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotLike(String value) {
            addCriterion("you_bian not like", value, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianIn(List<String> values) {
            addCriterion("you_bian in", values, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotIn(List<String> values) {
            addCriterion("you_bian not in", values, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianBetween(String value1, String value2) {
            addCriterion("you_bian between", value1, value2, "youBian");
            return (Criteria) this;
        }

        public Criteria andYouBianNotBetween(String value1, String value2) {
            addCriterion("you_bian not between", value1, value2, "youBian");
            return (Criteria) this;
        }

        public Criteria andJpCodeIsNull() {
            addCriterion("jp_code is null");
            return (Criteria) this;
        }

        public Criteria andJpCodeIsNotNull() {
            addCriterion("jp_code is not null");
            return (Criteria) this;
        }

        public Criteria andJpCodeEqualTo(String value) {
            addCriterion("jp_code =", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeNotEqualTo(String value) {
            addCriterion("jp_code <>", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeGreaterThan(String value) {
            addCriterion("jp_code >", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("jp_code >=", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeLessThan(String value) {
            addCriterion("jp_code <", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeLessThanOrEqualTo(String value) {
            addCriterion("jp_code <=", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeLike(String value) {
            addCriterion("jp_code like", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeNotLike(String value) {
            addCriterion("jp_code not like", value, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeIn(List<String> values) {
            addCriterion("jp_code in", values, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeNotIn(List<String> values) {
            addCriterion("jp_code not in", values, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeBetween(String value1, String value2) {
            addCriterion("jp_code between", value1, value2, "jpCode");
            return (Criteria) this;
        }

        public Criteria andJpCodeNotBetween(String value1, String value2) {
            addCriterion("jp_code not between", value1, value2, "jpCode");
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