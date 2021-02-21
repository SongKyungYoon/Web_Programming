<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("user_id");
		String password = request.getParameter("user_pw");
	%>
	<p>아 이 디 :<%=userid %></p>
	<p>비밀번호 :<%=password %></p>
</body>
</html>