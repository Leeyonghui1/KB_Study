<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int age;
	%>
	
	<%
		String str = request.getParameter("age");
		out.println(str+"살이에요.");
		age = Integer.parseInt(str);
	%>

	<%=age %>살입니다.
	<img src="https://mblogthumb-phinf.pstatic.net/MjAxODAxMDhfMTI0/MDAxNTE1MzM4MzgyOTgw.JGPYfKZh1Zq15968iGm6eAepu5T4x-9LEAq_0aRSPSsg.vlICAPGyOq_JDoJWSj4iVuh9SHA6wYbLFBK8oQRE8xAg.JPEG.aflashofhope/%EC%86%8C%EC%A3%BC.jpg?type=w800">
</body>
</html>