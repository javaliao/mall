package com.javaliao.backstage.bean;


public class TbFrequentProblem {

  private long id;
  private String problemType;
  private String problem;
  private long problemFrequent;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProblemType() {
    return problemType;
  }

  public void setProblemType(String problemType) {
    this.problemType = problemType;
  }


  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }


  public long getProblemFrequent() {
    return problemFrequent;
  }

  public void setProblemFrequent(long problemFrequent) {
    this.problemFrequent = problemFrequent;
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
