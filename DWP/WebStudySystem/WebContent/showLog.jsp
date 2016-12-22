
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>


<body background="images/CountCourse.jpg">
<center>

<%-- <table width="750" height="60" cellpadding="0" cellspacing="0"
			border="0">
			<tr>


				<%
					ItemsDao itemsdao = new ItemsDao();
					Items item = itemsdao.getItems_information(Integer.parseInt(request
							.getParameter("id")));

					if (item != null) {
				%>

				<td width="70%" valign="top">
					<table>
						<tr>
							<td rowspan="6"><img src="images/<%=item.getPicture()%>"
								width="250" height="200" /></td>
						</tr>

						<tr>
							<td><B><%=item.getName()%></B></td>
						</tr>

						<tr>
							<td><%=item.getCity()%></td>
						</tr>

						<tr>
							<td><%=item.getPrice()%>￥
							</td>
						</tr>

						<tr>
							<td><%=item.getNumber()%></td>
						</tr>
						<tr>
							<td> <span id="sub" onclick="sub();">-</span> <input
								type="text" id="number" name="number" value="1" size="2" /> <span
								id="add" onclick="add(<%=item.getNumber()%>);">+</span>
							</td>
						</tr>

					</table>

					<div id="cart">
						<a
							href="Servlet/BuyServlet?action=BuyShopping&Buy_id=<%=item.getId()%>&name=<%=item.getName()%>&city=<%=item.getCity()%>&picture=<%=item.getPicture()%>&price=<%=item.getPrice()%>&buy_number=<%=item.getNumber()%>"
							onclick="BuyShopping()"> <img src="images/buy.png"></a> <a
							href="javascript:AddIntoCart(<%=item.getId()%>)"><img
							src="images/in_cart.png"></a> <a
							href="Servlet/CartServlet?action=ShowCart"><img
							src="images/view_cart.jpg"></a>
					</div>
				</td>
				<%
					}
				%>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br> --%>



<h2>最近日志</h2>

<table border="2" width="1000" height="150">
<tr>
<td>
用户Student在2016-6-6 18:00 查看了课程
</td>
</tr>

<tr>
<td>
用户Student在2016-6-6 19:00 就行了答题
</td>
</tr>

<tr>
<td>
用户Student在2016-6-6 19:00 就行了答题
</td>
</tr>
</table>
</center>
</body>
</html>