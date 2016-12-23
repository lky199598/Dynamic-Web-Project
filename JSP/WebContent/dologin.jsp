<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String username = request.getParameter("username");
String password = request.getParameter("password");
if("admin".equals(username) && "123456".equals(password))
{
	session.setAttribute("name", username);
	request.getRequestDispatcher("login_success.jsp").forward(request, response);
}
else
	response.sendRedirect("login_failure.jsp");
%>

</body>
</html>