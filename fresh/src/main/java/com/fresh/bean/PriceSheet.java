package com.fresh.bean;

import java.math.BigDecimal;

public class PriceSheet {
    private Integer priceSheetId;

    private Integer categoryId;

    private String productName;

    private String place;

    private Integer specification;

    private String rank;

    private Integer quantity;

    private BigDecimal unitprice;

    private Short currency;

    private Short periodSpot;

    private String warehouse;

    private String remark;

    private Integer seniorId;

    private Integer purchaseId;

    public Integer getPriceSheetId() {
        return priceSheetId;
    }

    public void setPriceSheetId(Integer priceSheetId) {
        this.priceSheetId = priceSheetId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Integer getSpecification() {
        return specification;
    }

    public void setSpecification(Integer specification) {
        this.specification = specification;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Short getCurrency() {
        return currency;
    }

    public void setCurrency(Short currency) {
        this.currency = currency;
    }

    public Short getPeriodSpot() {
        return periodSpot;
    }

    public void setPeriodSpot(Short periodSpot) {
        this.periodSpot = periodSpot;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSeniorId() {
        return seniorId;
    }

    public void setSeniorId(Integer seniorId) {
        this.seniorId = seniorId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }
}