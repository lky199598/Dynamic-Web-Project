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
	<%request.setCharacterEncoding("utf-8"); //解决中文乱码 %>
<h1>setProperty动作元素</h1>	
<hr>
<jsp:useBean id="user" class="com.po.user" scope="session"/>

<jsp:setProperty property="*" name="user"/>

用户名: <%= user.getUsername() %><br>
密码:<%= user.getPassword() %><br>
<a href="scope.jsp">测试javabean的四个作用域范围</a>

<%//request.getRequestDispatcher("scope.jsp").forward(request, response); %>

</body>
</html>