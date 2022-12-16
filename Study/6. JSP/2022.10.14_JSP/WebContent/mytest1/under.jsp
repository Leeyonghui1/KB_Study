<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>나이가 20살 미만입니다.</h1>
	<p>이름 : <%=request.getAttribute("r_name") %></p><br>
	<p>나이 : <%=request.getAttribute("r_age") %></p><br>
	<p>ID : <%=request.getAttribute("r_id") %></p><br>
	
	<img src="http://image.dongascience.com/Photo/2020/03/5bddba7b6574b95d37b6079c199d7101.jpg">
</body>
</html>