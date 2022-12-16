<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 삭제</title>
</head>
<body>
	<%
		Enumeration enu = session.getAttributeNames();
		while(enu.hasMoreElements())
		{
			String sName = enu.nextElement().toString();
			String sValue = (String)session.getAttribute(sName);
			System.out.println(sName);
			System.out.println(sValue);
			if(sValue.equals("bbb"))
				session.removeAttribute(sName);  // id 값 지우기
		}
	%>
	
	<a href="session_test.jsp">세션 제거 테스트 페이지</a>
</body>
</html>