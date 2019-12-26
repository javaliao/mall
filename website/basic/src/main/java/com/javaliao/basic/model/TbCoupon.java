package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbCoupon implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "优惠券图标")
    private String couponIcon;

    @ApiModelProperty(value = "优惠券名称")
    private String couponName;

    @ApiModelProperty(value = "优惠券发行数量")
    private String couponPublishCount;

    @ApiModelProperty(value = "优惠券已使用数量")
    private String couponUseCount;

    @ApiModelProperty(value = "优惠券领取数量")
    private String couponReceiveCount;

    @ApiModelProperty(value = "优惠券抵扣金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String couponAmount;

    @ApiModelProperty(value = "每人限领张数")
    private String personLimit;

    @ApiModelProperty(value = "开始可使用时间")
    private Date startTime;

    @ApiModelProperty(value = "结束可使用时间")
    private Date endTime;

    @ApiModelProperty(value = "使用类型")
    private String useType;

    @ApiModelProperty(value = "优惠码")
    private String couponCode;

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

    public String getCouponIcon() {
        return couponIcon;
    }

    public void setCouponIcon(String couponIcon) {
        this.couponIcon = couponIcon;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponPublishCount() {
        return couponPublishCount;
    }

    public void setCouponPublishCount(String couponPublishCount) {
        this.couponPublishCount = couponPublishCount;
    }

    public String getCouponUseCount() {
        return couponUseCount;
    }

    public void setCouponUseCount(String couponUseCount) {
        this.couponUseCount = couponUseCount;
    }

    public String getCouponReceiveCount() {
        return couponReceiveCount;
    }

    public void setCouponReceiveCount(String couponReceiveCount) {
        this.couponReceiveCount = couponReceiveCount;
    }

    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getPersonLimit() {
        return personLimit;
    }

    public void setPersonLimit(String personLimit) {
        this.personLimit = personLimit;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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
        sb.append(", couponIcon=").append(couponIcon);
        sb.append(", couponName=").append(couponName);
        sb.append(", couponPublishCount=").append(couponPublishCount);
        sb.append(", couponUseCount=").append(couponUseCount);
        sb.append(", couponReceiveCount=").append(couponReceiveCount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", personLimit=").append(personLimit);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", useType=").append(useType);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}