<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice 1 memberInsert</title>
</head>
<body>
	<form action="JoinOkp" method="post">
		이름 : <input type="text" name="name" id="name" />
		<br />
		ID : <input type="text" name="id" id="id" />
		<br />
		PW : <input type="password" name="pw" id="pw" />
		<br />
		성별
		남자 <input type="radio" name="gender" id="man" value="man" />
		여자 <input type="radio" name="gender" id="woman" value="woman" />
		<br />
		
		<input type="submit" value="회원가입" />
		<input type="reset" value="취소" />
	</form>
</body>
</html>