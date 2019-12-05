package com.javaliao.backstage.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TbSeller implements Serializable {
  //表单类型都为String，所以这里将类型转换成String
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String sellerName;
  private String sellerCreditLevel;
  private String liaisonName;
  private String liaisonWechart;
  private String liaisonPhone;
  private String liaisonEmail;
  private String accountNumberStatus;
  private String licenseNumber;
  private String taxNumber;
  private String bankUserName;
  private String bankAccount;
  private String legalPerson;
  private String legalPersonCardId;
  private Long provinceId;
  private Long citiesId;
  private Long areaId;
  private String sellerDetailAddress;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private Long isDelete;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }


  public String getSellerCreditLevel() {
    return sellerCreditLevel;
  }

  public void setSellerCreditLevel(String sellerCreditLevel) {
    this.sellerCreditLevel = sellerCreditLevel;
  }


  public String getLiaisonName() {
    return liaisonName;
  }

  public void setLiaisonName(String liaisonName) {
    this.liaisonName = liaisonName;
  }


  public String getLiaisonWechart() {
    return liaisonWechart;
  }

  public void setLiaisonWechart(String liaisonWechart) {
    this.liaisonWechart = liaisonWechart;
  }


  public String getLiaisonPhone() {
    return liaisonPhone;
  }

  public void setLiaisonPhone(String liaisonPhone) {
    this.liaisonPhone = liaisonPhone;
  }


  public String getLiaisonEmail() {
    return liaisonEmail;
  }

  public void setLiaisonEmail(String liaisonEmail) {
    this.liaisonEmail = liaisonEmail;
  }


  public String getAccountNumberStatus() {
    return accountNumberStatus;
  }

  public void setAccountNumberStatus(String accountNumberStatus) {
    this.accountNumberStatus = accountNumberStatus;
  }


  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }


  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }


  public String getBankUserName() {
    return bankUserName;
  }

  public void setBankUserName(String bankUserName) {
    this.bankUserName = bankUserName;
  }


  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public String getLegalPerson() {
    return legalPerson;
  }

  public void setLegalPerson(String legalPerson) {
    this.legalPerson = legalPerson;
  }


  public String getLegalPersonCardId() {
    return legalPersonCardId;
  }

  public void setLegalPersonCardId(String legalPersonCardId) {
    this.legalPersonCardId = legalPersonCardId;
  }


  public Long getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(Long provinceId) {
    this.provinceId = provinceId;
  }


  public Long getCitiesId() {
    return citiesId;
  }

  public void setCitiesId(Long citiesId) {
    this.citiesId = citiesId;
  }


  public Long getAreaId() {
    return areaId;
  }

  public void setAreaId(Long areaId) {
    this.areaId = areaId;
  }


  public String getSellerDetailAddress() {
    return sellerDetailAddress;
  }

  public void setSellerDetailAddress(String sellerDetailAddress) {
    this.sellerDetailAddress = sellerDetailAddress;
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


  public Long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Long isDelete) {
    this.isDelete = isDelete;
  }

}
