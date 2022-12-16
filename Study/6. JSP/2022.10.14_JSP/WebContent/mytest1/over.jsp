<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>20살 초과</h1>
	<p>이름 : <%=request.getAttribute("r_name") %></p><br>
	<p>나이 : <%=request.getAttribute("r_age") %></p><br>
	<p>ID : <%=request.getAttribute("r_id") %></p><br>
	
	<img src="http://www.chemicalnews.co.kr/news/photo/201908/549_703_2625.jpg">
</body>
</html>