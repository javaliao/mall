package com.javaliao.backstage.bean;


public class TbVerificationCode {

  private long id;
  private long mobile;
  private long code;
  private java.sql.Timestamp createTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMobile() {
    return mobile;
  }

  public void setMobile(long mobile) {
    this.mobile = mobile;
  }


  public long getCode() {
    return code;
  }

  public void setCode(long code) {
    this.code = code;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }

}
