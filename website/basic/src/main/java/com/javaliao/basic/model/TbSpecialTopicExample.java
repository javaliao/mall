package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSpecialTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSpecialTopicExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Long value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Long value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Long value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Long value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Long> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Long> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Long value1, Long value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andSpecialIconIsNull() {
            addCriterion("special_icon is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIconIsNotNull() {
            addCriterion("special_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIconEqualTo(String value) {
            addCriterion("special_icon =", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconNotEqualTo(String value) {
            addCriterion("special_icon <>", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconGreaterThan(String value) {
            addCriterion("special_icon >", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconGreaterThanOrEqualTo(String value) {
            addCriterion("special_icon >=", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconLessThan(String value) {
            addCriterion("special_icon <", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconLessThanOrEqualTo(String value) {
            addCriterion("special_icon <=", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconLike(String value) {
            addCriterion("special_icon like", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconNotLike(String value) {
            addCriterion("special_icon not like", value, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconIn(List<String> values) {
            addCriterion("special_icon in", values, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconNotIn(List<String> values) {
            addCriterion("special_icon not in", values, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconBetween(String value1, String value2) {
            addCriterion("special_icon between", value1, value2, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialIconNotBetween(String value1, String value2) {
            addCriterion("special_icon not between", value1, value2, "specialIcon");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameIsNull() {
            addCriterion("special_topic_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameIsNotNull() {
            addCriterion("special_topic_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameEqualTo(String value) {
            addCriterion("special_topic_name =", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameNotEqualTo(String value) {
            addCriterion("special_topic_name <>", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameGreaterThan(String value) {
            addCriterion("special_topic_name >", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameGreaterThanOrEqualTo(String value) {
            addCriterion("special_topic_name >=", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameLessThan(String value) {
            addCriterion("special_topic_name <", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameLessThanOrEqualTo(String value) {
            addCriterion("special_topic_name <=", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameLike(String value) {
            addCriterion("special_topic_name like", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameNotLike(String value) {
            addCriterion("special_topic_name not like", value, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameIn(List<String> values) {
            addCriterion("special_topic_name in", values, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameNotIn(List<String> values) {
            addCriterion("special_topic_name not in", values, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameBetween(String value1, String value2) {
            addCriterion("special_topic_name between", value1, value2, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicNameNotBetween(String value1, String value2) {
            addCriterion("special_topic_name not between", value1, value2, "specialTopicName");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeIsNull() {
            addCriterion("discount_describe is null");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeIsNotNull() {
            addCriterion("discount_describe is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeEqualTo(String value) {
            addCriterion("discount_describe =", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeNotEqualTo(String value) {
            addCriterion("discount_describe <>", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeGreaterThan(String value) {
            addCriterion("discount_describe >", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("discount_describe >=", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeLessThan(String value) {
            addCriterion("discount_describe <", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeLessThanOrEqualTo(String value) {
            addCriterion("discount_describe <=", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeLike(String value) {
            addCriterion("discount_describe like", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeNotLike(String value) {
            addCriterion("discount_describe not like", value, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeIn(List<String> values) {
            addCriterion("discount_describe in", values, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeNotIn(List<String> values) {
            addCriterion("discount_describe not in", values, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeBetween(String value1, String value2) {
            addCriterion("discount_describe between", value1, value2, "discountDescribe");
            return (Criteria) this;
        }

        public Criteria andDiscountDescribeNotBetween(String value1, String value2) {
            addCriterion("discount_describe not between", value1, value2, "discountDescribe");
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