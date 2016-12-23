<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>天天短租网-让我遇见你</title>
<script src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/area.js"></script>
<script type="text/javascript" src="js/location.js"></script>
<script src="js/select2.js"></script>
<script src="js/select2_locale_zh-CN.js"></script>
<link href="css/common.css" rel="stylesheet" />
<link href="css/select2.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="css/public.css">
</head>
<style>
.div_container {
	width: 720px;
	background: #F1F1F1;
	margin: 20px auto;
	padding: 10px;
	heigth: 2500px;
}

.style1 {
	color: #6699CC;
	font-family: "方正兰亭超细黑简体";
	font-size: 24px;
}
/* === Button Style === */
button.submit {
	background-color: #68b12f;
	background: -webkit-gradient(linear, left top, left bottom, from(#68b12f),
		to(#50911e));
	background: -webkit-linear-gradient(top, #68b12f, #50911e);
	background: -moz-linear-gradient(top, #68b12f, #50911e);
	background: -ms-linear-gradient(top, #68b12f, #50911e);
	background: -o-linear-gradient(top, #68b12f, #50911e);
	background: linear-gradient(top, #68b12f, #50911e);
	border: 1px solid #509111;
	border-bottom: 1px solid #5b992b;
	border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	-ms-border-radius: 3px;
	-o-border-radius: 3px;
	box-shadow: inset 0 1px 0 0 #9fd574;
	-webkit-box-shadow: 0 1px 0 0 #9fd574 inset;
	-moz-box-shadow: 0 1px 0 0 #9fd574 inset;
	-ms-box-shadow: 0 1px 0 0 #9fd574 inset;
	-o-box-shadow: 0 1px 0 0 #9fd574 inset;
	color: white;
	font-weight: bold;
	padding: 6px 20px;
	text-align: center;
	text-shadow: 0 -1px 0 #396715;
}

button.submit:hover {
	opacity: .85;
	cursor: pointer;
}

button.submit:active {
	border: 1px solid #20911e;
	box-shadow: 0 0 10px 5px #356b0b inset;
	-webkit-box-shadow: 0 0 10px 5px #356b0b inset;
	-moz-box-shadow: 0 0 10px 5px #356b0b inset;
	-ms-box-shadow: 0 0 10px 5px #356b0b inset;
	-o-box-shadow: 0 0 10px 5px #356b0b inset;
}
</style>
<body>

	<div class="div_container">
		<form action="create_house.action" method="post" enctype="multipart/form-data" name="upload_house">
			<h1 align="center" class="style1">联系我们</h1>

			<span class="">房源信息:</span> <input type="text" name="title_textfield"
				width="150px"> <br>
			<br> <span class="">地理位置:</span> <select id="loc_province"
				name="loc_province" style="width: 120px;">
			</select> <select id="loc_city" name="loc_city"
				style="width: 120px; margin-left: 10px">
			</select> <select id="loc_town" name="loc_town"
				style="width: 120px; margin-left: 10px">
			</select> </select> <br>
			<br> <span class="">房屋面积:</span> <input type="text"
				name="housearea" class="contact_form textarea" style=""> <br>
			<br> <span class="">价格要求：日价</span> <input type="text"
				name="dayprice"> <span class="">元每天</span> <br>
			<br> <span class="">坏境： </span>
			<textarea name="surrounding" cols="40" rows="6" placeholder=""
				required></textarea>
			<br>
			<br> <span class="">其他说明：</span>
			<textarea name="othermessage" cols="40" rows="6" placeholder=""
				required></textarea>
			<br>
			<br>
			<br>
			上传图片: &nbsp;  &nbsp;  &nbsp;
			<input type="file" name="photo" >
			
			<br><br><br>
			<button class="submit" type="submit" name="upload_button">
				<div align="center">提交</div>
			</button>
		</form>
	</div>

</body>

</html>
