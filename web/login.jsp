<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">


	<title>学成在线官网-个人中心</title>
	<link rel="stylesheet" href="css/gerenzhongxin.css" />
</head>
<body>

<div class="head">
	<div class="header">
		<div class="logo">
			<a href=""></a>
		</div>
		<div class="fan">
			<a href="index.html"><span><<<返回</span></a>
		</div>
	</div>
</div>


<div class="center">
	<div class="deng">
		<div class="deng-title">
			用户登录
		</div>
		<form action="/login" method="post">
		<div class="deng-p">
			<li><span><img src="images/联系人_个人中心.png" alt="" /></span>
				<input type="text" name="username" id="" placeholder="请输入登录账户/注册手机号"/><label for=""></label>

			</li>
			<li><span><img src="images/锁子.png" alt="" /></span>
				<input type="password" name="password" placeholder="请输入登录密码"/><label for=""></label>

			</li>
<%--			<li><input type="radio" name="type">用户--%>
<%--				<input type="radio" name="type">商户--%>
<%--			</li>--%>
			<li><span><img src="images/钥匙.png" alt="" /></span>
				<input type="submit" name="" id="aaa" placeholder="登录"/><label for=""></label>
			</li>
			<li class="zhuce"><a href=""><span class="s1">忘记密码?点击找回</span></a> <a href=""><span class="s2">立即注册</span></a></li>
		</div>
		</form>
	</div>
</div>

<div class="foot">
	<div class="footer">
		<p class="1">www.xuejiucheng.com All Rights Reserved 2014</p>
		<p>版权所有：山东山大鸥玛软件股份有限公司 鲁ICP号11006098 增值电信业务经营许可证编号：鲁B2-20061055</p>
		<p>服务电话：0531-66680758<a>您是第<em>134833</em>位访问者</a> </p>
	</div>
</div>
</body>
</html>