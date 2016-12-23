<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.po.user" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的javaBean</title>
</head>
<body>
<h1>使用useBean动作创建javaBean实例</h1>	
<hr>
<jsp:useBean id="user" class="com.po.user" scope="request"/>
用户名:<%=user.getUsername() %><br>
密码：<%=user.getPassword() %><br>
</body>
</html>