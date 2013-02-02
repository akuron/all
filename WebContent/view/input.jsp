<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BMI</title>
<!-- jqueryの読み込み -->
<script src="jquery/jquery-1.9.0.min.js"></script>
<!-- jqueryUIの読み込み -->
<script src="jquery/jquery-ui-1.10.0.custom.min.js"></script>
</head>
<body>

<h1>BMIアプリ</h1>


<form action="/BMI/BmiContrllerServlet" method="post">
<input type="hidden" name="action" value="calcBmi">
名前：<input type="text" name="name" id="name"><img src="img/input.png" id="nameImage">
<br>
体重：<input type="text" name="weight" id="weight"><img src="img/input.png" id="weightImage">
<br>
身長：<input type="text" name="height" id="height"><img src="img/input.png" id="heightImage">
<br>
<font color="red">※身長はｍで記入してください（例）185cm→1.85</font>
<br>
<!-- <input type="image" src="img/bmiBotton.png" id="botton"> -->
<input type="submit" value="BMIを計算">
</form>

<script>
$(function(){
	$("h1").css("color", "red");
});

$("#name").click(function(){
	$("#nameImage").effect("explode");
});

$("#weight").click(function(){
	$("#weightImage").effect("explode");
});

$("#height").click(function(){
	$("#heightImage").effect("explode");
});

</script>
</body>
</html>