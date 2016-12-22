<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JavaScript在线考试系统</title>
</head>
<body>
<SCRIPT LANGUAGE="JavaScript">
<!-- 
function scorequiz(form) {
 list=0
 if(form.Q1.value!=null  &&  form.Q1.value=="*") {list=list+1}
 if(form.Q2.value!=null  &&  form.Q2.value=="*") {list=list+1}
 if(form.Q3.value!=null  &&  form.Q3.value=="*") {list=list+1}
 if(form.Q4.value!=null  &&  form.Q4.value=="*") {list=list+1}
 if(form.Q5.value!=null  &&  form.Q5.value=="*") {list=list+1}
 if(form.Q6.value!=null  &&  form.Q6.value=="*") {list=list+1}
 if(form.Q7.value!=null  &&  form.Q7.value=="*") {list=list+1}
 if(form.Q8.value!=null  &&  form.Q8.value=="*") {list=list+1}
 if(form.Q9.value!=null  &&  form.Q9.value=="*") {list=list+1}
 if(form.Q10.value!=null  &&  form.Q10.value=="*") {list=list+1}
 form.SCORE.value =eval(list)
 if (form.SCORE.value<=8){
ok="加油呀，你这次不及格哦！"}
}

function clearquiz(form) {
 list=0
 form.Q1.value="?"
 form.Q2.value="?"
 form.Q3.value="?"
 form.Q4.value="?"
 form.Q5.value="?"
 form.Q6.value="?"
 form.Q7.value="?"
 form.Q8.value="?"
 form.Q9.value="?"
 form.Q10.value="?"
 form.SCORE.value =eval(list)
}

function msg() {
 alert("您的成绩将E-mail给相关人员。")
 }
// -->
</SCRIPT>

<body>
<table width="75%" border="0" align="center">
  <tr>
    <td> 
      <form name="quiz1" 
 action ="mailto:www.mb5u.com@163.com"  method="post" enctype="text/plain" 
 onLoad="clearquiz(this.form)" onSubmit="msg()">
        您的姓名:   
        <input type="Text" name="Name" value="" class="pt9">
        <hr>
        1. Internet上使用的网络协议是：__________   
        <ol>
          <input type="radio" name="Q1" value="*TCP/IP" onClick=Q1.value="*">
          TCP/IP
          <input type="radio" name="Q1" value="X.25" onClick=Q1.value="X.25">
          X.25
          <input type="radio" name="Q1" value="NetBEUI" onClick=Q1.value="NetBEUI">
          NetBEUI
        </ol>
        2. 我们通过__________长距离连接两台计算机使它们通讯。   
        <ol>
          <input type="radio" name="Q2" value="LAN" onClick=Q2.value="A">
          LAN
  
          <input type="radio" name="Q2" value="*WAN" onClick=Q2.value="*">
          WAN
  
          <input type="radio" name="Q2" value="WAIS" onClick=Q2.value="C">
          WAIS
        </ol>
        3. HUB是指：__________   
        <ol>
          <input type="radio" name="Q3" value="网关" onClick=Q3.value="网关">
          网关
  
          <input type="radio" name="Q3" value="网桥" onClick=Q3.value="网桥">
          网桥
  
          <input type="radio" name="Q3" value="路由器" onClick=Q3.value="路由器">
          路由器
  
          <input type="radio" name="Q3" value="*集线器" onClick=Q3.value="*">
          集线器
  
        </ol>
        4. 56K MODEM的传输速度为：__________   
        <ol>
          <input type="radio" name="Q4" value="56Kbytes" onClick=Q4.value="A">
          每秒传输56K bytes的数据。 
  
          <input type="radio" name="Q4" value="*56kbps" onClick=Q4.value="*">
          每秒传输56k bits的数据。 
  
        </ol>
        5. Gateway是指：__________   
        <ol>
          <input type="radio" name="Q5" value="*网关" onClick=Q5.value="*">
          网关
  
          <input type="radio" name="Q5" value="网桥" onClick=Q5.value="B">
          网桥
  
          <input type="radio" name="Q5" value="路由器" onClick=Q5.value="C">
          路由器
  
          <input type="radio" name="Q5" value="集线器" onClick=Q5.value="D">
          集线器
  
        </ol>
        6. Http默认的端口是：__________   
        <ol>
          <input type="radio" name="Q6" value="8080" onClick=Q6.value="A">
          8080

          <input type="radio" name="Q6" value="*80" onClick=Q6.value="*">
          80

          <input type="radio" name="Q6" value="25" onClick=Q6.value="25">
          25

        </ol>
        7. JavaScript是一种类似于C++的语言，比较难掌握：__________   
        <ol>
          <input type="radio" name="Q7" value="True" onClick=Q7.value="T">
          True

          <input type="radio" name="Q7" value="*False" onClick=Q7.value="*">
          False

        </ol>
        8. JAVA是 __________ 公司的产品：   
        <ol>
          <input type="radio" name="Q8" value="Microsoft" onClick=Q8.value="A">
          Microsoft
  
          <input type="radio" name="Q8" value="Novell" onClick=Q8.value="B">
          Novell
  
          <input type="radio" name="Q8" value="*SUN" onClick=Q8.value="*">
          SUN
  
        </ol>
        9. CGI通过__________收集用户填写的表单信息：   
        <ol>
          <input type="radio" name="Q9" value="Form" onClick=Q9.value="A">
          Form
  
          <input type="radio" name="Q9" value="*环境变量" onClick=Q9.value="*">
          环境变量
  
          <input type="radio" name="Q9" value="javascripts脚本" onClick=Q9.value="C">
          javascripts脚本
  
        </ol>
        10. 服务器响应"404 error"的含义是： __________   
        <ol>
          <input type="radio" name="Q10" value="*文件不存在" onClick=Q10.value="*">
          文件不存在
          <input type="radio" name="Q10" value="Server error" onClick=Q10.value="B">
          服务器错误
       <input type="radio" name="Q10" value="Client error" onClick=Q10.value="C">
          浏览器错误
  
        </ol>
        <hr>
        <input type="button" name="submit" value="开始评分" onClick=scorequiz(this.form) class="pt9">
        <input type="reset" name="reset" value="重新测试" onClick=clearquiz(this.form) class="pt9">  
        <input type="submit" value="将成绩MAIL给管理员" onClick=scorequiz(this.form) name="submit" class="pt9">  
        你的考试成绩：   
        <input  name="SCORE" type="text" class="pt9">
      </form>
</body>
</html>