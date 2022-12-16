<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "mytest1Sol.Customer" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test 2</title>
</head>
<body>
	<%!
		String name, pw, major, protocol;
		String[] hobbys;
	%>
	<%
		request.setCharacterEncoding("UTF-8");
		name = request.getParameter("name");
		pw = request.getParameter("pw");
		major = request.getParameter("major");
		protocol = request.getParameter("protocol");
		hobbys = request.getParameterValues("hobby");
	%>
	<%
		for(int i = 0 ; i < hobbys.length ; i++)
		{
			if(hobbys[i].equals("cook"))
				hobbys[i] = "요리";
			else if(hobbys[i].equals("run"))
				hobbys[i] = "달리기";
			else if(hobbys[i].equals("swim"))
				hobbys[i] = "수영";
			else if(hobbys[i].equals("sleep"))
				hobbys[i] = "잠자기";
		}
	%>
	이름 : <%=name %><br>
	비번 : <%=pw %><br>
	전공 : <%=major %><br>
	규약 : <%=protocol %><br>
	취미 : <%=Arrays.toString(hobbys) %>
	
</body>
</html>