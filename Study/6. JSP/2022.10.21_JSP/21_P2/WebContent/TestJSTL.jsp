<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 1. 끝에 /> 로 마무리 -->
	<!-- 2. 쌍따옴표 안에 "달러{}" 이렇게 넣는데, 쌍따옴표 안 {}에 공백있으면 안됨 -->
	<%-- 3. 주석을 html용이 아닌 jsp용 주석을 사용하면 확실 --%>
	<%-- jstl을 사용할려면 jstl.zip파일안 2개의 jar파일을  --%>
	<%-- 서버와 연결된 아파치톰캣 폴더의 lib폴더 안에 넣어주고 사용해야함 --%>
	<c:set var="vatName2" value="aaa"/>
	<c:out value="${vatName2}"/>
	
	<%-- jstl 없이 --%>
	<%! String vatName; %>
	<%
		vatName = "안녕";
	%>
	<%=vatName %>
	<br>
	
	<%
		try{
			int a = 2;
			int b = 0;
			int c = a/b;
		} catch(Exception e) {
			out.println(e.getStackTrace());
		}
	%>
	<br>
	<%-- jstl 사용시 --%>
	<c:catch var="myerror">
	<%=2/0 %>
	</c:catch>
	<c:out value="${myerror}"/>
	<br>
	
	<c:if test="${1+2==3}">
	맞습니다.
	</c:if>
	
	<c:if test="${1+2!=3}">
	이건 안나옴
	</c:if>
	<br>
	
	<c:forEach var="fEach" begin="1" end="10" step="3">
	${fEach} <%-- EL태크 표현식 --%> <%-- 1 4 7 10 --%>
	</c:forEach>
	
	<c:choose>
		<c:when test="${10>100}"> 거짓1</c:when>
		<c:when test="${10==10}"> 참1</c:when>
		<c:otherwise> 이도저도 아님</c:otherwise>
	</c:choose>
	
	
</body>
</html>