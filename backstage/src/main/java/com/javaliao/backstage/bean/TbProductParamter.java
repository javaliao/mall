package com.javaliao.backstage.bean;


public class TbProductParamter {

  private long id;
  private long productParamterTypeId;
  private String productParamterName;
  private String productParamterValue;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getProductParamterTypeId() {
    return productParamterTypeId;
  }

  public void setProductParamterTypeId(long productParamterTypeId) {
    this.productParamterTypeId = productParamterTypeId;
  }


  public String getProductParamterName() {
    return productParamterName;
  }

  public void setProductParamterName(String productParamterName) {
    this.productParamterName = productParamterName;
  }


  public String getProductParamterValue() {
    return productParamterValue;
  }

  public void setProductParamterValue(String productParamterValue) {
    this.productParamterValue = productParamterValue;
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
