<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'success.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<center>
		<hr>
		您成功购买了<%=request.getParameter("buy_number")%>件编号为<%=request.getParameter("buy_id")%>的商品

	<!-- 	<script type="text/javascript">
             //直接跳转 
              window.location.href='Buy.jsp'; 
         //定时跳转
           setTimeout("javascript:location.href='Buy.jsp'",
					3000);
		</script> -->
          
          <p>
          <b id="second">3</b>秒后回到商品购买记录页面
          </p>
          
           <script type="text/javascript">
           var sec = document.getElementById("second");
           var i=3;
           
           var timer = seInterval(function () {
        	   i--;
        	   sec.innerHTML = i;
			   if(i==1)
				   location.href = "Buy.jsp";
		}, 1000);           
       	</script> 										
										 

	</center>
</body>
</html>


