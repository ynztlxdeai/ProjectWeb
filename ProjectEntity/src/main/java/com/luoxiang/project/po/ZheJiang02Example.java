package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class ZheJiang02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZheJiang02Example() {
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

        public Criteria andZhaoLuDanWeiIsNull() {
            addCriterion("zhao_lu_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiIsNotNull() {
            addCriterion("zhao_lu_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiEqualTo(String value) {
            addCriterion("zhao_lu_dan_wei =", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiNotEqualTo(String value) {
            addCriterion("zhao_lu_dan_wei <>", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiGreaterThan(String value) {
            addCriterion("zhao_lu_dan_wei >", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhao_lu_dan_wei >=", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiLessThan(String value) {
            addCriterion("zhao_lu_dan_wei <", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiLessThanOrEqualTo(String value) {
            addCriterion("zhao_lu_dan_wei <=", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiLike(String value) {
            addCriterion("zhao_lu_dan_wei like", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiNotLike(String value) {
            addCriterion("zhao_lu_dan_wei not like", value, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiIn(List<String> values) {
            addCriterion("zhao_lu_dan_wei in", values, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiNotIn(List<String> values) {
            addCriterion("zhao_lu_dan_wei not in", values, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiBetween(String value1, String value2) {
            addCriterion("zhao_lu_dan_wei between", value1, value2, "zhaoLuDanWei");
            return (Criteria) this;
        }

        public Criteria andZhaoLuDanWeiNotBetween(String value1, String value2) {
            addCriterion("zhao_lu_dan_wei not between", value1, value2, "zhaoLuDanWei");
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

        public Criteria andZhiWeiDaLeiIsNull() {
            addCriterion("zhi_wei_da_lei is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiIsNotNull() {
            addCriterion("zhi_wei_da_lei is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiEqualTo(String value) {
            addCriterion("zhi_wei_da_lei =", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiNotEqualTo(String value) {
            addCriterion("zhi_wei_da_lei <>", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiGreaterThan(String value) {
            addCriterion("zhi_wei_da_lei >", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_da_lei >=", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiLessThan(String value) {
            addCriterion("zhi_wei_da_lei <", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_da_lei <=", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiLike(String value) {
            addCriterion("zhi_wei_da_lei like", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiNotLike(String value) {
            addCriterion("zhi_wei_da_lei not like", value, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiIn(List<String> values) {
            addCriterion("zhi_wei_da_lei in", values, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiNotIn(List<String> values) {
            addCriterion("zhi_wei_da_lei not in", values, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiBetween(String value1, String value2) {
            addCriterion("zhi_wei_da_lei between", value1, value2, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiDaLeiNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_da_lei not between", value1, value2, "zhiWeiDaLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiIsNull() {
            addCriterion("zhi_wei_xiao_lei is null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiIsNotNull() {
            addCriterion("zhi_wei_xiao_lei is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiEqualTo(String value) {
            addCriterion("zhi_wei_xiao_lei =", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiNotEqualTo(String value) {
            addCriterion("zhi_wei_xiao_lei <>", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiGreaterThan(String value) {
            addCriterion("zhi_wei_xiao_lei >", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wei_xiao_lei >=", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiLessThan(String value) {
            addCriterion("zhi_wei_xiao_lei <", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiLessThanOrEqualTo(String value) {
            addCriterion("zhi_wei_xiao_lei <=", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiLike(String value) {
            addCriterion("zhi_wei_xiao_lei like", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiNotLike(String value) {
            addCriterion("zhi_wei_xiao_lei not like", value, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiIn(List<String> values) {
            addCriterion("zhi_wei_xiao_lei in", values, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiNotIn(List<String> values) {
            addCriterion("zhi_wei_xiao_lei not in", values, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiBetween(String value1, String value2) {
            addCriterion("zhi_wei_xiao_lei between", value1, value2, "zhiWeiXiaoLei");
            return (Criteria) this;
        }

        public Criteria andZhiWeiXiaoLeiNotBetween(String value1, String value2) {
            addCriterion("zhi_wei_xiao_lei not between", value1, value2, "zhiWeiXiaoLei");
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

        public Criteria andZiXunDianHuaIsNull() {
            addCriterion("zi_xun_dian_hua is null");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaIsNotNull() {
            addCriterion("zi_xun_dian_hua is not null");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaEqualTo(String value) {
            addCriterion("zi_xun_dian_hua =", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaNotEqualTo(String value) {
            addCriterion("zi_xun_dian_hua <>", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaGreaterThan(String value) {
            addCriterion("zi_xun_dian_hua >", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaGreaterThanOrEqualTo(String value) {
            addCriterion("zi_xun_dian_hua >=", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaLessThan(String value) {
            addCriterion("zi_xun_dian_hua <", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaLessThanOrEqualTo(String value) {
            addCriterion("zi_xun_dian_hua <=", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaLike(String value) {
            addCriterion("zi_xun_dian_hua like", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaNotLike(String value) {
            addCriterion("zi_xun_dian_hua not like", value, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaIn(List<String> values) {
            addCriterion("zi_xun_dian_hua in", values, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaNotIn(List<String> values) {
            addCriterion("zi_xun_dian_hua not in", values, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaBetween(String value1, String value2) {
            addCriterion("zi_xun_dian_hua between", value1, value2, "ziXunDianHua");
            return (Criteria) this;
        }

        public Criteria andZiXunDianHuaNotBetween(String value1, String value2) {
            addCriterion("zi_xun_dian_hua not between", value1, value2, "ziXunDianHua");
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

        public Criteria andXingBieIsNull() {
            addCriterion("xing_bie is null");
            return (Criteria) this;
        }

        public Criteria andXingBieIsNotNull() {
            addCriterion("xing_bie is not null");
            return (Criteria) this;
        }

        public Criteria andXingBieEqualTo(String value) {
            addCriterion("xing_bie =", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotEqualTo(String value) {
            addCriterion("xing_bie <>", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieGreaterThan(String value) {
            addCriterion("xing_bie >", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieGreaterThanOrEqualTo(String value) {
            addCriterion("xing_bie >=", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLessThan(String value) {
            addCriterion("xing_bie <", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLessThanOrEqualTo(String value) {
            addCriterion("xing_bie <=", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLike(String value) {
            addCriterion("xing_bie like", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotLike(String value) {
            addCriterion("xing_bie not like", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieIn(List<String> values) {
            addCriterion("xing_bie in", values, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotIn(List<String> values) {
            addCriterion("xing_bie not in", values, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieBetween(String value1, String value2) {
            addCriterion("xing_bie between", value1, value2, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotBetween(String value1, String value2) {
            addCriterion("xing_bie not between", value1, value2, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenIsNull() {
            addCriterion("xian_you_shen_fen is null");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenIsNotNull() {
            addCriterion("xian_you_shen_fen is not null");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenEqualTo(String value) {
            addCriterion("xian_you_shen_fen =", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenNotEqualTo(String value) {
            addCriterion("xian_you_shen_fen <>", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenGreaterThan(String value) {
            addCriterion("xian_you_shen_fen >", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenGreaterThanOrEqualTo(String value) {
            addCriterion("xian_you_shen_fen >=", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenLessThan(String value) {
            addCriterion("xian_you_shen_fen <", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenLessThanOrEqualTo(String value) {
            addCriterion("xian_you_shen_fen <=", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenLike(String value) {
            addCriterion("xian_you_shen_fen like", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenNotLike(String value) {
            addCriterion("xian_you_shen_fen not like", value, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenIn(List<String> values) {
            addCriterion("xian_you_shen_fen in", values, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenNotIn(List<String> values) {
            addCriterion("xian_you_shen_fen not in", values, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenBetween(String value1, String value2) {
            addCriterion("xian_you_shen_fen between", value1, value2, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andXianYouShenFenNotBetween(String value1, String value2) {
            addCriterion("xian_you_shen_fen not between", value1, value2, "xianYouShenFen");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoIsNull() {
            addCriterion("zheng_zhi_mian_mao is null");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoIsNotNull() {
            addCriterion("zheng_zhi_mian_mao is not null");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao =", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao <>", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoGreaterThan(String value) {
            addCriterion("zheng_zhi_mian_mao >", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoGreaterThanOrEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao >=", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoLessThan(String value) {
            addCriterion("zheng_zhi_mian_mao <", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoLessThanOrEqualTo(String value) {
            addCriterion("zheng_zhi_mian_mao <=", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoLike(String value) {
            addCriterion("zheng_zhi_mian_mao like", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotLike(String value) {
            addCriterion("zheng_zhi_mian_mao not like", value, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoIn(List<String> values) {
            addCriterion("zheng_zhi_mian_mao in", values, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotIn(List<String> values) {
            addCriterion("zheng_zhi_mian_mao not in", values, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoBetween(String value1, String value2) {
            addCriterion("zheng_zhi_mian_mao between", value1, value2, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andZhengZhiMianMaoNotBetween(String value1, String value2) {
            addCriterion("zheng_zhi_mian_mao not between", value1, value2, "zhengZhiMianMao");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuIsNull() {
            addCriterion("ming_zu_yao_qiu is null");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuIsNotNull() {
            addCriterion("ming_zu_yao_qiu is not null");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuEqualTo(String value) {
            addCriterion("ming_zu_yao_qiu =", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuNotEqualTo(String value) {
            addCriterion("ming_zu_yao_qiu <>", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuGreaterThan(String value) {
            addCriterion("ming_zu_yao_qiu >", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuGreaterThanOrEqualTo(String value) {
            addCriterion("ming_zu_yao_qiu >=", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuLessThan(String value) {
            addCriterion("ming_zu_yao_qiu <", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuLessThanOrEqualTo(String value) {
            addCriterion("ming_zu_yao_qiu <=", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuLike(String value) {
            addCriterion("ming_zu_yao_qiu like", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuNotLike(String value) {
            addCriterion("ming_zu_yao_qiu not like", value, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuIn(List<String> values) {
            addCriterion("ming_zu_yao_qiu in", values, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuNotIn(List<String> values) {
            addCriterion("ming_zu_yao_qiu not in", values, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuBetween(String value1, String value2) {
            addCriterion("ming_zu_yao_qiu between", value1, value2, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andMingZuYaoQiuNotBetween(String value1, String value2) {
            addCriterion("ming_zu_yao_qiu not between", value1, value2, "mingZuYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuIsNull() {
            addCriterion("nian_ling_yao_qiu is null");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuIsNotNull() {
            addCriterion("nian_ling_yao_qiu is not null");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuEqualTo(String value) {
            addCriterion("nian_ling_yao_qiu =", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuNotEqualTo(String value) {
            addCriterion("nian_ling_yao_qiu <>", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuGreaterThan(String value) {
            addCriterion("nian_ling_yao_qiu >", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuGreaterThanOrEqualTo(String value) {
            addCriterion("nian_ling_yao_qiu >=", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuLessThan(String value) {
            addCriterion("nian_ling_yao_qiu <", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuLessThanOrEqualTo(String value) {
            addCriterion("nian_ling_yao_qiu <=", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuLike(String value) {
            addCriterion("nian_ling_yao_qiu like", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuNotLike(String value) {
            addCriterion("nian_ling_yao_qiu not like", value, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuIn(List<String> values) {
            addCriterion("nian_ling_yao_qiu in", values, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuNotIn(List<String> values) {
            addCriterion("nian_ling_yao_qiu not in", values, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuBetween(String value1, String value2) {
            addCriterion("nian_ling_yao_qiu between", value1, value2, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andNianLingYaoQiuNotBetween(String value1, String value2) {
            addCriterion("nian_ling_yao_qiu not between", value1, value2, "nianLingYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuIsNull() {
            addCriterion("hu_ji_yao_qiu is null");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuIsNotNull() {
            addCriterion("hu_ji_yao_qiu is not null");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuEqualTo(String value) {
            addCriterion("hu_ji_yao_qiu =", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuNotEqualTo(String value) {
            addCriterion("hu_ji_yao_qiu <>", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuGreaterThan(String value) {
            addCriterion("hu_ji_yao_qiu >", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuGreaterThanOrEqualTo(String value) {
            addCriterion("hu_ji_yao_qiu >=", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuLessThan(String value) {
            addCriterion("hu_ji_yao_qiu <", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuLessThanOrEqualTo(String value) {
            addCriterion("hu_ji_yao_qiu <=", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuLike(String value) {
            addCriterion("hu_ji_yao_qiu like", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuNotLike(String value) {
            addCriterion("hu_ji_yao_qiu not like", value, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuIn(List<String> values) {
            addCriterion("hu_ji_yao_qiu in", values, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuNotIn(List<String> values) {
            addCriterion("hu_ji_yao_qiu not in", values, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuBetween(String value1, String value2) {
            addCriterion("hu_ji_yao_qiu between", value1, value2, "huJiYaoQiu");
            return (Criteria) this;
        }

        public Criteria andHuJiYaoQiuNotBetween(String value1, String value2) {
            addCriterion("hu_ji_yao_qiu not between", value1, value2, "huJiYaoQiu");
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