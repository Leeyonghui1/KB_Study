<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modifySol</title>
</head>
<body>
	<%! String strName, strID, strGender; %>
	<%
		strName = (String)session.getAttribute("name");
		strID = (String)session.getAttribute("id");
		strGender = (String)session.getAttribute("gender");
	%>
	
	<form action="ModifyOkSol" method="post">
		이름 : <input type="text" name="name" value=<%=strName %> /> <br />
		ID : <%=strID %> <br />
		성별구분 : 
		<%
			if(strGender.equals("man"))
			{%>
				<input type="radio" name="gender" value="man"  checked/>남
				<input type="radio" name="gender" value="woman"/>여
			<%}
			else
			{%>
				<input type="radio" name="gender" value="man" />남
				<input type="radio" name="gender" value="woman" checked />여
			<%}
		%>
		<br />
		<input type="submit" value="정보수정" /> &nbsp;
		<input type="reset" value="취소" />
	</form>
</body>
</html>