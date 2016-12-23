<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆页面</title>

</head>
<body>

<form method="post" name="login" action="loginCheck.jsp">
<table>
<tr>
<td>用户名:<input type="text" name="name" size="18" value="<%=request.getParameter("name") %>"/></td>
</tr>

<tr>
<td>密码:&nbsp;<input type="password" name="password" size="18"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="登录"/><input type="reset" value="取消"/></td>
</tr>

</table>
</form>

</body>
</html>