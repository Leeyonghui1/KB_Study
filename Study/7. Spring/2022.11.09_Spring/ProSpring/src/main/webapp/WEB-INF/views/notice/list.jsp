<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
	<!-- <h1>${login_info.id}</h1> -->
	<h2>공지사항</h2>
	<form action="list.no" method="post" id="list">
		<div id="list-top">
			<div>
				<ul>
					<li><input type="text" name="keyword" class="w-px300" placeholder="제목입력"/></li>
					<li><a class="btn-fill" onclick="$('form').submit()">검색</a></li>
				</ul>
				<ul>
					<core:if test="${login_info.id eq 'admin' }">
						<li><a class="btn-fill" href="new.no">글쓰기</a></li>
					</core:if>
				</ul>
			</div>
		</div>
	</form>

	<table>
		<tr>
			<th class="w-px60">번호</th>
			<th>제목</th>
			<th class="w-px100">작성자</th>
			<th class="w-px120">작성일자</th>
			<th class="w-px60">첨부파일</th>
		</tr>
		
	</table>
	
	<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
</body>
</html>