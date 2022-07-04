<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="${APP_PATH}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${APP_PATH}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${APP_PATH}/css/main.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor: pointer;
        }

        table tbody tr:nth-child(odd) {
            background: #F4F4F4;
        }

        table tbody td:nth-child(even) {
            color: #C00;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <div><a class="navbar-brand" style="font-size:32px;" href="${APP_PATH}/pm/user">众筹平台 - 用户维护</a></div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li style="padding-top:8px;">
                    <div class="btn-group">
                        <button type="button" class="btn btn-default btn-success dropdown-toggle"
                                data-toggle="dropdown">
                            <i class="glyphicon glyphicon-user"></i> ${loginUser} <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#"><i class="glyphicon glyphicon-cog"></i> 个人设置</a></li>
                            <li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
                            <li class="divider"></li>
                            <li><a href="${APP_PATH}/logout"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
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
                    <li class="list-group-item tree-closed">
                        <a href="${APP_PATH}/main"><i class="glyphicon glyphicon-dashboard"></i> 控制面板</a>
                    </li>
                    <li class="list-group-item">
                        <span><i class="glyphicon glyphicon glyphicon-tasks"></i> 权限管理 <span class="badge"
                                                                                             style="float:right">3</span></span>
                        <ul style="margin-top:10px;">
                            <li style="height:30px;">
                                <a href="${APP_PATH}/pm/user" style="color:red;"><i
                                        class="glyphicon glyphicon-user"></i> 用户维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="${APP_PATH}/pm/role"><i class="glyphicon glyphicon-king"></i> 角色维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="permission.html"><i class="glyphicon glyphicon-lock"></i> 许可维护</a>
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon-ok"></i> 业务审核 <span class="badge"
                                                                                style="float:right">3</span></span>
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
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon-th-large"></i> 业务管理 <span class="badge" style="float:right">7</span></span>
                        <ul style="margin-top:10px;display:none;">
                            <li style="height:30px;">
                                <a href="cert.html"><i class="glyphicon glyphicon-picture"></i> 资质维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="type.html"><i class="glyphicon glyphicon-equalizer"></i> 分类管理</a>
                            </li>
                            <li style="height:30px;">
                                <a href="process.html"><i class="glyphicon glyphicon-random"></i> 流程管理</a>
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
                    <li class="list-group-item tree-closed">
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
                                <input id="loginAcct" class="form-control has-success" type="text"
                                       placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="button" class="btn btn-warning" onclick="pageQuery(1)"><i
                                class="glyphicon glyphicon-search"></i> 查询
                        </button>
                    </form>
                    <button type="button" class="btn btn-danger" style="float:right;margin-left:10px;"
                            onclick="deleteMore()"><i
                            class=" glyphicon glyphicon-remove"></i> 删除
                    </button>
                    <button type="button" class="btn btn-primary" style="float:right;"
                            onclick="window.location.href='${APP_PATH}/pm/user/add'"><i
                            class="glyphicon glyphicon-plus"></i>新增
                    </button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <thead>
                            <tr>
                                <th width="30">#</th>
                                <th width="30"><input type="checkbox" onclick="checkAll(this)"></th>
                                <th>账号</th>
                                <th>名称</th>
                                <th>邮箱地址</th>
                                <th width="100">操作</th>
                            </tr>
                            </thead>
                            <tbody id="userData">
                            </tbody>
                            <tfoot>
                            <tr>
                                <td colspan="6" align="center">
                                    <ul class="pagination">

                                    </ul>
                                </td>
                            </tr>

                            </tfoot>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${APP_PATH}/jquery/jquery-2.1.1.min.js"></script>
<script src="${APP_PATH}/bootstrap/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/script/docs.min.js"></script>
<script src="${APP_PATH}/script/layer.js"></script>

<script type="text/javascript">

    var page;

    //分页查询
    function pageQuery(pageNo) {
        page = pageNo;
        var loginAcct = $("#loginAcct").val();

        var loadingIndex = null;
        $.ajax({
            type: "POST",
            url: "${APP_PATH}/user/userList2",
            data: {
                "pageNo": pageNo,
                "pageSize": 5,
                "loginAcct": loginAcct
            },
            beforeSend: function () {

                //	layer处理中
            },
            success: function (result) {

                var tableContext = "";
                var pageContext = "";

                var users = result.list;
                $.each(users, function (i, user) {
                    let u = JSON.stringify(user);
                    let queryByidUrl = 'window.location.href="${APP_PATH}/pm/user/queryById?id=';
                    let queryRoleByidUrl = 'window.location.href="${APP_PATH}/pm/role/assignRole?id=';
                    tableContext += '<tr>'
                    tableContext += '  <td>' + (i + 1) + '</td>'
                    tableContext += '  <td><input type="checkbox" name="id" value="' + user.id + '"></td>'
                    tableContext += ' <td>' + user.loginacct + '</td>'
                    tableContext += ' <td>' + user.username + '</td>'
                    tableContext += ' <td>' + user.email + '</td>'
                    tableContext += '  <td>'
                    tableContext += '	  <button type="button" class="btn btn-success btn-xs"  onclick=' + queryRoleByidUrl + user.id + '"><i class=" glyphicon glyphicon-check"></i></button>'
                    tableContext += '	  <button type="button" class="btn btn-primary btn-xs" onclick=' + queryByidUrl + user.id + '"><i class=" glyphicon glyphicon-pencil"></i></button>'
                    tableContext += '	  <button type="button" class="btn btn-danger btn-xs" onclick=\'deleteUser(' + u + ')\'><i class=" glyphicon glyphicon-remove"></i></button>'
                    tableContext += '  </td>'
                    tableContext += '</tr>'
                })

                if (pageNo > 1) {
                    pageContext += '<li><a href="#" onclick="pageQuery(' + (pageNo - 1) + ')">上一页</a></li>';
                }

                for (var i = 1; i <= result.totalPage; i++) {
                    if (i == pageNo) {
                        pageContext += '<li class="active"><a  href="#" onclick="pageQuery(' + i + ')">' + i + '</a></li>';
                    } else {
                        pageContext += '<li><a href="#" onclick="pageQuery(' + i + ')">' + i + '</a></li>';
                    }
                }

                if (pageNo < result.totalPage) {
                    pageContext += '<li><a href="#" onclick="pageQuery(' + (pageNo + 1) + ')">下一页</a></li>';
                }

                $("#userData").html(tableContext);

                $(".pagination").html(pageContext)

                //	关闭layer
            }
        })
    }

    function checkAll(val) {
        if (val.checked) {
            $('input[name="id"]').each(function () {
                this.checked = true;
            })
        } else {
            $('input[name="id"]').each(function () {
                this.checked = false;
            })
        }
    }


    function deleteMore() {


        let arr = [];
        $('input[name="id"]:checked').each(function () {
            arr.push($(this).val());
        });

        if (arr.length > 0) {
            layer.confirm('确认要删除选中的用户吗？', {
                btn: ['确认', '取消'] //按钮
            }, function () {
                $.ajax({
                    type: "POST",
                    url: "${APP_PATH}/user/deleteMore",
                    data: {
                        "ids": arr,
                        "_method": "DELETE"
                    },
                    beforeSend: function () {
                        //	layer处理中
                        layer.load(1);
                    },
                    success: function (result) {
                        layer.closeAll('loading');

                        layer.msg('删除成功', {icon: 1});

                        pageQuery(page);
                    },
                    error: function (result) {
                        layer.closeAll('loading');
                        layer.msg('删除失败', {icon: 2})
                    }
                })
            }, function () {

            });

        } else {
            layer.msg('至少选中一个user', {icon: 5});
        }
    }

    function deleteUser(user) {

        layer.confirm('确认删除用户【' + user.username + '】', {
            btn: ['确认', '取消']
        }, function () {
            $.ajax({
                type: "POST",
                url: "${APP_PATH}/user/delete",
                data: {
                    "id": user.id,
                    "_method": "DELETE"
                },
                beforeSend: function () {
                    //	layer处理中
                    layer.load(1);
                },
                success: function (result) {
                    layer.closeAll('loading');

                    layer.msg('删除成功', {icon: 1});

                    pageQuery(page);
                },
                error: function (result) {
                    layer.closeAll('loading');
                    layer.msg('删除失败', {icon: 2})
                }
            })
        }, function () {

        })
    }

    $(function () {
        $(".list-group-item").click(function () {
            if ($(this).find("ul")) {
                $(this).toggleClass("tree-closed");
                if ($(this).hasClass("tree-closed")) {
                    $("ul", this).hide("fast");
                } else {
                    $("ul", this).show("fast");
                }
            }
        });
        pageQuery(1)

    });
    $("tbody .btn-success").click(function () {
        window.location.href = "assignRole.html";
    });
    $("tbody .btn-primary").click(function () {
        window.location.href = "edit.html";
    });


</script>
</body>
</html>
