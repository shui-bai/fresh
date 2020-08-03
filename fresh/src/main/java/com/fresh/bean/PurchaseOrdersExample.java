package com.fresh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseOrdersExample() {
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

        public Criteria andPurchaseIdIsNull() {
            addCriterion("PURCHASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNotNull() {
            addCriterion("PURCHASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdEqualTo(Integer value) {
            addCriterion("PURCHASE_ID =", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotEqualTo(Integer value) {
            addCriterion("PURCHASE_ID <>", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThan(Integer value) {
            addCriterion("PURCHASE_ID >", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PURCHASE_ID >=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThan(Integer value) {
            addCriterion("PURCHASE_ID <", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("PURCHASE_ID <=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIn(List<Integer> values) {
            addCriterion("PURCHASE_ID in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotIn(List<Integer> values) {
            addCriterion("PURCHASE_ID not in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdBetween(Integer value1, Integer value2) {
            addCriterion("PURCHASE_ID between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PURCHASE_ID not between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIsNull() {
            addCriterion("PURCHASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIsNotNull() {
            addCriterion("PURCHASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameEqualTo(String value) {
            addCriterion("PURCHASE_NAME =", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotEqualTo(String value) {
            addCriterion("PURCHASE_NAME <>", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameGreaterThan(String value) {
            addCriterion("PURCHASE_NAME >", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NAME >=", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameLessThan(String value) {
            addCriterion("PURCHASE_NAME <", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NAME <=", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameLike(String value) {
            addCriterion("PURCHASE_NAME like", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotLike(String value) {
            addCriterion("PURCHASE_NAME not like", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIn(List<String> values) {
            addCriterion("PURCHASE_NAME in", values, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotIn(List<String> values) {
            addCriterion("PURCHASE_NAME not in", values, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameBetween(String value1, String value2) {
            addCriterion("PURCHASE_NAME between", value1, value2, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_NAME not between", value1, value2, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemIsNull() {
            addCriterion("PURCHASE_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemIsNotNull() {
            addCriterion("PURCHASE_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemEqualTo(String value) {
            addCriterion("PURCHASE_ITEM =", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemNotEqualTo(String value) {
            addCriterion("PURCHASE_ITEM <>", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemGreaterThan(String value) {
            addCriterion("PURCHASE_ITEM >", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ITEM >=", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemLessThan(String value) {
            addCriterion("PURCHASE_ITEM <", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ITEM <=", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemLike(String value) {
            addCriterion("PURCHASE_ITEM like", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemNotLike(String value) {
            addCriterion("PURCHASE_ITEM not like", value, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemIn(List<String> values) {
            addCriterion("PURCHASE_ITEM in", values, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemNotIn(List<String> values) {
            addCriterion("PURCHASE_ITEM not in", values, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemBetween(String value1, String value2) {
            addCriterion("PURCHASE_ITEM between", value1, value2, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPurchaseItemNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ITEM not between", value1, value2, "purchaseItem");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireIsNull() {
            addCriterion("PLACE_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireIsNotNull() {
            addCriterion("PLACE_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireEqualTo(String value) {
            addCriterion("PLACE_REQUIRE =", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireNotEqualTo(String value) {
            addCriterion("PLACE_REQUIRE <>", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireGreaterThan(String value) {
            addCriterion("PLACE_REQUIRE >", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE_REQUIRE >=", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireLessThan(String value) {
            addCriterion("PLACE_REQUIRE <", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireLessThanOrEqualTo(String value) {
            addCriterion("PLACE_REQUIRE <=", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireLike(String value) {
            addCriterion("PLACE_REQUIRE like", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireNotLike(String value) {
            addCriterion("PLACE_REQUIRE not like", value, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireIn(List<String> values) {
            addCriterion("PLACE_REQUIRE in", values, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireNotIn(List<String> values) {
            addCriterion("PLACE_REQUIRE not in", values, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireBetween(String value1, String value2) {
            addCriterion("PLACE_REQUIRE between", value1, value2, "placeRequire");
            return (Criteria) this;
        }

        public Criteria andPlaceRequireNotBetween(String value1, String value2) {
            addCriterion("PLACE_REQUIRE not between", value1, value2, "placeRequire");
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

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("SPECIFICATION =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("SPECIFICATION <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("SPECIFICATION >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("SPECIFICATION <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("SPECIFICATION like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("SPECIFICATION not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("SPECIFICATION in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("SPECIFICATION not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("SPECIFICATION between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("SPECIFICATION not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andRankRequireIsNull() {
            addCriterion("RANK_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andRankRequireIsNotNull() {
            addCriterion("RANK_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andRankRequireEqualTo(String value) {
            addCriterion("RANK_REQUIRE =", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireNotEqualTo(String value) {
            addCriterion("RANK_REQUIRE <>", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireGreaterThan(String value) {
            addCriterion("RANK_REQUIRE >", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireGreaterThanOrEqualTo(String value) {
            addCriterion("RANK_REQUIRE >=", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireLessThan(String value) {
            addCriterion("RANK_REQUIRE <", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireLessThanOrEqualTo(String value) {
            addCriterion("RANK_REQUIRE <=", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireLike(String value) {
            addCriterion("RANK_REQUIRE like", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireNotLike(String value) {
            addCriterion("RANK_REQUIRE not like", value, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireIn(List<String> values) {
            addCriterion("RANK_REQUIRE in", values, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireNotIn(List<String> values) {
            addCriterion("RANK_REQUIRE not in", values, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireBetween(String value1, String value2) {
            addCriterion("RANK_REQUIRE between", value1, value2, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andRankRequireNotBetween(String value1, String value2) {
            addCriterion("RANK_REQUIRE not between", value1, value2, "rankRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireIsNull() {
            addCriterion("WAREHOUSE_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireIsNotNull() {
            addCriterion("WAREHOUSE_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireEqualTo(String value) {
            addCriterion("WAREHOUSE_REQUIRE =", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireNotEqualTo(String value) {
            addCriterion("WAREHOUSE_REQUIRE <>", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireGreaterThan(String value) {
            addCriterion("WAREHOUSE_REQUIRE >", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireGreaterThanOrEqualTo(String value) {
            addCriterion("WAREHOUSE_REQUIRE >=", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireLessThan(String value) {
            addCriterion("WAREHOUSE_REQUIRE <", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireLessThanOrEqualTo(String value) {
            addCriterion("WAREHOUSE_REQUIRE <=", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireLike(String value) {
            addCriterion("WAREHOUSE_REQUIRE like", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireNotLike(String value) {
            addCriterion("WAREHOUSE_REQUIRE not like", value, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireIn(List<String> values) {
            addCriterion("WAREHOUSE_REQUIRE in", values, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireNotIn(List<String> values) {
            addCriterion("WAREHOUSE_REQUIRE not in", values, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireBetween(String value1, String value2) {
            addCriterion("WAREHOUSE_REQUIRE between", value1, value2, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andWarehouseRequireNotBetween(String value1, String value2) {
            addCriterion("WAREHOUSE_REQUIRE not between", value1, value2, "warehouseRequire");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotIsNull() {
            addCriterion("PERIOD_SPOT is null");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotIsNotNull() {
            addCriterion("PERIOD_SPOT is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotEqualTo(String value) {
            addCriterion("PERIOD_SPOT =", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotNotEqualTo(String value) {
            addCriterion("PERIOD_SPOT <>", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotGreaterThan(String value) {
            addCriterion("PERIOD_SPOT >", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_SPOT >=", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotLessThan(String value) {
            addCriterion("PERIOD_SPOT <", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_SPOT <=", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotLike(String value) {
            addCriterion("PERIOD_SPOT like", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotNotLike(String value) {
            addCriterion("PERIOD_SPOT not like", value, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotIn(List<String> values) {
            addCriterion("PERIOD_SPOT in", values, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotNotIn(List<String> values) {
            addCriterion("PERIOD_SPOT not in", values, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotBetween(String value1, String value2) {
            addCriterion("PERIOD_SPOT between", value1, value2, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andPeriodSpotNotBetween(String value1, String value2) {
            addCriterion("PERIOD_SPOT not between", value1, value2, "periodSpot");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireIsNull() {
            addCriterion("UNITPRICE_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireIsNotNull() {
            addCriterion("UNITPRICE_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireEqualTo(String value) {
            addCriterion("UNITPRICE_REQUIRE =", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireNotEqualTo(String value) {
            addCriterion("UNITPRICE_REQUIRE <>", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireGreaterThan(String value) {
            addCriterion("UNITPRICE_REQUIRE >", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireGreaterThanOrEqualTo(String value) {
            addCriterion("UNITPRICE_REQUIRE >=", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireLessThan(String value) {
            addCriterion("UNITPRICE_REQUIRE <", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireLessThanOrEqualTo(String value) {
            addCriterion("UNITPRICE_REQUIRE <=", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireLike(String value) {
            addCriterion("UNITPRICE_REQUIRE like", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireNotLike(String value) {
            addCriterion("UNITPRICE_REQUIRE not like", value, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireIn(List<String> values) {
            addCriterion("UNITPRICE_REQUIRE in", values, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireNotIn(List<String> values) {
            addCriterion("UNITPRICE_REQUIRE not in", values, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireBetween(String value1, String value2) {
            addCriterion("UNITPRICE_REQUIRE between", value1, value2, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andUnitpriceRequireNotBetween(String value1, String value2) {
            addCriterion("UNITPRICE_REQUIRE not between", value1, value2, "unitpriceRequire");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainIsNull() {
            addCriterion("PURCHASE_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainIsNotNull() {
            addCriterion("PURCHASE_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainEqualTo(String value) {
            addCriterion("PURCHASE_EXPLAIN =", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainNotEqualTo(String value) {
            addCriterion("PURCHASE_EXPLAIN <>", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainGreaterThan(String value) {
            addCriterion("PURCHASE_EXPLAIN >", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_EXPLAIN >=", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainLessThan(String value) {
            addCriterion("PURCHASE_EXPLAIN <", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_EXPLAIN <=", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainLike(String value) {
            addCriterion("PURCHASE_EXPLAIN like", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainNotLike(String value) {
            addCriterion("PURCHASE_EXPLAIN not like", value, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainIn(List<String> values) {
            addCriterion("PURCHASE_EXPLAIN in", values, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainNotIn(List<String> values) {
            addCriterion("PURCHASE_EXPLAIN not in", values, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainBetween(String value1, String value2) {
            addCriterion("PURCHASE_EXPLAIN between", value1, value2, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPurchaseExplainNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_EXPLAIN not between", value1, value2, "purchaseExplain");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("PAYMENT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("PAYMENT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("PAYMENT_METHOD =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("PAYMENT_METHOD <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("PAYMENT_METHOD like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("PAYMENT_METHOD not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("PAYMENT_METHOD in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("INVOICE_TYPE like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("INVOICE_TYPE not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIsNull() {
            addCriterion("RECEIPT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIsNotNull() {
            addCriterion("RECEIPT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressEqualTo(String value) {
            addCriterion("RECEIPT_ADDRESS =", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotEqualTo(String value) {
            addCriterion("RECEIPT_ADDRESS <>", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressGreaterThan(String value) {
            addCriterion("RECEIPT_ADDRESS >", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_ADDRESS >=", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLessThan(String value) {
            addCriterion("RECEIPT_ADDRESS <", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_ADDRESS <=", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLike(String value) {
            addCriterion("RECEIPT_ADDRESS like", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotLike(String value) {
            addCriterion("RECEIPT_ADDRESS not like", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIn(List<String> values) {
            addCriterion("RECEIPT_ADDRESS in", values, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotIn(List<String> values) {
            addCriterion("RECEIPT_ADDRESS not in", values, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressBetween(String value1, String value2) {
            addCriterion("RECEIPT_ADDRESS between", value1, value2, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_ADDRESS not between", value1, value2, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("LAST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("LAST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_DATE >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(Date value) {
            addCriterionForJDBCDate("LAST_DATE <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_DATE <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_DATE in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_DATE not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_DATE between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_DATE not between", value1, value2, "lastDate");
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