package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbFrequentProblem implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "问题类型")
    private String problemType;

    @ApiModelProperty(value = "问题频率")
    private Long problemFrequent;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否删除：1删除，0未删除")
    private Long isDelete;

    @ApiModelProperty(value = "问题")
    private byte[] problem;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public Long getProblemFrequent() {
        return problemFrequent;
    }

    public void setProblemFrequent(Long problemFrequent) {
        this.problemFrequent = problemFrequent;
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

    public byte[] getProblem() {
        return problem;
    }

    public void setProblem(byte[] problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", problemType=").append(problemType);
        sb.append(", problemFrequent=").append(problemFrequent);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", problem=").append(problem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}