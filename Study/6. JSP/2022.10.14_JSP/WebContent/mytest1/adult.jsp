<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--서블릿에서 값을 받아오기 --%>
	<%=request.getAttribute("result") %>
	<form>
		<img src="http://www.chemicalnews.co.kr/news/photo/201908/549_703_2625.jpg">	
	</form>
</body>
</html>