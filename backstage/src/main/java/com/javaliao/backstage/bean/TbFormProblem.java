package com.javaliao.backstage.bean;


public class TbFormProblem {

  private long id;
  private long consultationId;
  private long customerServiceEmployeeId;
  private String isSuccess;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp successTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getConsultationId() {
    return consultationId;
  }

  public void setConsultationId(long consultationId) {
    this.consultationId = consultationId;
  }


  public long getCustomerServiceEmployeeId() {
    return customerServiceEmployeeId;
  }

  public void setCustomerServiceEmployeeId(long customerServiceEmployeeId) {
    this.customerServiceEmployeeId = customerServiceEmployeeId;
  }


  public String getIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(String isSuccess) {
    this.isSuccess = isSuccess;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getSuccessTime() {
    return successTime;
  }

  public void setSuccessTime(java.sql.Timestamp successTime) {
    this.successTime = successTime;
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
