package com.fresh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResourceBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceBillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andResIdIsNull() {
            addCriterion("RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Integer value) {
            addCriterion("RES_ID =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Integer value) {
            addCriterion("RES_ID <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Integer value) {
            addCriterion("RES_ID >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_ID >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Integer value) {
            addCriterion("RES_ID <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Integer value) {
            addCriterion("RES_ID <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Integer> values) {
            addCriterion("RES_ID in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Integer> values) {
            addCriterion("RES_ID not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Integer value1, Integer value2) {
            addCriterion("RES_ID between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_ID not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("RES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("RES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("RES_NAME =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("RES_NAME <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("RES_NAME >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("RES_NAME >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("RES_NAME <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("RES_NAME <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("RES_NAME like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("RES_NAME not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("RES_NAME in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("RES_NAME not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("RES_NAME between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("RES_NAME not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNull() {
            addCriterion("CLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNotNull() {
            addCriterion("CLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyEqualTo(String value) {
            addCriterion("CLASSIFY =", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotEqualTo(String value) {
            addCriterion("CLASSIFY <>", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThan(String value) {
            addCriterion("CLASSIFY >", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSIFY >=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThan(String value) {
            addCriterion("CLASSIFY <", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThanOrEqualTo(String value) {
            addCriterion("CLASSIFY <=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLike(String value) {
            addCriterion("CLASSIFY like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotLike(String value) {
            addCriterion("CLASSIFY not like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyIn(List<String> values) {
            addCriterion("CLASSIFY in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotIn(List<String> values) {
            addCriterion("CLASSIFY not in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyBetween(String value1, String value2) {
            addCriterion("CLASSIFY between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotBetween(String value1, String value2) {
            addCriterion("CLASSIFY not between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andLdpeIsNull() {
            addCriterion("LDPE is null");
            return (Criteria) this;
        }

        public Criteria andLdpeIsNotNull() {
            addCriterion("LDPE is not null");
            return (Criteria) this;
        }

        public Criteria andLdpeEqualTo(String value) {
            addCriterion("LDPE =", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeNotEqualTo(String value) {
            addCriterion("LDPE <>", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeGreaterThan(String value) {
            addCriterion("LDPE >", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeGreaterThanOrEqualTo(String value) {
            addCriterion("LDPE >=", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeLessThan(String value) {
            addCriterion("LDPE <", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeLessThanOrEqualTo(String value) {
            addCriterion("LDPE <=", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeLike(String value) {
            addCriterion("LDPE like", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeNotLike(String value) {
            addCriterion("LDPE not like", value, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeIn(List<String> values) {
            addCriterion("LDPE in", values, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeNotIn(List<String> values) {
            addCriterion("LDPE not in", values, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeBetween(String value1, String value2) {
            addCriterion("LDPE between", value1, value2, "ldpe");
            return (Criteria) this;
        }

        public Criteria andLdpeNotBetween(String value1, String value2) {
            addCriterion("LDPE not between", value1, value2, "ldpe");
            return (Criteria) this;
        }

        public Criteria andResExplainIsNull() {
            addCriterion("RES_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andResExplainIsNotNull() {
            addCriterion("RES_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andResExplainEqualTo(String value) {
            addCriterion("RES_EXPLAIN =", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainNotEqualTo(String value) {
            addCriterion("RES_EXPLAIN <>", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainGreaterThan(String value) {
            addCriterion("RES_EXPLAIN >", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainGreaterThanOrEqualTo(String value) {
            addCriterion("RES_EXPLAIN >=", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainLessThan(String value) {
            addCriterion("RES_EXPLAIN <", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainLessThanOrEqualTo(String value) {
            addCriterion("RES_EXPLAIN <=", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainLike(String value) {
            addCriterion("RES_EXPLAIN like", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainNotLike(String value) {
            addCriterion("RES_EXPLAIN not like", value, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainIn(List<String> values) {
            addCriterion("RES_EXPLAIN in", values, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainNotIn(List<String> values) {
            addCriterion("RES_EXPLAIN not in", values, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainBetween(String value1, String value2) {
            addCriterion("RES_EXPLAIN between", value1, value2, "resExplain");
            return (Criteria) this;
        }

        public Criteria andResExplainNotBetween(String value1, String value2) {
            addCriterion("RES_EXPLAIN not between", value1, value2, "resExplain");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPLOAD_TIME in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPLOAD_TIME not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPLOAD_TIME between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPLOAD_TIME not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberIsNull() {
            addCriterion("DOWNLOAD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberIsNotNull() {
            addCriterion("DOWNLOAD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberEqualTo(Integer value) {
            addCriterion("DOWNLOAD_NUMBER =", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberNotEqualTo(Integer value) {
            addCriterion("DOWNLOAD_NUMBER <>", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberGreaterThan(Integer value) {
            addCriterion("DOWNLOAD_NUMBER >", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_NUMBER >=", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberLessThan(Integer value) {
            addCriterion("DOWNLOAD_NUMBER <", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberLessThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_NUMBER <=", value, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberIn(List<Integer> values) {
            addCriterion("DOWNLOAD_NUMBER in", values, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberNotIn(List<Integer> values) {
            addCriterion("DOWNLOAD_NUMBER not in", values, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_NUMBER between", value1, value2, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_NUMBER not between", value1, value2, "downloadNumber");
            return (Criteria) this;
        }

        public Criteria andDownloadPathIsNull() {
            addCriterion("DOWNLOAD_PATH is null");
            return (Criteria) this;
        }

        public Criteria andDownloadPathIsNotNull() {
            addCriterion("DOWNLOAD_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadPathEqualTo(String value) {
            addCriterion("DOWNLOAD_PATH =", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathNotEqualTo(String value) {
            addCriterion("DOWNLOAD_PATH <>", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathGreaterThan(String value) {
            addCriterion("DOWNLOAD_PATH >", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNLOAD_PATH >=", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathLessThan(String value) {
            addCriterion("DOWNLOAD_PATH <", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathLessThanOrEqualTo(String value) {
            addCriterion("DOWNLOAD_PATH <=", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathLike(String value) {
            addCriterion("DOWNLOAD_PATH like", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathNotLike(String value) {
            addCriterion("DOWNLOAD_PATH not like", value, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathIn(List<String> values) {
            addCriterion("DOWNLOAD_PATH in", values, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathNotIn(List<String> values) {
            addCriterion("DOWNLOAD_PATH not in", values, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathBetween(String value1, String value2) {
            addCriterion("DOWNLOAD_PATH between", value1, value2, "downloadPath");
            return (Criteria) this;
        }

        public Criteria andDownloadPathNotBetween(String value1, String value2) {
            addCriterion("DOWNLOAD_PATH not between", value1, value2, "downloadPath");
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