package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbSeller implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "卖家名")
    private String sellerName;

    @ApiModelProperty(value = "卖家信用级别")
    private String sellerCreditLevel;

    @ApiModelProperty(value = "联系人姓名")
    private String liaisonName;

    @ApiModelProperty(value = "联系人微信")
    private String liaisonWechart;

    @ApiModelProperty(value = "联系人手机")
    private String liaisonPhone;

    @ApiModelProperty(value = "联系人邮箱")
    private String liaisonEmail;

    @ApiModelProperty(value = "账号状态")
    private String accountNumberStatus;

    @ApiModelProperty(value = "营业执照号")
    private String licenseNumber;

    @ApiModelProperty(value = "税务登记证号")
    private String taxNumber;

    @ApiModelProperty(value = "开户行账号名称")
    private String bankUserName;

    @ApiModelProperty(value = "开户行账号")
    private String bankAccount;

    @ApiModelProperty(value = "法定代表人")
    private String legalPerson;

    @ApiModelProperty(value = "法定代表人身份证")
    private String legalPersonCardId;

    @ApiModelProperty(value = "省份id")
    private Long provinceId;

    @ApiModelProperty(value = "城市id")
    private Long citiesId;

    @ApiModelProperty(value = "区域id")
    private Long areaId;

    @ApiModelProperty(value = "卖家详细地址")
    private String sellerDetailAddress;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否删除：1删除，0未删除")
    private Long isDelete;

    private static final long serialVersionUID = 1L;

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

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sellerName=").append(sellerName);
        sb.append(", sellerCreditLevel=").append(sellerCreditLevel);
        sb.append(", liaisonName=").append(liaisonName);
        sb.append(", liaisonWechart=").append(liaisonWechart);
        sb.append(", liaisonPhone=").append(liaisonPhone);
        sb.append(", liaisonEmail=").append(liaisonEmail);
        sb.append(", accountNumberStatus=").append(accountNumberStatus);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", taxNumber=").append(taxNumber);
        sb.append(", bankUserName=").append(bankUserName);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", legalPersonCardId=").append(legalPersonCardId);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", citiesId=").append(citiesId);
        sb.append(", areaId=").append(areaId);
        sb.append(", sellerDetailAddress=").append(sellerDetailAddress);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}