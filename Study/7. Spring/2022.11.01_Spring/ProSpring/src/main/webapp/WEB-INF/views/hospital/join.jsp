<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="" method="post">
		<label for="id">ID:</label>&nbsp;&nbsp;&nbsp;
		<input type="text" id="id" name="id" /><br />
		<label for="pw">PW:</label>&nbsp;&nbsp;
		<input type="password" id="pw" name="pw" /><br />
		<label for="name">이름:</label>&nbsp;
		<input type="text" id="name" name="name"/><br />
		<label for="name">나이:</label>&nbsp;
		<input type="text" id="age" name="age"/><br />
		
		<label>성별</label>&nbsp;&nbsp;
		<input type="radio" name="gender" value="man" id="man" />
		<label for="man">남자</label>
		<input type="radio" name="gender" value="woman" id="woman" /> 
		<label for="woman">여자</label>
		<br />
		<select name="phone">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="007">007</option>
		</select>
		<label>-</label>
		<input type="text" name="phone2" /><label>-</label>
		<input type="text" name="phone3" />

		<br/>
		<label>직업</label>&nbsp;&nbsp;
		<select id="job_category" name="job" onchange="changehtml();">
			<option value="001">의사</option>
			<option value="002">간호사</option>
			<option value="003" selected>환자</option>
		</select>
		<div id="show"></div>
		<div id="show2"></div>
		<br />
		<input type="submit" value="회원가입" />
	</form>
	
	<script>
		function changehtml(){
			let job = document.getElementById('job_category').value;
			let show = document.getElementById('show');
			let show2 = document.getElementById('show2');
			
			if(job == "001"){
				show.innerHTML = '<p>전공 : <select id="major" name="major"> <option value="01">내과</option><option value="05">정형외과</option><option value="12">안과</option><option value="13">이비인후과</option><option value="49">치과</option></p>';
				show2.innerHTML = '<p>직급 : <select id="aposition" name="aposition"> <option value="101">레지던트</option><option value="102">치프</option><option value="103">펠로우</option><option value="104">과장</option><option value="105">부원장</option><option value="106">원장</option> </p>';
			} else if(job=="002"){
				show.innerHTML = '<p>전공 : <select id="major" name="major"> <option value="01">내과</option><option value="05">정형외과</option><option value="12">안과</option><option value="13">이비인후과</option><option value="49">치과</option></p>';
				show2.innerHTML = '<p>직급 : <select id="aposition" name="aposition"> <option value="201">간호사</option><option value="202">수간호사</option><option value="203">간호과장</option><option value="204">간호부장</option> </p>';
			} else{
				show.innerHTML = '';
				show2.innerHTML = '';
			}
		}
	</script>
</body>
</html>