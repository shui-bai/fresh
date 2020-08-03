package com.fresh.bean;

import java.util.ArrayList;
import java.util.List;

public class SeniorMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeniorMemberExample() {
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

        public Criteria andSeniorIdIsNull() {
            addCriterion("SENIOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeniorIdIsNotNull() {
            addCriterion("SENIOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorIdEqualTo(Integer value) {
            addCriterion("SENIOR_ID =", value, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdNotEqualTo(Integer value) {
            addCriterion("SENIOR_ID <>", value, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdGreaterThan(Integer value) {
            addCriterion("SENIOR_ID >", value, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SENIOR_ID >=", value, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdLessThan(Integer value) {
            addCriterion("SENIOR_ID <", value, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdLessThanOrEqualTo(Integer value) {
            addCriterion("SENIOR_ID <=", value, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdIn(List<Integer> values) {
            addCriterion("SENIOR_ID in", values, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdNotIn(List<Integer> values) {
            addCriterion("SENIOR_ID not in", values, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdBetween(Integer value1, Integer value2) {
            addCriterion("SENIOR_ID between", value1, value2, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SENIOR_ID not between", value1, value2, "seniorId");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneIsNull() {
            addCriterion("SENIOR_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneIsNotNull() {
            addCriterion("SENIOR_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneEqualTo(Long value) {
            addCriterion("SENIOR_PHONE =", value, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneNotEqualTo(Long value) {
            addCriterion("SENIOR_PHONE <>", value, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneGreaterThan(Long value) {
            addCriterion("SENIOR_PHONE >", value, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("SENIOR_PHONE >=", value, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneLessThan(Long value) {
            addCriterion("SENIOR_PHONE <", value, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneLessThanOrEqualTo(Long value) {
            addCriterion("SENIOR_PHONE <=", value, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneIn(List<Long> values) {
            addCriterion("SENIOR_PHONE in", values, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneNotIn(List<Long> values) {
            addCriterion("SENIOR_PHONE not in", values, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneBetween(Long value1, Long value2) {
            addCriterion("SENIOR_PHONE between", value1, value2, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorPhoneNotBetween(Long value1, Long value2) {
            addCriterion("SENIOR_PHONE not between", value1, value2, "seniorPhone");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailIsNull() {
            addCriterion("SENIOR_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailIsNotNull() {
            addCriterion("SENIOR_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailEqualTo(String value) {
            addCriterion("SENIOR_EMAIL =", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailNotEqualTo(String value) {
            addCriterion("SENIOR_EMAIL <>", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailGreaterThan(String value) {
            addCriterion("SENIOR_EMAIL >", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("SENIOR_EMAIL >=", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailLessThan(String value) {
            addCriterion("SENIOR_EMAIL <", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailLessThanOrEqualTo(String value) {
            addCriterion("SENIOR_EMAIL <=", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailLike(String value) {
            addCriterion("SENIOR_EMAIL like", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailNotLike(String value) {
            addCriterion("SENIOR_EMAIL not like", value, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailIn(List<String> values) {
            addCriterion("SENIOR_EMAIL in", values, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailNotIn(List<String> values) {
            addCriterion("SENIOR_EMAIL not in", values, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailBetween(String value1, String value2) {
            addCriterion("SENIOR_EMAIL between", value1, value2, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andSeniorEmailNotBetween(String value1, String value2) {
            addCriterion("SENIOR_EMAIL not between", value1, value2, "seniorEmail");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(Long value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(Long value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(Long value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(Long value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(Long value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(Long value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<Long> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<Long> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(Long value1, Long value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(Long value1, Long value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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