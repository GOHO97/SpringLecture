<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/hoValidChecker.js"></script>
<script type="text/javascript" src="resources/input.js"></script>
</head>
<body>
	<form action="bmiCalculate" onsubmit="return bmiCheck(this);" method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<th align="center">
					비만도 검사
				</th>
			</tr>
			<tr>
				<td align="center">
					이름 <input name="name" autofocus="autofocus" autocomplete="off">
				</td>
			</tr>
			<tr>
				<td align="center">
					키 <input name="height" autocomplete="off" placeholder="cm 단위로 입력">
				</td>
			</tr>
			<tr>
				<td align="center">
					몸무게 <input name="weight" autocomplete="off" placeholder="kg 단위로 입력">
				</td>
			</tr>
			<tr>
				<td>
					<input type="file" name="img">
				</td>
			</tr>
			<tr>
				<td align="center">
					<button>계산</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>