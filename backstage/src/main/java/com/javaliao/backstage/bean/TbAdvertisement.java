package com.javaliao.backstage.bean;


import java.util.Date;

public class TbAdvertisement {

  private long id;
  private String advertisementName;
  private String advertisementIcon;
  private String advertisementPic;
  private String advertisementLink;
  private String advertisementStatus;
  private Date createTime;
  private Date updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAdvertisementName() {
    return advertisementName;
  }

  public void setAdvertisementName(String advertisementName) {
    this.advertisementName = advertisementName;
  }


  public String getAdvertisementIcon() {
    return advertisementIcon;
  }

  public void setAdvertisementIcon(String advertisementIcon) {
    this.advertisementIcon = advertisementIcon;
  }


  public String getAdvertisementPic() {
    return advertisementPic;
  }

  public void setAdvertisementPic(String advertisementPic) {
    this.advertisementPic = advertisementPic;
  }


  public String getAdvertisementLink() {
    return advertisementLink;
  }

  public void setAdvertisementLink(String advertisementLink) {
    this.advertisementLink = advertisementLink;
  }


  public String getAdvertisementStatus() {
    return advertisementStatus;
  }

  public void setAdvertisementStatus(String advertisementStatus) {
    this.advertisementStatus = advertisementStatus;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }

}
