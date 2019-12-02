package com.javaliao.backstage.bean;


public class TbAgreement {

  private long id;
  private String agreementName;
  private String html;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAgreementName() {
    return agreementName;
  }

  public void setAgreementName(String agreementName) {
    this.agreementName = agreementName;
  }


  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
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
