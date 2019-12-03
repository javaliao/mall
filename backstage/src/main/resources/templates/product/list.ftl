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
                    <form class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input class="form-control has-success" type="text" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="button" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i> 查询</button>
                        <button type="button" class="btn btn-warning"><a href="/toModify"> <i class="glyphicon glyphicon-search"></i> 添加</a></button>
                    </form><br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <#if !Request.tbProducts??>
                                <tr><td>目前没有商品数据</td></tr>
                            </#if>
                            <#if Request.tbProducts??>
                                <thead>
                                <tr >
                                    <th>商品编号</th>
                                    <th>商品名称</th>
                                    <th>商品库存</th>
                                    <th>商品价格</th>
                                    <th>商品卖家</th>
                                    <th>商品状态</th>
                                    <th>商品图标</th>
                                    <th>商品详情</th>
                                    <th width="100">操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                    <#list Request.tbProducts as tbProduct>
                                        <tr>
                                            <td>${tbProduct.productSn}</td>
                                            <td>${tbProduct.productName}</td>
                                            <td>${tbProduct.productStock}</td>
                                            <td>${tbProduct.productPice}</td>
                                            <td>${tbProduct.productSeller}</td>
                                            <td>${tbProduct.productStatus}</td>
                                            <td>${tbProduct.productIcon}</td>
                                            <td><a href="#">查看详细信息</a></td>
                                            <td>
                                                <a href='/toModifyById?productId=${tbProduct.id}' class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></a>
                                                <a href="/removeProduct?productId=${tbProduct.id}" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></a>
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
