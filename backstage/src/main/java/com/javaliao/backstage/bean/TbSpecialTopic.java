package com.javaliao.backstage.bean;


public class TbSpecialTopic {

  private long id;
  private long activityId;
  private String specialIcon;
  private String specialTopicName;
  private String discountDescribe;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getActivityId() {
    return activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }


  public String getSpecialIcon() {
    return specialIcon;
  }

  public void setSpecialIcon(String specialIcon) {
    this.specialIcon = specialIcon;
  }


  public String getSpecialTopicName() {
    return specialTopicName;
  }

  public void setSpecialTopicName(String specialTopicName) {
    this.specialTopicName = specialTopicName;
  }


  public String getDiscountDescribe() {
    return discountDescribe;
  }

  public void setDiscountDescribe(String discountDescribe) {
    this.discountDescribe = discountDescribe;
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
