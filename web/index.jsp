<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/index.css" type="text/css" rel="stylesheet">
	  <link rel="stylesheet" href="css/top.css">
  	<script type="text/javascript" src="js/jquery-1.12.1.js"></script>
  	<script type="text/javascript">
		$(function(){
			$("#next").click(function(){
				var pages = parseInt($("#pages").html());
				var page = parseInt($("#currentPage").html());
				if(page == pages){
					return;
				}
				page++;
				location.href = "/book?page="+page;
			})

			$("#previous").click(function () {
				var page = parseInt($("#currentPage").html());
				if(page == 1){
					return;
				}
				page--;
				location.href = "/book?page="+page;
			})

			$("#first").click(function () {
				location.href = "/book?page=1";
			})

			$("#last").click(function(){
				var pages = parseInt($("#pages").html());
				location.href = "/book?page="+pages;
			})
		})
	</script>
  </head>
  
  <body>
<%--  <%@ include file="top.jsp" %>--%>
<%
	String name=(String)session.getAttribute("user");
%>
  	<div id="main">
		<div class="navigation">
				当前位置:&nbsp;&nbsp;<a href="/list?page=1">首页</a>
				<div id="readerBlock">欢迎回来&nbsp;:<a href="/list?method=findAllBorrow&page=1"><%=name%>></a>&nbsp;<a href="/logout">注销</a></div>
		</div>
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
					<td>${shop.shop_type}</td>
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
  	
<%--   <%@ include file="footer.jsp" %>--%>
  </body>
</html>
