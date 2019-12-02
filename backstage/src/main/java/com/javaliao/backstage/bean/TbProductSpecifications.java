package com.javaliao.backstage.bean;


public class TbProductSpecifications {

  private long id;
  private String specificationsName;
  private String specificationsCorrespondingPice;
  private String specificationsCorrespondingIcon;
  private String specificationsSorrespondingPic;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSpecificationsName() {
    return specificationsName;
  }

  public void setSpecificationsName(String specificationsName) {
    this.specificationsName = specificationsName;
  }


  public String getSpecificationsCorrespondingPice() {
    return specificationsCorrespondingPice;
  }

  public void setSpecificationsCorrespondingPice(String specificationsCorrespondingPice) {
    this.specificationsCorrespondingPice = specificationsCorrespondingPice;
  }


  public String getSpecificationsCorrespondingIcon() {
    return specificationsCorrespondingIcon;
  }

  public void setSpecificationsCorrespondingIcon(String specificationsCorrespondingIcon) {
    this.specificationsCorrespondingIcon = specificationsCorrespondingIcon;
  }


  public String getSpecificationsSorrespondingPic() {
    return specificationsSorrespondingPic;
  }

  public void setSpecificationsSorrespondingPic(String specificationsSorrespondingPic) {
    this.specificationsSorrespondingPic = specificationsSorrespondingPic;
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
