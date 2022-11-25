<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/sWrite.css">
<script type="text/javascript" src="resources/js/sWriteChecker.js"></script>
<script type="text/javascript" src="resources/js/hoValidChecker.js"></script>
</head>
<body>
<form action="share.write.complete?page=${param.page }" method="post" onsubmit="return sWriteCheck(this);">
	<table id="sWriteTable">
		<tr>
			<td class="textTd">
				제목
			</td>
		</tr>
		<tr>
			<td align="center">
				<input name="s_title" placeholder="제목 20자" maxlength="20" autocomplete="off" autofocus="autofocus">
				<input name="token" type="hidden" value="${token }">
			</td>
		</tr>
		<tr>
			<td class="textTd">
				내용
			</td>
		</tr>
		<tr>
			<td align="center">
				<textarea name="s_txt" maxlength="500" autocomplete="off" >최대 500자 최소 20자</textarea>
			</td>
		</tr>
		<tr>
			<td align="center">
				<button>등록</button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>