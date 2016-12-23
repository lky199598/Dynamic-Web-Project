
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>


</head>

<body background="images/003.jpg">
<center>
	<div class="page-container">
	
		<h1><font color="#0F0F0F">Web学习系统</font></h1>
		<br><br><br>
		<form action="" method="post">

			<table>
				<tr>
				<td>用户名</td>
					<td><input type="text" name="username" class="username"
						placeholder="Username"></td>
				</tr>
            <br><br>
				<tr>
				<td>密码</td>
					<td><input type="password" name="password" class="password"
						placeholder="Password"></td>
				</tr>
			<tr></tr>  <tr></tr>  <tr></tr>
				<tr>
					<td><input type="radio" name="identity" value="Teacher">
					</td>
					<td><font color="#0F0F0F">学生</font></td>
				</tr>
				
				
				<tr>
					<td><input type="radio" name="identity" value="Student"
						checked></td>
					<td><font color="#0F0F0F">教师</font></td>
				</tr>

				<tr >
					<td><input type="radio" name="identity" value="Admin">
					</td>
					<td ><font color="#0F0F0F">管理员</font></td>
				</tr>
               <tr></tr>  <tr></tr>  <tr></tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="注册">&nbsp;
					<input type="reset" value="取消" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</center>

</body>

</html>

