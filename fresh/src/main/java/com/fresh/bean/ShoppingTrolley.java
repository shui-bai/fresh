package com.fresh.bean;

import java.math.BigDecimal;

public class ShoppingTrolley {
    private Integer shppingTrolleyId;

    private Integer seniorId;

    private String productName;

    private String specification;

    private String place;

    private BigDecimal unitprice;

    private Integer quantity;

    private Integer money;

    public Integer getShppingTrolleyId() {
        return shppingTrolleyId;
    }

    public void setShppingTrolleyId(Integer shppingTrolleyId) {
        this.shppingTrolleyId = shppingTrolleyId;
    }

    public Integer getSeniorId() {
        return seniorId;
    }

    public void setSeniorId(Integer seniorId) {
        this.seniorId = seniorId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}