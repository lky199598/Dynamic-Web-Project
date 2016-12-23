<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	   <%@ taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

  <meta charset="UTF-8">
  <title>天天短租网-让我遇见你</title>
	<link href="css/register_style.css" rel="stylesheet" type="text/css" />
    <script src="/js/modernizr.js"></script>
	<script src="/js/jquery-1.7.1.min.js"></script>
	
    <style type="text/css">
<!--
.style3 {font-size: 18px}
.style4 {font-size: 24px}
.style6 {font-size: 16px}
-->
.id_error{color:red; padding-left:8px;}
.password_error{color:red; padding-left:8px;}
    </style>
</head>
<body background="images/login_background.jpg">
  <h1><a href="index.html"><img src="images/logo(1).png" border="0"></a></h1>
  <h1 align="right" class="index_title"><span class="style3" align="right"><span class="style4"><a href="index.html">主页</a>&nbsp; 团队&nbsp; 帮助&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span>
    <!--<br class="clearfloat" />-->
</h1> 
  </h1>
<s:form action="register.action"  name="register" method="post">
		<p>
		  <input name="account_name" placeholder="请输入账号名" class="name" required />
		  <span class="id_error">用户ID只能包含字母、数字和下划线</span>
		  <br>
		  <input name="password" placeholder="请输入密码" class="password" type="password" required />
		  <br>
          <input name="repeatpassword" placeholder="请再次输入密码" class="repeatpassword" type="password" required>
           <span class="password_error">两次输入密码不一致</span>
          <input name="submit" class="btn" type="submit" value="注册" />
	      </p>
	     <h2 class="style6">已有账号？<a href="log.jsp">点此登录</a></h2>
</s:form>
<br><br>
<div style="text-align:center;clear:both">
<p_end_left class="p_end_left">关于我们 &nbsp; 联系我们<p_end_left/> 
<p_end_right class="p_end_right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 客服热线:18036653798  &nbsp; 邮箱：359568694@qq.com<p_end_right>               
</div>
  <script src='js/jquery.js'></script>
</body>
<script>
$(document).ready(function(){
$('.id_error').hide();
$('.btn').click(function(event){
	var data=$('.name').val();
	if(validate_userid(data))
	{
		$('.id_error').hide();
	}
	else
	{
		$('.id_error').show();
		
	}
   });
});

function validate_userid(uid)
{
	var pattern = /^[a-z0-9_A-Z]+$/g;
	return pattern.test(uid);
}

$(document).ready(function(){
  $('.password_error').hide();
  $('.btn').click(function(event){
		data=$('.password').val();
		var len=data.length;
		if($('.password').val()!=$('.repeatpassword').val())
  {
	  $('.repeatpassword').next().show();
  }
  else
  {
	  $('.repeatpassword').next().hide();
  }
 
 });
});
</script>
</html>
