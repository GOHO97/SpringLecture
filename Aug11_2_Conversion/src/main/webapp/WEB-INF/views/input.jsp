<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/hoValidChecker.js"></script>
<script type="text/javascript" src="resources/js/inputChecker.js"></script>
</head>
<body>
	<form action="calculation" onsubmit="return inputCheck(this);">
		<table border="1">
			<tr>
				<th align="center">
					단위 변환기		
				</th>
			</tr>
			<tr>
				<td align="center">
					<input name="number" placeholder="숫자 입력">
				</td>
			</tr>
			<tr>
				<td align="center">
					<select name="kind">
						<option value="cm">cm → inch</option>
						<option value="inch">inch → cm</option>
						<option value="celsius">℃ → ℉</option>
						<option value="fahrenheit">℉ → ℃</option>
					</select>
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