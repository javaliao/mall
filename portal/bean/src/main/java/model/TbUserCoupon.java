package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbUserCoupon implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "关联编号")
    private Long couponId;

    @ApiModelProperty(value = "优惠码")
    private String couponCode;

    @ApiModelProperty(value = "用户领取优惠券的时间")
    private Date userCouponCreateTime;

    @ApiModelProperty(value = "使用状态:使用状态：0->未使用；1->已使用；2->已过期")
    private String useStatus;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Date getUserCouponCreateTime() {
        return userCouponCreateTime;
    }

    public void setUserCouponCreateTime(Date userCouponCreateTime) {
        this.userCouponCreateTime = userCouponCreateTime;
    }

    public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
        sb.append(", userId=").append(userId);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", userCouponCreateTime=").append(userCouponCreateTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}