<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
<script type="text/javascript">
	$(function() {
		var url = "http://openAPI.seoul.go.kr:8088/575a4655496b636839386f58586542/json/RealtimeCityAir/1/25/";
		var fDAr = [];
		var fFDAr = [];
		$.getJSON(url, function(dustData) {
			$.each(dustData.RealtimeCityAir.row, function(i, dd) {
				fDAr[i] = {
					label: dd.MSRSTE_NM,
					y: dd.PM10
				};
				fFDAr[i] = {
					label: dd.MSRSTE_NM,
					y: dd.PM25	
				};
				var location = $("<td></td>").text(dd.MSRSTE_NM).attr("align", "center");
				var fineDust = $("<td></td>").text(dd.PM10).attr("align", "center");
				var fFineDust = $("<td></td>").text(dd.PM25).attr("align", "center");
				var tr = $("<tr></tr>").append(location, fineDust, fFineDust);
				
				$("table").append(tr);
			});
		var chart = new CanvasJS.Chart("chartContainer", {
			
			title:{
				text: "서울시 지역별 미세먼지, 초미세먼지 농도",
				fontColor: "#00000025",
				backgroundColor: "#FFD600",
				
			},
			data: [              
			{
				type: "stackedColumn",
				legendText: "미세먼지 농도",
				showInLegend: "true",
				dataPoints: fDAr
			}, {
				type: "stackedColumn",
				legendText: "초미세먼지 농도",
				showInLegend: "true",
				dataPoints: fFDAr
			}
			]
		});
		chart.render();
		});
	});
</script>
</head>
<body>
	<div id="chartContainer" style="height: 300px; width: 100%;"></div>
	<table border="1">
		<tr>
			<td align="center">지역</td><td align="center">미세먼지</td><td align="center">초미세먼지</td>
		</tr>
	</table>
</body>
</html>