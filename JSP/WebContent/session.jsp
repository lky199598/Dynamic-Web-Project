<%@page import="java.text.SimpleDateFormat,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>session内置对象</h1>
<hr>
<%
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
Date d = new Date(session.getCreationTime());
session.setAttribute("username", "张三");
session.setAttribute("password", "123456");
session.setAttribute("Age", "18");
//session的最大生成期限
//session.setMaxInactiveInterval(10);
%>
session创建时间:<%=sdf.format(d) %><br><br>
session的ID编号:<%=session.getId() %><br><br>
从session中获取用户名:<%=session.getAttribute("username")%>
<br><br>

<a href="session_page2.jsp" target="blank">跳转到session_page2.jsp</a>


</body>
</html>