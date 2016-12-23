<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>用户登录</title>
</head>
<body>

<h1>用户登录</h1>
<hr>
<form name="login" action="dologin2.jsp" method="post">
<table>

<tr>
<td>用户名</td>
<td><input type="text" name="username" /></td>
</tr>

<tr>
<td>年龄</td>
<td><input type="text" name="age"/></td>
</tr>

<tr>
<td>性别:</td>
<td><input type="text" name="sex"/></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="登录"/>&nbsp;<input type="reset" value="取消"/></td>
 </tr>
 
</table>
</form>
</body>
</html>