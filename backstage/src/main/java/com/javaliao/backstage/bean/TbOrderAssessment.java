package com.javaliao.backstage.bean;


public class TbOrderAssessment {

  private long id;
  private long orderSn;
  private String assessmentDesc;
  private String assessmentStar;
  private String assessmentStar1;
  private String assessmentStar2;
  private String assessmentStar3;
  private String assessmentStar4;
  private long shareNum;
  private long likeNum;
  private String isHidden;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(long orderSn) {
    this.orderSn = orderSn;
  }


  public String getAssessmentDesc() {
    return assessmentDesc;
  }

  public void setAssessmentDesc(String assessmentDesc) {
    this.assessmentDesc = assessmentDesc;
  }


  public String getAssessmentStar() {
    return assessmentStar;
  }

  public void setAssessmentStar(String assessmentStar) {
    this.assessmentStar = assessmentStar;
  }


  public String getAssessmentStar1() {
    return assessmentStar1;
  }

  public void setAssessmentStar1(String assessmentStar1) {
    this.assessmentStar1 = assessmentStar1;
  }


  public String getAssessmentStar2() {
    return assessmentStar2;
  }

  public void setAssessmentStar2(String assessmentStar2) {
    this.assessmentStar2 = assessmentStar2;
  }


  public String getAssessmentStar3() {
    return assessmentStar3;
  }

  public void setAssessmentStar3(String assessmentStar3) {
    this.assessmentStar3 = assessmentStar3;
  }


  public String getAssessmentStar4() {
    return assessmentStar4;
  }

  public void setAssessmentStar4(String assessmentStar4) {
    this.assessmentStar4 = assessmentStar4;
  }


  public long getShareNum() {
    return shareNum;
  }

  public void setShareNum(long shareNum) {
    this.shareNum = shareNum;
  }


  public long getLikeNum() {
    return likeNum;
  }

  public void setLikeNum(long likeNum) {
    this.likeNum = likeNum;
  }


  public String getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(String isHidden) {
    this.isHidden = isHidden;
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
