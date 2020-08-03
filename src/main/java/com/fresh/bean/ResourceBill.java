package com.fresh.bean;

import java.util.Date;

public class ResourceBill {
    private Integer resId;

    private String resName;

    private String classify;

    private String ldpe;

    private String resExplain;

    private Date uploadTime;

    private Integer downloadNumber;

    private String downloadPath;

    private Integer memberId;

    private Short status;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getLdpe() {
        return ldpe;
    }

    public void setLdpe(String ldpe) {
        this.ldpe = ldpe == null ? null : ldpe.trim();
    }

    public String getResExplain() {
        return resExplain;
    }

    public void setResExplain(String resExplain) {
        this.resExplain = resExplain == null ? null : resExplain.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(Integer downloadNumber) {
        this.downloadNumber = downloadNumber;
    }

    public String getDownloadPath() {
        return downloadPath;
    }

    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath == null ? null : downloadPath.trim();
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