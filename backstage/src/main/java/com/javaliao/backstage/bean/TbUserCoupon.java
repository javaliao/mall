package com.javaliao.backstage.bean;


public class TbUserCoupon {

  private long id;
  private long userId;
  private long couponId;
  private String couponCode;
  private java.sql.Timestamp userCouponCreateTime;
  private String useStatus;
  private long orderId;
  private String orderSn;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getCouponId() {
    return couponId;
  }

  public void setCouponId(long couponId) {
    this.couponId = couponId;
  }


  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public java.sql.Timestamp getUserCouponCreateTime() {
    return userCouponCreateTime;
  }

  public void setUserCouponCreateTime(java.sql.Timestamp userCouponCreateTime) {
    this.userCouponCreateTime = userCouponCreateTime;
  }


  public String getUseStatus() {
    return useStatus;
  }

  public void setUseStatus(String useStatus) {
    this.useStatus = useStatus;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
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
