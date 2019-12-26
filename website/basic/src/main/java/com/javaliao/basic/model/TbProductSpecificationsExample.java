package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProductSpecificationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProductSpecificationsExample() {
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

        public Criteria andSpecificationsNameIsNull() {
            addCriterion("specifications_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameIsNotNull() {
            addCriterion("specifications_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameEqualTo(String value) {
            addCriterion("specifications_name =", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameNotEqualTo(String value) {
            addCriterion("specifications_name <>", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameGreaterThan(String value) {
            addCriterion("specifications_name >", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameGreaterThanOrEqualTo(String value) {
            addCriterion("specifications_name >=", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameLessThan(String value) {
            addCriterion("specifications_name <", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameLessThanOrEqualTo(String value) {
            addCriterion("specifications_name <=", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameLike(String value) {
            addCriterion("specifications_name like", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameNotLike(String value) {
            addCriterion("specifications_name not like", value, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameIn(List<String> values) {
            addCriterion("specifications_name in", values, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameNotIn(List<String> values) {
            addCriterion("specifications_name not in", values, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameBetween(String value1, String value2) {
            addCriterion("specifications_name between", value1, value2, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNameNotBetween(String value1, String value2) {
            addCriterion("specifications_name not between", value1, value2, "specificationsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceIsNull() {
            addCriterion("specifications_corresponding_pice is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceIsNotNull() {
            addCriterion("specifications_corresponding_pice is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceEqualTo(String value) {
            addCriterion("specifications_corresponding_pice =", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceNotEqualTo(String value) {
            addCriterion("specifications_corresponding_pice <>", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceGreaterThan(String value) {
            addCriterion("specifications_corresponding_pice >", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceGreaterThanOrEqualTo(String value) {
            addCriterion("specifications_corresponding_pice >=", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceLessThan(String value) {
            addCriterion("specifications_corresponding_pice <", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceLessThanOrEqualTo(String value) {
            addCriterion("specifications_corresponding_pice <=", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceLike(String value) {
            addCriterion("specifications_corresponding_pice like", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceNotLike(String value) {
            addCriterion("specifications_corresponding_pice not like", value, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceIn(List<String> values) {
            addCriterion("specifications_corresponding_pice in", values, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceNotIn(List<String> values) {
            addCriterion("specifications_corresponding_pice not in", values, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceBetween(String value1, String value2) {
            addCriterion("specifications_corresponding_pice between", value1, value2, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingPiceNotBetween(String value1, String value2) {
            addCriterion("specifications_corresponding_pice not between", value1, value2, "specificationsCorrespondingPice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconIsNull() {
            addCriterion("specifications_corresponding_icon is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconIsNotNull() {
            addCriterion("specifications_corresponding_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconEqualTo(String value) {
            addCriterion("specifications_corresponding_icon =", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconNotEqualTo(String value) {
            addCriterion("specifications_corresponding_icon <>", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconGreaterThan(String value) {
            addCriterion("specifications_corresponding_icon >", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconGreaterThanOrEqualTo(String value) {
            addCriterion("specifications_corresponding_icon >=", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconLessThan(String value) {
            addCriterion("specifications_corresponding_icon <", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconLessThanOrEqualTo(String value) {
            addCriterion("specifications_corresponding_icon <=", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconLike(String value) {
            addCriterion("specifications_corresponding_icon like", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconNotLike(String value) {
            addCriterion("specifications_corresponding_icon not like", value, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconIn(List<String> values) {
            addCriterion("specifications_corresponding_icon in", values, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconNotIn(List<String> values) {
            addCriterion("specifications_corresponding_icon not in", values, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconBetween(String value1, String value2) {
            addCriterion("specifications_corresponding_icon between", value1, value2, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsCorrespondingIconNotBetween(String value1, String value2) {
            addCriterion("specifications_corresponding_icon not between", value1, value2, "specificationsCorrespondingIcon");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicIsNull() {
            addCriterion("specifications_sorresponding_pic is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicIsNotNull() {
            addCriterion("specifications_sorresponding_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicEqualTo(String value) {
            addCriterion("specifications_sorresponding_pic =", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicNotEqualTo(String value) {
            addCriterion("specifications_sorresponding_pic <>", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicGreaterThan(String value) {
            addCriterion("specifications_sorresponding_pic >", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicGreaterThanOrEqualTo(String value) {
            addCriterion("specifications_sorresponding_pic >=", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicLessThan(String value) {
            addCriterion("specifications_sorresponding_pic <", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicLessThanOrEqualTo(String value) {
            addCriterion("specifications_sorresponding_pic <=", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicLike(String value) {
            addCriterion("specifications_sorresponding_pic like", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicNotLike(String value) {
            addCriterion("specifications_sorresponding_pic not like", value, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicIn(List<String> values) {
            addCriterion("specifications_sorresponding_pic in", values, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicNotIn(List<String> values) {
            addCriterion("specifications_sorresponding_pic not in", values, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicBetween(String value1, String value2) {
            addCriterion("specifications_sorresponding_pic between", value1, value2, "specificationsSorrespondingPic");
            return (Criteria) this;
        }

        public Criteria andSpecificationsSorrespondingPicNotBetween(String value1, String value2) {
            addCriterion("specifications_sorresponding_pic not between", value1, value2, "specificationsSorrespondingPic");
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