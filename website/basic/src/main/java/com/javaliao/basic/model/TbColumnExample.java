package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbColumnExample() {
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

        public Criteria andSpecialTopicIdIsNull() {
            addCriterion("special_topic_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdIsNotNull() {
            addCriterion("special_topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdEqualTo(Long value) {
            addCriterion("special_topic_id =", value, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdNotEqualTo(Long value) {
            addCriterion("special_topic_id <>", value, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdGreaterThan(Long value) {
            addCriterion("special_topic_id >", value, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("special_topic_id >=", value, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdLessThan(Long value) {
            addCriterion("special_topic_id <", value, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("special_topic_id <=", value, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdIn(List<Long> values) {
            addCriterion("special_topic_id in", values, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdNotIn(List<Long> values) {
            addCriterion("special_topic_id not in", values, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdBetween(Long value1, Long value2) {
            addCriterion("special_topic_id between", value1, value2, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andSpecialTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("special_topic_id not between", value1, value2, "specialTopicId");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("column_name like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("column_name not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnPicsIsNull() {
            addCriterion("column_pics is null");
            return (Criteria) this;
        }

        public Criteria andColumnPicsIsNotNull() {
            addCriterion("column_pics is not null");
            return (Criteria) this;
        }

        public Criteria andColumnPicsEqualTo(String value) {
            addCriterion("column_pics =", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsNotEqualTo(String value) {
            addCriterion("column_pics <>", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsGreaterThan(String value) {
            addCriterion("column_pics >", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsGreaterThanOrEqualTo(String value) {
            addCriterion("column_pics >=", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsLessThan(String value) {
            addCriterion("column_pics <", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsLessThanOrEqualTo(String value) {
            addCriterion("column_pics <=", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsLike(String value) {
            addCriterion("column_pics like", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsNotLike(String value) {
            addCriterion("column_pics not like", value, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsIn(List<String> values) {
            addCriterion("column_pics in", values, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsNotIn(List<String> values) {
            addCriterion("column_pics not in", values, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsBetween(String value1, String value2) {
            addCriterion("column_pics between", value1, value2, "columnPics");
            return (Criteria) this;
        }

        public Criteria andColumnPicsNotBetween(String value1, String value2) {
            addCriterion("column_pics not between", value1, value2, "columnPics");
            return (Criteria) this;
        }

        public Criteria andProductIdsIsNull() {
            addCriterion("product_ids is null");
            return (Criteria) this;
        }

        public Criteria andProductIdsIsNotNull() {
            addCriterion("product_ids is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdsEqualTo(String value) {
            addCriterion("product_ids =", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotEqualTo(String value) {
            addCriterion("product_ids <>", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsGreaterThan(String value) {
            addCriterion("product_ids >", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsGreaterThanOrEqualTo(String value) {
            addCriterion("product_ids >=", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsLessThan(String value) {
            addCriterion("product_ids <", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsLessThanOrEqualTo(String value) {
            addCriterion("product_ids <=", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsLike(String value) {
            addCriterion("product_ids like", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotLike(String value) {
            addCriterion("product_ids not like", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsIn(List<String> values) {
            addCriterion("product_ids in", values, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotIn(List<String> values) {
            addCriterion("product_ids not in", values, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsBetween(String value1, String value2) {
            addCriterion("product_ids between", value1, value2, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotBetween(String value1, String value2) {
            addCriterion("product_ids not between", value1, value2, "productIds");
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