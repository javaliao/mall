package com.javaliao.backstage.bean;


import java.util.Date;

public class TbColumn {

  private long id;
  private long specialTopicId;
  private String columnName;
  private String columnPics;
  private String productIds;
  private Date createTime;
  private Date updateTime;
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


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }

}
