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