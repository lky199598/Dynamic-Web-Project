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
	<%String str = request.getParameter("username"); %>
	<%=str %>
	
	<jsp:forward page="success.jsp">
	<jsp:param value="<%=str %>" name="name"/>
	</jsp:forward>
	
	<!-- <a href="success.jsp">继续</a> -->

<%//request.getRequestDispatcher("scope.jsp").forward(request, response); %>

</body>
</html>