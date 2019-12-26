package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSellerStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSellerStoreExample() {
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameIsNull() {
            addCriterion("seller_store_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameIsNotNull() {
            addCriterion("seller_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameEqualTo(String value) {
            addCriterion("seller_store_name =", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameNotEqualTo(String value) {
            addCriterion("seller_store_name <>", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameGreaterThan(String value) {
            addCriterion("seller_store_name >", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_name >=", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameLessThan(String value) {
            addCriterion("seller_store_name <", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameLessThanOrEqualTo(String value) {
            addCriterion("seller_store_name <=", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameLike(String value) {
            addCriterion("seller_store_name like", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameNotLike(String value) {
            addCriterion("seller_store_name not like", value, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameIn(List<String> values) {
            addCriterion("seller_store_name in", values, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameNotIn(List<String> values) {
            addCriterion("seller_store_name not in", values, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameBetween(String value1, String value2) {
            addCriterion("seller_store_name between", value1, value2, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNameNotBetween(String value1, String value2) {
            addCriterion("seller_store_name not between", value1, value2, "sellerStoreName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisIsNull() {
            addCriterion("seller_store_synopsis is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisIsNotNull() {
            addCriterion("seller_store_synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisEqualTo(String value) {
            addCriterion("seller_store_synopsis =", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisNotEqualTo(String value) {
            addCriterion("seller_store_synopsis <>", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisGreaterThan(String value) {
            addCriterion("seller_store_synopsis >", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_synopsis >=", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisLessThan(String value) {
            addCriterion("seller_store_synopsis <", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisLessThanOrEqualTo(String value) {
            addCriterion("seller_store_synopsis <=", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisLike(String value) {
            addCriterion("seller_store_synopsis like", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisNotLike(String value) {
            addCriterion("seller_store_synopsis not like", value, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisIn(List<String> values) {
            addCriterion("seller_store_synopsis in", values, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisNotIn(List<String> values) {
            addCriterion("seller_store_synopsis not in", values, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisBetween(String value1, String value2) {
            addCriterion("seller_store_synopsis between", value1, value2, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSynopsisNotBetween(String value1, String value2) {
            addCriterion("seller_store_synopsis not between", value1, value2, "sellerStoreSynopsis");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconIsNull() {
            addCriterion("seller_store_icon is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconIsNotNull() {
            addCriterion("seller_store_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconEqualTo(String value) {
            addCriterion("seller_store_icon =", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconNotEqualTo(String value) {
            addCriterion("seller_store_icon <>", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconGreaterThan(String value) {
            addCriterion("seller_store_icon >", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_icon >=", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconLessThan(String value) {
            addCriterion("seller_store_icon <", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconLessThanOrEqualTo(String value) {
            addCriterion("seller_store_icon <=", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconLike(String value) {
            addCriterion("seller_store_icon like", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconNotLike(String value) {
            addCriterion("seller_store_icon not like", value, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconIn(List<String> values) {
            addCriterion("seller_store_icon in", values, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconNotIn(List<String> values) {
            addCriterion("seller_store_icon not in", values, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconBetween(String value1, String value2) {
            addCriterion("seller_store_icon between", value1, value2, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreIconNotBetween(String value1, String value2) {
            addCriterion("seller_store_icon not between", value1, value2, "sellerStoreIcon");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeIsNull() {
            addCriterion("seller_store_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeIsNotNull() {
            addCriterion("seller_store_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeEqualTo(Date value) {
            addCriterion("seller_store_create_time =", value, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeNotEqualTo(Date value) {
            addCriterion("seller_store_create_time <>", value, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeGreaterThan(Date value) {
            addCriterion("seller_store_create_time >", value, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seller_store_create_time >=", value, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeLessThan(Date value) {
            addCriterion("seller_store_create_time <", value, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("seller_store_create_time <=", value, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeIn(List<Date> values) {
            addCriterion("seller_store_create_time in", values, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeNotIn(List<Date> values) {
            addCriterion("seller_store_create_time not in", values, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeBetween(Date value1, Date value2) {
            addCriterion("seller_store_create_time between", value1, value2, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("seller_store_create_time not between", value1, value2, "sellerStoreCreateTime");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameIsNull() {
            addCriterion("seller_store_category_attribute_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameIsNotNull() {
            addCriterion("seller_store_category_attribute_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameEqualTo(String value) {
            addCriterion("seller_store_category_attribute_name =", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameNotEqualTo(String value) {
            addCriterion("seller_store_category_attribute_name <>", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameGreaterThan(String value) {
            addCriterion("seller_store_category_attribute_name >", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_category_attribute_name >=", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameLessThan(String value) {
            addCriterion("seller_store_category_attribute_name <", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("seller_store_category_attribute_name <=", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameLike(String value) {
            addCriterion("seller_store_category_attribute_name like", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameNotLike(String value) {
            addCriterion("seller_store_category_attribute_name not like", value, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameIn(List<String> values) {
            addCriterion("seller_store_category_attribute_name in", values, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameNotIn(List<String> values) {
            addCriterion("seller_store_category_attribute_name not in", values, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameBetween(String value1, String value2) {
            addCriterion("seller_store_category_attribute_name between", value1, value2, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeNameNotBetween(String value1, String value2) {
            addCriterion("seller_store_category_attribute_name not between", value1, value2, "sellerStoreCategoryAttributeName");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesIsNull() {
            addCriterion("seller_store_category_attribute_values is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesIsNotNull() {
            addCriterion("seller_store_category_attribute_values is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesEqualTo(String value) {
            addCriterion("seller_store_category_attribute_values =", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesNotEqualTo(String value) {
            addCriterion("seller_store_category_attribute_values <>", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesGreaterThan(String value) {
            addCriterion("seller_store_category_attribute_values >", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_category_attribute_values >=", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesLessThan(String value) {
            addCriterion("seller_store_category_attribute_values <", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesLessThanOrEqualTo(String value) {
            addCriterion("seller_store_category_attribute_values <=", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesLike(String value) {
            addCriterion("seller_store_category_attribute_values like", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesNotLike(String value) {
            addCriterion("seller_store_category_attribute_values not like", value, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesIn(List<String> values) {
            addCriterion("seller_store_category_attribute_values in", values, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesNotIn(List<String> values) {
            addCriterion("seller_store_category_attribute_values not in", values, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesBetween(String value1, String value2) {
            addCriterion("seller_store_category_attribute_values between", value1, value2, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreCategoryAttributeValuesNotBetween(String value1, String value2) {
            addCriterion("seller_store_category_attribute_values not between", value1, value2, "sellerStoreCategoryAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsIsNull() {
            addCriterion("seller_store_sell_well_products is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsIsNotNull() {
            addCriterion("seller_store_sell_well_products is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsEqualTo(String value) {
            addCriterion("seller_store_sell_well_products =", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsNotEqualTo(String value) {
            addCriterion("seller_store_sell_well_products <>", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsGreaterThan(String value) {
            addCriterion("seller_store_sell_well_products >", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_sell_well_products >=", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsLessThan(String value) {
            addCriterion("seller_store_sell_well_products <", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsLessThanOrEqualTo(String value) {
            addCriterion("seller_store_sell_well_products <=", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsLike(String value) {
            addCriterion("seller_store_sell_well_products like", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsNotLike(String value) {
            addCriterion("seller_store_sell_well_products not like", value, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsIn(List<String> values) {
            addCriterion("seller_store_sell_well_products in", values, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsNotIn(List<String> values) {
            addCriterion("seller_store_sell_well_products not in", values, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsBetween(String value1, String value2) {
            addCriterion("seller_store_sell_well_products between", value1, value2, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreSellWellProductsNotBetween(String value1, String value2) {
            addCriterion("seller_store_sell_well_products not between", value1, value2, "sellerStoreSellWellProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsIsNull() {
            addCriterion("seller_store_hot_attention_products is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsIsNotNull() {
            addCriterion("seller_store_hot_attention_products is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsEqualTo(String value) {
            addCriterion("seller_store_hot_attention_products =", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsNotEqualTo(String value) {
            addCriterion("seller_store_hot_attention_products <>", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsGreaterThan(String value) {
            addCriterion("seller_store_hot_attention_products >", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_hot_attention_products >=", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsLessThan(String value) {
            addCriterion("seller_store_hot_attention_products <", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsLessThanOrEqualTo(String value) {
            addCriterion("seller_store_hot_attention_products <=", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsLike(String value) {
            addCriterion("seller_store_hot_attention_products like", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsNotLike(String value) {
            addCriterion("seller_store_hot_attention_products not like", value, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsIn(List<String> values) {
            addCriterion("seller_store_hot_attention_products in", values, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsNotIn(List<String> values) {
            addCriterion("seller_store_hot_attention_products not in", values, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsBetween(String value1, String value2) {
            addCriterion("seller_store_hot_attention_products between", value1, value2, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHotAttentionProductsNotBetween(String value1, String value2) {
            addCriterion("seller_store_hot_attention_products not between", value1, value2, "sellerStoreHotAttentionProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsIsNull() {
            addCriterion("seller_store_new_products is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsIsNotNull() {
            addCriterion("seller_store_new_products is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsEqualTo(String value) {
            addCriterion("seller_store_new_products =", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsNotEqualTo(String value) {
            addCriterion("seller_store_new_products <>", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsGreaterThan(String value) {
            addCriterion("seller_store_new_products >", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_new_products >=", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsLessThan(String value) {
            addCriterion("seller_store_new_products <", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsLessThanOrEqualTo(String value) {
            addCriterion("seller_store_new_products <=", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsLike(String value) {
            addCriterion("seller_store_new_products like", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsNotLike(String value) {
            addCriterion("seller_store_new_products not like", value, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsIn(List<String> values) {
            addCriterion("seller_store_new_products in", values, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsNotIn(List<String> values) {
            addCriterion("seller_store_new_products not in", values, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsBetween(String value1, String value2) {
            addCriterion("seller_store_new_products between", value1, value2, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreNewProductsNotBetween(String value1, String value2) {
            addCriterion("seller_store_new_products not between", value1, value2, "sellerStoreNewProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicIsNull() {
            addCriterion("seller_store_home_page_carousel_pic is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicIsNotNull() {
            addCriterion("seller_store_home_page_carousel_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicEqualTo(String value) {
            addCriterion("seller_store_home_page_carousel_pic =", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicNotEqualTo(String value) {
            addCriterion("seller_store_home_page_carousel_pic <>", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicGreaterThan(String value) {
            addCriterion("seller_store_home_page_carousel_pic >", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_home_page_carousel_pic >=", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicLessThan(String value) {
            addCriterion("seller_store_home_page_carousel_pic <", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicLessThanOrEqualTo(String value) {
            addCriterion("seller_store_home_page_carousel_pic <=", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicLike(String value) {
            addCriterion("seller_store_home_page_carousel_pic like", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicNotLike(String value) {
            addCriterion("seller_store_home_page_carousel_pic not like", value, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicIn(List<String> values) {
            addCriterion("seller_store_home_page_carousel_pic in", values, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicNotIn(List<String> values) {
            addCriterion("seller_store_home_page_carousel_pic not in", values, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicBetween(String value1, String value2) {
            addCriterion("seller_store_home_page_carousel_pic between", value1, value2, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStoreHomePageCarouselPicNotBetween(String value1, String value2) {
            addCriterion("seller_store_home_page_carousel_pic not between", value1, value2, "sellerStoreHomePageCarouselPic");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsIsNull() {
            addCriterion("seller_store_pics is null");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsIsNotNull() {
            addCriterion("seller_store_pics is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsEqualTo(String value) {
            addCriterion("seller_store_pics =", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsNotEqualTo(String value) {
            addCriterion("seller_store_pics <>", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsGreaterThan(String value) {
            addCriterion("seller_store_pics >", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_pics >=", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsLessThan(String value) {
            addCriterion("seller_store_pics <", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsLessThanOrEqualTo(String value) {
            addCriterion("seller_store_pics <=", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsLike(String value) {
            addCriterion("seller_store_pics like", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsNotLike(String value) {
            addCriterion("seller_store_pics not like", value, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsIn(List<String> values) {
            addCriterion("seller_store_pics in", values, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsNotIn(List<String> values) {
            addCriterion("seller_store_pics not in", values, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsBetween(String value1, String value2) {
            addCriterion("seller_store_pics between", value1, value2, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStorePicsNotBetween(String value1, String value2) {
            addCriterion("seller_store_pics not between", value1, value2, "sellerStorePics");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsIsNull() {
            addCriterion("seller_store_products is null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsIsNotNull() {
            addCriterion("seller_store_products is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsEqualTo(String value) {
            addCriterion("seller_store_products =", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsNotEqualTo(String value) {
            addCriterion("seller_store_products <>", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsGreaterThan(String value) {
            addCriterion("seller_store_products >", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsGreaterThanOrEqualTo(String value) {
            addCriterion("seller_store_products >=", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsLessThan(String value) {
            addCriterion("seller_store_products <", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsLessThanOrEqualTo(String value) {
            addCriterion("seller_store_products <=", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsLike(String value) {
            addCriterion("seller_store_products like", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsNotLike(String value) {
            addCriterion("seller_store_products not like", value, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsIn(List<String> values) {
            addCriterion("seller_store_products in", values, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsNotIn(List<String> values) {
            addCriterion("seller_store_products not in", values, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsBetween(String value1, String value2) {
            addCriterion("seller_store_products between", value1, value2, "sellerStoreProducts");
            return (Criteria) this;
        }

        public Criteria andSellerStoreProductsNotBetween(String value1, String value2) {
            addCriterion("seller_store_products not between", value1, value2, "sellerStoreProducts");
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