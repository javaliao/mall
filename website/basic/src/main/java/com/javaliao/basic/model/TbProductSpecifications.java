package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbProductSpecifications implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "规格名称")
    private String specificationsName;

    @ApiModelProperty(value = "规格对应的价格")
    private String specificationsCorrespondingPice;

    @ApiModelProperty(value = "规格对应的图标")
    private String specificationsCorrespondingIcon;

    @ApiModelProperty(value = "规格对应的图片")
    private String specificationsSorrespondingPic;

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

    public String getSpecificationsName() {
        return specificationsName;
    }

    public void setSpecificationsName(String specificationsName) {
        this.specificationsName = specificationsName;
    }

    public String getSpecificationsCorrespondingPice() {
        return specificationsCorrespondingPice;
    }

    public void setSpecificationsCorrespondingPice(String specificationsCorrespondingPice) {
        this.specificationsCorrespondingPice = specificationsCorrespondingPice;
    }

    public String getSpecificationsCorrespondingIcon() {
        return specificationsCorrespondingIcon;
    }

    public void setSpecificationsCorrespondingIcon(String specificationsCorrespondingIcon) {
        this.specificationsCorrespondingIcon = specificationsCorrespondingIcon;
    }

    public String getSpecificationsSorrespondingPic() {
        return specificationsSorrespondingPic;
    }

    public void setSpecificationsSorrespondingPic(String specificationsSorrespondingPic) {
        this.specificationsSorrespondingPic = specificationsSorrespondingPic;
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
        sb.append(", specificationsName=").append(specificationsName);
        sb.append(", specificationsCorrespondingPice=").append(specificationsCorrespondingPice);
        sb.append(", specificationsCorrespondingIcon=").append(specificationsCorrespondingIcon);
        sb.append(", specificationsSorrespondingPic=").append(specificationsSorrespondingPic);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}