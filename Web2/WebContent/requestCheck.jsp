<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>成绩</title>
</head>
<body>

<%
int n=0;
String str1 = request.getParameter("1");
String str2 = request.getParameter("2");
if(str1==null)
	str1="";
if(str2==null)
	str2="";
if(str1.equals("A"))
	n++;
if(str2.equals("A"))
	n++;
%>

本次测试成绩为:<%=n*100/2 %>分
</body>
</html>