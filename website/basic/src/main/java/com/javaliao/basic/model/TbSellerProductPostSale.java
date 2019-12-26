package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbSellerProductPostSale implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "卖家商品id")
    private Long sellerProductId;

    @ApiModelProperty(value = "卖家商品售后图册")
    private String postSalePics;

    @ApiModelProperty(value = "卖家商品售后说明")
    private String postSaleExplain;

    @ApiModelProperty(value = "卖家商品服务类型")
    private String postSaleService;

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

    public Long getSellerProductId() {
        return sellerProductId;
    }

    public void setSellerProductId(Long sellerProductId) {
        this.sellerProductId = sellerProductId;
    }

    public String getPostSalePics() {
        return postSalePics;
    }

    public void setPostSalePics(String postSalePics) {
        this.postSalePics = postSalePics;
    }

    public String getPostSaleExplain() {
        return postSaleExplain;
    }

    public void setPostSaleExplain(String postSaleExplain) {
        this.postSaleExplain = postSaleExplain;
    }

    public String getPostSaleService() {
        return postSaleService;
    }

    public void setPostSaleService(String postSaleService) {
        this.postSaleService = postSaleService;
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
        sb.append(", sellerProductId=").append(sellerProductId);
        sb.append(", postSalePics=").append(postSalePics);
        sb.append(", postSaleExplain=").append(postSaleExplain);
        sb.append(", postSaleService=").append(postSaleService);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}