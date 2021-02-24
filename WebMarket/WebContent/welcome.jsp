<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Welcome</title>
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<%!String greeting = "웹 쇼핑몰에 오신 것을 환영합니다";
	String tagline = "Welcome to Web Market!";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
			<%
				response.setIntHeader("Refresh", 5);
				java.util.Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if(hour / 12 == 0){
					am_pm = "AM";
				}
				else{
					am_pm = "PM";
					hour = hour-12;
				}
				String CT = hour+":"+ minute + ":" + second + " " + am_pm;
			%>
			현재 접속 시각:<%=CT%>
		</div>
		<hr>
		<%@ include file="footer.jsp" %>
	</div>
</body>
</html>