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
			<th align="center">
				단위 변환기
			</th>
		</tr>
		<tr>
			<td align="center">
				${param.number }${fd.input }
			</td>
		</tr>
		<tr>
			<td align="center">
				↓
			</td>
		</tr>
		<tr>
			<td align="center">
				<fmt:formatNumber value="${result }" pattern="#.00"/>${fd.output }
			</td>
		</tr>
	</table>
</body>
</html>