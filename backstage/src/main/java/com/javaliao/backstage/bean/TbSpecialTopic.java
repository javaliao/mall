package com.javaliao.backstage.bean;


import java.util.Date;

public class TbSpecialTopic {

  private long id;
  private long activityId;
  private String specialIcon;
  private String specialTopicName;
  private String discountDescribe;
  private Date createTime;
  private Date updateTime;
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
