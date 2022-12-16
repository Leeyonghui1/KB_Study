<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! String id,pw; %>
	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		// id : aaa, pw : 1234라고 가정
		if(id.equals("aaa") && pw.equals("1234"))
		{
			// "id" :: 키값 || id :: value
			Cookie cookie = new Cookie("id",id);
			cookie.setMaxAge(60); // 쿠키 보관시간 1분
			response.addCookie(cookie);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			// 로그인 실패시
			response.sendRedirect("login.html");
		}
	%>
</body>
</html>