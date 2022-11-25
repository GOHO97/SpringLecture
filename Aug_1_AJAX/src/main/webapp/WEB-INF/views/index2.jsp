<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td{
height: 300px;
}
</style>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">

	function getSong(page) {
			
		$.getJSON("songs2.get.json?page=" + page, function(wqe) {
			$.each(wqe.song2, function(i, s) {
				var nTd = $("<td></td>").text(s.a_no);
				var aTd = $("<td></td>").text(s.a_a);
				var tr = $("<tr></tr>").append(nTd, aTd);
				$("#ajaxTable").append(tr);
			});
		});
	}
	$(function () {
		var page = 1;
		getSong(page);
		
		$(window).scroll(function () {
			var htmlHeight = $(document).height();
			var browserHeight = $(window).height();
			var scrollTop = $(window).scrollTop();
			var scrollBottom = scrollTop + browserHeight;
			if(scrollBottom >= htmlHeight - 50){
				page ++;
				getSong(page);
			}
		});
		
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