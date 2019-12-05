<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
        table tbody tr:nth-child(odd){background:#F4F4F4;}
        table tbody td:nth-child(even){color:#C00;}
    </style>
</head>
<body>
<#include "common/top.ftl">
<div class="container-fluid">
    <div class="row">
        <#include "common/sidebar.ftl">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <#if !Request.TbSeller??>
                        <form action="/sellerController/insertSeller" enctype="application/x-www-form-urlencoded" method="POST">
                            <table>
                                <tr>
                                    <td width="500">卖家名称</td>
                                    <td><input type="text" name="sellerName"></td>
                                </tr>
                                <tr>
                                    <td>联系人姓名</td>
                                    <td><input type="text" name="liaisonName"></td>
                                </tr>
                                <tr>
                                    <td>联系人手机</td>
                                    <td><input type="text" name="liaisonPhone"></td>
                                </tr>
                                <tr>
                                    <td>联系人邮箱</td>
                                    <td><input type="text" name="liaisonEmail"></td>
                                </tr>
                                <tr>
                                    <td>账号状态</td>
                                    <td><input type="text" name="accountNumberStatus"></td>
                                </tr>
                                <tr>
                                    <td>营业执照号</td>
                                    <td><input type="text" name="licenseNumber"></td>
                                </tr>
                                <tr>
                                    <td>法定代表人</td>
                                    <td><input type="text" name="legalPerson"></td>
                                </tr>
                                <tr>
                                    <td>开户行账号名称</td>
                                    <td><input type="text" name="bankUserName"></td>
                                </tr>
                                <tr>
                                    <td>卖家信用级别</td>
                                    <td><input type="text" name="sellerCreditLevel"></td>
                                </tr>
                                <tr>
                                    <td>开户行账号</td>
                                    <td><input type="text" name="bankAccount"></td>
                                </tr>
                                <tr>
                                    <td>法定代表人身份证</td>
                                    <td><input type="text" name="legalPersonCardId"></td>
                                </tr>
                                <tr><td>操作</td><td><input type="submit" value="添加"></td></tr>
                            </table>
                        </form>
                    </#if>
                    <#if Request.TbSeller??>
                        <form action="/sellerController/updateSeller" enctype="application/x-www-form-urlencoded" method="POST">
                            <table>
                                <input type="hidden" name="id" value="${TbSeller.id}">
                                <input type="hidden" name="id" value="${TbSeller.isDelete}">
                                <tr>
                                    <td width="500">卖家名称</td>
                                    <td><input type="text" name="sellerName" value="${TbSeller.sellerName}"></td>
                                </tr>
                                <tr>
                                    <td>联系人姓名</td>
                                    <td><input type="text" name="liaisonName" value="${TbSeller.liaisonName}"></td>
                                </tr>
                                <tr>
                                    <td>联系人手机</td>
                                    <td><input type="text" name="liaisonPhone" value="${TbSeller.liaisonPhone}"></td>
                                </tr>
                                <tr>
                                    <td>联系人邮箱</td>
                                    <td><input type="text" name="liaisonEmail" value="${TbSeller.liaisonEmail}"></td>
                                </tr>
                                <tr>
                                    <td>账号状态</td>
                                    <td><input type="text" name="accountNumberStatus" value="${TbSeller.accountNumberStatus}"></td>
                                </tr>
                                <tr>
                                    <td>营业执照号</td>
                                    <td><input type="text" name="licenseNumber" value="${TbSeller.licenseNumber}"></td>
                                </tr>
                                <tr>
                                    <td>法定代表人</td>
                                    <td><input type="text" name="legalPerson" value="${TbSeller.legalPerson}"></td>
                                </tr>
                                <tr>
                                    <td>开户行账号名称</td>
                                    <td><input type="text" name="bankUserName" value="${TbSeller.bankUserName}"></td>
                                </tr>
                                <tr>
                                    <td>卖家信用级别</td>
                                    <td><input type="text" name="sellerCreditLevel" value="${TbSeller.sellerCreditLevel}"></td>
                                </tr>
                                <tr>
                                    <td>开户行账号</td>
                                    <td><input type="text" name="bankAccount" value="${TbSeller.bankAccount}"></td>
                                </tr>
                                <tr>
                                    <td>法定代表人身份证</td>
                                    <td><input type="text" name="legalPersonCardId" value="${TbSeller.legalPersonCardId}"></td>
                                </tr>
                                <tr><td>操作</td><td><input type="submit" value="添加"></td></tr>
                            </table>
                        </form>
                    </#if>
                </div>
            </div>
        </div>
    </div>
</div>
<#include "common/foot.ftl">
</body>
</html>
