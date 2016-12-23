<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
	<!-- HTML注释,在客户端可见 -->
	<%--jsp注释,在客户端不可见 --%>
	<%
	//单行注释、
	/*多行注释*/
	%>
	<%-- <h1>&nbsp; &nbsp;静夜思</h1>
	<%
	out.println("床前明月光<br>");
	out.println("疑是地上霜<br>");
	out.flush();
	out.print("举头望明月<br>");
	out.print("低头思故乡<br>");
	%>
	缓冲区大小:<%=out.getBufferSize() %>byte<br>
	剩余缓冲区大小：<%=out.getRemaining() %>byte<br>
	是否自动清空缓冲区:<%=out.isAutoFlush() %><br>
	
	<br><br>
	<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
	String s = sdf.format(new Date());
	%>
	今天是:<%=s	%>
	<br><br> --%>	
<h1>用户注册</h1>
<hr>
<form action="start2.jsp" name="login" method="post">
<table>
<tr>
<td>用户名:</td>
<td><input type="text" name="username"/></td>
</tr>

<tr>
<td>爱好: </td>
<td>
<input type="checkbox" name="favorite" value ="读书">读书
<input type="checkbox" name="favorite" value="音乐">音乐
<input type="checkbox" name="favorite" value="电影">电影
<input type="checkbox" name="favorite" value="上网">上网
</td>
</tr>

<tr>
<td colspan="2"> <input type="submit" value="提交"/> </td>
</tr>

</table>
</form>
<br><br>
<a href="request.jsp?username=张三">测试URL传参数</a><br>
<a href="rate.jsp">测试2</a>

</body>
</html>