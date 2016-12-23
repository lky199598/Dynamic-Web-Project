<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<center>当前在线用户人数: ${applicationScope.userNumber }
<br><br>
<c:forEach items="${applicationScope.UserList }" var="user" varStatus="i">
用户${i.index+1}&nbsp;sessionID: ${user.sessionID } &nbsp;&nbsp; IP: ${user.ip }&nbsp;&nbsp;FirstTime: ${user.firstTime } 
<br><br>
</c:forEach>

</center>
</body>
</html>