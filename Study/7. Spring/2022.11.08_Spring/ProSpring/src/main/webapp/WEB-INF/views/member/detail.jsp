<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 상세 페이지</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
	
	<div id="content">
		<h3>[${data.name}] 님의 상세 정보</h3>
		<table class='w-pct60' id="table_id">
			<tr>
				<th class="w-px160">이름</th>
				<td>${data.name }</td>
			</tr>
			<tr>
				<th class="w-px160">ID</th>
				<td>${data.id }</td>
			</tr>
			<tr>
				<th class="w-px160">성별</th>
				<td>${data.gender }</td>
			</tr>
			<tr>
				<th class="w-px160">이메일</th>
				<td>${data.email }</td>
			</tr>
			<tr>
				<th class="w-px160">전화번호</th>
				<td>${data.phone }</td>
			</tr>
			<tr>
				<th class="w-px160">생년월일</th>
				<td>${data.birth }</td>
			</tr>
			<tr>
				<th class="w-px160">주소</th>
				<td>${data.addr }</td>
			</tr>
			<tr>
				<th class="w-px160">직업</th>
				<td id="pt_code">${data.pt_code }</td>
			</tr>
			<tr>
				<th class="w-px160">전공</th>
				<td>${data.m_code }</td>
			</tr>
			<tr>
				<th class="w-px160">직급</th>
				<td>${data.jpo_code }</td>
			</tr>	
			
		</table>
	</div>
	<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
	
	<script type="text/javascript">
		let ptCode = document.getElementById("pt_code").innerText;
		console.log(ptCode);
		
	</script>
</body>
</html>