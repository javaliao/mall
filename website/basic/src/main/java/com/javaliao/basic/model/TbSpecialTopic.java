package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbSpecialTopic implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "活动id")
    private Long activityId;

    @ApiModelProperty(value = "专题图标")
    private String specialIcon;

    @ApiModelProperty(value = "专题名称")
    private String specialTopicName;

    @ApiModelProperty(value = "优惠描述")
    private String discountDescribe;

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

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getSpecialIcon() {
        return specialIcon;
    }

    public void setSpecialIcon(String specialIcon) {
        this.specialIcon = specialIcon;
    }

    public String getSpecialTopicName() {
        return specialTopicName;
    }

    public void setSpecialTopicName(String specialTopicName) {
        this.specialTopicName = specialTopicName;
    }

    public String getDiscountDescribe() {
        return discountDescribe;
    }

    public void setDiscountDescribe(String discountDescribe) {
        this.discountDescribe = discountDescribe;
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
        sb.append(", activityId=").append(activityId);
        sb.append(", specialIcon=").append(specialIcon);
        sb.append(", specialTopicName=").append(specialTopicName);
        sb.append(", discountDescribe=").append(discountDescribe);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}