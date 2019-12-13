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
                    <#if !Request.tbUser??>
                        <form action="/userController/insertUser" enctype="application/x-www-form-urlencoded" method="POST">
                            <table>
                                <tr>
                                    <td width="500">用户名</td>
                                    <td><input type="text" name="userName"></td>
                                </tr>
                                <tr>
                                    <td>用户手机号</td>
                                    <td><input type="text" name="userPhone"></td>
                                </tr>
                                <tr>
                                    <td>用户邮箱</td>
                                    <td><input type="text" name="userEmail"></td>
                                </tr>
                                <tr>
                                    <td>用户等级</td>
                                    <td><input type="text" name="userRank"></td>
                                </tr>
                                <tr>
                                    <td>用户累计积分</td>
                                    <td><input type="text" name="userAccumulatePoints"></td>
                                </tr>
                                <tr>
                                    <td>用户真实姓名</td>
                                    <td><input type="text" name="userRealName"></td>
                                </tr>
                                <tr><td>操作</td><td><input type="submit" value="添加"></td></tr>
                            </table>
                        </form>
                    </#if>
                    <#if Request.tbUser??>
                        <form action="/userController/updateUser" enctype="application/x-www-form-urlencoded" method="POST">
                            <table>
                                <input type="hidden" name="id" value="${tbUser.id}">
                                <input type="hidden" name="isDelete" value="${tbUser.isDelete}">
                                <tr>
                                    <td width="500">用户名</td>
                                    <td><input type="text" name="userName" value="${tbUser.userName}"></td>
                                </tr>
                                <tr>
                                    <td>用户手机号</td>
                                    <td><input type="text" name="userPhone" value="${tbUser.userPhone}"></td>
                                </tr>
                                <tr>
                                    <td>用户邮箱</td>
                                    <td><input type="text" name="userEmail" value="${tbUser.userEmail}"></td>
                                </tr>
                                <tr>
                                    <td>用户等级</td>
                                    <td><input type="text" name="userRank" value="${tbUser.userRank}"></td>
                                </tr>
                                <tr>
                                    <td>用户累计积分</td>
                                    <td><input type="text" name="userAccumulatePoints" value="${tbUser.userAccumulatePoints}"></td>
                                </tr>
                                <tr>
                                    <td>用户真实姓名</td>
                                    <td><input type="text" name="userRealName" value="${tbUser.userRealName}"></td>
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
