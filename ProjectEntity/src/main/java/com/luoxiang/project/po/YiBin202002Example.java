package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class YiBin202002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YiBin202002Example() {
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

        public Criteria andIndexCodeIsNull() {
            addCriterion("index_code is null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIsNotNull() {
            addCriterion("index_code is not null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeEqualTo(Integer value) {
            addCriterion("index_code =", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotEqualTo(Integer value) {
            addCriterion("index_code <>", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThan(Integer value) {
            addCriterion("index_code >", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_code >=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThan(Integer value) {
            addCriterion("index_code <", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThanOrEqualTo(Integer value) {
            addCriterion("index_code <=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIn(List<Integer> values) {
            addCriterion("index_code in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotIn(List<Integer> values) {
            addCriterion("index_code not in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeBetween(Integer value1, Integer value2) {
            addCriterion("index_code between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("index_code not between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiIsNull() {
            addCriterion("zhao_ping_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiIsNotNull() {
            addCriterion("zhao_ping_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiEqualTo(String value) {
            addCriterion("zhao_ping_dan_wei =", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiNotEqualTo(String value) {
            addCriterion("zhao_ping_dan_wei <>", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiGreaterThan(String value) {
            addCriterion("zhao_ping_dan_wei >", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_ping_dan_wei >=", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiLessThan(String value) {
            addCriterion("zhao_ping_dan_wei <", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiLessThanOrEqualTo(String value) {
            addCriterion("zhao_ping_dan_wei <=", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiLike(String value) {
            addCriterion("zhao_ping_dan_wei like", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiNotLike(String value) {
            addCriterion("zhao_ping_dan_wei not like", value, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiIn(List<String> values) {
            addCriterion("zhao_ping_dan_wei in", values, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiNotIn(List<String> values) {
            addCriterion("zhao_ping_dan_wei not in", values, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiBetween(String value1, String value2) {
            addCriterion("zhao_ping_dan_wei between", value1, value2, "zhaoPingDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoPingDanWeiNotBetween(String value1, String value2) {
            addCriterion("zhao_ping_dan_wei not between", value1, value2, "zhaoPingDanWei");
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

        public Criteria andGangWeiLeiBieIsNull() {
            addCriterion("gang_wei_lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieIsNotNull() {
            addCriterion("gang_wei_lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieEqualTo(String value) {
            addCriterion("gang_wei_lei_bie =", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieNotEqualTo(String value) {
            addCriterion("gang_wei_lei_bie <>", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieGreaterThan(String value) {
            addCriterion("gang_wei_lei_bie >", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("gang_wei_lei_bie >=", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieLessThan(String value) {
            addCriterion("gang_wei_lei_bie <", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieLessThanOrEqualTo(String value) {
            addCriterion("gang_wei_lei_bie <=", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieLike(String value) {
            addCriterion("gang_wei_lei_bie like", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieNotLike(String value) {
            addCriterion("gang_wei_lei_bie not like", value, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieIn(List<String> values) {
            addCriterion("gang_wei_lei_bie in", values, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieNotIn(List<String> values) {
            addCriterion("gang_wei_lei_bie not in", values, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieBetween(String value1, String value2) {
            addCriterion("gang_wei_lei_bie between", value1, value2, "gangWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andGangWeiLeiBieNotBetween(String value1, String value2) {
            addCriterion("gang_wei_lei_bie not between", value1, value2, "gangWeiLeiBie");
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

        public Criteria andNianLingIsNull() {
            addCriterion("nian_ling is null");
            return (Criteria) this;
        }

        public Criteria andNianLingIsNotNull() {
            addCriterion("nian_ling is not null");
            return (Criteria) this;
        }

        public Criteria andNianLingEqualTo(String value) {
            addCriterion("nian_ling =", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingNotEqualTo(String value) {
            addCriterion("nian_ling <>", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingGreaterThan(String value) {
            addCriterion("nian_ling >", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingGreaterThanOrEqualTo(String value) {
            addCriterion("nian_ling >=", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingLessThan(String value) {
            addCriterion("nian_ling <", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingLessThanOrEqualTo(String value) {
            addCriterion("nian_ling <=", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingLike(String value) {
            addCriterion("nian_ling like", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingNotLike(String value) {
            addCriterion("nian_ling not like", value, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingIn(List<String> values) {
            addCriterion("nian_ling in", values, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingNotIn(List<String> values) {
            addCriterion("nian_ling not in", values, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingBetween(String value1, String value2) {
            addCriterion("nian_ling between", value1, value2, "nianLing");
            return (Criteria) this;
        }

        public Criteria andNianLingNotBetween(String value1, String value2) {
            addCriterion("nian_ling not between", value1, value2, "nianLing");
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

        public Criteria andXinLiSuZhiIsNull() {
            addCriterion("xin_li_su_zhi is null");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiIsNotNull() {
            addCriterion("xin_li_su_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiEqualTo(String value) {
            addCriterion("xin_li_su_zhi =", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiNotEqualTo(String value) {
            addCriterion("xin_li_su_zhi <>", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiGreaterThan(String value) {
            addCriterion("xin_li_su_zhi >", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiGreaterThanOrEqualTo(String value) {
            addCriterion("xin_li_su_zhi >=", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiLessThan(String value) {
            addCriterion("xin_li_su_zhi <", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiLessThanOrEqualTo(String value) {
            addCriterion("xin_li_su_zhi <=", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiLike(String value) {
            addCriterion("xin_li_su_zhi like", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiNotLike(String value) {
            addCriterion("xin_li_su_zhi not like", value, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiIn(List<String> values) {
            addCriterion("xin_li_su_zhi in", values, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiNotIn(List<String> values) {
            addCriterion("xin_li_su_zhi not in", values, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiBetween(String value1, String value2) {
            addCriterion("xin_li_su_zhi between", value1, value2, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andXinLiSuZhiNotBetween(String value1, String value2) {
            addCriterion("xin_li_su_zhi not between", value1, value2, "xinLiSuZhi");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuIsNull() {
            addCriterion("gong_gong_ke_mu is null");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuIsNotNull() {
            addCriterion("gong_gong_ke_mu is not null");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuEqualTo(String value) {
            addCriterion("gong_gong_ke_mu =", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuNotEqualTo(String value) {
            addCriterion("gong_gong_ke_mu <>", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuGreaterThan(String value) {
            addCriterion("gong_gong_ke_mu >", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuGreaterThanOrEqualTo(String value) {
            addCriterion("gong_gong_ke_mu >=", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuLessThan(String value) {
            addCriterion("gong_gong_ke_mu <", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuLessThanOrEqualTo(String value) {
            addCriterion("gong_gong_ke_mu <=", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuLike(String value) {
            addCriterion("gong_gong_ke_mu like", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuNotLike(String value) {
            addCriterion("gong_gong_ke_mu not like", value, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuIn(List<String> values) {
            addCriterion("gong_gong_ke_mu in", values, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuNotIn(List<String> values) {
            addCriterion("gong_gong_ke_mu not in", values, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuBetween(String value1, String value2) {
            addCriterion("gong_gong_ke_mu between", value1, value2, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andGongGongKeMuNotBetween(String value1, String value2) {
            addCriterion("gong_gong_ke_mu not between", value1, value2, "gongGongKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuIsNull() {
            addCriterion("zhuan_ye_ke_mu is null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuIsNotNull() {
            addCriterion("zhuan_ye_ke_mu is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuEqualTo(String value) {
            addCriterion("zhuan_ye_ke_mu =", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuNotEqualTo(String value) {
            addCriterion("zhuan_ye_ke_mu <>", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuGreaterThan(String value) {
            addCriterion("zhuan_ye_ke_mu >", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_ke_mu >=", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuLessThan(String value) {
            addCriterion("zhuan_ye_ke_mu <", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuLessThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_ke_mu <=", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuLike(String value) {
            addCriterion("zhuan_ye_ke_mu like", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuNotLike(String value) {
            addCriterion("zhuan_ye_ke_mu not like", value, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuIn(List<String> values) {
            addCriterion("zhuan_ye_ke_mu in", values, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuNotIn(List<String> values) {
            addCriterion("zhuan_ye_ke_mu not in", values, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuBetween(String value1, String value2) {
            addCriterion("zhuan_ye_ke_mu between", value1, value2, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andZhuanYeKeMuNotBetween(String value1, String value2) {
            addCriterion("zhuan_ye_ke_mu not between", value1, value2, "zhuanYeKeMu");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiIsNull() {
            addCriterion("mian_shi_xing_shi is null");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiIsNotNull() {
            addCriterion("mian_shi_xing_shi is not null");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiEqualTo(String value) {
            addCriterion("mian_shi_xing_shi =", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiNotEqualTo(String value) {
            addCriterion("mian_shi_xing_shi <>", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiGreaterThan(String value) {
            addCriterion("mian_shi_xing_shi >", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiGreaterThanOrEqualTo(String value) {
            addCriterion("mian_shi_xing_shi >=", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiLessThan(String value) {
            addCriterion("mian_shi_xing_shi <", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiLessThanOrEqualTo(String value) {
            addCriterion("mian_shi_xing_shi <=", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiLike(String value) {
            addCriterion("mian_shi_xing_shi like", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiNotLike(String value) {
            addCriterion("mian_shi_xing_shi not like", value, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiIn(List<String> values) {
            addCriterion("mian_shi_xing_shi in", values, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiNotIn(List<String> values) {
            addCriterion("mian_shi_xing_shi not in", values, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiBetween(String value1, String value2) {
            addCriterion("mian_shi_xing_shi between", value1, value2, "mianShiXingShi");
            return (Criteria) this;
        }

        public Criteria andMianShiXingShiNotBetween(String value1, String value2) {
            addCriterion("mian_shi_xing_shi not between", value1, value2, "mianShiXingShi");
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

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(String value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(String value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(String value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(String value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(String value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLike(String value) {
            addCriterion("current like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotLike(String value) {
            addCriterion("current not like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<String> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<String> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(String value1, String value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(String value1, String value2) {
            addCriterion("current not between", value1, value2, "current");
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