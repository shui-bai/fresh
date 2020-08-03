package com.fresh.bean;

public class SeniorMember {
    private Integer seniorId;

    private Long seniorPhone;

    private String seniorEmail;

    private Long telephone;

    private Integer memberId;

    private Integer uId;

    private String cardId;

    private Short status;

    public Integer getSeniorId() {
        return seniorId;
    }

    public void setSeniorId(Integer seniorId) {
        this.seniorId = seniorId;
    }

    public Long getSeniorPhone() {
        return seniorPhone;
    }

    public void setSeniorPhone(Long seniorPhone) {
        this.seniorPhone = seniorPhone;
    }

    public String getSeniorEmail() {
        return seniorEmail;
    }

    public void setSeniorEmail(String seniorEmail) {
        this.seniorEmail = seniorEmail == null ? null : seniorEmail.trim();
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}