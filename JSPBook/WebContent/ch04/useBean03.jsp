<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="application"></jsp:useBean>
	<p> 아이디 : <%=person.getId()%></p>
	<p> 이 름 : <%=person.getName()%></p>
</body>
</html>