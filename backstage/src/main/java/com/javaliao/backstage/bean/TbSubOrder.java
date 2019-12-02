package com.javaliao.backstage.bean;


public class TbSubOrder {

  private long id;
  private long productId;
  private long sellerId;
  private long userCouponId;
  private long orderNo;
  private long orderSn;
  private String productName;
  private String productIcon;
  private String productSpecifications;
  private String productBrandName;
  private String productSellerName;
  private String productPrice;
  private String productQuantity;
  private String productNowPrice;
  private String orderState;
  private String productCouponPrice;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getSellerId() {
    return sellerId;
  }

  public void setSellerId(long sellerId) {
    this.sellerId = sellerId;
  }


  public long getUserCouponId() {
    return userCouponId;
  }

  public void setUserCouponId(long userCouponId) {
    this.userCouponId = userCouponId;
  }


  public long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(long orderNo) {
    this.orderNo = orderNo;
  }


  public long getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(long orderSn) {
    this.orderSn = orderSn;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getProductIcon() {
    return productIcon;
  }

  public void setProductIcon(String productIcon) {
    this.productIcon = productIcon;
  }


  public String getProductSpecifications() {
    return productSpecifications;
  }

  public void setProductSpecifications(String productSpecifications) {
    this.productSpecifications = productSpecifications;
  }


  public String getProductBrandName() {
    return productBrandName;
  }

  public void setProductBrandName(String productBrandName) {
    this.productBrandName = productBrandName;
  }


  public String getProductSellerName() {
    return productSellerName;
  }

  public void setProductSellerName(String productSellerName) {
    this.productSellerName = productSellerName;
  }


  public String getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }


  public String getProductQuantity() {
    return productQuantity;
  }

  public void setProductQuantity(String productQuantity) {
    this.productQuantity = productQuantity;
  }


  public String getProductNowPrice() {
    return productNowPrice;
  }

  public void setProductNowPrice(String productNowPrice) {
    this.productNowPrice = productNowPrice;
  }


  public String getOrderState() {
    return orderState;
  }

  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }


  public String getProductCouponPrice() {
    return productCouponPrice;
  }

  public void setProductCouponPrice(String productCouponPrice) {
    this.productCouponPrice = productCouponPrice;
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
