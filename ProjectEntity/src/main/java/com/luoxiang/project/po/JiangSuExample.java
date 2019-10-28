package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class JiangSuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiangSuExample() {
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

        public Criteria andLiShuGuanXiIsNull() {
            addCriterion("li_shu_guan_xi is null");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiIsNotNull() {
            addCriterion("li_shu_guan_xi is not null");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiEqualTo(String value) {
            addCriterion("li_shu_guan_xi =", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiNotEqualTo(String value) {
            addCriterion("li_shu_guan_xi <>", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiGreaterThan(String value) {
            addCriterion("li_shu_guan_xi >", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiGreaterThanOrEqualTo(String value) {
            addCriterion("li_shu_guan_xi >=", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiLessThan(String value) {
            addCriterion("li_shu_guan_xi <", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiLessThanOrEqualTo(String value) {
            addCriterion("li_shu_guan_xi <=", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiLike(String value) {
            addCriterion("li_shu_guan_xi like", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiNotLike(String value) {
            addCriterion("li_shu_guan_xi not like", value, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiIn(List<String> values) {
            addCriterion("li_shu_guan_xi in", values, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiNotIn(List<String> values) {
            addCriterion("li_shu_guan_xi not in", values, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiBetween(String value1, String value2) {
            addCriterion("li_shu_guan_xi between", value1, value2, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andLiShuGuanXiNotBetween(String value1, String value2) {
            addCriterion("li_shu_guan_xi not between", value1, value2, "liShuGuanXi");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaIsNull() {
            addCriterion("di_qu_dai_ma is null");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaIsNotNull() {
            addCriterion("di_qu_dai_ma is not null");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaEqualTo(String value) {
            addCriterion("di_qu_dai_ma =", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaNotEqualTo(String value) {
            addCriterion("di_qu_dai_ma <>", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaGreaterThan(String value) {
            addCriterion("di_qu_dai_ma >", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaGreaterThanOrEqualTo(String value) {
            addCriterion("di_qu_dai_ma >=", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaLessThan(String value) {
            addCriterion("di_qu_dai_ma <", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaLessThanOrEqualTo(String value) {
            addCriterion("di_qu_dai_ma <=", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaLike(String value) {
            addCriterion("di_qu_dai_ma like", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaNotLike(String value) {
            addCriterion("di_qu_dai_ma not like", value, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaIn(List<String> values) {
            addCriterion("di_qu_dai_ma in", values, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaNotIn(List<String> values) {
            addCriterion("di_qu_dai_ma not in", values, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaBetween(String value1, String value2) {
            addCriterion("di_qu_dai_ma between", value1, value2, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuDaiMaNotBetween(String value1, String value2) {
            addCriterion("di_qu_dai_ma not between", value1, value2, "diQuDaiMa");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengIsNull() {
            addCriterion("di_qu_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengIsNotNull() {
            addCriterion("di_qu_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengEqualTo(String value) {
            addCriterion("di_qu_ming_cheng =", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengNotEqualTo(String value) {
            addCriterion("di_qu_ming_cheng <>", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengGreaterThan(String value) {
            addCriterion("di_qu_ming_cheng >", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("di_qu_ming_cheng >=", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengLessThan(String value) {
            addCriterion("di_qu_ming_cheng <", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengLessThanOrEqualTo(String value) {
            addCriterion("di_qu_ming_cheng <=", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengLike(String value) {
            addCriterion("di_qu_ming_cheng like", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengNotLike(String value) {
            addCriterion("di_qu_ming_cheng not like", value, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengIn(List<String> values) {
            addCriterion("di_qu_ming_cheng in", values, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengNotIn(List<String> values) {
            addCriterion("di_qu_ming_cheng not in", values, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengBetween(String value1, String value2) {
            addCriterion("di_qu_ming_cheng between", value1, value2, "diQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andDiQuMingChengNotBetween(String value1, String value2) {
            addCriterion("di_qu_ming_cheng not between", value1, value2, "diQuMingCheng");
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

        public Criteria andDanWeiMingChengIsNull() {
            addCriterion("dan_wei_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengIsNotNull() {
            addCriterion("dan_wei_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengEqualTo(String value) {
            addCriterion("dan_wei_ming_cheng =", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengNotEqualTo(String value) {
            addCriterion("dan_wei_ming_cheng <>", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengGreaterThan(String value) {
            addCriterion("dan_wei_ming_cheng >", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("dan_wei_ming_cheng >=", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengLessThan(String value) {
            addCriterion("dan_wei_ming_cheng <", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengLessThanOrEqualTo(String value) {
            addCriterion("dan_wei_ming_cheng <=", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengLike(String value) {
            addCriterion("dan_wei_ming_cheng like", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengNotLike(String value) {
            addCriterion("dan_wei_ming_cheng not like", value, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengIn(List<String> values) {
            addCriterion("dan_wei_ming_cheng in", values, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengNotIn(List<String> values) {
            addCriterion("dan_wei_ming_cheng not in", values, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengBetween(String value1, String value2) {
            addCriterion("dan_wei_ming_cheng between", value1, value2, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andDanWeiMingChengNotBetween(String value1, String value2) {
            addCriterion("dan_wei_ming_cheng not between", value1, value2, "danWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaIsNull() {
            addCriterion("zhi_wei_dai_ma is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaIsNotNull() {
            addCriterion("zhi_wei_dai_ma is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma =", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma <>", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaGreaterThan(String value) {
            addCriterion("zhi_wei_dai_ma >", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma >=", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaLessThan(String value) {
            addCriterion("zhi_wei_dai_ma <", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_dai_ma <=", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaLike(String value) {
            addCriterion("zhi_wei_dai_ma like", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotLike(String value) {
            addCriterion("zhi_wei_dai_ma not like", value, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaIn(List<String> values) {
            addCriterion("zhi_wei_dai_ma in", values, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotIn(List<String> values) {
            addCriterion("zhi_wei_dai_ma not in", values, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaBetween(String value1, String value2) {
            addCriterion("zhi_wei_dai_ma between", value1, value2, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaiMaNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_dai_ma not between", value1, value2, "zhiWeiDaiMa");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengIsNull() {
            addCriterion("zhi_wei_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengIsNotNull() {
            addCriterion("zhi_wei_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng =", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng <>", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengGreaterThan(String value) {
            addCriterion("zhi_wei_ming_cheng >", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng >=", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengLessThan(String value) {
            addCriterion("zhi_wei_ming_cheng <", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_ming_cheng <=", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengLike(String value) {
            addCriterion("zhi_wei_ming_cheng like", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotLike(String value) {
            addCriterion("zhi_wei_ming_cheng not like", value, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengIn(List<String> values) {
            addCriterion("zhi_wei_ming_cheng in", values, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotIn(List<String> values) {
            addCriterion("zhi_wei_ming_cheng not in", values, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengBetween(String value1, String value2) {
            addCriterion("zhi_wei_ming_cheng between", value1, value2, "zhiWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWeiMingChengNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_ming_cheng not between", value1, value2, "zhiWeiMingCheng");
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

        public Criteria andZhiWeiLeiBieIsNull() {
            addCriterion("zhi_wei_lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieIsNotNull() {
            addCriterion("zhi_wei_lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieEqualTo(String value) {
            addCriterion("zhi_wei_lei_bie =", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieNotEqualTo(String value) {
            addCriterion("zhi_wei_lei_bie <>", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieGreaterThan(String value) {
            addCriterion("zhi_wei_lei_bie >", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_lei_bie >=", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieLessThan(String value) {
            addCriterion("zhi_wei_lei_bie <", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_lei_bie <=", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieLike(String value) {
            addCriterion("zhi_wei_lei_bie like", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieNotLike(String value) {
            addCriterion("zhi_wei_lei_bie not like", value, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieIn(List<String> values) {
            addCriterion("zhi_wei_lei_bie in", values, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieNotIn(List<String> values) {
            addCriterion("zhi_wei_lei_bie not in", values, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieBetween(String value1, String value2) {
            addCriterion("zhi_wei_lei_bie between", value1, value2, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andZhiWeiLeiBieNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_lei_bie not between", value1, value2, "zhiWeiLeiBie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieIsNull() {
            addCriterion("kai_kao_bi_lie is null");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieIsNotNull() {
            addCriterion("kai_kao_bi_lie is not null");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieEqualTo(String value) {
            addCriterion("kai_kao_bi_lie =", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieNotEqualTo(String value) {
            addCriterion("kai_kao_bi_lie <>", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieGreaterThan(String value) {
            addCriterion("kai_kao_bi_lie >", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieGreaterThanOrEqualTo(String value) {
            addCriterion("kai_kao_bi_lie >=", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieLessThan(String value) {
            addCriterion("kai_kao_bi_lie <", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieLessThanOrEqualTo(String value) {
            addCriterion("kai_kao_bi_lie <=", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieLike(String value) {
            addCriterion("kai_kao_bi_lie like", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieNotLike(String value) {
            addCriterion("kai_kao_bi_lie not like", value, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieIn(List<String> values) {
            addCriterion("kai_kao_bi_lie in", values, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieNotIn(List<String> values) {
            addCriterion("kai_kao_bi_lie not in", values, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieBetween(String value1, String value2) {
            addCriterion("kai_kao_bi_lie between", value1, value2, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andKaiKaoBiLieNotBetween(String value1, String value2) {
            addCriterion("kai_kao_bi_lie not between", value1, value2, "kaiKaoBiLie");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuIsNull() {
            addCriterion("zhao_kao_ren_shu is null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuIsNotNull() {
            addCriterion("zhao_kao_ren_shu is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuEqualTo(String value) {
            addCriterion("zhao_kao_ren_shu =", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuNotEqualTo(String value) {
            addCriterion("zhao_kao_ren_shu <>", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuGreaterThan(String value) {
            addCriterion("zhao_kao_ren_shu >", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_kao_ren_shu >=", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuLessThan(String value) {
            addCriterion("zhao_kao_ren_shu <", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuLessThanOrEqualTo(String value) {
            addCriterion("zhao_kao_ren_shu <=", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuLike(String value) {
            addCriterion("zhao_kao_ren_shu like", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuNotLike(String value) {
            addCriterion("zhao_kao_ren_shu not like", value, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuIn(List<String> values) {
            addCriterion("zhao_kao_ren_shu in", values, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuNotIn(List<String> values) {
            addCriterion("zhao_kao_ren_shu not in", values, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuBetween(String value1, String value2) {
            addCriterion("zhao_kao_ren_shu between", value1, value2, "zhaoKaoRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoKaoRenShuNotBetween(String value1, String value2) {
            addCriterion("zhao_kao_ren_shu not between", value1, value2, "zhaoKaoRenShu");
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