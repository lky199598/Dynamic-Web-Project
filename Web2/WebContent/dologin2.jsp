<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>用户信息</title>
</head>
<body>

<%request.setCharacterEncoding("utf-8"); %>

<%
String username=request.getParameter("username") ;
String age=request.getParameter("age");
String sex= request.getParameter("sex");
%>
<h1>用户信息</h1>
用户名:<%=username%><br>
年龄:<%=Double.parseDouble(age) %><br>
性别:<%=sex %>

</body>
</html>