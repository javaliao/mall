package com.javaliao.backstage.bean;


public class TbCoupon {

  private long id;
  private String couponIcon;
  private String couponName;
  private String couponPublishCount;
  private String couponUseCount;
  private String couponReceiveCount;
  private String couponAmount;
  private String personLimit;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;
  private String useType;
  private String couponCode;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCouponIcon() {
    return couponIcon;
  }

  public void setCouponIcon(String couponIcon) {
    this.couponIcon = couponIcon;
  }


  public String getCouponName() {
    return couponName;
  }

  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public String getCouponPublishCount() {
    return couponPublishCount;
  }

  public void setCouponPublishCount(String couponPublishCount) {
    this.couponPublishCount = couponPublishCount;
  }


  public String getCouponUseCount() {
    return couponUseCount;
  }

  public void setCouponUseCount(String couponUseCount) {
    this.couponUseCount = couponUseCount;
  }


  public String getCouponReceiveCount() {
    return couponReceiveCount;
  }

  public void setCouponReceiveCount(String couponReceiveCount) {
    this.couponReceiveCount = couponReceiveCount;
  }


  public String getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(String couponAmount) {
    this.couponAmount = couponAmount;
  }


  public String getPersonLimit() {
    return personLimit;
  }

  public void setPersonLimit(String personLimit) {
    this.personLimit = personLimit;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public String getUseType() {
    return useType;
  }

  public void setUseType(String useType) {
    this.useType = useType;
  }


  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }

}
