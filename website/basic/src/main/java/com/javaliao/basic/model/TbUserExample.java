package com.javaliao.basic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNull() {
            addCriterion("user_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNotNull() {
            addCriterion("user_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameEqualTo(String value) {
            addCriterion("user_nick_name =", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotEqualTo(String value) {
            addCriterion("user_nick_name <>", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThan(String value) {
            addCriterion("user_nick_name >", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick_name >=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThan(String value) {
            addCriterion("user_nick_name <", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("user_nick_name <=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLike(String value) {
            addCriterion("user_nick_name like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotLike(String value) {
            addCriterion("user_nick_name not like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIn(List<String> values) {
            addCriterion("user_nick_name in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotIn(List<String> values) {
            addCriterion("user_nick_name not in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameBetween(String value1, String value2) {
            addCriterion("user_nick_name between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotBetween(String value1, String value2) {
            addCriterion("user_nick_name not between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserRankIsNull() {
            addCriterion("user_rank is null");
            return (Criteria) this;
        }

        public Criteria andUserRankIsNotNull() {
            addCriterion("user_rank is not null");
            return (Criteria) this;
        }

        public Criteria andUserRankEqualTo(String value) {
            addCriterion("user_rank =", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankNotEqualTo(String value) {
            addCriterion("user_rank <>", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankGreaterThan(String value) {
            addCriterion("user_rank >", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankGreaterThanOrEqualTo(String value) {
            addCriterion("user_rank >=", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankLessThan(String value) {
            addCriterion("user_rank <", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankLessThanOrEqualTo(String value) {
            addCriterion("user_rank <=", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankLike(String value) {
            addCriterion("user_rank like", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankNotLike(String value) {
            addCriterion("user_rank not like", value, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankIn(List<String> values) {
            addCriterion("user_rank in", values, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankNotIn(List<String> values) {
            addCriterion("user_rank not in", values, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankBetween(String value1, String value2) {
            addCriterion("user_rank between", value1, value2, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserRankNotBetween(String value1, String value2) {
            addCriterion("user_rank not between", value1, value2, "userRank");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsIsNull() {
            addCriterion("user_accumulate_points is null");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsIsNotNull() {
            addCriterion("user_accumulate_points is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsEqualTo(String value) {
            addCriterion("user_accumulate_points =", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsNotEqualTo(String value) {
            addCriterion("user_accumulate_points <>", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsGreaterThan(String value) {
            addCriterion("user_accumulate_points >", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsGreaterThanOrEqualTo(String value) {
            addCriterion("user_accumulate_points >=", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsLessThan(String value) {
            addCriterion("user_accumulate_points <", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsLessThanOrEqualTo(String value) {
            addCriterion("user_accumulate_points <=", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsLike(String value) {
            addCriterion("user_accumulate_points like", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsNotLike(String value) {
            addCriterion("user_accumulate_points not like", value, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsIn(List<String> values) {
            addCriterion("user_accumulate_points in", values, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsNotIn(List<String> values) {
            addCriterion("user_accumulate_points not in", values, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsBetween(String value1, String value2) {
            addCriterion("user_accumulate_points between", value1, value2, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserAccumulatePointsNotBetween(String value1, String value2) {
            addCriterion("user_accumulate_points not between", value1, value2, "userAccumulatePoints");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserIconIsNull() {
            addCriterion("user_icon is null");
            return (Criteria) this;
        }

        public Criteria andUserIconIsNotNull() {
            addCriterion("user_icon is not null");
            return (Criteria) this;
        }

        public Criteria andUserIconEqualTo(String value) {
            addCriterion("user_icon =", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotEqualTo(String value) {
            addCriterion("user_icon <>", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconGreaterThan(String value) {
            addCriterion("user_icon >", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconGreaterThanOrEqualTo(String value) {
            addCriterion("user_icon >=", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLessThan(String value) {
            addCriterion("user_icon <", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLessThanOrEqualTo(String value) {
            addCriterion("user_icon <=", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconLike(String value) {
            addCriterion("user_icon like", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotLike(String value) {
            addCriterion("user_icon not like", value, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconIn(List<String> values) {
            addCriterion("user_icon in", values, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotIn(List<String> values) {
            addCriterion("user_icon not in", values, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconBetween(String value1, String value2) {
            addCriterion("user_icon between", value1, value2, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserIconNotBetween(String value1, String value2) {
            addCriterion("user_icon not between", value1, value2, "userIcon");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNull() {
            addCriterion("user_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNotNull() {
            addCriterion("user_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardEqualTo(String value) {
            addCriterion("user_idcard =", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotEqualTo(String value) {
            addCriterion("user_idcard <>", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThan(String value) {
            addCriterion("user_idcard >", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("user_idcard >=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThan(String value) {
            addCriterion("user_idcard <", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThanOrEqualTo(String value) {
            addCriterion("user_idcard <=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLike(String value) {
            addCriterion("user_idcard like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotLike(String value) {
            addCriterion("user_idcard not like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIn(List<String> values) {
            addCriterion("user_idcard in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotIn(List<String> values) {
            addCriterion("user_idcard not in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardBetween(String value1, String value2) {
            addCriterion("user_idcard between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotBetween(String value1, String value2) {
            addCriterion("user_idcard not between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemIsNull() {
            addCriterion("secret_protection_problem is null");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemIsNotNull() {
            addCriterion("secret_protection_problem is not null");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemEqualTo(String value) {
            addCriterion("secret_protection_problem =", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemNotEqualTo(String value) {
            addCriterion("secret_protection_problem <>", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemGreaterThan(String value) {
            addCriterion("secret_protection_problem >", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemGreaterThanOrEqualTo(String value) {
            addCriterion("secret_protection_problem >=", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemLessThan(String value) {
            addCriterion("secret_protection_problem <", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemLessThanOrEqualTo(String value) {
            addCriterion("secret_protection_problem <=", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemLike(String value) {
            addCriterion("secret_protection_problem like", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemNotLike(String value) {
            addCriterion("secret_protection_problem not like", value, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemIn(List<String> values) {
            addCriterion("secret_protection_problem in", values, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemNotIn(List<String> values) {
            addCriterion("secret_protection_problem not in", values, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemBetween(String value1, String value2) {
            addCriterion("secret_protection_problem between", value1, value2, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionProblemNotBetween(String value1, String value2) {
            addCriterion("secret_protection_problem not between", value1, value2, "secretProtectionProblem");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerIsNull() {
            addCriterion("secret_protection_answer is null");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerIsNotNull() {
            addCriterion("secret_protection_answer is not null");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerEqualTo(String value) {
            addCriterion("secret_protection_answer =", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerNotEqualTo(String value) {
            addCriterion("secret_protection_answer <>", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerGreaterThan(String value) {
            addCriterion("secret_protection_answer >", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("secret_protection_answer >=", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerLessThan(String value) {
            addCriterion("secret_protection_answer <", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerLessThanOrEqualTo(String value) {
            addCriterion("secret_protection_answer <=", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerLike(String value) {
            addCriterion("secret_protection_answer like", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerNotLike(String value) {
            addCriterion("secret_protection_answer not like", value, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerIn(List<String> values) {
            addCriterion("secret_protection_answer in", values, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerNotIn(List<String> values) {
            addCriterion("secret_protection_answer not in", values, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerBetween(String value1, String value2) {
            addCriterion("secret_protection_answer between", value1, value2, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andSecretProtectionAnswerNotBetween(String value1, String value2) {
            addCriterion("secret_protection_answer not between", value1, value2, "secretProtectionAnswer");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(String value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(String value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(String value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(String value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(String value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLike(String value) {
            addCriterion("account_status like", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotLike(String value) {
            addCriterion("account_status not like", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<String> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<String> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(String value1, String value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(String value1, String value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andPositiveImgIsNull() {
            addCriterion("positive_img is null");
            return (Criteria) this;
        }

        public Criteria andPositiveImgIsNotNull() {
            addCriterion("positive_img is not null");
            return (Criteria) this;
        }

        public Criteria andPositiveImgEqualTo(String value) {
            addCriterion("positive_img =", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgNotEqualTo(String value) {
            addCriterion("positive_img <>", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgGreaterThan(String value) {
            addCriterion("positive_img >", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgGreaterThanOrEqualTo(String value) {
            addCriterion("positive_img >=", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgLessThan(String value) {
            addCriterion("positive_img <", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgLessThanOrEqualTo(String value) {
            addCriterion("positive_img <=", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgLike(String value) {
            addCriterion("positive_img like", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgNotLike(String value) {
            addCriterion("positive_img not like", value, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgIn(List<String> values) {
            addCriterion("positive_img in", values, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgNotIn(List<String> values) {
            addCriterion("positive_img not in", values, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgBetween(String value1, String value2) {
            addCriterion("positive_img between", value1, value2, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andPositiveImgNotBetween(String value1, String value2) {
            addCriterion("positive_img not between", value1, value2, "positiveImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgIsNull() {
            addCriterion("opposite_img is null");
            return (Criteria) this;
        }

        public Criteria andOppositeImgIsNotNull() {
            addCriterion("opposite_img is not null");
            return (Criteria) this;
        }

        public Criteria andOppositeImgEqualTo(String value) {
            addCriterion("opposite_img =", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgNotEqualTo(String value) {
            addCriterion("opposite_img <>", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgGreaterThan(String value) {
            addCriterion("opposite_img >", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgGreaterThanOrEqualTo(String value) {
            addCriterion("opposite_img >=", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgLessThan(String value) {
            addCriterion("opposite_img <", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgLessThanOrEqualTo(String value) {
            addCriterion("opposite_img <=", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgLike(String value) {
            addCriterion("opposite_img like", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgNotLike(String value) {
            addCriterion("opposite_img not like", value, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgIn(List<String> values) {
            addCriterion("opposite_img in", values, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgNotIn(List<String> values) {
            addCriterion("opposite_img not in", values, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgBetween(String value1, String value2) {
            addCriterion("opposite_img between", value1, value2, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOppositeImgNotBetween(String value1, String value2) {
            addCriterion("opposite_img not between", value1, value2, "oppositeImg");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andIsCertificationIsNull() {
            addCriterion("is_certification is null");
            return (Criteria) this;
        }

        public Criteria andIsCertificationIsNotNull() {
            addCriterion("is_certification is not null");
            return (Criteria) this;
        }

        public Criteria andIsCertificationEqualTo(String value) {
            addCriterion("is_certification =", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotEqualTo(String value) {
            addCriterion("is_certification <>", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationGreaterThan(String value) {
            addCriterion("is_certification >", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationGreaterThanOrEqualTo(String value) {
            addCriterion("is_certification >=", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationLessThan(String value) {
            addCriterion("is_certification <", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationLessThanOrEqualTo(String value) {
            addCriterion("is_certification <=", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationLike(String value) {
            addCriterion("is_certification like", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotLike(String value) {
            addCriterion("is_certification not like", value, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationIn(List<String> values) {
            addCriterion("is_certification in", values, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotIn(List<String> values) {
            addCriterion("is_certification not in", values, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationBetween(String value1, String value2) {
            addCriterion("is_certification between", value1, value2, "isCertification");
            return (Criteria) this;
        }

        public Criteria andIsCertificationNotBetween(String value1, String value2) {
            addCriterion("is_certification not between", value1, value2, "isCertification");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIsNull() {
            addCriterion("qq_open_id is null");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIsNotNull() {
            addCriterion("qq_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdEqualTo(String value) {
            addCriterion("qq_open_id =", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotEqualTo(String value) {
            addCriterion("qq_open_id <>", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdGreaterThan(String value) {
            addCriterion("qq_open_id >", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("qq_open_id >=", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLessThan(String value) {
            addCriterion("qq_open_id <", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLessThanOrEqualTo(String value) {
            addCriterion("qq_open_id <=", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLike(String value) {
            addCriterion("qq_open_id like", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotLike(String value) {
            addCriterion("qq_open_id not like", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIn(List<String> values) {
            addCriterion("qq_open_id in", values, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotIn(List<String> values) {
            addCriterion("qq_open_id not in", values, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdBetween(String value1, String value2) {
            addCriterion("qq_open_id between", value1, value2, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotBetween(String value1, String value2) {
            addCriterion("qq_open_id not between", value1, value2, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdIsNull() {
            addCriterion("weixin_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdIsNotNull() {
            addCriterion("weixin_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdEqualTo(String value) {
            addCriterion("weixin_open_id =", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdNotEqualTo(String value) {
            addCriterion("weixin_open_id <>", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdGreaterThan(String value) {
            addCriterion("weixin_open_id >", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_open_id >=", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdLessThan(String value) {
            addCriterion("weixin_open_id <", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdLessThanOrEqualTo(String value) {
            addCriterion("weixin_open_id <=", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdLike(String value) {
            addCriterion("weixin_open_id like", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdNotLike(String value) {
            addCriterion("weixin_open_id not like", value, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdIn(List<String> values) {
            addCriterion("weixin_open_id in", values, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdNotIn(List<String> values) {
            addCriterion("weixin_open_id not in", values, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdBetween(String value1, String value2) {
            addCriterion("weixin_open_id between", value1, value2, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinOpenIdNotBetween(String value1, String value2) {
            addCriterion("weixin_open_id not between", value1, value2, "weixinOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdIsNull() {
            addCriterion("weixin_lite_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdIsNotNull() {
            addCriterion("weixin_lite_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdEqualTo(String value) {
            addCriterion("weixin_lite_open_id =", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdNotEqualTo(String value) {
            addCriterion("weixin_lite_open_id <>", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdGreaterThan(String value) {
            addCriterion("weixin_lite_open_id >", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_lite_open_id >=", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdLessThan(String value) {
            addCriterion("weixin_lite_open_id <", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdLessThanOrEqualTo(String value) {
            addCriterion("weixin_lite_open_id <=", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdLike(String value) {
            addCriterion("weixin_lite_open_id like", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdNotLike(String value) {
            addCriterion("weixin_lite_open_id not like", value, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdIn(List<String> values) {
            addCriterion("weixin_lite_open_id in", values, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdNotIn(List<String> values) {
            addCriterion("weixin_lite_open_id not in", values, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdBetween(String value1, String value2) {
            addCriterion("weixin_lite_open_id between", value1, value2, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinLiteOpenIdNotBetween(String value1, String value2) {
            addCriterion("weixin_lite_open_id not between", value1, value2, "weixinLiteOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdIsNull() {
            addCriterion("weixin_app_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdIsNotNull() {
            addCriterion("weixin_app_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdEqualTo(String value) {
            addCriterion("weixin_app_open_id =", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdNotEqualTo(String value) {
            addCriterion("weixin_app_open_id <>", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdGreaterThan(String value) {
            addCriterion("weixin_app_open_id >", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_app_open_id >=", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdLessThan(String value) {
            addCriterion("weixin_app_open_id <", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdLessThanOrEqualTo(String value) {
            addCriterion("weixin_app_open_id <=", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdLike(String value) {
            addCriterion("weixin_app_open_id like", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdNotLike(String value) {
            addCriterion("weixin_app_open_id not like", value, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdIn(List<String> values) {
            addCriterion("weixin_app_open_id in", values, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdNotIn(List<String> values) {
            addCriterion("weixin_app_open_id not in", values, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdBetween(String value1, String value2) {
            addCriterion("weixin_app_open_id between", value1, value2, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeixinAppOpenIdNotBetween(String value1, String value2) {
            addCriterion("weixin_app_open_id not between", value1, value2, "weixinAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdIsNull() {
            addCriterion("alipay_app_open_id is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdIsNotNull() {
            addCriterion("alipay_app_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdEqualTo(String value) {
            addCriterion("alipay_app_open_id =", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdNotEqualTo(String value) {
            addCriterion("alipay_app_open_id <>", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdGreaterThan(String value) {
            addCriterion("alipay_app_open_id >", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_app_open_id >=", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdLessThan(String value) {
            addCriterion("alipay_app_open_id <", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdLessThanOrEqualTo(String value) {
            addCriterion("alipay_app_open_id <=", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdLike(String value) {
            addCriterion("alipay_app_open_id like", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdNotLike(String value) {
            addCriterion("alipay_app_open_id not like", value, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdIn(List<String> values) {
            addCriterion("alipay_app_open_id in", values, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdNotIn(List<String> values) {
            addCriterion("alipay_app_open_id not in", values, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdBetween(String value1, String value2) {
            addCriterion("alipay_app_open_id between", value1, value2, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andAlipayAppOpenIdNotBetween(String value1, String value2) {
            addCriterion("alipay_app_open_id not between", value1, value2, "alipayAppOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdIsNull() {
            addCriterion("weibo_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdIsNotNull() {
            addCriterion("weibo_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdEqualTo(String value) {
            addCriterion("weibo_open_id =", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdNotEqualTo(String value) {
            addCriterion("weibo_open_id <>", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdGreaterThan(String value) {
            addCriterion("weibo_open_id >", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_open_id >=", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdLessThan(String value) {
            addCriterion("weibo_open_id <", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdLessThanOrEqualTo(String value) {
            addCriterion("weibo_open_id <=", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdLike(String value) {
            addCriterion("weibo_open_id like", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdNotLike(String value) {
            addCriterion("weibo_open_id not like", value, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdIn(List<String> values) {
            addCriterion("weibo_open_id in", values, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdNotIn(List<String> values) {
            addCriterion("weibo_open_id not in", values, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdBetween(String value1, String value2) {
            addCriterion("weibo_open_id between", value1, value2, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andWeiboOpenIdNotBetween(String value1, String value2) {
            addCriterion("weibo_open_id not between", value1, value2, "weiboOpenId");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeIsNull() {
            addCriterion("account_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeIsNotNull() {
            addCriterion("account_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeEqualTo(Date value) {
            addCriterion("account_create_time =", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeNotEqualTo(Date value) {
            addCriterion("account_create_time <>", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeGreaterThan(Date value) {
            addCriterion("account_create_time >", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_create_time >=", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeLessThan(Date value) {
            addCriterion("account_create_time <", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_create_time <=", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeIn(List<Date> values) {
            addCriterion("account_create_time in", values, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeNotIn(List<Date> values) {
            addCriterion("account_create_time not in", values, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeBetween(Date value1, Date value2) {
            addCriterion("account_create_time between", value1, value2, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_create_time not between", value1, value2, "accountCreateTime");
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