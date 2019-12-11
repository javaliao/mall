package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbLogVisit implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "ip地址")
    private String ipAddress;

    @ApiModelProperty(value = "机器名称")
    private String hostName;

    @ApiModelProperty(value = "渠道")
    private String channel;

    @ApiModelProperty(value = "业务描述")
    private String serviceDescription;

    @ApiModelProperty(value = "接口")
    private String visitApi;

    @ApiModelProperty(value = "方法")
    private String visitMethod;

    @ApiModelProperty(value = "资源路径")
    private String visitUrl;

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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getVisitApi() {
        return visitApi;
    }

    public void setVisitApi(String visitApi) {
        this.visitApi = visitApi;
    }

    public String getVisitMethod() {
        return visitMethod;
    }

    public void setVisitMethod(String visitMethod) {
        this.visitMethod = visitMethod;
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl;
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
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", hostName=").append(hostName);
        sb.append(", channel=").append(channel);
        sb.append(", serviceDescription=").append(serviceDescription);
        sb.append(", visitApi=").append(visitApi);
        sb.append(", visitMethod=").append(visitMethod);
        sb.append(", visitUrl=").append(visitUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}