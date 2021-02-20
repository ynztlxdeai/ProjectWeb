package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class HuBei202101Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuBei202101Example() {
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

        public Criteria andXueWeiSecondIsNull() {
            addCriterion("xue_wei_second is null");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondIsNotNull() {
            addCriterion("xue_wei_second is not null");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondEqualTo(String value) {
            addCriterion("xue_wei_second =", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondNotEqualTo(String value) {
            addCriterion("xue_wei_second <>", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondGreaterThan(String value) {
            addCriterion("xue_wei_second >", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondGreaterThanOrEqualTo(String value) {
            addCriterion("xue_wei_second >=", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondLessThan(String value) {
            addCriterion("xue_wei_second <", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondLessThanOrEqualTo(String value) {
            addCriterion("xue_wei_second <=", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondLike(String value) {
            addCriterion("xue_wei_second like", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondNotLike(String value) {
            addCriterion("xue_wei_second not like", value, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondIn(List<String> values) {
            addCriterion("xue_wei_second in", values, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondNotIn(List<String> values) {
            addCriterion("xue_wei_second not in", values, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondBetween(String value1, String value2) {
            addCriterion("xue_wei_second between", value1, value2, "xueWeiSecond");
            return (Criteria) this;
        }

        public Criteria andXueWeiSecondNotBetween(String value1, String value2) {
            addCriterion("xue_wei_second not between", value1, value2, "xueWeiSecond");
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

        public Criteria andMianShiTestIsNull() {
            addCriterion("mian_shi_test is null");
            return (Criteria) this;
        }

        public Criteria andMianShiTestIsNotNull() {
            addCriterion("mian_shi_test is not null");
            return (Criteria) this;
        }

        public Criteria andMianShiTestEqualTo(String value) {
            addCriterion("mian_shi_test =", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestNotEqualTo(String value) {
            addCriterion("mian_shi_test <>", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestGreaterThan(String value) {
            addCriterion("mian_shi_test >", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestGreaterThanOrEqualTo(String value) {
            addCriterion("mian_shi_test >=", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestLessThan(String value) {
            addCriterion("mian_shi_test <", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestLessThanOrEqualTo(String value) {
            addCriterion("mian_shi_test <=", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestLike(String value) {
            addCriterion("mian_shi_test like", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestNotLike(String value) {
            addCriterion("mian_shi_test not like", value, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestIn(List<String> values) {
            addCriterion("mian_shi_test in", values, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestNotIn(List<String> values) {
            addCriterion("mian_shi_test not in", values, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestBetween(String value1, String value2) {
            addCriterion("mian_shi_test between", value1, value2, "mianShiTest");
            return (Criteria) this;
        }

        public Criteria andMianShiTestNotBetween(String value1, String value2) {
            addCriterion("mian_shi_test not between", value1, value2, "mianShiTest");
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

        public Criteria andCanGongIsNull() {
            addCriterion("can_gong is null");
            return (Criteria) this;
        }

        public Criteria andCanGongIsNotNull() {
            addCriterion("can_gong is not null");
            return (Criteria) this;
        }

        public Criteria andCanGongEqualTo(String value) {
            addCriterion("can_gong =", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotEqualTo(String value) {
            addCriterion("can_gong <>", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongGreaterThan(String value) {
            addCriterion("can_gong >", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongGreaterThanOrEqualTo(String value) {
            addCriterion("can_gong >=", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongLessThan(String value) {
            addCriterion("can_gong <", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongLessThanOrEqualTo(String value) {
            addCriterion("can_gong <=", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongLike(String value) {
            addCriterion("can_gong like", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotLike(String value) {
            addCriterion("can_gong not like", value, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongIn(List<String> values) {
            addCriterion("can_gong in", values, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotIn(List<String> values) {
            addCriterion("can_gong not in", values, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongBetween(String value1, String value2) {
            addCriterion("can_gong between", value1, value2, "canGong");
            return (Criteria) this;
        }

        public Criteria andCanGongNotBetween(String value1, String value2) {
            addCriterion("can_gong not between", value1, value2, "canGong");
            return (Criteria) this;
        }

        public Criteria andKaoChaIsNull() {
            addCriterion("kao_cha is null");
            return (Criteria) this;
        }

        public Criteria andKaoChaIsNotNull() {
            addCriterion("kao_cha is not null");
            return (Criteria) this;
        }

        public Criteria andKaoChaEqualTo(String value) {
            addCriterion("kao_cha =", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaNotEqualTo(String value) {
            addCriterion("kao_cha <>", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaGreaterThan(String value) {
            addCriterion("kao_cha >", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaGreaterThanOrEqualTo(String value) {
            addCriterion("kao_cha >=", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaLessThan(String value) {
            addCriterion("kao_cha <", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaLessThanOrEqualTo(String value) {
            addCriterion("kao_cha <=", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaLike(String value) {
            addCriterion("kao_cha like", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaNotLike(String value) {
            addCriterion("kao_cha not like", value, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaIn(List<String> values) {
            addCriterion("kao_cha in", values, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaNotIn(List<String> values) {
            addCriterion("kao_cha not in", values, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaBetween(String value1, String value2) {
            addCriterion("kao_cha between", value1, value2, "kaoCha");
            return (Criteria) this;
        }

        public Criteria andKaoChaNotBetween(String value1, String value2) {
            addCriterion("kao_cha not between", value1, value2, "kaoCha");
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