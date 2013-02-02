<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="img/ojisan.jpg" style="background-size:35% ; background-repeat:no-repeat">

<div align="right">
<h1>結果</h1>

<jsp:useBean id="user" scope="request" class="jp.co.rakus.bmi.model.User"></jsp:useBean>

<jsp:getProperty property="name" name="user"/>
さんのBMI数値は『
<font color="red">
<jsp:getProperty property="bmi" name="user"/>
</font>
』です。
<h2><a href="input.jsp">再挑戦する</a></h2>
</div>

</body>
</html>