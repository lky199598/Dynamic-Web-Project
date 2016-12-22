
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>


<body background="images/CountCourse.jpg">
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
<table class="tab1">
						<tbody>
							<tr>
								<td width="90" align="right">指令名称：</td>
								<td>
									<input name="command" type="text" class="allInput" value="${command}"/>
								</td>
								<td width="90" align="right">描述：</td>
								<td>
									<input name="description" type="text" class="allInput" value="${description}"/>
								</td>
	                            <td width="85" align="right"><input type="submit" class="tabSub" value="查 询" /></td>
	       					</tr>
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
							<tbody>
								<tr>
								    <th><input type="checkbox" id="all" onclick="#"/></th>
								    <th>序号</th>
								    <th>指令名称</th>
								    <th>描述</th>
								    <th>操作</th>
								</tr>
								<c:forEach items="${messageList}" var="message" varStatus="status">
									<tr  <c:if test="${status.index % 2 != 0}">style='background-color:#ECF6EE;'</c:if>>
										<td><input type="checkbox"  name="id" value="${message.id}"/></td>
										<td>${status.index + 1}</td>
										<td>${message.command}</td>
										<td>${message.description}</td>
										<td>
											<a href="#">修改</a>&nbsp;&nbsp;&nbsp;
											<a href="${basePath}DeleteOneServlet.action?id=${message.id}">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
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
 --%>


<center>

<h2>学生</h2>
</center>
<table>
<tr>
<td>
小红同学：高数、概率与统计、运筹、数学模型、经济学（宏观、微观）
</td>
</tr>

<tr>
<td>
小明同学： c语言程序设计、Java、三大框架
</td>
</tr>
<tr>
<td>

小林同学： c语言程序设计、vfp程序设计、matlab、spss、eviews、sas
</td>
</tr>

<tr>
<td>

小刚同学：Java、三大框架、c语言程序设计、vfp程序设计、matlabs
</td>
</tr>

<tr>
<td>
小因同学：C++、概率与统计、运筹
</td>
</tr>

</table>


<br><br>
<center>
<h2>教师</h2>
</center>
<table>
<tr>
<td>
李峰老师：三大框架、c语言程序设计、vfp程序设计
</td>
</tr>

<tr>
<td>
张琳老师：运筹、数学模型、经济学、matlab、spss
</td>
</tr>
<tr>
<td>
杨帆老师：C++、概率与统计、vfp程序设计
</td>
</tr>
</table>



</body>
</html>