package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCustomerServiceEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCustomerServiceEmployeeExample() {
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

        public Criteria andCustomerServiceNameIsNull() {
            addCriterion("customer_service_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameIsNotNull() {
            addCriterion("customer_service_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameEqualTo(String value) {
            addCriterion("customer_service_name =", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotEqualTo(String value) {
            addCriterion("customer_service_name <>", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameGreaterThan(String value) {
            addCriterion("customer_service_name >", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_name >=", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameLessThan(String value) {
            addCriterion("customer_service_name <", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameLessThanOrEqualTo(String value) {
            addCriterion("customer_service_name <=", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameLike(String value) {
            addCriterion("customer_service_name like", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotLike(String value) {
            addCriterion("customer_service_name not like", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameIn(List<String> values) {
            addCriterion("customer_service_name in", values, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotIn(List<String> values) {
            addCriterion("customer_service_name not in", values, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameBetween(String value1, String value2) {
            addCriterion("customer_service_name between", value1, value2, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotBetween(String value1, String value2) {
            addCriterion("customer_service_name not between", value1, value2, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsNull() {
            addCriterion("customer_service_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsNotNull() {
            addCriterion("customer_service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneEqualTo(String value) {
            addCriterion("customer_service_phone =", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotEqualTo(String value) {
            addCriterion("customer_service_phone <>", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneGreaterThan(String value) {
            addCriterion("customer_service_phone >", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_phone >=", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneLessThan(String value) {
            addCriterion("customer_service_phone <", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_service_phone <=", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneLike(String value) {
            addCriterion("customer_service_phone like", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotLike(String value) {
            addCriterion("customer_service_phone not like", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIn(List<String> values) {
            addCriterion("customer_service_phone in", values, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotIn(List<String> values) {
            addCriterion("customer_service_phone not in", values, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneBetween(String value1, String value2) {
            addCriterion("customer_service_phone between", value1, value2, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotBetween(String value1, String value2) {
            addCriterion("customer_service_phone not between", value1, value2, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharIsNull() {
            addCriterion("customer_service_wechar is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharIsNotNull() {
            addCriterion("customer_service_wechar is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharEqualTo(String value) {
            addCriterion("customer_service_wechar =", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharNotEqualTo(String value) {
            addCriterion("customer_service_wechar <>", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharGreaterThan(String value) {
            addCriterion("customer_service_wechar >", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_wechar >=", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharLessThan(String value) {
            addCriterion("customer_service_wechar <", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharLessThanOrEqualTo(String value) {
            addCriterion("customer_service_wechar <=", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharLike(String value) {
            addCriterion("customer_service_wechar like", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharNotLike(String value) {
            addCriterion("customer_service_wechar not like", value, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharIn(List<String> values) {
            addCriterion("customer_service_wechar in", values, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharNotIn(List<String> values) {
            addCriterion("customer_service_wechar not in", values, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharBetween(String value1, String value2) {
            addCriterion("customer_service_wechar between", value1, value2, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceWecharNotBetween(String value1, String value2) {
            addCriterion("customer_service_wechar not between", value1, value2, "customerServiceWechar");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqIsNull() {
            addCriterion("customer_service_QQ is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqIsNotNull() {
            addCriterion("customer_service_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqEqualTo(String value) {
            addCriterion("customer_service_QQ =", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqNotEqualTo(String value) {
            addCriterion("customer_service_QQ <>", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqGreaterThan(String value) {
            addCriterion("customer_service_QQ >", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_QQ >=", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqLessThan(String value) {
            addCriterion("customer_service_QQ <", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqLessThanOrEqualTo(String value) {
            addCriterion("customer_service_QQ <=", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqLike(String value) {
            addCriterion("customer_service_QQ like", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqNotLike(String value) {
            addCriterion("customer_service_QQ not like", value, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqIn(List<String> values) {
            addCriterion("customer_service_QQ in", values, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqNotIn(List<String> values) {
            addCriterion("customer_service_QQ not in", values, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqBetween(String value1, String value2) {
            addCriterion("customer_service_QQ between", value1, value2, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceQqNotBetween(String value1, String value2) {
            addCriterion("customer_service_QQ not between", value1, value2, "customerServiceQq");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeIsNull() {
            addCriterion("customer_service_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeIsNotNull() {
            addCriterion("customer_service_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeEqualTo(String value) {
            addCriterion("customer_service_type =", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeNotEqualTo(String value) {
            addCriterion("customer_service_type <>", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeGreaterThan(String value) {
            addCriterion("customer_service_type >", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_type >=", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeLessThan(String value) {
            addCriterion("customer_service_type <", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_service_type <=", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeLike(String value) {
            addCriterion("customer_service_type like", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeNotLike(String value) {
            addCriterion("customer_service_type not like", value, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeIn(List<String> values) {
            addCriterion("customer_service_type in", values, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeNotIn(List<String> values) {
            addCriterion("customer_service_type not in", values, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeBetween(String value1, String value2) {
            addCriterion("customer_service_type between", value1, value2, "customerServiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTypeNotBetween(String value1, String value2) {
            addCriterion("customer_service_type not between", value1, value2, "customerServiceType");
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