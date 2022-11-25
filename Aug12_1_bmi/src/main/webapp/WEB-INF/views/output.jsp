<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td align="center">
				키 : ${bi.height }			
			</td>
		</tr>
		<tr>
			<td align="center">
				몸무게 : ${bi.weight }			
			</td>
		</tr>
		<tr>
			<td align="center">
				BMI : <fmt:formatNumber value="${bi.bmi }" pattern="#.0"/>
			</td>
		</tr>
		<tr>
			<td align="center">
				${bi.name }씨는 ${result }
			</td>
		</tr>
		<tr>
			<td>
				<img src="resources/img/${img }">
			</td>
		</tr>
	</table>
</body>
</html>