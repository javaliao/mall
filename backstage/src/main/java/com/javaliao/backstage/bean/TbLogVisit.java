package com.javaliao.backstage.bean;


public class TbLogVisit {

  private long id;
  private String ipAddress;
  private String hostName;
  private String channel;
  private String serviceDescription;
  private String visitApi;
  private String visitMethod;
  private String visitUrl;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }


  public String getVisitApi() {
    return visitApi;
  }

  public void setVisitApi(String visitApi) {
    this.visitApi = visitApi;
  }


  public String getVisitMethod() {
    return visitMethod;
  }

  public void setVisitMethod(String visitMethod) {
    this.visitMethod = visitMethod;
  }


  public String getVisitUrl() {
    return visitUrl;
  }

  public void setVisitUrl(String visitUrl) {
    this.visitUrl = visitUrl;
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
