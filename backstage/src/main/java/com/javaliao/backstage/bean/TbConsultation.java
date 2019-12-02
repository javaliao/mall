package com.javaliao.backstage.bean;


public class TbConsultation {

  private long id;
  private String consultationName;
  private String consultationPhone;
  private String userId;
  private String sellerId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getConsultationName() {
    return consultationName;
  }

  public void setConsultationName(String consultationName) {
    this.consultationName = consultationName;
  }


  public String getConsultationPhone() {
    return consultationPhone;
  }

  public void setConsultationPhone(String consultationPhone) {
    this.consultationPhone = consultationPhone;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
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
