<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="practice1.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice 1 modify</title>
</head>
<body>
	<%! String Id, Name, Gender; %>
	<%! String dbId, dbName, dbGender; %>
	<%
		Id = (String)session.getAttribute("id");
		Name = (String)session.getAttribute("name");
		Gender = (String)session.getAttribute("gender");
	%>
	
	<%
		DataSource ds = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
			
		try {
			conn = ds.getConnection();
			String query = "select * from memberdto where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, Id);
			rs = pstmt.executeQuery();
			rs.next();
			
			dbId = rs.getString("id");
			dbName = rs.getString("name");
			dbGender = rs.getString("gender");
			
			System.out.println(dbId);
			System.out.println(dbName);
			System.out.println(dbGender);
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	%>
	
	<form action="ModifyOk" method="post">
		이름 : <input type="text" name="name" value=<%=dbName %> /> <br />
		ID : <input type="text" name="id" value=<%=dbId %> /> <br />
		성별구분 : 
		<%
			if(dbGender.equals("man"))
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