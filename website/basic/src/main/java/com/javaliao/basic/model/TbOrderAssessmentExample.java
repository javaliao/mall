package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderAssessmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderAssessmentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(Long value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(Long value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(Long value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(Long value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(Long value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<Long> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<Long> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(Long value1, Long value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(Long value1, Long value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescIsNull() {
            addCriterion("assessment_desc is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescIsNotNull() {
            addCriterion("assessment_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescEqualTo(String value) {
            addCriterion("assessment_desc =", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescNotEqualTo(String value) {
            addCriterion("assessment_desc <>", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescGreaterThan(String value) {
            addCriterion("assessment_desc >", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescGreaterThanOrEqualTo(String value) {
            addCriterion("assessment_desc >=", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescLessThan(String value) {
            addCriterion("assessment_desc <", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescLessThanOrEqualTo(String value) {
            addCriterion("assessment_desc <=", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescLike(String value) {
            addCriterion("assessment_desc like", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescNotLike(String value) {
            addCriterion("assessment_desc not like", value, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescIn(List<String> values) {
            addCriterion("assessment_desc in", values, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescNotIn(List<String> values) {
            addCriterion("assessment_desc not in", values, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescBetween(String value1, String value2) {
            addCriterion("assessment_desc between", value1, value2, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentDescNotBetween(String value1, String value2) {
            addCriterion("assessment_desc not between", value1, value2, "assessmentDesc");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarIsNull() {
            addCriterion("assessment_star is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarIsNotNull() {
            addCriterion("assessment_star is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarEqualTo(String value) {
            addCriterion("assessment_star =", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarNotEqualTo(String value) {
            addCriterion("assessment_star <>", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarGreaterThan(String value) {
            addCriterion("assessment_star >", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarGreaterThanOrEqualTo(String value) {
            addCriterion("assessment_star >=", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarLessThan(String value) {
            addCriterion("assessment_star <", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarLessThanOrEqualTo(String value) {
            addCriterion("assessment_star <=", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarLike(String value) {
            addCriterion("assessment_star like", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarNotLike(String value) {
            addCriterion("assessment_star not like", value, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarIn(List<String> values) {
            addCriterion("assessment_star in", values, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarNotIn(List<String> values) {
            addCriterion("assessment_star not in", values, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarBetween(String value1, String value2) {
            addCriterion("assessment_star between", value1, value2, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStarNotBetween(String value1, String value2) {
            addCriterion("assessment_star not between", value1, value2, "assessmentStar");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1IsNull() {
            addCriterion("assessment_star1 is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1IsNotNull() {
            addCriterion("assessment_star1 is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1EqualTo(String value) {
            addCriterion("assessment_star1 =", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1NotEqualTo(String value) {
            addCriterion("assessment_star1 <>", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1GreaterThan(String value) {
            addCriterion("assessment_star1 >", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1GreaterThanOrEqualTo(String value) {
            addCriterion("assessment_star1 >=", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1LessThan(String value) {
            addCriterion("assessment_star1 <", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1LessThanOrEqualTo(String value) {
            addCriterion("assessment_star1 <=", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1Like(String value) {
            addCriterion("assessment_star1 like", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1NotLike(String value) {
            addCriterion("assessment_star1 not like", value, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1In(List<String> values) {
            addCriterion("assessment_star1 in", values, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1NotIn(List<String> values) {
            addCriterion("assessment_star1 not in", values, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1Between(String value1, String value2) {
            addCriterion("assessment_star1 between", value1, value2, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar1NotBetween(String value1, String value2) {
            addCriterion("assessment_star1 not between", value1, value2, "assessmentStar1");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2IsNull() {
            addCriterion("assessment_star2 is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2IsNotNull() {
            addCriterion("assessment_star2 is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2EqualTo(String value) {
            addCriterion("assessment_star2 =", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2NotEqualTo(String value) {
            addCriterion("assessment_star2 <>", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2GreaterThan(String value) {
            addCriterion("assessment_star2 >", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2GreaterThanOrEqualTo(String value) {
            addCriterion("assessment_star2 >=", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2LessThan(String value) {
            addCriterion("assessment_star2 <", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2LessThanOrEqualTo(String value) {
            addCriterion("assessment_star2 <=", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2Like(String value) {
            addCriterion("assessment_star2 like", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2NotLike(String value) {
            addCriterion("assessment_star2 not like", value, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2In(List<String> values) {
            addCriterion("assessment_star2 in", values, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2NotIn(List<String> values) {
            addCriterion("assessment_star2 not in", values, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2Between(String value1, String value2) {
            addCriterion("assessment_star2 between", value1, value2, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar2NotBetween(String value1, String value2) {
            addCriterion("assessment_star2 not between", value1, value2, "assessmentStar2");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3IsNull() {
            addCriterion("assessment_star3 is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3IsNotNull() {
            addCriterion("assessment_star3 is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3EqualTo(String value) {
            addCriterion("assessment_star3 =", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3NotEqualTo(String value) {
            addCriterion("assessment_star3 <>", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3GreaterThan(String value) {
            addCriterion("assessment_star3 >", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3GreaterThanOrEqualTo(String value) {
            addCriterion("assessment_star3 >=", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3LessThan(String value) {
            addCriterion("assessment_star3 <", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3LessThanOrEqualTo(String value) {
            addCriterion("assessment_star3 <=", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3Like(String value) {
            addCriterion("assessment_star3 like", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3NotLike(String value) {
            addCriterion("assessment_star3 not like", value, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3In(List<String> values) {
            addCriterion("assessment_star3 in", values, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3NotIn(List<String> values) {
            addCriterion("assessment_star3 not in", values, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3Between(String value1, String value2) {
            addCriterion("assessment_star3 between", value1, value2, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar3NotBetween(String value1, String value2) {
            addCriterion("assessment_star3 not between", value1, value2, "assessmentStar3");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4IsNull() {
            addCriterion("assessment_star4 is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4IsNotNull() {
            addCriterion("assessment_star4 is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4EqualTo(String value) {
            addCriterion("assessment_star4 =", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4NotEqualTo(String value) {
            addCriterion("assessment_star4 <>", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4GreaterThan(String value) {
            addCriterion("assessment_star4 >", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4GreaterThanOrEqualTo(String value) {
            addCriterion("assessment_star4 >=", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4LessThan(String value) {
            addCriterion("assessment_star4 <", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4LessThanOrEqualTo(String value) {
            addCriterion("assessment_star4 <=", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4Like(String value) {
            addCriterion("assessment_star4 like", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4NotLike(String value) {
            addCriterion("assessment_star4 not like", value, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4In(List<String> values) {
            addCriterion("assessment_star4 in", values, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4NotIn(List<String> values) {
            addCriterion("assessment_star4 not in", values, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4Between(String value1, String value2) {
            addCriterion("assessment_star4 between", value1, value2, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andAssessmentStar4NotBetween(String value1, String value2) {
            addCriterion("assessment_star4 not between", value1, value2, "assessmentStar4");
            return (Criteria) this;
        }

        public Criteria andShareNumIsNull() {
            addCriterion("share_num is null");
            return (Criteria) this;
        }

        public Criteria andShareNumIsNotNull() {
            addCriterion("share_num is not null");
            return (Criteria) this;
        }

        public Criteria andShareNumEqualTo(Long value) {
            addCriterion("share_num =", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotEqualTo(Long value) {
            addCriterion("share_num <>", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumGreaterThan(Long value) {
            addCriterion("share_num >", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumGreaterThanOrEqualTo(Long value) {
            addCriterion("share_num >=", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumLessThan(Long value) {
            addCriterion("share_num <", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumLessThanOrEqualTo(Long value) {
            addCriterion("share_num <=", value, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumIn(List<Long> values) {
            addCriterion("share_num in", values, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotIn(List<Long> values) {
            addCriterion("share_num not in", values, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumBetween(Long value1, Long value2) {
            addCriterion("share_num between", value1, value2, "shareNum");
            return (Criteria) this;
        }

        public Criteria andShareNumNotBetween(Long value1, Long value2) {
            addCriterion("share_num not between", value1, value2, "shareNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNull() {
            addCriterion("like_num is null");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNotNull() {
            addCriterion("like_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNumEqualTo(Long value) {
            addCriterion("like_num =", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotEqualTo(Long value) {
            addCriterion("like_num <>", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThan(Long value) {
            addCriterion("like_num >", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThanOrEqualTo(Long value) {
            addCriterion("like_num >=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThan(Long value) {
            addCriterion("like_num <", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThanOrEqualTo(Long value) {
            addCriterion("like_num <=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIn(List<Long> values) {
            addCriterion("like_num in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotIn(List<Long> values) {
            addCriterion("like_num not in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumBetween(Long value1, Long value2) {
            addCriterion("like_num between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotBetween(Long value1, Long value2) {
            addCriterion("like_num not between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNull() {
            addCriterion("is_hidden is null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNotNull() {
            addCriterion("is_hidden is not null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenEqualTo(String value) {
            addCriterion("is_hidden =", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotEqualTo(String value) {
            addCriterion("is_hidden <>", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThan(String value) {
            addCriterion("is_hidden >", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThanOrEqualTo(String value) {
            addCriterion("is_hidden >=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThan(String value) {
            addCriterion("is_hidden <", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThanOrEqualTo(String value) {
            addCriterion("is_hidden <=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLike(String value) {
            addCriterion("is_hidden like", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotLike(String value) {
            addCriterion("is_hidden not like", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIn(List<String> values) {
            addCriterion("is_hidden in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotIn(List<String> values) {
            addCriterion("is_hidden not in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenBetween(String value1, String value2) {
            addCriterion("is_hidden between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotBetween(String value1, String value2) {
            addCriterion("is_hidden not between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Long value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Long value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Long value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Long value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Long value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Long> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Long> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Long value1, Long value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Long value1, Long value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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