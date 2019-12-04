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
                        <button type="button" class="btn btn-warning"><a href="/jumpController/toProductCategoryModify?id=${parentId}"> <i class="glyphicon"></i> 添加</a></button>
                    </form><br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <#if !Request.tbProductCategories??>
                                <tr><td>目前没有商品分类数据</td></tr>
                            </#if>
                            <#if Request.tbProductCategories??>
                                <thead>
                                <tr >
                                    <th>主键id</th>
                                    <th>父id</th>
                                    <th>分类名称</th>
                                    <th>分类的图标</th>
                                    <th>分类下的产品数量</th>
                                    <th>查看下一级</th>
                                    <th width="100">操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <#list Request.tbProductCategories as tbProductCategory>
                                    <tr>
                                        <td>${tbProductCategory.id}</td>
                                        <td>${tbProductCategory.parentId}</td>
                                        <td>${tbProductCategory.categoryName}</td>
                                        <td>${tbProductCategory.categoryIcon}</td>
                                        <td>${tbProductCategory.categoryDownProductCount}</td>
                                        <td><a href='/productController/getProductCategoryTwoById?productCategoryId=${tbProductCategory.id}'>查看下一级分类</a></td>
                                        <td>
                                            <a href='/productController/getProductCategoryById?productCategoryId=${tbProductCategory.id}' class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></a>
                                            <a href="/productController/removeProductCategoryById?productCategoryId=${tbProductCategory.id}" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></a>
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
