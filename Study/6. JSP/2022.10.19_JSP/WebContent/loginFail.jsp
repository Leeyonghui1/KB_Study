<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice 1 loginFail</title>
</head>
<body>
	<h1>로그인 실패</h1>
	<%! String ID; %>
	<%
		ID = (String)session.getAttribute("id");
	%>
	
	<%=ID %> 님의 비밀번호를 잘못입력했습니다.
</body>
</html>