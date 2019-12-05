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
                    <form action="/sellerController/sellerSearch"  enctype="application/x-www-form-urlencoded" method="POST"
                          class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input class="form-control has-success" type="text" placeholder="请输入卖家名称" name="sellerName">
                                <input class="form-control has-success" type="text" placeholder="请输入联系人姓名" name="liaisonName">
                                <input class="form-control has-success" type="text" placeholder="请输入联系人手机" name="liaisonPhone">
                            </div>
                        </div>
                        <button type="submit" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i>查询</button>
                        <button type="button" class="btn btn-warning"><i class="glyphicon glyphicon-plus"></i><a href="/jumpController/toSellerModify">添加</a></button>
                    </form>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <#if !Request.sellerList??>
                                <tr><td>目前没有卖家数据</td></tr>
                            </#if>
                            <#if Request.sellerList??>
                                <thead>
                                <tr >
                                    <th>卖家名称</th>
                                    <th>联系人姓名</th>
                                    <th>联系人手机</th>
                                    <th>联系人邮箱</th>
                                    <th>账号状态</th>
                                    <th>营业执照号</th>
                                    <th>法定代表人</th>
                                    <th>开户行账号名称</th>
                                    <th>卖家信用级别</th>
                                    <th width="100">操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                    <#list Request.sellerList as seller>
                                        <tr>
                                            <td>${seller.sellerName}</td>
                                            <td>${seller.liaisonName}</td>
                                            <td>${seller.liaisonPhone}</td>
                                            <td>${seller.liaisonEmail}</td>
                                            <td>${seller.accountNumberStatus}</td>
                                            <td>${seller.licenseNumber}</td>
                                            <td>${seller.legalPerson}</td>
                                            <td>${seller.bankUserName}</td>
                                            <td>${seller.sellerCreditLevel}</td>
                                            <td>
                                                <a href='/sellerController/getSellerById?sellerId=${seller.id}' class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></a>
                                                <a href="/sellerController/removeSellerById?sellerId=${seller.id}" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></a>
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
