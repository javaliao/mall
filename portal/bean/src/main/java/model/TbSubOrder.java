package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbSubOrder implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "商品id")
    private Long productId;

    @ApiModelProperty(value = "卖家id")
    private Long sellerId;

    @ApiModelProperty(value = "用户优惠券id")
    private Long userCouponId;

    @ApiModelProperty(value = "子订单号")
    private Long orderNo;

    @ApiModelProperty(value = "父订单号")
    private Long orderSn;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品图标")
    private String productIcon;

    @ApiModelProperty(value = "商品规格")
    private String productSpecifications;

    @ApiModelProperty(value = "商品品牌名称")
    private String productBrandName;

    @ApiModelProperty(value = "商品卖家名称")
    private String productSellerName;

    @ApiModelProperty(value = "商品价格 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String productPrice;

    @ApiModelProperty(value = "商品数量")
    private String productQuantity;

    @ApiModelProperty(value = "商品现价 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String productNowPrice;

    @ApiModelProperty(value = "订单状态")
    private String orderState;

    @ApiModelProperty(value = "商品优惠券价格 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String productCouponPrice;

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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(Long userCouponId) {
        this.userCouponId = userCouponId;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public String getProductSpecifications() {
        return productSpecifications;
    }

    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications;
    }

    public String getProductBrandName() {
        return productBrandName;
    }

    public void setProductBrandName(String productBrandName) {
        this.productBrandName = productBrandName;
    }

    public String getProductSellerName() {
        return productSellerName;
    }

    public void setProductSellerName(String productSellerName) {
        this.productSellerName = productSellerName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductNowPrice() {
        return productNowPrice;
    }

    public void setProductNowPrice(String productNowPrice) {
        this.productNowPrice = productNowPrice;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getProductCouponPrice() {
        return productCouponPrice;
    }

    public void setProductCouponPrice(String productCouponPrice) {
        this.productCouponPrice = productCouponPrice;
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
        sb.append(", productId=").append(productId);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", userCouponId=").append(userCouponId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", productName=").append(productName);
        sb.append(", productIcon=").append(productIcon);
        sb.append(", productSpecifications=").append(productSpecifications);
        sb.append(", productBrandName=").append(productBrandName);
        sb.append(", productSellerName=").append(productSellerName);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productQuantity=").append(productQuantity);
        sb.append(", productNowPrice=").append(productNowPrice);
        sb.append(", orderState=").append(orderState);
        sb.append(", productCouponPrice=").append(productCouponPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}