package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbProduct implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "卖家id")
    private Long sellerId;

    @ApiModelProperty(value = "商品编号")
    private String productSn;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品图片")
    private String productPic;

    @ApiModelProperty(value = "商品销量")
    private String productSale;

    @ApiModelProperty(value = "商品价格 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String productPice;

    @ApiModelProperty(value = "商品现价 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型")
    private String productNowPrice;

    @ApiModelProperty(value = "商品品牌")
    private String productBrand;

    @ApiModelProperty(value = "商品库存")
    private String productStock;

    @ApiModelProperty(value = "商品评价数")
    private String productAppraise;

    @ApiModelProperty(value = "商品上架发布时间")
    private Date productPublishTime;

    @ApiModelProperty(value = "商品标题")
    private String productTitle;

    @ApiModelProperty(value = "商品卖家")
    private String productSeller;

    @ApiModelProperty(value = "商品发货地")
    private String productPlaceOfDelivery;

    @ApiModelProperty(value = "商品状态：以逗号分割的商品状态：1->下架；2->上架；3->不推荐；4->推荐；5->未审核；6->审核通过；7->审核中；8->审核未通过")
    private String productStatus;

    @ApiModelProperty(value = "商品重量")
    private String productWeight;

    @ApiModelProperty(value = "商画册图片：图片以逗号分割")
    private String productAlbumPics;

    @ApiModelProperty(value = "商品规格")
    private String productSpecifications;

    @ApiModelProperty(value = "商品信用")
    private String productCredit;

    @ApiModelProperty(value = "商品服务类型：以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String productServiceIds;

    @ApiModelProperty(value = "商品详情图册：图片以逗号分割")
    private String productDetailPics;

    @ApiModelProperty(value = "商品描述说明")
    private String productDescription;

    @ApiModelProperty(value = "商品小图标")
    private String productIcon;

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

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductSale() {
        return productSale;
    }

    public void setProductSale(String productSale) {
        this.productSale = productSale;
    }

    public String getProductPice() {
        return productPice;
    }

    public void setProductPice(String productPice) {
        this.productPice = productPice;
    }

    public String getProductNowPrice() {
        return productNowPrice;
    }

    public void setProductNowPrice(String productNowPrice) {
        this.productNowPrice = productNowPrice;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock;
    }

    public String getProductAppraise() {
        return productAppraise;
    }

    public void setProductAppraise(String productAppraise) {
        this.productAppraise = productAppraise;
    }

    public Date getProductPublishTime() {
        return productPublishTime;
    }

    public void setProductPublishTime(Date productPublishTime) {
        this.productPublishTime = productPublishTime;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductSeller() {
        return productSeller;
    }

    public void setProductSeller(String productSeller) {
        this.productSeller = productSeller;
    }

    public String getProductPlaceOfDelivery() {
        return productPlaceOfDelivery;
    }

    public void setProductPlaceOfDelivery(String productPlaceOfDelivery) {
        this.productPlaceOfDelivery = productPlaceOfDelivery;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductAlbumPics() {
        return productAlbumPics;
    }

    public void setProductAlbumPics(String productAlbumPics) {
        this.productAlbumPics = productAlbumPics;
    }

    public String getProductSpecifications() {
        return productSpecifications;
    }

    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications;
    }

    public String getProductCredit() {
        return productCredit;
    }

    public void setProductCredit(String productCredit) {
        this.productCredit = productCredit;
    }

    public String getProductServiceIds() {
        return productServiceIds;
    }

    public void setProductServiceIds(String productServiceIds) {
        this.productServiceIds = productServiceIds;
    }

    public String getProductDetailPics() {
        return productDetailPics;
    }

    public void setProductDetailPics(String productDetailPics) {
        this.productDetailPics = productDetailPics;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
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
        sb.append(", sellerId=").append(sellerId);
        sb.append(", productSn=").append(productSn);
        sb.append(", productName=").append(productName);
        sb.append(", productPic=").append(productPic);
        sb.append(", productSale=").append(productSale);
        sb.append(", productPice=").append(productPice);
        sb.append(", productNowPrice=").append(productNowPrice);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productStock=").append(productStock);
        sb.append(", productAppraise=").append(productAppraise);
        sb.append(", productPublishTime=").append(productPublishTime);
        sb.append(", productTitle=").append(productTitle);
        sb.append(", productSeller=").append(productSeller);
        sb.append(", productPlaceOfDelivery=").append(productPlaceOfDelivery);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", productWeight=").append(productWeight);
        sb.append(", productAlbumPics=").append(productAlbumPics);
        sb.append(", productSpecifications=").append(productSpecifications);
        sb.append(", productCredit=").append(productCredit);
        sb.append(", productServiceIds=").append(productServiceIds);
        sb.append(", productDetailPics=").append(productDetailPics);
        sb.append(", productDescription=").append(productDescription);
        sb.append(", productIcon=").append(productIcon);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}