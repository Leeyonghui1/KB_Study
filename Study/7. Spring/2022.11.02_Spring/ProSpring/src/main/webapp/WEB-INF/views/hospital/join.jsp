<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>
<style>
	.id_re1{color:green; display:none;}
	.id_re2{color:red; display:none;}
</style>

</head>

<body>
	<h1>회원가입</h1>
	<form method="post">
		<h4>필수사항</h4>
		<p>ID : <input type="text" name="id" class="inputId"/></p>
		<span class="id_re1">사용 가능한 아이디입니다.</span>
		<span class="id_re2">아이디가 이미 존재합니다.</span>
		
		<p>PW : <input type="password" name="pw" /></p>
		<p>이름 : <input type="text" name="name" /></p>
		<p>나이 : <input type="text" name="age" /></p>
		<p>성별 
			<label for="man">남</label>
			<input type="radio" name="gender" id="man" value="man"/>
			<label for="woman">여</label>
			<input type="radio" name="gender" id="woman" value="woman"/>
		</p>
		<p>휴대전화 : <input type="text" name="phone" placeholder="ex)010-1111-1111"/></p>
		<p>직업
			<select name="pt_code" id="pt_code" onchange="changeSelection()" >
				<option value="" selected>선택하기</option>
				<option value="001">의사</option>
				<option value="002">간호사</option>
				<option value="003">환자</option>
			</select>
		</p>
		
		<div id="select_staff" style=display:none;>
			<h4>선택사항</h4>
			<p>전공
				<select name="m_code">
					<option value="01">내과</option>
					<option value="05">정형외과</option>
					<option value="12">안과</option>
					<option value="13">이비인후과</option>
					<option value="49">치과</option>
				</select>
			</p>
		
			<div id="select_doctor">
			<p>직급(의사)
				<select name="jpo_code">
					<option value="101">레지던트</option>
					<option value="102">치프</option>
					<option value="103">펠로우</option>
					<option value="104">과장</option>
					<option value="105">원장</option>
				</select>
			</p>
			</div>
		
			<div id="select_nurse">
			<p>직급(간호사)
				<select name="jpo_code">
					<option value="201">간호사</option>
					<option value="202">수간호사</option>
					<option value="203">간호과장</option>
					<option value="204">간호부장</option>
				</select>
			</p>
			</div>
		</div>
		
		<p><input type="submit" value="회원가입" /></p>
	</form>
	
	<script>
		function changeSelection(){
			let selectPtcode = document.getElementById("pt_code").value;
			
			if(selectPtcode == "001"){
				document.getElementById("select_staff").style.display = 'block';
				document.getElementById("select_doctor").style.display = 'block';
				document.getElementById("select_nurse").style.display = 'none';
			} else if(selectPtcode == "002"){
				document.getElementById("select_staff").style.display = 'block';
				document.getElementById("select_doctor").style.display = 'none';
				document.getElementById("select_nurse").style.display = 'block';
			} else{
				document.getElementById("select_staff").style.display = 'none';
				document.getElementById("select_doctor").style.display = 'none';
				document.getElementById("select_nurse").style.display = 'none';
			}
		}
		
		// 아이디 중복검사
		$('.inputId').on("propertychange change keyup paste input", function(){
			var memberId = $('.inputId').val();
			var data = {memberId : memberId}
			
			$.ajax({
				type : "post",
				url : "/memberIdChk",
				data : data
			})
		});
		
	</script>
</body>
</html>