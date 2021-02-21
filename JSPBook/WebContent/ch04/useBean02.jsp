<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="bean" class="ch04.com.dao.Calculator"></jsp:useBean>
	<%
		int m = bean.process(5);
	%>
	<p>5의 3제곱: <%=m%></p>
</body>
</html>