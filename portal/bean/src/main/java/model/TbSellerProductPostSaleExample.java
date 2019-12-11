package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSellerProductPostSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSellerProductPostSaleExample() {
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

        public Criteria andSellerProductIdIsNull() {
            addCriterion("seller_product_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdIsNotNull() {
            addCriterion("seller_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdEqualTo(Long value) {
            addCriterion("seller_product_id =", value, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdNotEqualTo(Long value) {
            addCriterion("seller_product_id <>", value, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdGreaterThan(Long value) {
            addCriterion("seller_product_id >", value, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_product_id >=", value, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdLessThan(Long value) {
            addCriterion("seller_product_id <", value, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_product_id <=", value, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdIn(List<Long> values) {
            addCriterion("seller_product_id in", values, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdNotIn(List<Long> values) {
            addCriterion("seller_product_id not in", values, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdBetween(Long value1, Long value2) {
            addCriterion("seller_product_id between", value1, value2, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andSellerProductIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_product_id not between", value1, value2, "sellerProductId");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsIsNull() {
            addCriterion("post_sale_pics is null");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsIsNotNull() {
            addCriterion("post_sale_pics is not null");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsEqualTo(String value) {
            addCriterion("post_sale_pics =", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsNotEqualTo(String value) {
            addCriterion("post_sale_pics <>", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsGreaterThan(String value) {
            addCriterion("post_sale_pics >", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsGreaterThanOrEqualTo(String value) {
            addCriterion("post_sale_pics >=", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsLessThan(String value) {
            addCriterion("post_sale_pics <", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsLessThanOrEqualTo(String value) {
            addCriterion("post_sale_pics <=", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsLike(String value) {
            addCriterion("post_sale_pics like", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsNotLike(String value) {
            addCriterion("post_sale_pics not like", value, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsIn(List<String> values) {
            addCriterion("post_sale_pics in", values, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsNotIn(List<String> values) {
            addCriterion("post_sale_pics not in", values, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsBetween(String value1, String value2) {
            addCriterion("post_sale_pics between", value1, value2, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSalePicsNotBetween(String value1, String value2) {
            addCriterion("post_sale_pics not between", value1, value2, "postSalePics");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainIsNull() {
            addCriterion("post_sale_explain is null");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainIsNotNull() {
            addCriterion("post_sale_explain is not null");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainEqualTo(String value) {
            addCriterion("post_sale_explain =", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainNotEqualTo(String value) {
            addCriterion("post_sale_explain <>", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainGreaterThan(String value) {
            addCriterion("post_sale_explain >", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainGreaterThanOrEqualTo(String value) {
            addCriterion("post_sale_explain >=", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainLessThan(String value) {
            addCriterion("post_sale_explain <", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainLessThanOrEqualTo(String value) {
            addCriterion("post_sale_explain <=", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainLike(String value) {
            addCriterion("post_sale_explain like", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainNotLike(String value) {
            addCriterion("post_sale_explain not like", value, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainIn(List<String> values) {
            addCriterion("post_sale_explain in", values, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainNotIn(List<String> values) {
            addCriterion("post_sale_explain not in", values, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainBetween(String value1, String value2) {
            addCriterion("post_sale_explain between", value1, value2, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleExplainNotBetween(String value1, String value2) {
            addCriterion("post_sale_explain not between", value1, value2, "postSaleExplain");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceIsNull() {
            addCriterion("post_sale_service is null");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceIsNotNull() {
            addCriterion("post_sale_service is not null");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceEqualTo(String value) {
            addCriterion("post_sale_service =", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceNotEqualTo(String value) {
            addCriterion("post_sale_service <>", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceGreaterThan(String value) {
            addCriterion("post_sale_service >", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceGreaterThanOrEqualTo(String value) {
            addCriterion("post_sale_service >=", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceLessThan(String value) {
            addCriterion("post_sale_service <", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceLessThanOrEqualTo(String value) {
            addCriterion("post_sale_service <=", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceLike(String value) {
            addCriterion("post_sale_service like", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceNotLike(String value) {
            addCriterion("post_sale_service not like", value, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceIn(List<String> values) {
            addCriterion("post_sale_service in", values, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceNotIn(List<String> values) {
            addCriterion("post_sale_service not in", values, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceBetween(String value1, String value2) {
            addCriterion("post_sale_service between", value1, value2, "postSaleService");
            return (Criteria) this;
        }

        public Criteria andPostSaleServiceNotBetween(String value1, String value2) {
            addCriterion("post_sale_service not between", value1, value2, "postSaleService");
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