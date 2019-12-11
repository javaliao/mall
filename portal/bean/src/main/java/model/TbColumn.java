package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbColumn implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "专题id")
    private Long specialTopicId;

    @ApiModelProperty(value = "栏目名称")
    private String columnName;

    @ApiModelProperty(value = "栏目图片集合")
    private String columnPics;

    @ApiModelProperty(value = "商品id集合")
    private String productIds;

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

    public Long getSpecialTopicId() {
        return specialTopicId;
    }

    public void setSpecialTopicId(Long specialTopicId) {
        this.specialTopicId = specialTopicId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnPics() {
        return columnPics;
    }

    public void setColumnPics(String columnPics) {
        this.columnPics = columnPics;
    }

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
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
        sb.append(", specialTopicId=").append(specialTopicId);
        sb.append(", columnName=").append(columnName);
        sb.append(", columnPics=").append(columnPics);
        sb.append(", productIds=").append(productIds);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}