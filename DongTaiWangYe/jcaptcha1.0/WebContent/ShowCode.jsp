<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
function ReloadCode() {
	var time = new Date().getTime();
	document.getElementById("vcode").src="cgvc?d="+time;
}
</script>

</head>

<body>
<form action="ValidateServlet" method="post">
    <input type="text" name="customgvc">
    <img id="vcode" title="点击更换" alt="验证图片" style="vertical-align: middle;" src="cgvc" height="30" width="80">
    <a href="javascript:ReloadCode();">看不清楚</a>
    
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>