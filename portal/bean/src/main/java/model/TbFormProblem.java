package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbFormProblem implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "咨询人id")
    private Long consultationId;

    @ApiModelProperty(value = "客服人员id")
    private Long customerServiceEmployeeId;

    @ApiModelProperty(value = "处理是否成功")
    private String isSuccess;

    @ApiModelProperty(value = "表单创建时间")
    private Date createTime;

    @ApiModelProperty(value = "表单处理成功时间")
    private Date successTime;

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

    public Long getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Long consultationId) {
        this.consultationId = consultationId;
    }

    public Long getCustomerServiceEmployeeId() {
        return customerServiceEmployeeId;
    }

    public void setCustomerServiceEmployeeId(Long customerServiceEmployeeId) {
        this.customerServiceEmployeeId = customerServiceEmployeeId;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
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
        sb.append(", consultationId=").append(consultationId);
        sb.append(", customerServiceEmployeeId=").append(customerServiceEmployeeId);
        sb.append(", isSuccess=").append(isSuccess);
        sb.append(", createTime=").append(createTime);
        sb.append(", successTime=").append(successTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}