package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCouponExample() {
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

        public Criteria andCouponIconIsNull() {
            addCriterion("coupon_icon is null");
            return (Criteria) this;
        }

        public Criteria andCouponIconIsNotNull() {
            addCriterion("coupon_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIconEqualTo(String value) {
            addCriterion("coupon_icon =", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconNotEqualTo(String value) {
            addCriterion("coupon_icon <>", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconGreaterThan(String value) {
            addCriterion("coupon_icon >", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_icon >=", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconLessThan(String value) {
            addCriterion("coupon_icon <", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconLessThanOrEqualTo(String value) {
            addCriterion("coupon_icon <=", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconLike(String value) {
            addCriterion("coupon_icon like", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconNotLike(String value) {
            addCriterion("coupon_icon not like", value, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconIn(List<String> values) {
            addCriterion("coupon_icon in", values, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconNotIn(List<String> values) {
            addCriterion("coupon_icon not in", values, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconBetween(String value1, String value2) {
            addCriterion("coupon_icon between", value1, value2, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponIconNotBetween(String value1, String value2) {
            addCriterion("coupon_icon not between", value1, value2, "couponIcon");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountIsNull() {
            addCriterion("coupon_publish_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountIsNotNull() {
            addCriterion("coupon_publish_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountEqualTo(String value) {
            addCriterion("coupon_publish_count =", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountNotEqualTo(String value) {
            addCriterion("coupon_publish_count <>", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountGreaterThan(String value) {
            addCriterion("coupon_publish_count >", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_publish_count >=", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountLessThan(String value) {
            addCriterion("coupon_publish_count <", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountLessThanOrEqualTo(String value) {
            addCriterion("coupon_publish_count <=", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountLike(String value) {
            addCriterion("coupon_publish_count like", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountNotLike(String value) {
            addCriterion("coupon_publish_count not like", value, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountIn(List<String> values) {
            addCriterion("coupon_publish_count in", values, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountNotIn(List<String> values) {
            addCriterion("coupon_publish_count not in", values, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountBetween(String value1, String value2) {
            addCriterion("coupon_publish_count between", value1, value2, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponPublishCountNotBetween(String value1, String value2) {
            addCriterion("coupon_publish_count not between", value1, value2, "couponPublishCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountIsNull() {
            addCriterion("coupon_use_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountIsNotNull() {
            addCriterion("coupon_use_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountEqualTo(String value) {
            addCriterion("coupon_use_count =", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountNotEqualTo(String value) {
            addCriterion("coupon_use_count <>", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountGreaterThan(String value) {
            addCriterion("coupon_use_count >", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_use_count >=", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountLessThan(String value) {
            addCriterion("coupon_use_count <", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountLessThanOrEqualTo(String value) {
            addCriterion("coupon_use_count <=", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountLike(String value) {
            addCriterion("coupon_use_count like", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountNotLike(String value) {
            addCriterion("coupon_use_count not like", value, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountIn(List<String> values) {
            addCriterion("coupon_use_count in", values, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountNotIn(List<String> values) {
            addCriterion("coupon_use_count not in", values, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountBetween(String value1, String value2) {
            addCriterion("coupon_use_count between", value1, value2, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponUseCountNotBetween(String value1, String value2) {
            addCriterion("coupon_use_count not between", value1, value2, "couponUseCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountIsNull() {
            addCriterion("coupon_receive_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountIsNotNull() {
            addCriterion("coupon_receive_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountEqualTo(String value) {
            addCriterion("coupon_receive_count =", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountNotEqualTo(String value) {
            addCriterion("coupon_receive_count <>", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountGreaterThan(String value) {
            addCriterion("coupon_receive_count >", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_receive_count >=", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountLessThan(String value) {
            addCriterion("coupon_receive_count <", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountLessThanOrEqualTo(String value) {
            addCriterion("coupon_receive_count <=", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountLike(String value) {
            addCriterion("coupon_receive_count like", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountNotLike(String value) {
            addCriterion("coupon_receive_count not like", value, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountIn(List<String> values) {
            addCriterion("coupon_receive_count in", values, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountNotIn(List<String> values) {
            addCriterion("coupon_receive_count not in", values, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountBetween(String value1, String value2) {
            addCriterion("coupon_receive_count between", value1, value2, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponReceiveCountNotBetween(String value1, String value2) {
            addCriterion("coupon_receive_count not between", value1, value2, "couponReceiveCount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(String value) {
            addCriterion("coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(String value) {
            addCriterion("coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(String value) {
            addCriterion("coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(String value) {
            addCriterion("coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(String value) {
            addCriterion("coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLike(String value) {
            addCriterion("coupon_amount like", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotLike(String value) {
            addCriterion("coupon_amount not like", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<String> values) {
            addCriterion("coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<String> values) {
            addCriterion("coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(String value1, String value2) {
            addCriterion("coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(String value1, String value2) {
            addCriterion("coupon_amount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andPersonLimitIsNull() {
            addCriterion("person_limit is null");
            return (Criteria) this;
        }

        public Criteria andPersonLimitIsNotNull() {
            addCriterion("person_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPersonLimitEqualTo(String value) {
            addCriterion("person_limit =", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitNotEqualTo(String value) {
            addCriterion("person_limit <>", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitGreaterThan(String value) {
            addCriterion("person_limit >", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitGreaterThanOrEqualTo(String value) {
            addCriterion("person_limit >=", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitLessThan(String value) {
            addCriterion("person_limit <", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitLessThanOrEqualTo(String value) {
            addCriterion("person_limit <=", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitLike(String value) {
            addCriterion("person_limit like", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitNotLike(String value) {
            addCriterion("person_limit not like", value, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitIn(List<String> values) {
            addCriterion("person_limit in", values, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitNotIn(List<String> values) {
            addCriterion("person_limit not in", values, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitBetween(String value1, String value2) {
            addCriterion("person_limit between", value1, value2, "personLimit");
            return (Criteria) this;
        }

        public Criteria andPersonLimitNotBetween(String value1, String value2) {
            addCriterion("person_limit not between", value1, value2, "personLimit");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("use_type is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(String value) {
            addCriterion("use_type =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(String value) {
            addCriterion("use_type <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(String value) {
            addCriterion("use_type >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("use_type >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(String value) {
            addCriterion("use_type <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(String value) {
            addCriterion("use_type <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLike(String value) {
            addCriterion("use_type like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotLike(String value) {
            addCriterion("use_type not like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<String> values) {
            addCriterion("use_type in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<String> values) {
            addCriterion("use_type not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(String value1, String value2) {
            addCriterion("use_type between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(String value1, String value2) {
            addCriterion("use_type not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNull() {
            addCriterion("coupon_code is null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNotNull() {
            addCriterion("coupon_code is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeEqualTo(String value) {
            addCriterion("coupon_code =", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotEqualTo(String value) {
            addCriterion("coupon_code <>", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThan(String value) {
            addCriterion("coupon_code >", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_code >=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThan(String value) {
            addCriterion("coupon_code <", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThanOrEqualTo(String value) {
            addCriterion("coupon_code <=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLike(String value) {
            addCriterion("coupon_code like", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotLike(String value) {
            addCriterion("coupon_code not like", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIn(List<String> values) {
            addCriterion("coupon_code in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotIn(List<String> values) {
            addCriterion("coupon_code not in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeBetween(String value1, String value2) {
            addCriterion("coupon_code between", value1, value2, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotBetween(String value1, String value2) {
            addCriterion("coupon_code not between", value1, value2, "couponCode");
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