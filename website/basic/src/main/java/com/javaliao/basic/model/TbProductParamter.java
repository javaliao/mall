package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbProductParamter implements Serializable {
    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "关联编号")
    private Long productParamterTypeId;

    @ApiModelProperty(value = "商品参数名称")
    private String productParamterName;

    @ApiModelProperty(value = "商品参数值")
    private String productParamterValue;

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

    public Long getProductParamterTypeId() {
        return productParamterTypeId;
    }

    public void setProductParamterTypeId(Long productParamterTypeId) {
        this.productParamterTypeId = productParamterTypeId;
    }

    public String getProductParamterName() {
        return productParamterName;
    }

    public void setProductParamterName(String productParamterName) {
        this.productParamterName = productParamterName;
    }

    public String getProductParamterValue() {
        return productParamterValue;
    }

    public void setProductParamterValue(String productParamterValue) {
        this.productParamterValue = productParamterValue;
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
        sb.append(", productParamterTypeId=").append(productParamterTypeId);
        sb.append(", productParamterName=").append(productParamterName);
        sb.append(", productParamterValue=").append(productParamterValue);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}