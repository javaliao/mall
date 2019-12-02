package com.javaliao.backstage.bean;


public class TbUserReturnOrder {

  private long id;
  private long orderSn;
  private long userId;
  private long sellerId;
  private String reason;
  private java.sql.Timestamp returnOrderTime;
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


  public long getSellerId() {
    return sellerId;
  }

  public void setSellerId(long sellerId) {
    this.sellerId = sellerId;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public java.sql.Timestamp getReturnOrderTime() {
    return returnOrderTime;
  }

  public void setReturnOrderTime(java.sql.Timestamp returnOrderTime) {
    this.returnOrderTime = returnOrderTime;
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
