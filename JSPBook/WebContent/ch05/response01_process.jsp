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
		
		if (userid.equals("관리자") && password.equals("1234")) {
			response.sendRedirect("response01_success.jsp");	
		} else {
			response.sendRedirect("response01_failed.jsp");
		}
	%>
</body>
</html>