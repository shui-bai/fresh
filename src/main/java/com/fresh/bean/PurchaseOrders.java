package com.fresh.bean;

import java.util.Date;

public class PurchaseOrders {
    private Integer purchaseId;

    private String purchaseName;

    private String purchaseItem;

    private String placeRequire;

    private String specification;

    private String rankRequire;

    private String warehouseRequire;

    private String periodSpot;

    private String unitpriceRequire;

    private String purchaseExplain;

    private String paymentMethod;

    private String invoiceType;

    private String receiptAddress;

    private Date lastDate;

    private Integer memberId;

    private Short status;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName == null ? null : purchaseName.trim();
    }

    public String getPurchaseItem() {
        return purchaseItem;
    }

    public void setPurchaseItem(String purchaseItem) {
        this.purchaseItem = purchaseItem == null ? null : purchaseItem.trim();
    }

    public String getPlaceRequire() {
        return placeRequire;
    }

    public void setPlaceRequire(String placeRequire) {
        this.placeRequire = placeRequire == null ? null : placeRequire.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getRankRequire() {
        return rankRequire;
    }

    public void setRankRequire(String rankRequire) {
        this.rankRequire = rankRequire == null ? null : rankRequire.trim();
    }

    public String getWarehouseRequire() {
        return warehouseRequire;
    }

    public void setWarehouseRequire(String warehouseRequire) {
        this.warehouseRequire = warehouseRequire == null ? null : warehouseRequire.trim();
    }

    public String getPeriodSpot() {
        return periodSpot;
    }

    public void setPeriodSpot(String periodSpot) {
        this.periodSpot = periodSpot == null ? null : periodSpot.trim();
    }

    public String getUnitpriceRequire() {
        return unitpriceRequire;
    }

    public void setUnitpriceRequire(String unitpriceRequire) {
        this.unitpriceRequire = unitpriceRequire == null ? null : unitpriceRequire.trim();
    }

    public String getPurchaseExplain() {
        return purchaseExplain;
    }

    public void setPurchaseExplain(String purchaseExplain) {
        this.purchaseExplain = purchaseExplain == null ? null : purchaseExplain.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getReceiptAddress() {
        return receiptAddress;
    }

    public void setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress == null ? null : receiptAddress.trim();
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}