<%--
  Created by IntelliJ IDEA.
  User: 小白
  Date: 2020/3/13
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<%--    <link rel="stylesheet" href="css/index.css">--%>
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">XinZhi</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/list?method=findAll&page=1">首页 <span class="sr-only">(current)</span></a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">商品类型 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">日用品</a></li>
                        <li><a href="#">食品</a></li>
                        <li><a href="#">调味品</a></li>

                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="搜索商品....">
                </div>
                <button type="submit" class="btn btn-default">提交</button>
            </form>
            <%
                String name=(String)session.getAttribute("user");
            %>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">欢迎回来:<%=name%>></a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">余额</a></li>
                        <li><a href="#">修改密码</a></li>
                        <li><a href="#">修改地址</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="/loginout">退出登录</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="panel panel-default container">
    <div id="main">

        <div class="img_block">
            <img src="images/main_booksort.gif" class="img" />
        </div>

        <table class="table" cellspacing="0">
            <tr>
                <td>商品编号</td>
                <td>商品名称</td>
                <td>商品类型</td>
                <td>商品单价</td>
                <td>会员价格</td>
                <td>库存(个)</td>
                <td>操作</td>
            </tr>

            <c:forEach items="${list}" var="shop">
                <tr>
                    <td>${shop.shop_id}</td>
                    <td>${shop.shop_name}</td>
                    <td>${shop.shopType.shop_type_name}</td>
                    <td>${shop.shop_price}</td>
                    <td>${shop.shop_price_vip}</td>
                    <td>${shop.shop_num}</td>
                    <td>
                        <a href="/book?method=addBorrow&bookid=${shop.shop_id}">加购</a>
                    </td>
                </tr>
            </c:forEach>

        </table>

    </div>


</div>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>




