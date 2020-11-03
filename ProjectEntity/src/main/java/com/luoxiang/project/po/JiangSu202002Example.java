package com.luoxiang.project.po;

import java.util.ArrayList;
import java.util.List;

public class JiangSu202002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiangSu202002Example() {
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

        public Criteria andDiQuCodeIsNull() {
            addCriterion("di_qu_code is null");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeIsNotNull() {
            addCriterion("di_qu_code is not null");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeEqualTo(String value) {
            addCriterion("di_qu_code =", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeNotEqualTo(String value) {
            addCriterion("di_qu_code <>", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeGreaterThan(String value) {
            addCriterion("di_qu_code >", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("di_qu_code >=", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeLessThan(String value) {
            addCriterion("di_qu_code <", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeLessThanOrEqualTo(String value) {
            addCriterion("di_qu_code <=", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeLike(String value) {
            addCriterion("di_qu_code like", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeNotLike(String value) {
            addCriterion("di_qu_code not like", value, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeIn(List<String> values) {
            addCriterion("di_qu_code in", values, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeNotIn(List<String> values) {
            addCriterion("di_qu_code not in", values, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeBetween(String value1, String value2) {
            addCriterion("di_qu_code between", value1, value2, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuCodeNotBetween(String value1, String value2) {
            addCriterion("di_qu_code not between", value1, value2, "diQuCode");
            return (Criteria) this;
        }

        public Criteria andDiQuNameIsNull() {
            addCriterion("di_qu_name is null");
            return (Criteria) this;
        }

        public Criteria andDiQuNameIsNotNull() {
            addCriterion("di_qu_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiQuNameEqualTo(String value) {
            addCriterion("di_qu_name =", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameNotEqualTo(String value) {
            addCriterion("di_qu_name <>", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameGreaterThan(String value) {
            addCriterion("di_qu_name >", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameGreaterThanOrEqualTo(String value) {
            addCriterion("di_qu_name >=", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameLessThan(String value) {
            addCriterion("di_qu_name <", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameLessThanOrEqualTo(String value) {
            addCriterion("di_qu_name <=", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameLike(String value) {
            addCriterion("di_qu_name like", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameNotLike(String value) {
            addCriterion("di_qu_name not like", value, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameIn(List<String> values) {
            addCriterion("di_qu_name in", values, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameNotIn(List<String> values) {
            addCriterion("di_qu_name not in", values, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameBetween(String value1, String value2) {
            addCriterion("di_qu_name between", value1, value2, "diQuName");
            return (Criteria) this;
        }

        public Criteria andDiQuNameNotBetween(String value1, String value2) {
            addCriterion("di_qu_name not between", value1, value2, "diQuName");
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

        public Criteria andJobLeiBieIsNull() {
            addCriterion("job_lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieIsNotNull() {
            addCriterion("job_lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieEqualTo(String value) {
            addCriterion("job_lei_bie =", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotEqualTo(String value) {
            addCriterion("job_lei_bie <>", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieGreaterThan(String value) {
            addCriterion("job_lei_bie >", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("job_lei_bie >=", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieLessThan(String value) {
            addCriterion("job_lei_bie <", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieLessThanOrEqualTo(String value) {
            addCriterion("job_lei_bie <=", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieLike(String value) {
            addCriterion("job_lei_bie like", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotLike(String value) {
            addCriterion("job_lei_bie not like", value, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieIn(List<String> values) {
            addCriterion("job_lei_bie in", values, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotIn(List<String> values) {
            addCriterion("job_lei_bie not in", values, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieBetween(String value1, String value2) {
            addCriterion("job_lei_bie between", value1, value2, "jobLeiBie");
            return (Criteria) this;
        }

        public Criteria andJobLeiBieNotBetween(String value1, String value2) {
            addCriterion("job_lei_bie not between", value1, value2, "jobLeiBie");
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