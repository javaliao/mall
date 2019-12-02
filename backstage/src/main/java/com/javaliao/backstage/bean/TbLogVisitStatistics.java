package com.javaliao.backstage.bean;


public class TbLogVisitStatistics {

  private long id;
  private long logVisitId;
  private String visitMethod;
  private String visitParams;
  private String visitThrowingErro;
  private String visitResult;
  private long visitNum;
  private java.sql.Timestamp visitStartTime;
  private java.sql.Timestamp visitEndTime;
  private long visitTimeConsuming;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getLogVisitId() {
    return logVisitId;
  }

  public void setLogVisitId(long logVisitId) {
    this.logVisitId = logVisitId;
  }


  public String getVisitMethod() {
    return visitMethod;
  }

  public void setVisitMethod(String visitMethod) {
    this.visitMethod = visitMethod;
  }


  public String getVisitParams() {
    return visitParams;
  }

  public void setVisitParams(String visitParams) {
    this.visitParams = visitParams;
  }


  public String getVisitThrowingErro() {
    return visitThrowingErro;
  }

  public void setVisitThrowingErro(String visitThrowingErro) {
    this.visitThrowingErro = visitThrowingErro;
  }


  public String getVisitResult() {
    return visitResult;
  }

  public void setVisitResult(String visitResult) {
    this.visitResult = visitResult;
  }


  public long getVisitNum() {
    return visitNum;
  }

  public void setVisitNum(long visitNum) {
    this.visitNum = visitNum;
  }


  public java.sql.Timestamp getVisitStartTime() {
    return visitStartTime;
  }

  public void setVisitStartTime(java.sql.Timestamp visitStartTime) {
    this.visitStartTime = visitStartTime;
  }


  public java.sql.Timestamp getVisitEndTime() {
    return visitEndTime;
  }

  public void setVisitEndTime(java.sql.Timestamp visitEndTime) {
    this.visitEndTime = visitEndTime;
  }


  public long getVisitTimeConsuming() {
    return visitTimeConsuming;
  }

  public void setVisitTimeConsuming(long visitTimeConsuming) {
    this.visitTimeConsuming = visitTimeConsuming;
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
