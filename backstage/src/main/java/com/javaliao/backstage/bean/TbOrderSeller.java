package com.javaliao.backstage.bean;


public class TbOrderSeller {

  private long id;
  private long orderSn;
  private long userId;
  private long productId;
  private long userCouponId;
  private long storeCouponId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(long orderSn) {
    this.orderSn = orderSn;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getUserCouponId() {
    return userCouponId;
  }

  public void setUserCouponId(long userCouponId) {
    this.userCouponId = userCouponId;
  }


  public long getStoreCouponId() {
    return storeCouponId;
  }

  public void setStoreCouponId(long storeCouponId) {
    this.storeCouponId = storeCouponId;
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
