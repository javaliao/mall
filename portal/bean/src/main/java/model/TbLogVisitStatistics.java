package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbLogVisitStatistics implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "日志访客关联id")
    private Long logVisitId;

    @ApiModelProperty(value = "访问方法")
    private String visitMethod;

    @ApiModelProperty(value = "访问参数")
    private String visitParams;

    @ApiModelProperty(value = "访问抛的异常")
    private String visitThrowingErro;

    @ApiModelProperty(value = "访问结果")
    private String visitResult;

    @ApiModelProperty(value = "调用次数")
    private Long visitNum;

    @ApiModelProperty(value = "访问开始时间")
    private Date visitStartTime;

    @ApiModelProperty(value = "访问结束时间")
    private Date visitEndTime;

    @ApiModelProperty(value = "访问耗时")
    private Long visitTimeConsuming;

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

    public Long getLogVisitId() {
        return logVisitId;
    }

    public void setLogVisitId(Long logVisitId) {
        this.logVisitId = logVisitId;
    }

    public String getVisitMethod() {
        return visitMethod;
    }

    public void setVisitMethod(String visitMethod) {
        this.visitMethod = visitMethod;
    }

    public String getVisitParams() {
        return visitParams;
    }

    public void setVisitParams(String visitParams) {
        this.visitParams = visitParams;
    }

    public String getVisitThrowingErro() {
        return visitThrowingErro;
    }

    public void setVisitThrowingErro(String visitThrowingErro) {
        this.visitThrowingErro = visitThrowingErro;
    }

    public String getVisitResult() {
        return visitResult;
    }

    public void setVisitResult(String visitResult) {
        this.visitResult = visitResult;
    }

    public Long getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Long visitNum) {
        this.visitNum = visitNum;
    }

    public Date getVisitStartTime() {
        return visitStartTime;
    }

    public void setVisitStartTime(Date visitStartTime) {
        this.visitStartTime = visitStartTime;
    }

    public Date getVisitEndTime() {
        return visitEndTime;
    }

    public void setVisitEndTime(Date visitEndTime) {
        this.visitEndTime = visitEndTime;
    }

    public Long getVisitTimeConsuming() {
        return visitTimeConsuming;
    }

    public void setVisitTimeConsuming(Long visitTimeConsuming) {
        this.visitTimeConsuming = visitTimeConsuming;
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
        sb.append(", logVisitId=").append(logVisitId);
        sb.append(", visitMethod=").append(visitMethod);
        sb.append(", visitParams=").append(visitParams);
        sb.append(", visitThrowingErro=").append(visitThrowingErro);
        sb.append(", visitResult=").append(visitResult);
        sb.append(", visitNum=").append(visitNum);
        sb.append(", visitStartTime=").append(visitStartTime);
        sb.append(", visitEndTime=").append(visitEndTime);
        sb.append(", visitTimeConsuming=").append(visitTimeConsuming);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}