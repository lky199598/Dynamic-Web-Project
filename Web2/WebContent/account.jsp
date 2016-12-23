<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>

<body>
<%
int n=0;
Object obj = session.getAttribute("account");
if(obj != null)
n=Integer.parseInt(obj.toString());

n++;
session.setAttribute("account", String.valueOf(n));
out.println("你是第"+n+"个用户访问本网站!<br>");

%>

你是第<%=n %>个用户访问本网站!
</body>

</html>