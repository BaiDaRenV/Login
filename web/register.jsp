<%--
  Created by IntelliJ IDEA.
  User: 小白
  Date: 2020/3/13
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.12.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".user").blur(function () {
                var user=$(".user").val();
                if(user == null || user == undefined || user == ''){
                  $(".user").after("<span class='text'> 用户名不能为空</span>");
                    $(".text").remove();
                }else{
                    $.ajax({
                        url:'/quchong',
                        type:'post',
                        data:'user='+user,
                        dataType:'text',
                        success:function (data) {
                            if (data=='0'){
                                $(".text").remove();
                                $(".user").after("<span class='text'> 用户名已存在</span>");
                            }else {
                                $(".text").remove();
                                $(".user").after("<span class='text'> 请继续注册</span>");
                            }
                        }
                    })
                }

            })
        })
    </script>
    <title>Title</title>
</head>
<body>
<h1> 欢迎来到注册页面!</h1>
<form action="/register" method="post">
    用户名:<input type="text" class="user" name="username"><br>
    密码: <input type="password" name="password"><br>
    地址: <input type="text" name="address"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
