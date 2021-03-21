<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출결확인</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<div class="container-md container-fluid">
		<div style="margin: 10px auto;">
 			<a class="btn btn-primary" href="RollCall?q=입실" role="button">입실</a>
 			<a class="btn btn-primary" href="RollCall?q=퇴실" role="button">퇴실</a>
 		</div>
 		<div>
 			<c:if test="${not empty requestScope.today}">
 				${requestScope.today}<br>
 				<a class="btn btn-primary" href="chulgyeollist?time=${requestScope.time }&attend=${requestScope.attend}" role="button">예</a>
 				<a class="btn btn-primary" href="MainPage.jsp" role="button">아니오</a>
 			</c:if>
 		</div>
	</div>
</body>
</html>