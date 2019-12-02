package com.javaliao.backstage.bean;


public class TbActivity {

  private long id;
  private String activityPic;
  private String hotwords;
  private String activityName;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getActivityPic() {
    return activityPic;
  }

  public void setActivityPic(String activityPic) {
    this.activityPic = activityPic;
  }


  public String getHotwords() {
    return hotwords;
  }

  public void setHotwords(String hotwords) {
    this.hotwords = hotwords;
  }


  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
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
