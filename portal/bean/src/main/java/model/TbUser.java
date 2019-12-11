package model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TbUser implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String userPassword;

    @ApiModelProperty(value = "用户昵称")
    private String userNickName;

    @ApiModelProperty(value = "用户手机号")
    private String userPhone;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户等级")
    private String userRank;

    @ApiModelProperty(value = "用户累计积分")
    private String userAccumulatePoints;

    @ApiModelProperty(value = "用户性别")
    private String userGender;

    @ApiModelProperty(value = "用户头像")
    private String userIcon;

    @ApiModelProperty(value = "用户真实姓名")
    private String userRealName;

    @ApiModelProperty(value = "用户身份证")
    private String userIdcard;

    @ApiModelProperty(value = "用户密保问题")
    private String secretProtectionProblem;

    @ApiModelProperty(value = "用户密保回答")
    private String secretProtectionAnswer;

    @ApiModelProperty(value = "用户账户状态")
    private String accountStatus;

    @ApiModelProperty(value = "用户类型")
    private String userType;

    @ApiModelProperty(value = "身份证正面照")
    private String positiveImg;

    @ApiModelProperty(value = "身份证反面照")
    private String oppositeImg;

    @ApiModelProperty(value = "职业")
    private String occupation;

    @ApiModelProperty(value = "用户支付密码")
    private String payPassword;

    @ApiModelProperty(value = "是否实名认证")
    private String isCertification;

    @ApiModelProperty(value = "qq唯一标识")
    private String qqOpenId;

    @ApiModelProperty(value = "微信唯一标识")
    private String weixinOpenId;

    @ApiModelProperty(value = "微信小程序唯一标示")
    private String weixinLiteOpenId;

    @ApiModelProperty(value = "微信app唯一标识")
    private String weixinAppOpenId;

    @ApiModelProperty(value = "支付宝app唯一id")
    private String alipayAppOpenId;

    @ApiModelProperty(value = "微博唯一标识")
    private String weiboOpenId;

    @ApiModelProperty(value = "用户生日")
    private Date userBirthday;

    @ApiModelProperty(value = "用户账户创建时间")
    private Date accountCreateTime;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank;
    }

    public String getUserAccumulatePoints() {
        return userAccumulatePoints;
    }

    public void setUserAccumulatePoints(String userAccumulatePoints) {
        this.userAccumulatePoints = userAccumulatePoints;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getSecretProtectionProblem() {
        return secretProtectionProblem;
    }

    public void setSecretProtectionProblem(String secretProtectionProblem) {
        this.secretProtectionProblem = secretProtectionProblem;
    }

    public String getSecretProtectionAnswer() {
        return secretProtectionAnswer;
    }

    public void setSecretProtectionAnswer(String secretProtectionAnswer) {
        this.secretProtectionAnswer = secretProtectionAnswer;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPositiveImg() {
        return positiveImg;
    }

    public void setPositiveImg(String positiveImg) {
        this.positiveImg = positiveImg;
    }

    public String getOppositeImg() {
        return oppositeImg;
    }

    public void setOppositeImg(String oppositeImg) {
        this.oppositeImg = oppositeImg;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getIsCertification() {
        return isCertification;
    }

    public void setIsCertification(String isCertification) {
        this.isCertification = isCertification;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String getWeixinOpenId() {
        return weixinOpenId;
    }

    public void setWeixinOpenId(String weixinOpenId) {
        this.weixinOpenId = weixinOpenId;
    }

    public String getWeixinLiteOpenId() {
        return weixinLiteOpenId;
    }

    public void setWeixinLiteOpenId(String weixinLiteOpenId) {
        this.weixinLiteOpenId = weixinLiteOpenId;
    }

    public String getWeixinAppOpenId() {
        return weixinAppOpenId;
    }

    public void setWeixinAppOpenId(String weixinAppOpenId) {
        this.weixinAppOpenId = weixinAppOpenId;
    }

    public String getAlipayAppOpenId() {
        return alipayAppOpenId;
    }

    public void setAlipayAppOpenId(String alipayAppOpenId) {
        this.alipayAppOpenId = alipayAppOpenId;
    }

    public String getWeiboOpenId() {
        return weiboOpenId;
    }

    public void setWeiboOpenId(String weiboOpenId) {
        this.weiboOpenId = weiboOpenId;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Date getAccountCreateTime() {
        return accountCreateTime;
    }

    public void setAccountCreateTime(Date accountCreateTime) {
        this.accountCreateTime = accountCreateTime;
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
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userNickName=").append(userNickName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userRank=").append(userRank);
        sb.append(", userAccumulatePoints=").append(userAccumulatePoints);
        sb.append(", userGender=").append(userGender);
        sb.append(", userIcon=").append(userIcon);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", userIdcard=").append(userIdcard);
        sb.append(", secretProtectionProblem=").append(secretProtectionProblem);
        sb.append(", secretProtectionAnswer=").append(secretProtectionAnswer);
        sb.append(", accountStatus=").append(accountStatus);
        sb.append(", userType=").append(userType);
        sb.append(", positiveImg=").append(positiveImg);
        sb.append(", oppositeImg=").append(oppositeImg);
        sb.append(", occupation=").append(occupation);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", isCertification=").append(isCertification);
        sb.append(", qqOpenId=").append(qqOpenId);
        sb.append(", weixinOpenId=").append(weixinOpenId);
        sb.append(", weixinLiteOpenId=").append(weixinLiteOpenId);
        sb.append(", weixinAppOpenId=").append(weixinAppOpenId);
        sb.append(", alipayAppOpenId=").append(alipayAppOpenId);
        sb.append(", weiboOpenId=").append(weiboOpenId);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", accountCreateTime=").append(accountCreateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}