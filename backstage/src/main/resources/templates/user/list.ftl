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
                    <form action="/userController/userSearch"  enctype="application/x-www-form-urlencoded" method="POST"
                          class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input class="form-control has-success" type="text" placeholder="请输入用户名" name="userName">
                                <input class="form-control has-success" type="text" placeholder="请输入用户手机号" name="userPhone">
                                <input class="form-control has-success" type="text" placeholder="请输入用户真实姓名" name="userRealName">
                            </div>
                        </div>
                        <button type="submit" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i>查询</button>
                        <button type="button" class="btn btn-warning"><i class="glyphicon glyphicon-plus"></i><a href="/jumpController/toUserModify">添加</a></button>
                    </form>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <#if !Request.tbUsers??>
                                <tr><td>目前没有卖家数据</td></tr>
                            </#if>
                            <#if Request.tbUsers??>
                                <thead>
                                <tr >
                                    <th>用户名</th>
                                    <th>用户手机号</th>
                                    <th>用户邮箱</th>
                                    <th>用户等级</th>
                                    <th>用户累计积分</th>
                                    <th>用户真实姓名</th>
                                    <th width="100">操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                    <#list Request.tbUsers as tbUser>
                                        <tr>
                                            <td>${tbUser.userName}</td>
                                            <td>${tbUser.userPhone}</td>
                                            <td>${tbUser.userEmail}</td>
                                            <td>${tbUser.userRank}</td>
                                            <td>${tbUser.userAccumulatePoints}</td>
                                            <td>${tbUser.userRealName}</td>
                                            <td>
                                                <a href='/userController/getUserById?userId=${tbUser.id}' class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></a>
                                                <a href="/userController/removeUserById?userId=${tbUser.id}" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></a>
                                            </td>
                                        </tr>
                                    </#list>
                                </tbody>
                            </#if>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<#include "common/foot.ftl">
</body>
</html>
