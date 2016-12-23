<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>

<body>
<%-- <%request.setCharacterEncoding("utf-8"); %> --%>

<form method="post" name="shop" action="shopCheck.jsp">
请选择要添加或删除的图书:
<br>
<select name="item">
<option>红楼梦</option>
<option>西游记</option>
<option>三国演义</option>
<option>水浒传</option>
<option>极品家丁</option>
</select>

<br><br>
<input type="submit" name="submit" value="添加"/>
<input type="submit" name="submit" value="删除"/>

</form>

</body>
</html>