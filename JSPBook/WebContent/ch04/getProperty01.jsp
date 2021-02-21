<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
 <jsp:useBean id="person" class="ch04.com.dao.Person" scope="application"></jsp:useBean>
 <p> 아이디 : <jsp:getProperty property="id" name="person"/></p>
 <p> 이 름 : <jsp:getProperty property="name" name="person"/></p>
</body>
</html>