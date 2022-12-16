<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "mytest1Sol.Customer" %>
<%@ page import= "mytest2Sol.Student" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test 2 Solution</title>
</head>
<body>
	<%!
		String name, pw, major, protocol;
		String[] hobbys;
	%>
	
	<%!
		public String korHobby(String[] hobbys)
		{
			String hobby = "";
			for(int i = 0 ; i < hobbys.length ; i++)
			{
				switch(hobbys[i])
				{
					case "cook":
						hobby+="요리";
						break;
					case "run":
						hobby+="달리기";
						break;
					case "swim":
						hobby+="수영";
						break;
					case "sleep":
						hobby+="잠자기";
						break;
				}
				if(i!=hobbys.length-1)
					hobby+=",";
			}
			return hobby;
		}
	%>
	
	<%--!
		public String korMajor(String major)
		{
			String m = "";
			switch(major)
			{
				case "math":
					m+="수학";
					break;
				case "eng":
					m+="영어";
					break;
				case "kor":
					m+="국어";
					break;
			}
			return m;
		}
	--%>
	
	<%!
		public String korMajor(String major)
		{
			if(major.equals("math"))
				return "수학";
			else if(major.equals("eng"))
				return "영어";
			else if(major.equals("kor"))
				return "국어";
			else
				return major;
		}
	%>
	
	<%
		request.setCharacterEncoding("UTF-8");
		name = request.getParameter("name");
		pw = request.getParameter("pw");
		major = request.getParameter("major");
		protocol = request.getParameter("protocol");
		hobbys = request.getParameterValues("hobby");
	
	%>

	이름 : <%=name %><br>
	비번 : <%=pw %><br>
	전공 : <%=korMajor(major) %><br>
	규약 : <%=protocol %><br>
	취미 : <%=korHobby(hobbys) %>
	
	
	<br><hr>
	<%! Student s = new Student(); %>
	<%
		s.setName(name);
		s.setPw(pw);
		s.setMajor(major);
		s.setProtocol(protocol);
		s.setHobbys(hobbys);
	%>
	이름 : <%=s.getName() %><br>
	비번 : <%=s.getPw() %><br>
	전공 : <%=s.getMajor() %><br>
	규약 : <%=s.getProtocol() %><br>
	취미 : <%=s.getHobbys() %>
	
</body>
</html>