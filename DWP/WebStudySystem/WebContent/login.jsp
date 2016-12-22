<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>

<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="assets/css/reset.css">
<link rel="stylesheet" href="assets/css/supersized.css">
<link rel="stylesheet" href="assets/css/style.css">

</head>

<body>
<h1><a href="login.jsp">登录</a></font> &nbsp;<a href="register.jsp">注册</a></font></h1> 
	<div class="page-container">
	
	     
		<h1>
		<font color="#0F0F0F">Web学习系统
		</h1>
		
		<form action="LoginServlet.action" method="post">

			<table>
				<tr>
					<td><input type="text" name="username" class="username"
						placeholder="Username"></td>
				</tr>

				<tr>
					<td><input type="password" name="password" class="password"
						placeholder="Password"></td>
				</tr>
				
				<tr>
					<td><input type="radio" name="identity" value="Student">
					</td>
					<td><font color="#0F0F0F">学生</font></td>
				</tr>

				<tr>
					<td><input type="radio" name="identity" value="Teacher"
						checked></td>
					<td><font color="#0F0F0F">教师</font></td>
				</tr>

				<tr>
					<td><input type="radio" name="identity" value="Admin">
					</td>
					<td><font color="#0F0F0F">管理员</font></td>
				</tr>

				<tr>
					<td>
						<button type="submit">登录</button>
						<div class="error">
							<span>+</span>
						</div>
					</td>
				</tr>
			</table>
		</form>

		<div class="connect">
			<p>Or connect with:</p>
			<p>
				<a class="facebook" href=""></a> <a class="twitter" href=""></a>
			</p>
		</div>
	</div>


	<!-- Javascript -->
	<script src="assets/js/jquery-1.8.2.min.js"></script>
	<script src="assets/js/supersized.3.2.7.min.js"></script>
	<script src="assets/js/supersized-init.js"></script>
	<script src="assets/js/scripts.js"></script>

</body>

</html>

