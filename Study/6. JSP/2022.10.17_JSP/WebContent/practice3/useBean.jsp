<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student1" class="practice3.Student" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- practice3.Student 클래스를 Bean으로 사용하기 --%>
	<jsp:setProperty property="name" name="student1" value="홍길동"/>
	<jsp:getProperty property="name" name="student1"/>
	<jsp:setProperty property="age" name="student1" value="34"/>
	<jsp:getProperty property="age" name="student1"/>
	<%-- EL(Expression Language) :: 읽어들인 값을 표현하는 다른 방법 --%>
	${student1.name}
	${student1.age}
	
	
</body>
</html>