package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSellerExample() {
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

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelIsNull() {
            addCriterion("seller_credit_level is null");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelIsNotNull() {
            addCriterion("seller_credit_level is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelEqualTo(String value) {
            addCriterion("seller_credit_level =", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelNotEqualTo(String value) {
            addCriterion("seller_credit_level <>", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelGreaterThan(String value) {
            addCriterion("seller_credit_level >", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelGreaterThanOrEqualTo(String value) {
            addCriterion("seller_credit_level >=", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelLessThan(String value) {
            addCriterion("seller_credit_level <", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelLessThanOrEqualTo(String value) {
            addCriterion("seller_credit_level <=", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelLike(String value) {
            addCriterion("seller_credit_level like", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelNotLike(String value) {
            addCriterion("seller_credit_level not like", value, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelIn(List<String> values) {
            addCriterion("seller_credit_level in", values, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelNotIn(List<String> values) {
            addCriterion("seller_credit_level not in", values, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelBetween(String value1, String value2) {
            addCriterion("seller_credit_level between", value1, value2, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andSellerCreditLevelNotBetween(String value1, String value2) {
            addCriterion("seller_credit_level not between", value1, value2, "sellerCreditLevel");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameIsNull() {
            addCriterion("liaison_name is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameIsNotNull() {
            addCriterion("liaison_name is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameEqualTo(String value) {
            addCriterion("liaison_name =", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameNotEqualTo(String value) {
            addCriterion("liaison_name <>", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameGreaterThan(String value) {
            addCriterion("liaison_name >", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameGreaterThanOrEqualTo(String value) {
            addCriterion("liaison_name >=", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameLessThan(String value) {
            addCriterion("liaison_name <", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameLessThanOrEqualTo(String value) {
            addCriterion("liaison_name <=", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameLike(String value) {
            addCriterion("liaison_name like", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameNotLike(String value) {
            addCriterion("liaison_name not like", value, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameIn(List<String> values) {
            addCriterion("liaison_name in", values, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameNotIn(List<String> values) {
            addCriterion("liaison_name not in", values, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameBetween(String value1, String value2) {
            addCriterion("liaison_name between", value1, value2, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonNameNotBetween(String value1, String value2) {
            addCriterion("liaison_name not between", value1, value2, "liaisonName");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartIsNull() {
            addCriterion("liaison_wechart is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartIsNotNull() {
            addCriterion("liaison_wechart is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartEqualTo(String value) {
            addCriterion("liaison_wechart =", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartNotEqualTo(String value) {
            addCriterion("liaison_wechart <>", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartGreaterThan(String value) {
            addCriterion("liaison_wechart >", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartGreaterThanOrEqualTo(String value) {
            addCriterion("liaison_wechart >=", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartLessThan(String value) {
            addCriterion("liaison_wechart <", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartLessThanOrEqualTo(String value) {
            addCriterion("liaison_wechart <=", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartLike(String value) {
            addCriterion("liaison_wechart like", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartNotLike(String value) {
            addCriterion("liaison_wechart not like", value, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartIn(List<String> values) {
            addCriterion("liaison_wechart in", values, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartNotIn(List<String> values) {
            addCriterion("liaison_wechart not in", values, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartBetween(String value1, String value2) {
            addCriterion("liaison_wechart between", value1, value2, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonWechartNotBetween(String value1, String value2) {
            addCriterion("liaison_wechart not between", value1, value2, "liaisonWechart");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneIsNull() {
            addCriterion("liaison_phone is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneIsNotNull() {
            addCriterion("liaison_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneEqualTo(String value) {
            addCriterion("liaison_phone =", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneNotEqualTo(String value) {
            addCriterion("liaison_phone <>", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneGreaterThan(String value) {
            addCriterion("liaison_phone >", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("liaison_phone >=", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneLessThan(String value) {
            addCriterion("liaison_phone <", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneLessThanOrEqualTo(String value) {
            addCriterion("liaison_phone <=", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneLike(String value) {
            addCriterion("liaison_phone like", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneNotLike(String value) {
            addCriterion("liaison_phone not like", value, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneIn(List<String> values) {
            addCriterion("liaison_phone in", values, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneNotIn(List<String> values) {
            addCriterion("liaison_phone not in", values, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneBetween(String value1, String value2) {
            addCriterion("liaison_phone between", value1, value2, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonPhoneNotBetween(String value1, String value2) {
            addCriterion("liaison_phone not between", value1, value2, "liaisonPhone");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailIsNull() {
            addCriterion("liaison_email is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailIsNotNull() {
            addCriterion("liaison_email is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailEqualTo(String value) {
            addCriterion("liaison_email =", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailNotEqualTo(String value) {
            addCriterion("liaison_email <>", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailGreaterThan(String value) {
            addCriterion("liaison_email >", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailGreaterThanOrEqualTo(String value) {
            addCriterion("liaison_email >=", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailLessThan(String value) {
            addCriterion("liaison_email <", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailLessThanOrEqualTo(String value) {
            addCriterion("liaison_email <=", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailLike(String value) {
            addCriterion("liaison_email like", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailNotLike(String value) {
            addCriterion("liaison_email not like", value, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailIn(List<String> values) {
            addCriterion("liaison_email in", values, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailNotIn(List<String> values) {
            addCriterion("liaison_email not in", values, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailBetween(String value1, String value2) {
            addCriterion("liaison_email between", value1, value2, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andLiaisonEmailNotBetween(String value1, String value2) {
            addCriterion("liaison_email not between", value1, value2, "liaisonEmail");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusIsNull() {
            addCriterion("account_number_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusIsNotNull() {
            addCriterion("account_number_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusEqualTo(String value) {
            addCriterion("account_number_status =", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusNotEqualTo(String value) {
            addCriterion("account_number_status <>", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusGreaterThan(String value) {
            addCriterion("account_number_status >", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusGreaterThanOrEqualTo(String value) {
            addCriterion("account_number_status >=", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusLessThan(String value) {
            addCriterion("account_number_status <", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusLessThanOrEqualTo(String value) {
            addCriterion("account_number_status <=", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusLike(String value) {
            addCriterion("account_number_status like", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusNotLike(String value) {
            addCriterion("account_number_status not like", value, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusIn(List<String> values) {
            addCriterion("account_number_status in", values, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusNotIn(List<String> values) {
            addCriterion("account_number_status not in", values, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusBetween(String value1, String value2) {
            addCriterion("account_number_status between", value1, value2, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStatusNotBetween(String value1, String value2) {
            addCriterion("account_number_status not between", value1, value2, "accountNumberStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberIsNull() {
            addCriterion("tax_number is null");
            return (Criteria) this;
        }

        public Criteria andTaxNumberIsNotNull() {
            addCriterion("tax_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNumberEqualTo(String value) {
            addCriterion("tax_number =", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotEqualTo(String value) {
            addCriterion("tax_number <>", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberGreaterThan(String value) {
            addCriterion("tax_number >", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tax_number >=", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberLessThan(String value) {
            addCriterion("tax_number <", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberLessThanOrEqualTo(String value) {
            addCriterion("tax_number <=", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberLike(String value) {
            addCriterion("tax_number like", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotLike(String value) {
            addCriterion("tax_number not like", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberIn(List<String> values) {
            addCriterion("tax_number in", values, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotIn(List<String> values) {
            addCriterion("tax_number not in", values, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberBetween(String value1, String value2) {
            addCriterion("tax_number between", value1, value2, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotBetween(String value1, String value2) {
            addCriterion("tax_number not between", value1, value2, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andBankUserNameIsNull() {
            addCriterion("bank_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBankUserNameIsNotNull() {
            addCriterion("bank_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankUserNameEqualTo(String value) {
            addCriterion("bank_user_name =", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotEqualTo(String value) {
            addCriterion("bank_user_name <>", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameGreaterThan(String value) {
            addCriterion("bank_user_name >", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_user_name >=", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameLessThan(String value) {
            addCriterion("bank_user_name <", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameLessThanOrEqualTo(String value) {
            addCriterion("bank_user_name <=", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameLike(String value) {
            addCriterion("bank_user_name like", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotLike(String value) {
            addCriterion("bank_user_name not like", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameIn(List<String> values) {
            addCriterion("bank_user_name in", values, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotIn(List<String> values) {
            addCriterion("bank_user_name not in", values, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameBetween(String value1, String value2) {
            addCriterion("bank_user_name between", value1, value2, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotBetween(String value1, String value2) {
            addCriterion("bank_user_name not between", value1, value2, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdIsNull() {
            addCriterion("legal_person_card_id is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdIsNotNull() {
            addCriterion("legal_person_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdEqualTo(String value) {
            addCriterion("legal_person_card_id =", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdNotEqualTo(String value) {
            addCriterion("legal_person_card_id <>", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdGreaterThan(String value) {
            addCriterion("legal_person_card_id >", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_card_id >=", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdLessThan(String value) {
            addCriterion("legal_person_card_id <", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdLessThanOrEqualTo(String value) {
            addCriterion("legal_person_card_id <=", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdLike(String value) {
            addCriterion("legal_person_card_id like", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdNotLike(String value) {
            addCriterion("legal_person_card_id not like", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdIn(List<String> values) {
            addCriterion("legal_person_card_id in", values, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdNotIn(List<String> values) {
            addCriterion("legal_person_card_id not in", values, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdBetween(String value1, String value2) {
            addCriterion("legal_person_card_id between", value1, value2, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdNotBetween(String value1, String value2) {
            addCriterion("legal_person_card_id not between", value1, value2, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdIsNull() {
            addCriterion("cities_id is null");
            return (Criteria) this;
        }

        public Criteria andCitiesIdIsNotNull() {
            addCriterion("cities_id is not null");
            return (Criteria) this;
        }

        public Criteria andCitiesIdEqualTo(Long value) {
            addCriterion("cities_id =", value, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdNotEqualTo(Long value) {
            addCriterion("cities_id <>", value, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdGreaterThan(Long value) {
            addCriterion("cities_id >", value, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cities_id >=", value, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdLessThan(Long value) {
            addCriterion("cities_id <", value, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdLessThanOrEqualTo(Long value) {
            addCriterion("cities_id <=", value, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdIn(List<Long> values) {
            addCriterion("cities_id in", values, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdNotIn(List<Long> values) {
            addCriterion("cities_id not in", values, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdBetween(Long value1, Long value2) {
            addCriterion("cities_id between", value1, value2, "citiesId");
            return (Criteria) this;
        }

        public Criteria andCitiesIdNotBetween(Long value1, Long value2) {
            addCriterion("cities_id not between", value1, value2, "citiesId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressIsNull() {
            addCriterion("seller_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressIsNotNull() {
            addCriterion("seller_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressEqualTo(String value) {
            addCriterion("seller_detail_address =", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressNotEqualTo(String value) {
            addCriterion("seller_detail_address <>", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressGreaterThan(String value) {
            addCriterion("seller_detail_address >", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("seller_detail_address >=", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressLessThan(String value) {
            addCriterion("seller_detail_address <", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("seller_detail_address <=", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressLike(String value) {
            addCriterion("seller_detail_address like", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressNotLike(String value) {
            addCriterion("seller_detail_address not like", value, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressIn(List<String> values) {
            addCriterion("seller_detail_address in", values, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressNotIn(List<String> values) {
            addCriterion("seller_detail_address not in", values, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressBetween(String value1, String value2) {
            addCriterion("seller_detail_address between", value1, value2, "sellerDetailAddress");
            return (Criteria) this;
        }

        public Criteria andSellerDetailAddressNotBetween(String value1, String value2) {
            addCriterion("seller_detail_address not between", value1, value2, "sellerDetailAddress");
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