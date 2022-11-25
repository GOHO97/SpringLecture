<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/move.js"></script>
</head>
<body>
	<table border="1" id="shareTable">
		<form action="share.search" >
		<tr>
			<td align="center" colspan="2">
				게시판 목록 선택
			</td>
			<td colspan="2" align="center">
				<input name="page" value="1" type="hidden">
				<input name="search" placeholder="제목 or 내용"><button>검색</button>
			</td>
		</tr>
		</form>
		<tr>
			<td colspan="4">
				${r }
			</td>
		</tr>
		<c:forEach var="sb" items="${shareBoard }">
		<tr>
			<td align="center">
				${sb.s_no }
			</td>
			<td align="center">
				닉네임
			</td>
			<td align="center">
				${sb.s_title }
			</td>
			<td align="center">
				<fmt:formatDate value="${sb.s_date }" pattern="yy-MM-dd"/> 
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="3" align="center">
				<c:forEach var="p" begin="1" end="${pageCount }">
					<a href="share.search?page=${p }&search=${sessionScope.search }">${p }</a>
				</c:forEach>
			</td>
			<td align="center">
				<div onclick="goWrite(${param.page });">글쓰기</div>
			</td>
		</tr>
	</table>
</body>
</html>