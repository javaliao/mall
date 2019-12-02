package com.javaliao.backstage.bean;


public class TbProductCategory {

  private long id;
  private long parentId;
  private String categoryName;
  private String categoryIcon;
  private String categoryDownProductCount;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public String getCategoryIcon() {
    return categoryIcon;
  }

  public void setCategoryIcon(String categoryIcon) {
    this.categoryIcon = categoryIcon;
  }


  public String getCategoryDownProductCount() {
    return categoryDownProductCount;
  }

  public void setCategoryDownProductCount(String categoryDownProductCount) {
    this.categoryDownProductCount = categoryDownProductCount;
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
