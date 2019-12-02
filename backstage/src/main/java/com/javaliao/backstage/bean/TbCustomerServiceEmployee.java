package com.javaliao.backstage.bean;


public class TbCustomerServiceEmployee {

  private long id;
  private String customerServiceName;
  private String customerServicePhone;
  private String customerServiceWechar;
  private String customerServiceQq;
  private String customerServiceType;
  private long isDelete;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCustomerServiceName() {
    return customerServiceName;
  }

  public void setCustomerServiceName(String customerServiceName) {
    this.customerServiceName = customerServiceName;
  }


  public String getCustomerServicePhone() {
    return customerServicePhone;
  }

  public void setCustomerServicePhone(String customerServicePhone) {
    this.customerServicePhone = customerServicePhone;
  }


  public String getCustomerServiceWechar() {
    return customerServiceWechar;
  }

  public void setCustomerServiceWechar(String customerServiceWechar) {
    this.customerServiceWechar = customerServiceWechar;
  }


  public String getCustomerServiceQq() {
    return customerServiceQq;
  }

  public void setCustomerServiceQq(String customerServiceQq) {
    this.customerServiceQq = customerServiceQq;
  }


  public String getCustomerServiceType() {
    return customerServiceType;
  }

  public void setCustomerServiceType(String customerServiceType) {
    this.customerServiceType = customerServiceType;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
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

}
