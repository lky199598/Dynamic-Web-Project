<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>第三个页面</title>
</head>
<body>
<h1>第三个页面被访问</h1>
<jsp:useBean id="count" class="com.po.application" scope="application">
</jsp:useBean>
三个页面共被访问了:<%=count.get() %>

<br><br>
<a href="application2.jsp">第一个页面</a>
<br><br>
<a href="application3.jsp">第二个页面</a>
</body>
</html>