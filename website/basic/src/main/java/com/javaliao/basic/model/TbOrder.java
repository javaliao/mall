package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbOrder implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "卖家id")
    private Long sellerId;

    @ApiModelProperty(value = "商品id")
    private Long productId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "收货人姓名")
    private String receiverPersonName;

    @ApiModelProperty(value = "收货人电话")
    private String receiverPersonPhone;

    @ApiModelProperty(value = "收货省份")
    private String receiverProvince;

    @ApiModelProperty(value = "收货城市")
    private String receiverCity;

    @ApiModelProperty(value = "收货区")
    private String receiverRegion;

    @ApiModelProperty(value = "收货默认地址")
    private String receiverDetailAddress;

    @ApiModelProperty(value = "下单人姓名")
    private String placeOrderPersonName;

    @ApiModelProperty(value = "下单人电话")
    private String placeOrderPersonPhone;

    @ApiModelProperty(value = "阿里的交易订单号")
    private String alipayTradeNo;

    @ApiModelProperty(value = "订单状态：订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private String orderStatus;

    @ApiModelProperty(value = "订单总金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String totalAmount;

    @ApiModelProperty(value = "支付金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String payAmount;

    @ApiModelProperty(value = "运费金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String freightAmount;

    @ApiModelProperty(value = "物流单号")
    private String deliverySn;

    @ApiModelProperty(value = "物流公司(配送方式)")
    private String deliveryCompany;

    @ApiModelProperty(value = "下单时间")
    private Date orderCreateTime;

    @ApiModelProperty(value = "订单评价时间")
    private Date orderCommentTime;

    @ApiModelProperty(value = "订单支付时间")
    private Date orderPayTime;

    @ApiModelProperty(value = "订单发货时间")
    private Date orderDeliveryTime;

    @ApiModelProperty(value = "订单收货时间")
    private Date orderReceiveTime;

    @ApiModelProperty(value = "下单使用的积分")
    private String useIntegration;

    @ApiModelProperty(value = "订单备注")
    private String orderNote;

    @ApiModelProperty(value = "下单可增加的积分")
    private String addUserIntegration;

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

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getReceiverPersonName() {
        return receiverPersonName;
    }

    public void setReceiverPersonName(String receiverPersonName) {
        this.receiverPersonName = receiverPersonName;
    }

    public String getReceiverPersonPhone() {
        return receiverPersonPhone;
    }

    public void setReceiverPersonPhone(String receiverPersonPhone) {
        this.receiverPersonPhone = receiverPersonPhone;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    public String getPlaceOrderPersonName() {
        return placeOrderPersonName;
    }

    public void setPlaceOrderPersonName(String placeOrderPersonName) {
        this.placeOrderPersonName = placeOrderPersonName;
    }

    public String getPlaceOrderPersonPhone() {
        return placeOrderPersonPhone;
    }

    public void setPlaceOrderPersonPhone(String placeOrderPersonPhone) {
        this.placeOrderPersonPhone = placeOrderPersonPhone;
    }

    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(String freightAmount) {
        this.freightAmount = freightAmount;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCommentTime() {
        return orderCommentTime;
    }

    public void setOrderCommentTime(Date orderCommentTime) {
        this.orderCommentTime = orderCommentTime;
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Date getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    public void setOrderDeliveryTime(Date orderDeliveryTime) {
        this.orderDeliveryTime = orderDeliveryTime;
    }

    public Date getOrderReceiveTime() {
        return orderReceiveTime;
    }

    public void setOrderReceiveTime(Date orderReceiveTime) {
        this.orderReceiveTime = orderReceiveTime;
    }

    public String getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(String useIntegration) {
        this.useIntegration = useIntegration;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public String getAddUserIntegration() {
        return addUserIntegration;
    }

    public void setAddUserIntegration(String addUserIntegration) {
        this.addUserIntegration = addUserIntegration;
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
        sb.append(", sellerId=").append(sellerId);
        sb.append(", productId=").append(productId);
        sb.append(", userName=").append(userName);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", receiverPersonName=").append(receiverPersonName);
        sb.append(", receiverPersonPhone=").append(receiverPersonPhone);
        sb.append(", receiverProvince=").append(receiverProvince);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverRegion=").append(receiverRegion);
        sb.append(", receiverDetailAddress=").append(receiverDetailAddress);
        sb.append(", placeOrderPersonName=").append(placeOrderPersonName);
        sb.append(", placeOrderPersonPhone=").append(placeOrderPersonPhone);
        sb.append(", alipayTradeNo=").append(alipayTradeNo);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", freightAmount=").append(freightAmount);
        sb.append(", deliverySn=").append(deliverySn);
        sb.append(", deliveryCompany=").append(deliveryCompany);
        sb.append(", orderCreateTime=").append(orderCreateTime);
        sb.append(", orderCommentTime=").append(orderCommentTime);
        sb.append(", orderPayTime=").append(orderPayTime);
        sb.append(", orderDeliveryTime=").append(orderDeliveryTime);
        sb.append(", orderReceiveTime=").append(orderReceiveTime);
        sb.append(", useIntegration=").append(useIntegration);
        sb.append(", orderNote=").append(orderNote);
        sb.append(", addUserIntegration=").append(addUserIntegration);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}