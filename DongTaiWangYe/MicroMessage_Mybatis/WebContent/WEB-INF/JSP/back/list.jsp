﻿<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>内容列表页面</title>
<link href="<%=basePath%>resources/css/all.css" rel="stylesheet"
	type="text/css" />
<script src="<%=basePath%>resources/js/back/list.js"></script>	
<script src="<%=basePath%>resources/js/common/jquery-1.8.0.min.js">
</script>	
</head>

<body style="background: #e1e9eb;">

	<form action="<%=basePath%>ListServlet.action" id="mainForm"
		method="post">
		
		<input type="hidden" name="currentPage" id="currentPage" value="${page.currentPage}"/>
		
		<div class="right">
			<div class="current">
				当前位置：<a href="javascript:void(0)" style="color: #6E6E6E;">内容管理</a>
				&gt; 内容列表
					
				
			</div>
			<div class="rightCont">
				<p class="g_title fix">
					内容列表 <a class="btn03" href="#">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a class="btn03" href="javascript:Delete_Batch_Message('<%=basePath%>')" onclick="javascript:Confirm_Delete()">删 除</a>
				</p>
				<table class="tab1">
					<tbody>
						<tr>
							<td width="90" align="right">指令名称：</td>
							<td><input name="command" id="command" type="text"
								class="allInput" value="${message.command}" /></td>
							<td width="90" align="right">描述：</td>
							<td><input name="description" id="description" type="text"
								class="allInput" value="${message.description}" /></td>
							<td width="85" align="right"><input type="submit"
								class="tabSub" value="查 询" /></td>
						</tr>
					</tbody>
				</table>
				<div class="zixun fix">
					<table class="tab2" width="100%">
						<tbody>
							<tr>
								<th><input type="checkbox" id="all" onclick="#" /></th>
								<th>序号</th>
								<th>指令名称</th>
								<th>名称</th>
								<th>操作</th>
							</tr>

                            <input type="hidden" name="id" id="id" value="${id}"/> 
                             
							<c:forEach items="${messageList}" var="message" varStatus="i">

								<tr
									<c:if test="${i.index % 2 != 0}">style="background-color:#ECF6EE;"</c:if>>
									
									<td><input type="checkbox" name="ids" value="${message.id}" /></td>
									<td>${i.index+1}</td>
									<td>${message.command}</td>
									<td>${message.description}</td>
									<td>
									    <a href="#">修改</a>&nbsp;&nbsp;&nbsp; 
									    <a
										href="javascript:deleteOneMessage('${basePath}','${message.id}')"
										onclick="javascript:Confirm_Delete()">删除
										</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					
				
					
					<div class='page fix'>
						共 <b>${page.totalMessageNumber}</b>条
						
						<c:if test="${page.currentPage != 1}">
						  <a href="javascript:showCurrentPage('1')" class='first'>首页</a> 		 
						  <a href="javascript:showCurrentPage('${page.currentPage - 1}')" class='pre'>上一页</a>						  
						</c:if>
						
						 当前第<span>${page.currentPage}/${page.totalPageNumber}</span>页 	
							
					   <c:if test="${page.currentPage != page.totalPageNumber}">
							<a href="javascript:showCurrentPage('${page.currentPage + 1}')"
							class='next'>下一页</a> 
														
							<a href="javascript:showCurrentPage('${page.totalPageNumber}')" class='last'>末页</a> 
					  </c:if>
							
					跳至&nbsp;<input type='text' id="currentPageText" name="currentPageText" value='${page.currentPage}' class='allInput w28' />&nbsp;页&nbsp;				
					<a href="javascript:showCurrentPage($('#currentPageText').val())" class='go'>GO</a>
							<!-- $('#currentPageText').val() -->
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>