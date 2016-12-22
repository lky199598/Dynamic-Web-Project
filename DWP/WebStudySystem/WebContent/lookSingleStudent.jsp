<%@ page import="com.po.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.sql.ResultSet"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>

<body>
	<center>
	  <h1>学生用户信息查询</h1>
		<br>
		<br>
		 <%-- <br>
		<%
			String strPage=request.getParameter("Page");
			int Page;
			if(strPage==null)
				Page=1;
			else
				Page=Integer.parseInt(strPage);
				<table width="750" height="60" cellpadding="0" cellspacing="0"
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
				<br>
		%>

		<%
			Student stu = new Student();
			jdbc j = new jdbc();
			ResultSet res = j.select_All_Information(stu);
			res.last();
		%>
		
		<%
			int RowCount= res.getRow();//总共的记录
			int PageSize=5;//每页的个数
			int PageCount;//页数
				
				if(RowCount%PageSize==0)
			PageCount=RowCount/PageSize;
				else
			PageCount=RowCount/PageSize+1;
		%>

		你要查询的学生有 <font size="5" color="black"> <%=RowCount%>
		</font>人 <br>
		<br> --%>
		<table border="2" width="1000">
			<tr>
				<th>学号</th>
				<th>班级</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>			
			</tr>
			<tr align="center">
				<td>2</td>
				<td>计科1300</td>
				<td>Student</td>
				<td>男</td>
				<td>19</td>
				
			</tr>

		
</center>
</body>
</html>