<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	let f1 = document.createElement("button")
	f1.textContent = "HiWorld로 이동"
	let f2 = document.createElement("button")
	f2.textContent = "ByeWorld로 이동"
	let space = document.createTextNode("\u00a0")
	document.body.appendChild(f1)
	document.body.appendChild(space)
	document.body.appendChild(f2)
</script>
</body>
</html>