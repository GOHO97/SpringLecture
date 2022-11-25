<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
			$.ajax({
				url : "weather.get",
				data : {x:32, y:65},
				success : function(wData) {
					var ar = [];
					$(wData).find("data").each(function(i, d) {
						ar[i] = {
								x : $(d).find("day").text() + $(d).find("hour").text(),
								y : $(d).find("temp").text() * 1
						};
						var hourTd = $("<td></td>").text($(d).find("hour").text()).attr("align", "center");
						var tempTd = $("<td></td>").text($(d).find("temp").text()).attr("align", "center");
						var weatherTd = $("<td></td>").text($(d).find("wfKor").text()).attr("align", "center");
						var tr = $("<tr></tr>").append(hourTd, tempTd, weatherTd);
						$("table").append(tr);
					});
					
					var chart = new CanvasJS.Chart("chartContainer", {
						animationEnabled: true,
						theme: "light2",
						title:{
							text: "Simple Line Chart"
						},
						data: [{        
							type: "line",
					      	indexLabelFontSize: 16,
							dataPoints: ar
						}]
					});
					chart.render();
				}
			});
	});
</script>
</head>
<body>
	<input id="x"><br>
	<input id="y"><br>
	<button id="btn">날씨확인</button><hr>
	<div id="chartContainer" style="height: 370px; width: 100%;"></div>
	<table border="1">
		<tr>
			<td align="center">시간</td>
			<td align="center">온도</td>
			<td align="center">날씨</td>
		</tr>
	</table>
</body>
</html>