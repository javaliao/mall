package com.javaliao.backstage.bean;


public class TbPaymentInfo {

  private long id;
  private long outTradeNo;
  private String orderSn;
  private String alipayTradeNo;
  private String totalAmount;
  private String paymentStatus;
  private java.sql.Timestamp callbackContent;
  private String subject;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(long outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public String getAlipayTradeNo() {
    return alipayTradeNo;
  }

  public void setAlipayTradeNo(String alipayTradeNo) {
    this.alipayTradeNo = alipayTradeNo;
  }


  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public java.sql.Timestamp getCallbackContent() {
    return callbackContent;
  }

  public void setCallbackContent(java.sql.Timestamp callbackContent) {
    this.callbackContent = callbackContent;
  }


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
