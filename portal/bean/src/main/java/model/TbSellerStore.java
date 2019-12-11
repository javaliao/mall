package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbSellerStore implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "卖家id")
    private Long sellerId;

    @ApiModelProperty(value = "卖家店铺名称")
    private String sellerStoreName;

    @ApiModelProperty(value = "卖家店铺简介")
    private String sellerStoreSynopsis;

    @ApiModelProperty(value = "卖家店铺logo图标")
    private String sellerStoreIcon;

    @ApiModelProperty(value = "卖家店铺创建日期")
    private Date sellerStoreCreateTime;

    @ApiModelProperty(value = "卖家店铺分类属性名称")
    private String sellerStoreCategoryAttributeName;

    @ApiModelProperty(value = "卖家店铺分类属性值")
    private String sellerStoreCategoryAttributeValues;

    @ApiModelProperty(value = "卖家店铺热销的商品")
    private String sellerStoreSellWellProducts;

    @ApiModelProperty(value = "卖家店铺热门关注的商品")
    private String sellerStoreHotAttentionProducts;

    @ApiModelProperty(value = "卖家店铺新品")
    private String sellerStoreNewProducts;

    @ApiModelProperty(value = "卖家店铺首页轮播图")
    private String sellerStoreHomePageCarouselPic;

    @ApiModelProperty(value = "卖家店铺图册")
    private String sellerStorePics;

    @ApiModelProperty(value = "卖家店铺商品")
    private String sellerStoreProducts;

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

    public String getSellerStoreName() {
        return sellerStoreName;
    }

    public void setSellerStoreName(String sellerStoreName) {
        this.sellerStoreName = sellerStoreName;
    }

    public String getSellerStoreSynopsis() {
        return sellerStoreSynopsis;
    }

    public void setSellerStoreSynopsis(String sellerStoreSynopsis) {
        this.sellerStoreSynopsis = sellerStoreSynopsis;
    }

    public String getSellerStoreIcon() {
        return sellerStoreIcon;
    }

    public void setSellerStoreIcon(String sellerStoreIcon) {
        this.sellerStoreIcon = sellerStoreIcon;
    }

    public Date getSellerStoreCreateTime() {
        return sellerStoreCreateTime;
    }

    public void setSellerStoreCreateTime(Date sellerStoreCreateTime) {
        this.sellerStoreCreateTime = sellerStoreCreateTime;
    }

    public String getSellerStoreCategoryAttributeName() {
        return sellerStoreCategoryAttributeName;
    }

    public void setSellerStoreCategoryAttributeName(String sellerStoreCategoryAttributeName) {
        this.sellerStoreCategoryAttributeName = sellerStoreCategoryAttributeName;
    }

    public String getSellerStoreCategoryAttributeValues() {
        return sellerStoreCategoryAttributeValues;
    }

    public void setSellerStoreCategoryAttributeValues(String sellerStoreCategoryAttributeValues) {
        this.sellerStoreCategoryAttributeValues = sellerStoreCategoryAttributeValues;
    }

    public String getSellerStoreSellWellProducts() {
        return sellerStoreSellWellProducts;
    }

    public void setSellerStoreSellWellProducts(String sellerStoreSellWellProducts) {
        this.sellerStoreSellWellProducts = sellerStoreSellWellProducts;
    }

    public String getSellerStoreHotAttentionProducts() {
        return sellerStoreHotAttentionProducts;
    }

    public void setSellerStoreHotAttentionProducts(String sellerStoreHotAttentionProducts) {
        this.sellerStoreHotAttentionProducts = sellerStoreHotAttentionProducts;
    }

    public String getSellerStoreNewProducts() {
        return sellerStoreNewProducts;
    }

    public void setSellerStoreNewProducts(String sellerStoreNewProducts) {
        this.sellerStoreNewProducts = sellerStoreNewProducts;
    }

    public String getSellerStoreHomePageCarouselPic() {
        return sellerStoreHomePageCarouselPic;
    }

    public void setSellerStoreHomePageCarouselPic(String sellerStoreHomePageCarouselPic) {
        this.sellerStoreHomePageCarouselPic = sellerStoreHomePageCarouselPic;
    }

    public String getSellerStorePics() {
        return sellerStorePics;
    }

    public void setSellerStorePics(String sellerStorePics) {
        this.sellerStorePics = sellerStorePics;
    }

    public String getSellerStoreProducts() {
        return sellerStoreProducts;
    }

    public void setSellerStoreProducts(String sellerStoreProducts) {
        this.sellerStoreProducts = sellerStoreProducts;
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
        sb.append(", sellerStoreName=").append(sellerStoreName);
        sb.append(", sellerStoreSynopsis=").append(sellerStoreSynopsis);
        sb.append(", sellerStoreIcon=").append(sellerStoreIcon);
        sb.append(", sellerStoreCreateTime=").append(sellerStoreCreateTime);
        sb.append(", sellerStoreCategoryAttributeName=").append(sellerStoreCategoryAttributeName);
        sb.append(", sellerStoreCategoryAttributeValues=").append(sellerStoreCategoryAttributeValues);
        sb.append(", sellerStoreSellWellProducts=").append(sellerStoreSellWellProducts);
        sb.append(", sellerStoreHotAttentionProducts=").append(sellerStoreHotAttentionProducts);
        sb.append(", sellerStoreNewProducts=").append(sellerStoreNewProducts);
        sb.append(", sellerStoreHomePageCarouselPic=").append(sellerStoreHomePageCarouselPic);
        sb.append(", sellerStorePics=").append(sellerStorePics);
        sb.append(", sellerStoreProducts=").append(sellerStoreProducts);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}