<%@page import="org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder"%>
<%@page import="org.springframework.security.crypto.password.PasswordEncoder"%>
<%@page import="practice1.MemberDAO"%>
<%@page import="practice1.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice 1 pwSerch</title>
</head>
<body>
	<%! String Name, Id, Gender; %>
	<%
		Id = (String)session.getAttribute("id");
		
		MemberDTO m = new MemberDTO();
		m.setId(Id);
		
		MemberDTO dto = new MemberDAO().checkMember(m);
		PasswordEncoder p = new BCryptPasswordEncoder();
	%>
	
</body>
</html>