package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class Gd2020Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Gd2020Example() {
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

        public Criteria andIndexIdIsNull() {
            addCriterion("index_id is null");
            return (Criteria) this;
        }

        public Criteria andIndexIdIsNotNull() {
            addCriterion("index_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndexIdEqualTo(Integer value) {
            addCriterion("index_id =", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotEqualTo(Integer value) {
            addCriterion("index_id <>", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThan(Integer value) {
            addCriterion("index_id >", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_id >=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThan(Integer value) {
            addCriterion("index_id <", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThanOrEqualTo(Integer value) {
            addCriterion("index_id <=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdIn(List<Integer> values) {
            addCriterion("index_id in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotIn(List<Integer> values) {
            addCriterion("index_id not in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdBetween(Integer value1, Integer value2) {
            addCriterion("index_id between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotBetween(Integer value1, Integer value2) {
            addCriterion("index_id not between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiIsNull() {
            addCriterion("zhao_kao_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiIsNotNull() {
            addCriterion("zhao_kao_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiEqualTo(String value) {
            addCriterion("zhao_kao_dan_wei =", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiNotEqualTo(String value) {
            addCriterion("zhao_kao_dan_wei <>", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiGreaterThan(String value) {
            addCriterion("zhao_kao_dan_wei >", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_kao_dan_wei >=", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiLessThan(String value) {
            addCriterion("zhao_kao_dan_wei <", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiLessThanOrEqualTo(String value) {
            addCriterion("zhao_kao_dan_wei <=", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiLike(String value) {
            addCriterion("zhao_kao_dan_wei like", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiNotLike(String value) {
            addCriterion("zhao_kao_dan_wei not like", value, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiIn(List<String> values) {
            addCriterion("zhao_kao_dan_wei in", values, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiNotIn(List<String> values) {
            addCriterion("zhao_kao_dan_wei not in", values, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiBetween(String value1, String value2) {
            addCriterion("zhao_kao_dan_wei between", value1, value2, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoDanWeiNotBetween(String value1, String value2) {
            addCriterion("zhao_kao_dan_wei not between", value1, value2, "zhaoKaoDanWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaIsNull() {
            addCriterion("dan_wei_dai_ma is null");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaIsNotNull() {
            addCriterion("dan_wei_dai_ma is not null");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaEqualTo(String value) {
            addCriterion("dan_wei_dai_ma =", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaNotEqualTo(String value) {
            addCriterion("dan_wei_dai_ma <>", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaGreaterThan(String value) {
            addCriterion("dan_wei_dai_ma >", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaGreaterThanOrEqualTo(String value) {
            addCriterion("dan_wei_dai_ma >=", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaLessThan(String value) {
            addCriterion("dan_wei_dai_ma <", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaLessThanOrEqualTo(String value) {
            addCriterion("dan_wei_dai_ma <=", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaLike(String value) {
            addCriterion("dan_wei_dai_ma like", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaNotLike(String value) {
            addCriterion("dan_wei_dai_ma not like", value, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaIn(List<String> values) {
            addCriterion("dan_wei_dai_ma in", values, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaNotIn(List<String> values) {
            addCriterion("dan_wei_dai_ma not in", values, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaBetween(String value1, String value2) {
            addCriterion("dan_wei_dai_ma between", value1, value2, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andDanWeiDaiMaNotBetween(String value1, String value2) {
            addCriterion("dan_wei_dai_ma not between", value1, value2, "danWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiIsNull() {
            addCriterion("zhao_kao_zhi_wei is null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiIsNotNull() {
            addCriterion("zhao_kao_zhi_wei is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiEqualTo(String value) {
            addCriterion("zhao_kao_zhi_wei =", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiNotEqualTo(String value) {
            addCriterion("zhao_kao_zhi_wei <>", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiGreaterThan(String value) {
            addCriterion("zhao_kao_zhi_wei >", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_kao_zhi_wei >=", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiLessThan(String value) {
            addCriterion("zhao_kao_zhi_wei <", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiLessThanOrEqualTo(String value) {
            addCriterion("zhao_kao_zhi_wei <=", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiLike(String value) {
            addCriterion("zhao_kao_zhi_wei like", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiNotLike(String value) {
            addCriterion("zhao_kao_zhi_wei not like", value, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiIn(List<String> values) {
            addCriterion("zhao_kao_zhi_wei in", values, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiNotIn(List<String> values) {
            addCriterion("zhao_kao_zhi_wei not in", values, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiBetween(String value1, String value2) {
            addCriterion("zhao_kao_zhi_wei between", value1, value2, "zhaoKaoZhiWei");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoZhiWeiNotBetween(String value1, String value2) {
            addCriterion("zhao_kao_zhi_wei not between", value1, value2, "zhaoKaoZhiWei");
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

        public Criteria andZhiWeiJianJieIsNull() {
            addCriterion("zhi_wei_jian_jie is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieIsNotNull() {
            addCriterion("zhi_wei_jian_jie is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie =", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie <>", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieGreaterThan(String value) {
            addCriterion("zhi_wei_jian_jie >", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie >=", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieLessThan(String value) {
            addCriterion("zhi_wei_jian_jie <", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_jian_jie <=", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieLike(String value) {
            addCriterion("zhi_wei_jian_jie like", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotLike(String value) {
            addCriterion("zhi_wei_jian_jie not like", value, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieIn(List<String> values) {
            addCriterion("zhi_wei_jian_jie in", values, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotIn(List<String> values) {
            addCriterion("zhi_wei_jian_jie not in", values, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieBetween(String value1, String value2) {
            addCriterion("zhi_wei_jian_jie between", value1, value2, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiJianJieNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_jian_jie not between", value1, value2, "zhiWeiJianJie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingIsNull() {
            addCriterion("zhi_wei_lei_xing is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingIsNotNull() {
            addCriterion("zhi_wei_lei_xing is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingEqualTo(String value) {
            addCriterion("zhi_wei_lei_xing =", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingNotEqualTo(String value) {
            addCriterion("zhi_wei_lei_xing <>", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingGreaterThan(String value) {
            addCriterion("zhi_wei_lei_xing >", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_lei_xing >=", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingLessThan(String value) {
            addCriterion("zhi_wei_lei_xing <", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_lei_xing <=", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingLike(String value) {
            addCriterion("zhi_wei_lei_xing like", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingNotLike(String value) {
            addCriterion("zhi_wei_lei_xing not like", value, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingIn(List<String> values) {
            addCriterion("zhi_wei_lei_xing in", values, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingNotIn(List<String> values) {
            addCriterion("zhi_wei_lei_xing not in", values, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingBetween(String value1, String value2) {
            addCriterion("zhi_wei_lei_xing between", value1, value2, "zhiWeiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiXingNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_lei_xing not between", value1, value2, "zhiWeiLeiXing");
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

        public Criteria andJiCengJingYanIsNull() {
            addCriterion("ji_ceng_jing_yan is null");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanIsNotNull() {
            addCriterion("ji_ceng_jing_yan is not null");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan =", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan <>", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanGreaterThan(String value) {
            addCriterion("ji_ceng_jing_yan >", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanGreaterThanOrEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan >=", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanLessThan(String value) {
            addCriterion("ji_ceng_jing_yan <", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanLessThanOrEqualTo(String value) {
            addCriterion("ji_ceng_jing_yan <=", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanLike(String value) {
            addCriterion("ji_ceng_jing_yan like", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotLike(String value) {
            addCriterion("ji_ceng_jing_yan not like", value, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanIn(List<String> values) {
            addCriterion("ji_ceng_jing_yan in", values, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotIn(List<String> values) {
            addCriterion("ji_ceng_jing_yan not in", values, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanBetween(String value1, String value2) {
            addCriterion("ji_ceng_jing_yan between", value1, value2, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andJiCengJingYanNotBetween(String value1, String value2) {
            addCriterion("ji_ceng_jing_yan not between", value1, value2, "jiCengJingYan");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiIsNull() {
            addCriterion("zhuan_ye_ce_shi is null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiIsNotNull() {
            addCriterion("zhuan_ye_ce_shi is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi =", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi <>", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiGreaterThan(String value) {
            addCriterion("zhuan_ye_ce_shi >", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi >=", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiLessThan(String value) {
            addCriterion("zhuan_ye_ce_shi <", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiLessThanOrEqualTo(String value) {
            addCriterion("zhuan_ye_ce_shi <=", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiLike(String value) {
            addCriterion("zhuan_ye_ce_shi like", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotLike(String value) {
            addCriterion("zhuan_ye_ce_shi not like", value, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiIn(List<String> values) {
            addCriterion("zhuan_ye_ce_shi in", values, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotIn(List<String> values) {
            addCriterion("zhuan_ye_ce_shi not in", values, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiBetween(String value1, String value2) {
            addCriterion("zhuan_ye_ce_shi between", value1, value2, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andZhuanYeCeShiNotBetween(String value1, String value2) {
            addCriterion("zhuan_ye_ce_shi not between", value1, value2, "zhuanYeCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiIsNull() {
            addCriterion("xin_li_ce_shi is null");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiIsNotNull() {
            addCriterion("xin_li_ce_shi is not null");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiEqualTo(String value) {
            addCriterion("xin_li_ce_shi =", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiNotEqualTo(String value) {
            addCriterion("xin_li_ce_shi <>", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiGreaterThan(String value) {
            addCriterion("xin_li_ce_shi >", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiGreaterThanOrEqualTo(String value) {
            addCriterion("xin_li_ce_shi >=", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiLessThan(String value) {
            addCriterion("xin_li_ce_shi <", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiLessThanOrEqualTo(String value) {
            addCriterion("xin_li_ce_shi <=", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiLike(String value) {
            addCriterion("xin_li_ce_shi like", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiNotLike(String value) {
            addCriterion("xin_li_ce_shi not like", value, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiIn(List<String> values) {
            addCriterion("xin_li_ce_shi in", values, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiNotIn(List<String> values) {
            addCriterion("xin_li_ce_shi not in", values, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiBetween(String value1, String value2) {
            addCriterion("xin_li_ce_shi between", value1, value2, "xinLiCeShi");
            return (Criteria) this;
        }

        public Criteria andXinLiCeShiNotBetween(String value1, String value2) {
            addCriterion("xin_li_ce_shi not between", value1, value2, "xinLiCeShi");
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

        public Criteria andHasNumsIsNull() {
            addCriterion("has_nums is null");
            return (Criteria) this;
        }

        public Criteria andHasNumsIsNotNull() {
            addCriterion("has_nums is not null");
            return (Criteria) this;
        }

        public Criteria andHasNumsEqualTo(Integer value) {
            addCriterion("has_nums =", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsNotEqualTo(Integer value) {
            addCriterion("has_nums <>", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsGreaterThan(Integer value) {
            addCriterion("has_nums >", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_nums >=", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsLessThan(Integer value) {
            addCriterion("has_nums <", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsLessThanOrEqualTo(Integer value) {
            addCriterion("has_nums <=", value, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsIn(List<Integer> values) {
            addCriterion("has_nums in", values, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsNotIn(List<Integer> values) {
            addCriterion("has_nums not in", values, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsBetween(Integer value1, Integer value2) {
            addCriterion("has_nums between", value1, value2, "hasNums");
            return (Criteria) this;
        }

        public Criteria andHasNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("has_nums not between", value1, value2, "hasNums");
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