package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProductExample() {
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

        public Criteria andProductSnIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProductSnEqualTo(String value) {
            addCriterion("product_sn =", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThan(String value) {
            addCriterion("product_sn >", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThan(String value) {
            addCriterion("product_sn <", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLike(String value) {
            addCriterion("product_sn like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotLike(String value) {
            addCriterion("product_sn not like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIn(List<String> values) {
            addCriterion("product_sn in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNull() {
            addCriterion("product_pic is null");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNotNull() {
            addCriterion("product_pic is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicEqualTo(String value) {
            addCriterion("product_pic =", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotEqualTo(String value) {
            addCriterion("product_pic <>", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThan(String value) {
            addCriterion("product_pic >", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThanOrEqualTo(String value) {
            addCriterion("product_pic >=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThan(String value) {
            addCriterion("product_pic <", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThanOrEqualTo(String value) {
            addCriterion("product_pic <=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLike(String value) {
            addCriterion("product_pic like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotLike(String value) {
            addCriterion("product_pic not like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicIn(List<String> values) {
            addCriterion("product_pic in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotIn(List<String> values) {
            addCriterion("product_pic not in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicBetween(String value1, String value2) {
            addCriterion("product_pic between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotBetween(String value1, String value2) {
            addCriterion("product_pic not between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductSaleIsNull() {
            addCriterion("product_sale is null");
            return (Criteria) this;
        }

        public Criteria andProductSaleIsNotNull() {
            addCriterion("product_sale is not null");
            return (Criteria) this;
        }

        public Criteria andProductSaleEqualTo(String value) {
            addCriterion("product_sale =", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleNotEqualTo(String value) {
            addCriterion("product_sale <>", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleGreaterThan(String value) {
            addCriterion("product_sale >", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleGreaterThanOrEqualTo(String value) {
            addCriterion("product_sale >=", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleLessThan(String value) {
            addCriterion("product_sale <", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleLessThanOrEqualTo(String value) {
            addCriterion("product_sale <=", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleLike(String value) {
            addCriterion("product_sale like", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleNotLike(String value) {
            addCriterion("product_sale not like", value, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleIn(List<String> values) {
            addCriterion("product_sale in", values, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleNotIn(List<String> values) {
            addCriterion("product_sale not in", values, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleBetween(String value1, String value2) {
            addCriterion("product_sale between", value1, value2, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductSaleNotBetween(String value1, String value2) {
            addCriterion("product_sale not between", value1, value2, "productSale");
            return (Criteria) this;
        }

        public Criteria andProductPiceIsNull() {
            addCriterion("product_pice is null");
            return (Criteria) this;
        }

        public Criteria andProductPiceIsNotNull() {
            addCriterion("product_pice is not null");
            return (Criteria) this;
        }

        public Criteria andProductPiceEqualTo(String value) {
            addCriterion("product_pice =", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceNotEqualTo(String value) {
            addCriterion("product_pice <>", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceGreaterThan(String value) {
            addCriterion("product_pice >", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceGreaterThanOrEqualTo(String value) {
            addCriterion("product_pice >=", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceLessThan(String value) {
            addCriterion("product_pice <", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceLessThanOrEqualTo(String value) {
            addCriterion("product_pice <=", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceLike(String value) {
            addCriterion("product_pice like", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceNotLike(String value) {
            addCriterion("product_pice not like", value, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceIn(List<String> values) {
            addCriterion("product_pice in", values, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceNotIn(List<String> values) {
            addCriterion("product_pice not in", values, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceBetween(String value1, String value2) {
            addCriterion("product_pice between", value1, value2, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductPiceNotBetween(String value1, String value2) {
            addCriterion("product_pice not between", value1, value2, "productPice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceIsNull() {
            addCriterion("product_now_price is null");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceIsNotNull() {
            addCriterion("product_now_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceEqualTo(String value) {
            addCriterion("product_now_price =", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceNotEqualTo(String value) {
            addCriterion("product_now_price <>", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceGreaterThan(String value) {
            addCriterion("product_now_price >", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceGreaterThanOrEqualTo(String value) {
            addCriterion("product_now_price >=", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceLessThan(String value) {
            addCriterion("product_now_price <", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceLessThanOrEqualTo(String value) {
            addCriterion("product_now_price <=", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceLike(String value) {
            addCriterion("product_now_price like", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceNotLike(String value) {
            addCriterion("product_now_price not like", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceIn(List<String> values) {
            addCriterion("product_now_price in", values, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceNotIn(List<String> values) {
            addCriterion("product_now_price not in", values, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceBetween(String value1, String value2) {
            addCriterion("product_now_price between", value1, value2, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceNotBetween(String value1, String value2) {
            addCriterion("product_now_price not between", value1, value2, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNull() {
            addCriterion("product_brand is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNotNull() {
            addCriterion("product_brand is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandEqualTo(String value) {
            addCriterion("product_brand =", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotEqualTo(String value) {
            addCriterion("product_brand <>", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThan(String value) {
            addCriterion("product_brand >", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThanOrEqualTo(String value) {
            addCriterion("product_brand >=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThan(String value) {
            addCriterion("product_brand <", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThanOrEqualTo(String value) {
            addCriterion("product_brand <=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLike(String value) {
            addCriterion("product_brand like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotLike(String value) {
            addCriterion("product_brand not like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandIn(List<String> values) {
            addCriterion("product_brand in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotIn(List<String> values) {
            addCriterion("product_brand not in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandBetween(String value1, String value2) {
            addCriterion("product_brand between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotBetween(String value1, String value2) {
            addCriterion("product_brand not between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNull() {
            addCriterion("product_stock is null");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNotNull() {
            addCriterion("product_stock is not null");
            return (Criteria) this;
        }

        public Criteria andProductStockEqualTo(String value) {
            addCriterion("product_stock =", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotEqualTo(String value) {
            addCriterion("product_stock <>", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThan(String value) {
            addCriterion("product_stock >", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThanOrEqualTo(String value) {
            addCriterion("product_stock >=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThan(String value) {
            addCriterion("product_stock <", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThanOrEqualTo(String value) {
            addCriterion("product_stock <=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLike(String value) {
            addCriterion("product_stock like", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotLike(String value) {
            addCriterion("product_stock not like", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockIn(List<String> values) {
            addCriterion("product_stock in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotIn(List<String> values) {
            addCriterion("product_stock not in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockBetween(String value1, String value2) {
            addCriterion("product_stock between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotBetween(String value1, String value2) {
            addCriterion("product_stock not between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseIsNull() {
            addCriterion("product_appraise is null");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseIsNotNull() {
            addCriterion("product_appraise is not null");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseEqualTo(String value) {
            addCriterion("product_appraise =", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseNotEqualTo(String value) {
            addCriterion("product_appraise <>", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseGreaterThan(String value) {
            addCriterion("product_appraise >", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseGreaterThanOrEqualTo(String value) {
            addCriterion("product_appraise >=", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseLessThan(String value) {
            addCriterion("product_appraise <", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseLessThanOrEqualTo(String value) {
            addCriterion("product_appraise <=", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseLike(String value) {
            addCriterion("product_appraise like", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseNotLike(String value) {
            addCriterion("product_appraise not like", value, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseIn(List<String> values) {
            addCriterion("product_appraise in", values, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseNotIn(List<String> values) {
            addCriterion("product_appraise not in", values, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseBetween(String value1, String value2) {
            addCriterion("product_appraise between", value1, value2, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductAppraiseNotBetween(String value1, String value2) {
            addCriterion("product_appraise not between", value1, value2, "productAppraise");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeIsNull() {
            addCriterion("product_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeIsNotNull() {
            addCriterion("product_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeEqualTo(Date value) {
            addCriterion("product_publish_time =", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeNotEqualTo(Date value) {
            addCriterion("product_publish_time <>", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeGreaterThan(Date value) {
            addCriterion("product_publish_time >", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_publish_time >=", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeLessThan(Date value) {
            addCriterion("product_publish_time <", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_publish_time <=", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeIn(List<Date> values) {
            addCriterion("product_publish_time in", values, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeNotIn(List<Date> values) {
            addCriterion("product_publish_time not in", values, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeBetween(Date value1, Date value2) {
            addCriterion("product_publish_time between", value1, value2, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_publish_time not between", value1, value2, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNull() {
            addCriterion("product_title is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNotNull() {
            addCriterion("product_title is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEqualTo(String value) {
            addCriterion("product_title =", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotEqualTo(String value) {
            addCriterion("product_title <>", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThan(String value) {
            addCriterion("product_title >", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThanOrEqualTo(String value) {
            addCriterion("product_title >=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThan(String value) {
            addCriterion("product_title <", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThanOrEqualTo(String value) {
            addCriterion("product_title <=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLike(String value) {
            addCriterion("product_title like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotLike(String value) {
            addCriterion("product_title not like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIn(List<String> values) {
            addCriterion("product_title in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotIn(List<String> values) {
            addCriterion("product_title not in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleBetween(String value1, String value2) {
            addCriterion("product_title between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotBetween(String value1, String value2) {
            addCriterion("product_title not between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductSellerIsNull() {
            addCriterion("product_seller is null");
            return (Criteria) this;
        }

        public Criteria andProductSellerIsNotNull() {
            addCriterion("product_seller is not null");
            return (Criteria) this;
        }

        public Criteria andProductSellerEqualTo(String value) {
            addCriterion("product_seller =", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerNotEqualTo(String value) {
            addCriterion("product_seller <>", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerGreaterThan(String value) {
            addCriterion("product_seller >", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerGreaterThanOrEqualTo(String value) {
            addCriterion("product_seller >=", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerLessThan(String value) {
            addCriterion("product_seller <", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerLessThanOrEqualTo(String value) {
            addCriterion("product_seller <=", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerLike(String value) {
            addCriterion("product_seller like", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerNotLike(String value) {
            addCriterion("product_seller not like", value, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerIn(List<String> values) {
            addCriterion("product_seller in", values, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerNotIn(List<String> values) {
            addCriterion("product_seller not in", values, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerBetween(String value1, String value2) {
            addCriterion("product_seller between", value1, value2, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductSellerNotBetween(String value1, String value2) {
            addCriterion("product_seller not between", value1, value2, "productSeller");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryIsNull() {
            addCriterion("product_place_of_delivery is null");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryIsNotNull() {
            addCriterion("product_place_of_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryEqualTo(String value) {
            addCriterion("product_place_of_delivery =", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryNotEqualTo(String value) {
            addCriterion("product_place_of_delivery <>", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryGreaterThan(String value) {
            addCriterion("product_place_of_delivery >", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("product_place_of_delivery >=", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryLessThan(String value) {
            addCriterion("product_place_of_delivery <", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryLessThanOrEqualTo(String value) {
            addCriterion("product_place_of_delivery <=", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryLike(String value) {
            addCriterion("product_place_of_delivery like", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryNotLike(String value) {
            addCriterion("product_place_of_delivery not like", value, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryIn(List<String> values) {
            addCriterion("product_place_of_delivery in", values, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryNotIn(List<String> values) {
            addCriterion("product_place_of_delivery not in", values, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryBetween(String value1, String value2) {
            addCriterion("product_place_of_delivery between", value1, value2, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductPlaceOfDeliveryNotBetween(String value1, String value2) {
            addCriterion("product_place_of_delivery not between", value1, value2, "productPlaceOfDelivery");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(String value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(String value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(String value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(String value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(String value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(String value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLike(String value) {
            addCriterion("product_status like", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotLike(String value) {
            addCriterion("product_status not like", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<String> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<String> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(String value1, String value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(String value1, String value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("product_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("product_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(String value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(String value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(String value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(String value) {
            addCriterion("product_weight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(String value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(String value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLike(String value) {
            addCriterion("product_weight like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotLike(String value) {
            addCriterion("product_weight not like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<String> values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<String> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(String value1, String value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(String value1, String value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsIsNull() {
            addCriterion("product_album_pics is null");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsIsNotNull() {
            addCriterion("product_album_pics is not null");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsEqualTo(String value) {
            addCriterion("product_album_pics =", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsNotEqualTo(String value) {
            addCriterion("product_album_pics <>", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsGreaterThan(String value) {
            addCriterion("product_album_pics >", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsGreaterThanOrEqualTo(String value) {
            addCriterion("product_album_pics >=", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsLessThan(String value) {
            addCriterion("product_album_pics <", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsLessThanOrEqualTo(String value) {
            addCriterion("product_album_pics <=", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsLike(String value) {
            addCriterion("product_album_pics like", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsNotLike(String value) {
            addCriterion("product_album_pics not like", value, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsIn(List<String> values) {
            addCriterion("product_album_pics in", values, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsNotIn(List<String> values) {
            addCriterion("product_album_pics not in", values, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsBetween(String value1, String value2) {
            addCriterion("product_album_pics between", value1, value2, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductAlbumPicsNotBetween(String value1, String value2) {
            addCriterion("product_album_pics not between", value1, value2, "productAlbumPics");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIsNull() {
            addCriterion("product_specifications is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIsNotNull() {
            addCriterion("product_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsEqualTo(String value) {
            addCriterion("product_specifications =", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotEqualTo(String value) {
            addCriterion("product_specifications <>", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsGreaterThan(String value) {
            addCriterion("product_specifications >", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("product_specifications >=", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLessThan(String value) {
            addCriterion("product_specifications <", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("product_specifications <=", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsLike(String value) {
            addCriterion("product_specifications like", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotLike(String value) {
            addCriterion("product_specifications not like", value, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsIn(List<String> values) {
            addCriterion("product_specifications in", values, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotIn(List<String> values) {
            addCriterion("product_specifications not in", values, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsBetween(String value1, String value2) {
            addCriterion("product_specifications between", value1, value2, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductSpecificationsNotBetween(String value1, String value2) {
            addCriterion("product_specifications not between", value1, value2, "productSpecifications");
            return (Criteria) this;
        }

        public Criteria andProductCreditIsNull() {
            addCriterion("product_credit is null");
            return (Criteria) this;
        }

        public Criteria andProductCreditIsNotNull() {
            addCriterion("product_credit is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreditEqualTo(String value) {
            addCriterion("product_credit =", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditNotEqualTo(String value) {
            addCriterion("product_credit <>", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditGreaterThan(String value) {
            addCriterion("product_credit >", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditGreaterThanOrEqualTo(String value) {
            addCriterion("product_credit >=", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditLessThan(String value) {
            addCriterion("product_credit <", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditLessThanOrEqualTo(String value) {
            addCriterion("product_credit <=", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditLike(String value) {
            addCriterion("product_credit like", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditNotLike(String value) {
            addCriterion("product_credit not like", value, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditIn(List<String> values) {
            addCriterion("product_credit in", values, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditNotIn(List<String> values) {
            addCriterion("product_credit not in", values, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditBetween(String value1, String value2) {
            addCriterion("product_credit between", value1, value2, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductCreditNotBetween(String value1, String value2) {
            addCriterion("product_credit not between", value1, value2, "productCredit");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsIsNull() {
            addCriterion("product_service_ids is null");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsIsNotNull() {
            addCriterion("product_service_ids is not null");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsEqualTo(String value) {
            addCriterion("product_service_ids =", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsNotEqualTo(String value) {
            addCriterion("product_service_ids <>", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsGreaterThan(String value) {
            addCriterion("product_service_ids >", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsGreaterThanOrEqualTo(String value) {
            addCriterion("product_service_ids >=", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsLessThan(String value) {
            addCriterion("product_service_ids <", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsLessThanOrEqualTo(String value) {
            addCriterion("product_service_ids <=", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsLike(String value) {
            addCriterion("product_service_ids like", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsNotLike(String value) {
            addCriterion("product_service_ids not like", value, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsIn(List<String> values) {
            addCriterion("product_service_ids in", values, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsNotIn(List<String> values) {
            addCriterion("product_service_ids not in", values, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsBetween(String value1, String value2) {
            addCriterion("product_service_ids between", value1, value2, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductServiceIdsNotBetween(String value1, String value2) {
            addCriterion("product_service_ids not between", value1, value2, "productServiceIds");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsIsNull() {
            addCriterion("product_detail_pics is null");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsIsNotNull() {
            addCriterion("product_detail_pics is not null");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsEqualTo(String value) {
            addCriterion("product_detail_pics =", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsNotEqualTo(String value) {
            addCriterion("product_detail_pics <>", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsGreaterThan(String value) {
            addCriterion("product_detail_pics >", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsGreaterThanOrEqualTo(String value) {
            addCriterion("product_detail_pics >=", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsLessThan(String value) {
            addCriterion("product_detail_pics <", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsLessThanOrEqualTo(String value) {
            addCriterion("product_detail_pics <=", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsLike(String value) {
            addCriterion("product_detail_pics like", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsNotLike(String value) {
            addCriterion("product_detail_pics not like", value, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsIn(List<String> values) {
            addCriterion("product_detail_pics in", values, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsNotIn(List<String> values) {
            addCriterion("product_detail_pics not in", values, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsBetween(String value1, String value2) {
            addCriterion("product_detail_pics between", value1, value2, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDetailPicsNotBetween(String value1, String value2) {
            addCriterion("product_detail_pics not between", value1, value2, "productDetailPics");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("product_description is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("product_description is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("product_description =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("product_description <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("product_description >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("product_description >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("product_description <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("product_description <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("product_description like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("product_description not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("product_description in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("product_description not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("product_description between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("product_description not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductIconIsNull() {
            addCriterion("product_icon is null");
            return (Criteria) this;
        }

        public Criteria andProductIconIsNotNull() {
            addCriterion("product_icon is not null");
            return (Criteria) this;
        }

        public Criteria andProductIconEqualTo(String value) {
            addCriterion("product_icon =", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotEqualTo(String value) {
            addCriterion("product_icon <>", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconGreaterThan(String value) {
            addCriterion("product_icon >", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconGreaterThanOrEqualTo(String value) {
            addCriterion("product_icon >=", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconLessThan(String value) {
            addCriterion("product_icon <", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconLessThanOrEqualTo(String value) {
            addCriterion("product_icon <=", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconLike(String value) {
            addCriterion("product_icon like", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotLike(String value) {
            addCriterion("product_icon not like", value, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconIn(List<String> values) {
            addCriterion("product_icon in", values, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotIn(List<String> values) {
            addCriterion("product_icon not in", values, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconBetween(String value1, String value2) {
            addCriterion("product_icon between", value1, value2, "productIcon");
            return (Criteria) this;
        }

        public Criteria andProductIconNotBetween(String value1, String value2) {
            addCriterion("product_icon not between", value1, value2, "productIcon");
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