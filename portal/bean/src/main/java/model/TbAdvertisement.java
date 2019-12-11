package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbAdvertisement implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "广告名称")
    private String advertisementName;

    @ApiModelProperty(value = "广告图标")
    private String advertisementIcon;

    @ApiModelProperty(value = "广告图片")
    private String advertisementPic;

    @ApiModelProperty(value = "广告链接")
    private String advertisementLink;

    @ApiModelProperty(value = "广告状态")
    private String advertisementStatus;

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

    public String getAdvertisementName() {
        return advertisementName;
    }

    public void setAdvertisementName(String advertisementName) {
        this.advertisementName = advertisementName;
    }

    public String getAdvertisementIcon() {
        return advertisementIcon;
    }

    public void setAdvertisementIcon(String advertisementIcon) {
        this.advertisementIcon = advertisementIcon;
    }

    public String getAdvertisementPic() {
        return advertisementPic;
    }

    public void setAdvertisementPic(String advertisementPic) {
        this.advertisementPic = advertisementPic;
    }

    public String getAdvertisementLink() {
        return advertisementLink;
    }

    public void setAdvertisementLink(String advertisementLink) {
        this.advertisementLink = advertisementLink;
    }

    public String getAdvertisementStatus() {
        return advertisementStatus;
    }

    public void setAdvertisementStatus(String advertisementStatus) {
        this.advertisementStatus = advertisementStatus;
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
        sb.append(", advertisementName=").append(advertisementName);
        sb.append(", advertisementIcon=").append(advertisementIcon);
        sb.append(", advertisementPic=").append(advertisementPic);
        sb.append(", advertisementLink=").append(advertisementLink);
        sb.append(", advertisementStatus=").append(advertisementStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}