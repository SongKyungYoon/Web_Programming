<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SeongJeogPage</title>
</head>
<body>

	<c:set var="dbData" value="${dbData }"></c:set>
	이름 : ${dbData.name }	<br/>
	반 : ${dbData.group }<br/>
	Java : ${dbData.java }<br/>
	DataBase : ${dbData.database }<br/>
	FrameWork : ${dbData.framework }

	<a href="MainPage.jsp"><button type="button" >확인</button></a>
</body>
</html>