package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class GdSydw2022Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GdSydw2022Example() {
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

        public Criteria andKaoQuIsNull() {
            addCriterion("kao_qu is null");
            return (Criteria) this;
        }

        public Criteria andKaoQuIsNotNull() {
            addCriterion("kao_qu is not null");
            return (Criteria) this;
        }

        public Criteria andKaoQuEqualTo(String value) {
            addCriterion("kao_qu =", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotEqualTo(String value) {
            addCriterion("kao_qu <>", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuGreaterThan(String value) {
            addCriterion("kao_qu >", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuGreaterThanOrEqualTo(String value) {
            addCriterion("kao_qu >=", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuLessThan(String value) {
            addCriterion("kao_qu <", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuLessThanOrEqualTo(String value) {
            addCriterion("kao_qu <=", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuLike(String value) {
            addCriterion("kao_qu like", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotLike(String value) {
            addCriterion("kao_qu not like", value, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuIn(List<String> values) {
            addCriterion("kao_qu in", values, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotIn(List<String> values) {
            addCriterion("kao_qu not in", values, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuBetween(String value1, String value2) {
            addCriterion("kao_qu between", value1, value2, "kaoQu");
            return (Criteria) this;
        }

        public Criteria andKaoQuNotBetween(String value1, String value2) {
            addCriterion("kao_qu not between", value1, value2, "kaoQu");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andKaoShengLeiBieIsNull() {
            addCriterion("kao_sheng_lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieIsNotNull() {
            addCriterion("kao_sheng_lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieEqualTo(String value) {
            addCriterion("kao_sheng_lei_bie =", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieNotEqualTo(String value) {
            addCriterion("kao_sheng_lei_bie <>", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieGreaterThan(String value) {
            addCriterion("kao_sheng_lei_bie >", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("kao_sheng_lei_bie >=", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieLessThan(String value) {
            addCriterion("kao_sheng_lei_bie <", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieLessThanOrEqualTo(String value) {
            addCriterion("kao_sheng_lei_bie <=", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieLike(String value) {
            addCriterion("kao_sheng_lei_bie like", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieNotLike(String value) {
            addCriterion("kao_sheng_lei_bie not like", value, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieIn(List<String> values) {
            addCriterion("kao_sheng_lei_bie in", values, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieNotIn(List<String> values) {
            addCriterion("kao_sheng_lei_bie not in", values, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieBetween(String value1, String value2) {
            addCriterion("kao_sheng_lei_bie between", value1, value2, "kaoShengLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaoShengLeiBieNotBetween(String value1, String value2) {
            addCriterion("kao_sheng_lei_bie not between", value1, value2, "kaoShengLeiBie");
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

        public Criteria andJingLiIsNull() {
            addCriterion("jing_li is null");
            return (Criteria) this;
        }

        public Criteria andJingLiIsNotNull() {
            addCriterion("jing_li is not null");
            return (Criteria) this;
        }

        public Criteria andJingLiEqualTo(String value) {
            addCriterion("jing_li =", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiNotEqualTo(String value) {
            addCriterion("jing_li <>", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiGreaterThan(String value) {
            addCriterion("jing_li >", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiGreaterThanOrEqualTo(String value) {
            addCriterion("jing_li >=", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiLessThan(String value) {
            addCriterion("jing_li <", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiLessThanOrEqualTo(String value) {
            addCriterion("jing_li <=", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiLike(String value) {
            addCriterion("jing_li like", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiNotLike(String value) {
            addCriterion("jing_li not like", value, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiIn(List<String> values) {
            addCriterion("jing_li in", values, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiNotIn(List<String> values) {
            addCriterion("jing_li not in", values, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiBetween(String value1, String value2) {
            addCriterion("jing_li between", value1, value2, "jingLi");
            return (Criteria) this;
        }

        public Criteria andJingLiNotBetween(String value1, String value2) {
            addCriterion("jing_li not between", value1, value2, "jingLi");
            return (Criteria) this;
        }

        public Criteria andZhunRuIsNull() {
            addCriterion("zhun_ru is null");
            return (Criteria) this;
        }

        public Criteria andZhunRuIsNotNull() {
            addCriterion("zhun_ru is not null");
            return (Criteria) this;
        }

        public Criteria andZhunRuEqualTo(String value) {
            addCriterion("zhun_ru =", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuNotEqualTo(String value) {
            addCriterion("zhun_ru <>", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuGreaterThan(String value) {
            addCriterion("zhun_ru >", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuGreaterThanOrEqualTo(String value) {
            addCriterion("zhun_ru >=", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuLessThan(String value) {
            addCriterion("zhun_ru <", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuLessThanOrEqualTo(String value) {
            addCriterion("zhun_ru <=", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuLike(String value) {
            addCriterion("zhun_ru like", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuNotLike(String value) {
            addCriterion("zhun_ru not like", value, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuIn(List<String> values) {
            addCriterion("zhun_ru in", values, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuNotIn(List<String> values) {
            addCriterion("zhun_ru not in", values, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuBetween(String value1, String value2) {
            addCriterion("zhun_ru between", value1, value2, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhunRuNotBetween(String value1, String value2) {
            addCriterion("zhun_ru not between", value1, value2, "zhunRu");
            return (Criteria) this;
        }

        public Criteria andZhengShuIsNull() {
            addCriterion("zheng_shu is null");
            return (Criteria) this;
        }

        public Criteria andZhengShuIsNotNull() {
            addCriterion("zheng_shu is not null");
            return (Criteria) this;
        }

        public Criteria andZhengShuEqualTo(String value) {
            addCriterion("zheng_shu =", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuNotEqualTo(String value) {
            addCriterion("zheng_shu <>", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuGreaterThan(String value) {
            addCriterion("zheng_shu >", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuGreaterThanOrEqualTo(String value) {
            addCriterion("zheng_shu >=", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuLessThan(String value) {
            addCriterion("zheng_shu <", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuLessThanOrEqualTo(String value) {
            addCriterion("zheng_shu <=", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuLike(String value) {
            addCriterion("zheng_shu like", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuNotLike(String value) {
            addCriterion("zheng_shu not like", value, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuIn(List<String> values) {
            addCriterion("zheng_shu in", values, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuNotIn(List<String> values) {
            addCriterion("zheng_shu not in", values, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuBetween(String value1, String value2) {
            addCriterion("zheng_shu between", value1, value2, "zhengShu");
            return (Criteria) this;
        }

        public Criteria andZhengShuNotBetween(String value1, String value2) {
            addCriterion("zheng_shu not between", value1, value2, "zhengShu");
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