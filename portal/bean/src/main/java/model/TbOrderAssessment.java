package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbOrderAssessment implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "订单号")
    private Long orderSn;

    @ApiModelProperty(value = "评价描述")
    private String assessmentDesc;

    @ApiModelProperty(value = "订单评分")
    private String assessmentStar;

    @ApiModelProperty(value = "评分1")
    private String assessmentStar1;

    @ApiModelProperty(value = "评分2")
    private String assessmentStar2;

    @ApiModelProperty(value = "评分3")
    private String assessmentStar3;

    @ApiModelProperty(value = "评分4")
    private String assessmentStar4;

    @ApiModelProperty(value = "分享次数")
    private Long shareNum;

    @ApiModelProperty(value = "点赞次数")
    private Long likeNum;

    @ApiModelProperty(value = "是否隐藏")
    private String isHidden;

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

    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    public String getAssessmentDesc() {
        return assessmentDesc;
    }

    public void setAssessmentDesc(String assessmentDesc) {
        this.assessmentDesc = assessmentDesc;
    }

    public String getAssessmentStar() {
        return assessmentStar;
    }

    public void setAssessmentStar(String assessmentStar) {
        this.assessmentStar = assessmentStar;
    }

    public String getAssessmentStar1() {
        return assessmentStar1;
    }

    public void setAssessmentStar1(String assessmentStar1) {
        this.assessmentStar1 = assessmentStar1;
    }

    public String getAssessmentStar2() {
        return assessmentStar2;
    }

    public void setAssessmentStar2(String assessmentStar2) {
        this.assessmentStar2 = assessmentStar2;
    }

    public String getAssessmentStar3() {
        return assessmentStar3;
    }

    public void setAssessmentStar3(String assessmentStar3) {
        this.assessmentStar3 = assessmentStar3;
    }

    public String getAssessmentStar4() {
        return assessmentStar4;
    }

    public void setAssessmentStar4(String assessmentStar4) {
        this.assessmentStar4 = assessmentStar4;
    }

    public Long getShareNum() {
        return shareNum;
    }

    public void setShareNum(Long shareNum) {
        this.shareNum = shareNum;
    }

    public Long getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Long likeNum) {
        this.likeNum = likeNum;
    }

    public String getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden;
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
        sb.append(", orderSn=").append(orderSn);
        sb.append(", assessmentDesc=").append(assessmentDesc);
        sb.append(", assessmentStar=").append(assessmentStar);
        sb.append(", assessmentStar1=").append(assessmentStar1);
        sb.append(", assessmentStar2=").append(assessmentStar2);
        sb.append(", assessmentStar3=").append(assessmentStar3);
        sb.append(", assessmentStar4=").append(assessmentStar4);
        sb.append(", shareNum=").append(shareNum);
        sb.append(", likeNum=").append(likeNum);
        sb.append(", isHidden=").append(isHidden);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}