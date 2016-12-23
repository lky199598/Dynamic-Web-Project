<%@page import="java.text.SimpleDateFormat,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
Date d = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
String s = sdf.format(d);
out.print(s+"<br>");
%>