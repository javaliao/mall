package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLogVisitStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLogVisitStatisticsExample() {
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

        public Criteria andLogVisitIdIsNull() {
            addCriterion("log_visit_id is null");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdIsNotNull() {
            addCriterion("log_visit_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdEqualTo(Long value) {
            addCriterion("log_visit_id =", value, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdNotEqualTo(Long value) {
            addCriterion("log_visit_id <>", value, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdGreaterThan(Long value) {
            addCriterion("log_visit_id >", value, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("log_visit_id >=", value, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdLessThan(Long value) {
            addCriterion("log_visit_id <", value, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdLessThanOrEqualTo(Long value) {
            addCriterion("log_visit_id <=", value, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdIn(List<Long> values) {
            addCriterion("log_visit_id in", values, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdNotIn(List<Long> values) {
            addCriterion("log_visit_id not in", values, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdBetween(Long value1, Long value2) {
            addCriterion("log_visit_id between", value1, value2, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andLogVisitIdNotBetween(Long value1, Long value2) {
            addCriterion("log_visit_id not between", value1, value2, "logVisitId");
            return (Criteria) this;
        }

        public Criteria andVisitMethodIsNull() {
            addCriterion("visit_method is null");
            return (Criteria) this;
        }

        public Criteria andVisitMethodIsNotNull() {
            addCriterion("visit_method is not null");
            return (Criteria) this;
        }

        public Criteria andVisitMethodEqualTo(String value) {
            addCriterion("visit_method =", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotEqualTo(String value) {
            addCriterion("visit_method <>", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodGreaterThan(String value) {
            addCriterion("visit_method >", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodGreaterThanOrEqualTo(String value) {
            addCriterion("visit_method >=", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodLessThan(String value) {
            addCriterion("visit_method <", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodLessThanOrEqualTo(String value) {
            addCriterion("visit_method <=", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodLike(String value) {
            addCriterion("visit_method like", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotLike(String value) {
            addCriterion("visit_method not like", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodIn(List<String> values) {
            addCriterion("visit_method in", values, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotIn(List<String> values) {
            addCriterion("visit_method not in", values, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodBetween(String value1, String value2) {
            addCriterion("visit_method between", value1, value2, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotBetween(String value1, String value2) {
            addCriterion("visit_method not between", value1, value2, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitParamsIsNull() {
            addCriterion("visit_params is null");
            return (Criteria) this;
        }

        public Criteria andVisitParamsIsNotNull() {
            addCriterion("visit_params is not null");
            return (Criteria) this;
        }

        public Criteria andVisitParamsEqualTo(String value) {
            addCriterion("visit_params =", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsNotEqualTo(String value) {
            addCriterion("visit_params <>", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsGreaterThan(String value) {
            addCriterion("visit_params >", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsGreaterThanOrEqualTo(String value) {
            addCriterion("visit_params >=", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsLessThan(String value) {
            addCriterion("visit_params <", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsLessThanOrEqualTo(String value) {
            addCriterion("visit_params <=", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsLike(String value) {
            addCriterion("visit_params like", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsNotLike(String value) {
            addCriterion("visit_params not like", value, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsIn(List<String> values) {
            addCriterion("visit_params in", values, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsNotIn(List<String> values) {
            addCriterion("visit_params not in", values, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsBetween(String value1, String value2) {
            addCriterion("visit_params between", value1, value2, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitParamsNotBetween(String value1, String value2) {
            addCriterion("visit_params not between", value1, value2, "visitParams");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroIsNull() {
            addCriterion("visit_throwing_erro is null");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroIsNotNull() {
            addCriterion("visit_throwing_erro is not null");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroEqualTo(String value) {
            addCriterion("visit_throwing_erro =", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroNotEqualTo(String value) {
            addCriterion("visit_throwing_erro <>", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroGreaterThan(String value) {
            addCriterion("visit_throwing_erro >", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroGreaterThanOrEqualTo(String value) {
            addCriterion("visit_throwing_erro >=", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroLessThan(String value) {
            addCriterion("visit_throwing_erro <", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroLessThanOrEqualTo(String value) {
            addCriterion("visit_throwing_erro <=", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroLike(String value) {
            addCriterion("visit_throwing_erro like", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroNotLike(String value) {
            addCriterion("visit_throwing_erro not like", value, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroIn(List<String> values) {
            addCriterion("visit_throwing_erro in", values, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroNotIn(List<String> values) {
            addCriterion("visit_throwing_erro not in", values, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroBetween(String value1, String value2) {
            addCriterion("visit_throwing_erro between", value1, value2, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitThrowingErroNotBetween(String value1, String value2) {
            addCriterion("visit_throwing_erro not between", value1, value2, "visitThrowingErro");
            return (Criteria) this;
        }

        public Criteria andVisitResultIsNull() {
            addCriterion("visit_result is null");
            return (Criteria) this;
        }

        public Criteria andVisitResultIsNotNull() {
            addCriterion("visit_result is not null");
            return (Criteria) this;
        }

        public Criteria andVisitResultEqualTo(String value) {
            addCriterion("visit_result =", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotEqualTo(String value) {
            addCriterion("visit_result <>", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultGreaterThan(String value) {
            addCriterion("visit_result >", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultGreaterThanOrEqualTo(String value) {
            addCriterion("visit_result >=", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultLessThan(String value) {
            addCriterion("visit_result <", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultLessThanOrEqualTo(String value) {
            addCriterion("visit_result <=", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultLike(String value) {
            addCriterion("visit_result like", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotLike(String value) {
            addCriterion("visit_result not like", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultIn(List<String> values) {
            addCriterion("visit_result in", values, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotIn(List<String> values) {
            addCriterion("visit_result not in", values, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultBetween(String value1, String value2) {
            addCriterion("visit_result between", value1, value2, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotBetween(String value1, String value2) {
            addCriterion("visit_result not between", value1, value2, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNull() {
            addCriterion("visit_num is null");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNotNull() {
            addCriterion("visit_num is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNumEqualTo(Long value) {
            addCriterion("visit_num =", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotEqualTo(Long value) {
            addCriterion("visit_num <>", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThan(Long value) {
            addCriterion("visit_num >", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThanOrEqualTo(Long value) {
            addCriterion("visit_num >=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThan(Long value) {
            addCriterion("visit_num <", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThanOrEqualTo(Long value) {
            addCriterion("visit_num <=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIn(List<Long> values) {
            addCriterion("visit_num in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotIn(List<Long> values) {
            addCriterion("visit_num not in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumBetween(Long value1, Long value2) {
            addCriterion("visit_num between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotBetween(Long value1, Long value2) {
            addCriterion("visit_num not between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeIsNull() {
            addCriterion("visit_start_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeIsNotNull() {
            addCriterion("visit_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeEqualTo(Date value) {
            addCriterion("visit_start_time =", value, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeNotEqualTo(Date value) {
            addCriterion("visit_start_time <>", value, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeGreaterThan(Date value) {
            addCriterion("visit_start_time >", value, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("visit_start_time >=", value, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeLessThan(Date value) {
            addCriterion("visit_start_time <", value, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("visit_start_time <=", value, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeIn(List<Date> values) {
            addCriterion("visit_start_time in", values, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeNotIn(List<Date> values) {
            addCriterion("visit_start_time not in", values, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeBetween(Date value1, Date value2) {
            addCriterion("visit_start_time between", value1, value2, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("visit_start_time not between", value1, value2, "visitStartTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeIsNull() {
            addCriterion("visit_end_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeIsNotNull() {
            addCriterion("visit_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeEqualTo(Date value) {
            addCriterion("visit_end_time =", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeNotEqualTo(Date value) {
            addCriterion("visit_end_time <>", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeGreaterThan(Date value) {
            addCriterion("visit_end_time >", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("visit_end_time >=", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeLessThan(Date value) {
            addCriterion("visit_end_time <", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("visit_end_time <=", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeIn(List<Date> values) {
            addCriterion("visit_end_time in", values, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeNotIn(List<Date> values) {
            addCriterion("visit_end_time not in", values, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeBetween(Date value1, Date value2) {
            addCriterion("visit_end_time between", value1, value2, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("visit_end_time not between", value1, value2, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingIsNull() {
            addCriterion("visit_time_consuming is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingIsNotNull() {
            addCriterion("visit_time_consuming is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingEqualTo(Long value) {
            addCriterion("visit_time_consuming =", value, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingNotEqualTo(Long value) {
            addCriterion("visit_time_consuming <>", value, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingGreaterThan(Long value) {
            addCriterion("visit_time_consuming >", value, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingGreaterThanOrEqualTo(Long value) {
            addCriterion("visit_time_consuming >=", value, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingLessThan(Long value) {
            addCriterion("visit_time_consuming <", value, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingLessThanOrEqualTo(Long value) {
            addCriterion("visit_time_consuming <=", value, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingIn(List<Long> values) {
            addCriterion("visit_time_consuming in", values, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingNotIn(List<Long> values) {
            addCriterion("visit_time_consuming not in", values, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingBetween(Long value1, Long value2) {
            addCriterion("visit_time_consuming between", value1, value2, "visitTimeConsuming");
            return (Criteria) this;
        }

        public Criteria andVisitTimeConsumingNotBetween(Long value1, Long value2) {
            addCriterion("visit_time_consuming not between", value1, value2, "visitTimeConsuming");
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