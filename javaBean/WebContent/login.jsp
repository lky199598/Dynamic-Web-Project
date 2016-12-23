<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.po.user" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>

<h1>系统登录</h1>	
<hr>
<%
String name = "AAA"; String password="123456";
%>

<form name="loginForm" action="dologin.jsp" method = "post">
<table>
<tr>
<td>用户名: </td>
<td><input type="text" name="username" value="<%=name %>"/></td>
</tr>

<tr>
<td>密码:</td>
<td><input type="password" name="password" value="<%=password%>"/></td>
</tr>
<br>
<tr>
<td colspan="2" align = "center"><input type="submit" value="登录"/></td>
</tr>

</table>
</form>


</body>
</html>