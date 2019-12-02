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

    <script src="/jquery/jquery-2.1.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script src="/script/docs.min.js"></script>
        <script type="text/javascript">
            $(function () {
                $(".list-group-item").click(function(){
                    if ( $(this).find("ul") ) {
                        $(this).toggleClass("tree-closed");
                        if ( $(this).hasClass("tree-closed") ) {
                            $("ul", this).hide("fast");
                        } else {
                            $("ul", this).show("fast");
                        }
                    }
                });
            });
        </script>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <div><a class="navbar-brand" style="font-size:32px;" href="#">众筹平台 - 流程管理</a></div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li style="padding-top:8px;">
                <div class="btn-group">
                  <button type="button" class="btn btn-default btn-success dropdown-toggle" data-toggle="dropdown">
                    <i class="glyphicon glyphicon-user"></i> 张三 <span class="caret"></span>
                  </button>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#"><i class="glyphicon glyphicon-cog"></i> 个人设置</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
                        <li class="divider"></li>
                        <li><a href="index.html"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
                      </ul>
                </div>
            </li>
            <li style="margin-left:10px;padding-top:8px;">
                <button type="button" class="btn btn-default btn-danger">
                  <span class="glyphicon glyphicon-question-sign"></span> 帮助
                </button>
            </li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <div class="tree">
                <ul style="padding-left:0px;" class="list-group">
                    <li class="list-group-item tree-closed" >
                        <a href="main.html"><i class="glyphicon glyphicon-dashboard"></i> 控制面板</a> 
                    </li>
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon glyphicon-tasks"></i> 权限管理 <span class="badge" style="float:right">3</span></span> 
                        <ul style="margin-top:10px;display:none;">
                            <li style="height:30px;">
                                <a href="user.html"><i class="glyphicon glyphicon-user"></i> 用户维护</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="role.html"><i class="glyphicon glyphicon-king"></i> 角色维护</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="permission.html"><i class="glyphicon glyphicon-lock"></i> 许可维护</a> 
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon-ok"></i> 业务审核 <span class="badge" style="float:right">3</span></span> 
                        <ul style="margin-top:10px;display:none;">
                            <li style="height:30px;">
                                <a href="auth_cert.html"><i class="glyphicon glyphicon-check"></i> 实名认证审核</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="auth_adv.html"><i class="glyphicon glyphicon-check"></i> 广告审核</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="auth_project.html"><i class="glyphicon glyphicon-check"></i> 项目审核</a> 
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item">
                        <span><i class="glyphicon glyphicon-th-large"></i> 业务管理 <span class="badge" style="float:right">7</span></span> 
                        <ul style="margin-top:10px;">
                            <li style="height:30px;">
                                <a href="cert.html"><i class="glyphicon glyphicon-picture"></i> 资质维护</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="type.html"><i class="glyphicon glyphicon-equalizer"></i> 分类管理</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="process.html" style="color:red"><i class="glyphicon glyphicon-random"></i> 流程管理</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="advertisement.html"><i class="glyphicon glyphicon-hdd"></i> 广告管理</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="message.html"><i class="glyphicon glyphicon-comment"></i> 消息模板</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="project_type.html"><i class="glyphicon glyphicon-list"></i> 项目分类</a> 
                            </li>
                            <li style="height:30px;">
                                <a href="tag.html"><i class="glyphicon glyphicon-tags"></i> 项目标签</a> 
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed" >
                        <a href="param.html"><i class="glyphicon glyphicon-list-alt"></i> 参数管理</a> 
                    </li>
                </ul>
            </div>
        </div>
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
</form>

<script type="text/javascript">
    $(function(){
        $("#uploadBtn").click(function(){
        		//仅仅是调用click()函数，而不是在click()函数中传入function(){}
        		//jQuery对象.click()：相当于点击了一下控件
        		//jQuery对象.click(函数)：给控件绑定单击响应函数
        		$("#uploadInput").click();
        });
        
        $("#uploadInput").change(function(){
            $("#uploadForm").submit();
        });
    });
</script>
<form id="uploadForm" action="/manager/consumer/upload" method="post" enctype="multipart/form-data" style="display: none;">
	<input id="uploadInput" type="file" name="processDefinitionFile"/>
</form>
<button id="uploadBtn" type="button" class="btn btn-primary" style="float:right;">
    <i class="glyphicon glyphicon-upload"></i> 上传流程定义文件
</button>
<br>
 <hr style="clear:both;">
          <div class="table-responsive">
            <table class="table  table-bordered">
            <#if !Request.processDefinitionMapList??>
                <tr><td>未查询到任何流程定义</td></tr>
            </#if>
            <#if Request.processDefinitionMapList??>
              <thead>
                <tr >
                  <th width="30">#</th>
                  <th>流程名称</th>
                  <th>流程版本</th>
                  <th width="100">操作</th>
                </tr>
              </thead>
              <tbody>
                <#list Request.processDefinitionMapList as map>
                    <tr>
                      <td>${map.id}</td>
                      <td>${map.name}</td>
                      <td>${map.version}</td>
                      <td>
                          <a class="btn btn-success btn-xs" 
                                target="_blank" 
                                href="/manager/consumer/eye/picture/${map.key}/${map.version}">
                            <i class=" glyphicon glyphicon-eye-open"></i>
                          </a>
                          <button type="button" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>
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
  </body>
</html>
