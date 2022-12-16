<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- method 생략하거나 method="get"일때 주소창에 name값이 출력 -->
<%-- 하지만 method="post"로 설정하면 주소창에 name값 숨김 --%>
<%-- jsp용 주석은 '%' html용 주석은 '!' || %주석은 웹페이지에서 숨김처리 --%>
<form action="HiWorlds">
	<input type="text" name="hi">
	<input type="submit" value="전송">
</form>

<form action="ByeWorlds">
	<input type="text" name="bye">
	<input type="submit" value="전송">
</form>

<form action="HiWorlds" method="post">
	<input type="text" name="hi">
	<input type="submit" value="전송">
</form>

<form action="ByeWorlds" method="post">
	<input type="text" name="bye">
	<input type="submit" value="전송">
</form>
</body>
</html>