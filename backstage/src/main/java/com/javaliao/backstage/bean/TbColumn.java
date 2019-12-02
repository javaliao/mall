package com.javaliao.backstage.bean;


public class TbColumn {

  private long id;
  private long specialTopicId;
  private String columnName;
  private String columnPics;
  private String productIds;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSpecialTopicId() {
    return specialTopicId;
  }

  public void setSpecialTopicId(long specialTopicId) {
    this.specialTopicId = specialTopicId;
  }


  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public String getColumnPics() {
    return columnPics;
  }

  public void setColumnPics(String columnPics) {
    this.columnPics = columnPics;
  }


  public String getProductIds() {
    return productIds;
  }

  public void setProductIds(String productIds) {
    this.productIds = productIds;
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
