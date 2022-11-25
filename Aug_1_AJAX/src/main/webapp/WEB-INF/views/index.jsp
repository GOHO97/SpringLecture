<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function () {
		setInterval(function() {
			$.ajax({
				url : "songs.get.xml", 
				success : function (xzc) {
					$("#ajaxTable").empty();
					$(xzc).find("song").each(function (i, a) {
						var a2 = $(a).find("a_a").text();
						var n = $(a).find("a_no").text();
						var nTd = $("<td></td>").text(n);
						var aTd = $("<td></td>").text(a2);
						var tr = $("<tr></tr>").append(nTd, aTd);
						$("#ajaxTable").append(tr);
						
					}); 
				}
			});
		}, 1000);
	});
</script>
</head>
<body>
	<table border="1" id="ajaxTable">
		<tr>
			<th>a_a</th>
			<th>a_no</th>
		</tr>
		
	</table>
	<input>
<table border="1">
	<c:forEach var="a" items="${au }">
		<tr>
			<td>
				${a.a_no }
			</td>
			<td>
				${a.a_a }
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>