<#if !Request.approvalDetailVO??>
    未查询到相关资质信息！！！
</#if>
<#if Request.approvalDetailVO??>
    <table>
        <tr>
            <td>真实姓名</td>
            <td>${Request.approvalDetailVO.member.realName}</td>
        </tr>
        <tr>
            <td>用户昵称</td>
            <td>${Request.approvalDetailVO.member.nickName}</td>
        </tr>
        <tr>
            <td>身份证号</td>
            <td>${Request.approvalDetailVO.member.cardNum}</td>
        </tr>
        <tr>
            <td>手机号</td>
            <td>${Request.approvalDetailVO.member.phoneNum}</td>
        </tr>
        <tr>
            <td>Email地址</td>
            <td>${Request.approvalDetailVO.member.emailAddr}</td>
        </tr>
        <#list Request.approvalDetailVO.certInfoVOList as certInfo>
            <tr>
                <td>${certInfo.certName}</td>
                <td>
                    <img src="${certInfo.iconPath}"/>                
                </td>
            </tr>
        </#list>
    </table>
</#if>