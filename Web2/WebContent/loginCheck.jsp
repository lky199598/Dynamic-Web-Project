<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>数据处理页面</title>
</head>
<body>
<%
String name=request.getParameter("name");
String password=request.getParameter("password");
if(name.equals("aaa") && password.equals("123"))
{
%>

<jsp:forward page="success.jsp">
<jsp:param value="<%=name %>" name="user"/>
</jsp:forward>

<%
}
else
{
%>

<jsp:forward page="login_forward.jsp">
<jsp:param value="<%=name %>" name="user"/>
</jsp:forward>
<%
}
%>
</body>
</html>