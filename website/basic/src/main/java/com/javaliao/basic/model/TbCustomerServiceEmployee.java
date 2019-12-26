package com.javaliao.basic.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbCustomerServiceEmployee implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "客服人员名称")
    private String customerServiceName;

    @ApiModelProperty(value = "客服人员电话")
    private String customerServicePhone;

    @ApiModelProperty(value = "客服人员微信号")
    private String customerServiceWechar;

    @ApiModelProperty(value = "客服人员QQ")
    private String customerServiceQq;

    @ApiModelProperty(value = "客服人员类型")
    private String customerServiceType;

    @ApiModelProperty(value = "是否删除：1删除，0未删除")
    private Long isDelete;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerServiceName() {
        return customerServiceName;
    }

    public void setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
    }

    public String getCustomerServicePhone() {
        return customerServicePhone;
    }

    public void setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
    }

    public String getCustomerServiceWechar() {
        return customerServiceWechar;
    }

    public void setCustomerServiceWechar(String customerServiceWechar) {
        this.customerServiceWechar = customerServiceWechar;
    }

    public String getCustomerServiceQq() {
        return customerServiceQq;
    }

    public void setCustomerServiceQq(String customerServiceQq) {
        this.customerServiceQq = customerServiceQq;
    }

    public String getCustomerServiceType() {
        return customerServiceType;
    }

    public void setCustomerServiceType(String customerServiceType) {
        this.customerServiceType = customerServiceType;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerServiceName=").append(customerServiceName);
        sb.append(", customerServicePhone=").append(customerServicePhone);
        sb.append(", customerServiceWechar=").append(customerServiceWechar);
        sb.append(", customerServiceQq=").append(customerServiceQq);
        sb.append(", customerServiceType=").append(customerServiceType);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}