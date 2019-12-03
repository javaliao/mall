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
                    <#if !Request.tbProduct??>
                        <form action="/insertProduct" enctype="application/x-www-form-urlencoded" method="POST">
                            <table>
                                <tr>
                                    <td width="500">商品编号</td>
                                    <td><input type="text" name="productSn"></td>
                                </tr>
                                <tr>
                                    <td>商品名称</td>
                                    <td><input type="text" name="productName"></td>
                                </tr>
                                <tr>
                                    <td>商品库存</td>
                                    <td><input type="text" name="productStock"></td>
                                </tr>
                                <tr>
                                    <td>商品价格</td>
                                    <td><input type="text" name="productPice"></td>
                                </tr>
                                <tr>
                                    <td>商品卖家</td>
                                    <td><input type="text" name="productSeller"></td>
                                </tr>
                                <tr>
                                    <td>商品状态</td>
                                    <td><input type="text" name="productStatus"></td>
                                </tr>
                                <tr>
                                    <td>商品图标</td>
                                    <td><input type="text" name="productIcon"></td>
                                </tr>
                                <tr><td>操作</td><td><input type="submit" value="添加"></td></tr>
                            </table>
                        </form>
                    </#if>
                    <#if Request.tbProduct??>
                        <form action="/updateProduct" enctype="application/x-www-form-urlencoded" method="POST">
                            <table>
                                <input type="hidden" name="id" value="${tbProduct.id}">
                                <tr>
                                    <td width="500">商品编号</td>
                                    <td><input type="text" name="productSn" value="${tbProduct.productSn}"></td>
                                </tr>
                                <tr>
                                    <td>商品名称</td>
                                    <td><input type="text" name="productName" value="${tbProduct.productName}"></td>
                                </tr>
                                <tr>
                                    <td>商品库存</td>
                                    <td><input type="text" name="productStock" value="${tbProduct.productStock}"></td>
                                </tr>
                                <tr>
                                    <td>商品价格</td>
                                    <td><input type="text" name="productPice" value="${tbProduct.productPice}"></td>
                                </tr>
                                <tr>
                                    <td>商品卖家</td>
                                    <td><input type="text" name="productSeller" value="${tbProduct.productSeller}"></td>
                                </tr>
                                <tr>
                                    <td>商品状态</td>
                                    <td><input type="text" name="productStatus" value="${tbProduct.productStatus}"></td>
                                </tr>
                                <tr>
                                    <td>商品图标</td>
                                    <td><input type="file" name="productIcon" value="${tbProduct.productIcon}"></td>
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
