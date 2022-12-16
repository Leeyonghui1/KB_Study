<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1018 Test 2 modifyResult</title>
</head>
<body>
	<%= session.getAttribute("name") %>
	님의 회원정보 수정이 정상처리 되었습니다.
	<a href="Logout.jsp">로그아웃</a>  &nbsp;  &nbsp;  
	<a href="modify.jsp">정보수정</a>
</body>
</html>