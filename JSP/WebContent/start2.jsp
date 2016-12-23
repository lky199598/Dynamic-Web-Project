<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>request内置对象</h1>
<%
request.setCharacterEncoding("utf-8");
%>
用户名:<%=request.getParameter("username")%><br><br>
爱好:&nbsp;
<%
if(request.getParameterValues("favorite") != null)
{
String[] f = request.getParameterValues("favorite");
for(String s:f)
out.print(s+"&nbsp; &nbsp;");
}
%>
<br>
<br>
请求的真实路径: <%=request.getRealPath("start2.jsp") %><br>
</body>
</html>