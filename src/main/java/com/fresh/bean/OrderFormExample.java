package com.fresh.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderFormExample() {
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

        public Criteria andOrderFormIdIsNull() {
            addCriterion("ORDER_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdIsNotNull() {
            addCriterion("ORDER_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdEqualTo(Integer value) {
            addCriterion("ORDER_FORM_ID =", value, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdNotEqualTo(Integer value) {
            addCriterion("ORDER_FORM_ID <>", value, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdGreaterThan(Integer value) {
            addCriterion("ORDER_FORM_ID >", value, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_FORM_ID >=", value, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdLessThan(Integer value) {
            addCriterion("ORDER_FORM_ID <", value, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_FORM_ID <=", value, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdIn(List<Integer> values) {
            addCriterion("ORDER_FORM_ID in", values, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdNotIn(List<Integer> values) {
            addCriterion("ORDER_FORM_ID not in", values, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_FORM_ID between", value1, value2, "orderFormId");
            return (Criteria) this;
        }

        public Criteria andOrderFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_FORM_ID not between", value1, value2, "orderFormId");
            return (Criteria) this;
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

        public Criteria andOrderFormDateIsNull() {
            addCriterion("ORDER_FORM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateIsNotNull() {
            addCriterion("ORDER_FORM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_FORM_DATE =", value, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_FORM_DATE <>", value, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ORDER_FORM_DATE >", value, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_FORM_DATE >=", value, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateLessThan(Date value) {
            addCriterionForJDBCDate("ORDER_FORM_DATE <", value, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_FORM_DATE <=", value, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateIn(List<Date> values) {
            addCriterionForJDBCDate("ORDER_FORM_DATE in", values, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ORDER_FORM_DATE not in", values, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ORDER_FORM_DATE between", value1, value2, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andOrderFormDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ORDER_FORM_DATE not between", value1, value2, "orderFormDate");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoIsNull() {
            addCriterion("COMMODITY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoIsNotNull() {
            addCriterion("COMMODITY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoEqualTo(String value) {
            addCriterion("COMMODITY_INFO =", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoNotEqualTo(String value) {
            addCriterion("COMMODITY_INFO <>", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoGreaterThan(String value) {
            addCriterion("COMMODITY_INFO >", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_INFO >=", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoLessThan(String value) {
            addCriterion("COMMODITY_INFO <", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_INFO <=", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoLike(String value) {
            addCriterion("COMMODITY_INFO like", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoNotLike(String value) {
            addCriterion("COMMODITY_INFO not like", value, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoIn(List<String> values) {
            addCriterion("COMMODITY_INFO in", values, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoNotIn(List<String> values) {
            addCriterion("COMMODITY_INFO not in", values, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoBetween(String value1, String value2) {
            addCriterion("COMMODITY_INFO between", value1, value2, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityInfoNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_INFO not between", value1, value2, "commodityInfo");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("SPECIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("SPECIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(Integer value) {
            addCriterion("SPECIFICATION =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(Integer value) {
            addCriterion("SPECIFICATION <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(Integer value) {
            addCriterion("SPECIFICATION >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPECIFICATION >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(Integer value) {
            addCriterion("SPECIFICATION <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(Integer value) {
            addCriterion("SPECIFICATION <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<Integer> values) {
            addCriterion("SPECIFICATION in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<Integer> values) {
            addCriterion("SPECIFICATION not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(Integer value1, Integer value2) {
            addCriterion("SPECIFICATION between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(Integer value1, Integer value2) {
            addCriterion("SPECIFICATION not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("UNITPRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UNITPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(BigDecimal value) {
            addCriterion("UNITPRICE >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(BigDecimal value) {
            addCriterion("UNITPRICE <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<BigDecimal> values) {
            addCriterion("UNITPRICE in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<BigDecimal> values) {
            addCriterion("UNITPRICE not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITPRICE between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITPRICE not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("TOTAL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("TOTAL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_MONEY >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(BigDecimal value) {
            addCriterion("TOTAL_MONEY <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("TOTAL_MONEY in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_MONEY not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_MONEY between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_MONEY not between", value1, value2, "totalMoney");
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

        public Criteria andPayOrderImgIsNull() {
            addCriterion("PAY_ORDER_IMG is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgIsNotNull() {
            addCriterion("PAY_ORDER_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgEqualTo(String value) {
            addCriterion("PAY_ORDER_IMG =", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgNotEqualTo(String value) {
            addCriterion("PAY_ORDER_IMG <>", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgGreaterThan(String value) {
            addCriterion("PAY_ORDER_IMG >", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_IMG >=", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgLessThan(String value) {
            addCriterion("PAY_ORDER_IMG <", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgLessThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_IMG <=", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgLike(String value) {
            addCriterion("PAY_ORDER_IMG like", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgNotLike(String value) {
            addCriterion("PAY_ORDER_IMG not like", value, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgIn(List<String> values) {
            addCriterion("PAY_ORDER_IMG in", values, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgNotIn(List<String> values) {
            addCriterion("PAY_ORDER_IMG not in", values, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_IMG between", value1, value2, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andPayOrderImgNotBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_IMG not between", value1, value2, "payOrderImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgIsNull() {
            addCriterion("BILLING_INFO_IMG is null");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgIsNotNull() {
            addCriterion("BILLING_INFO_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgEqualTo(String value) {
            addCriterion("BILLING_INFO_IMG =", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgNotEqualTo(String value) {
            addCriterion("BILLING_INFO_IMG <>", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgGreaterThan(String value) {
            addCriterion("BILLING_INFO_IMG >", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_INFO_IMG >=", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgLessThan(String value) {
            addCriterion("BILLING_INFO_IMG <", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgLessThanOrEqualTo(String value) {
            addCriterion("BILLING_INFO_IMG <=", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgLike(String value) {
            addCriterion("BILLING_INFO_IMG like", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgNotLike(String value) {
            addCriterion("BILLING_INFO_IMG not like", value, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgIn(List<String> values) {
            addCriterion("BILLING_INFO_IMG in", values, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgNotIn(List<String> values) {
            addCriterion("BILLING_INFO_IMG not in", values, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgBetween(String value1, String value2) {
            addCriterion("BILLING_INFO_IMG between", value1, value2, "billingInfoImg");
            return (Criteria) this;
        }

        public Criteria andBillingInfoImgNotBetween(String value1, String value2) {
            addCriterion("BILLING_INFO_IMG not between", value1, value2, "billingInfoImg");
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