<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice 1 loginPass</title>
</head>
<body>
	<h1>로그인 성공</h1>
	<%! String Name, ID, Gender; %>
	<%
		Name = (String)session.getAttribute("name");
		ID = (String)session.getAttribute("id");
		Gender = (String)session.getAttribute("gender");
	%>
	
	<%
		if(Gender.equals("man"))
		{%>
			<h1 style="color:blue">아이디 : <%=ID %></h1><br />
			<h1 style="color:blue">이름 : <%=Name %></h1><br />
			<h1 style="color:blue">성별 : <%=Gender %></h1><br />
		<%}
		else
		{%>
			<h1 style="color:hotpink">아이디 : <%=ID %></h1><br />
			<h1 style="color:hotpink">이름 : <%=Name %></h1><br />
			<h1 style="color:hotpink">성별 : <%=Gender %></h1><br />
		<%}
	%>
</body>
</html>