<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
<link href="${pageContext.request.contextPath}/login.css" rel="stylesheet" type="text/css" />

</head>
<body>
<form name="reg" action="/chapter05/LoginServlet" method="post">
<div class="container">
		<!-- 导航 -->
		<div class="nav">
			<ul>
				<li><a href="#">链接三</a></li>
				<li><a href="#">链接二</a></li>
				<li><a href="#">链接一</a></li>
				<li><a href="#">首页</a></li>
			</ul>
		</div>
 
		<!-- 主体内容 （登陆界面）-->
		<div class="main">
			<!-- 左侧信息栏 -->
			<div class="sideleft">
				<h1>家电配件订购系统</h1>
				<h4>用户登录界面</h4>
				
 
			</div>
			<!-- 右侧登陆界面 -->
			<div class="sideright">
				<div class="index">
					<form action="#" method="get">
						<p class="headline">用户登陆</p>
						<p class="astyle">用户名：</p>
						<input name="username"type="text" value="">
						<p class="astyle">密码：</p>
						<input name="password"type="text" value="">
						<input type="submit" value="登陆" name="login" >
						</br>
						<p class="bstyle"><input type="checkbox" name="rempas" />  记住密码</p>
						<p class="cstyle">忘记密码</p>
						</br></br>
						<p class="cstyle">没有账号？<a href="zhuce.jsp">立即注册</a></p>
					</form>
 
				</div>
			</div>
		</div>
 
		<!-- 尾部 -->
		<div class="footer">
				<ul>
					<li><a href="#">华南理工</a></li>
					<li><a href="#">计算机学院</a></li>
					
				</ul>
 
		</div>
 
	</div>
	</form>
</body>
</html>