<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice 1 loginResult</title>
</head>
<body>
	<%! String Name, Phone, Gender, Hobby; %>
	<%
		Name = (String)session.getAttribute("name");
		Phone = (String)session.getAttribute("phone");
		Gender = (String)session.getAttribute("gender");
		Hobby = (String)session.getAttribute("hobby");
	%>
	
	이름 : <%=Name %>
	<br />
	전화번호 : <%=Phone %>
	<br />
	<h1><%=Gender %></h1>
	<h2><%=Hobby %></h2>
	
	<a href="modify.jsp">회원정보수정</a>
</body>
</html>