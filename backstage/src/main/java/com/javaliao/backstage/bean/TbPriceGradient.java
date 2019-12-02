package com.javaliao.backstage.bean;


public class TbPriceGradient {

  private long id;
  private String productPrice;
  private String productCount;
  private String discountPice;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }


  public String getProductCount() {
    return productCount;
  }

  public void setProductCount(String productCount) {
    this.productCount = productCount;
  }


  public String getDiscountPice() {
    return discountPice;
  }

  public void setDiscountPice(String discountPice) {
    this.discountPice = discountPice;
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
