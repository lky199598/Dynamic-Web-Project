<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ç±å¥½</title>
</head>

<body>
<%-- <%request.setCharacterEncoding("utf-8"); %>
用户名:<%=request.getParameter("username") %><br>
爱好:
<%
String[] f = request.getParameterValues("favorite");
for(String s : f)
	out.print(s+"&nbsp;&nbsp;");
%>
 --%>

<ol>
  <li>咖啡</li>
  <li>牛奶</li>
  <li>茶</li>
</ol>

<ol start="8">
  <li>咖啡</li>
  <li>牛奶</li>
  <li>茶</li>
</ol>


</body>

</html>