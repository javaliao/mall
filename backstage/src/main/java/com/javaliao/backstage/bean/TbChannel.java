package com.javaliao.backstage.bean;


public class TbChannel {

  private long id;
  private String channelName;
  private String channelPhone;
  private String channelQrCode;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public String getChannelPhone() {
    return channelPhone;
  }

  public void setChannelPhone(String channelPhone) {
    this.channelPhone = channelPhone;
  }


  public String getChannelQrCode() {
    return channelQrCode;
  }

  public void setChannelQrCode(String channelQrCode) {
    this.channelQrCode = channelQrCode;
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
