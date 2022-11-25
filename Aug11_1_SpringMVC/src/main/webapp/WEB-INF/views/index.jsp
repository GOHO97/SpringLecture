<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/hoValidChecker.js"></script>
<script type="text/javascript" src="resources/js/login.js"></script>
</head>
<body>
	<h1>김해청년 랄로</h1>
	<form action="result" border="1" name="loginF" method="post" onsubmit="return loginCheck();">
		ID : <input name="id"><p>
		PW : <input name="pw"><p>
		이름 : <input name="name"><p>
		나이 : <input name="age"><p>
		<button>가입</button>
	</form>
</body>
</html>