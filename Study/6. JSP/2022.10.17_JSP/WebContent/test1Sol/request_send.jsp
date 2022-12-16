<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int age; %>
<%
	String str = request.getParameter("age");
	try
	{
		age = Integer.parseInt(str);
		if(age >= 20)
			response.sendRedirect("pass.jsp?age="+age);
		else
			response.sendRedirect("ng.jsp?age="+age);		
	} catch (Exception e){
		// 에러페이지 이동대신 예외발생시 html 페이지로 이동
		// T1.html 대신 myfail.jsp 적으면 myfail 페이지로 이동
		response.sendRedirect("T1.html");
	}
%>
</body>
</html>