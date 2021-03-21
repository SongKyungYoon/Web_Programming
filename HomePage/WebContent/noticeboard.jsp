<%@page import="com.bit.model.NoticeBoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NoticeBoard</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
	<style type="text/css">
		a{
			text-decoration: none;
		}
	</style>
</head>
<body>
	<div class="container" style="margin-top: 10px;">
		<div class="row">
			 <div class="col-md-4"><h1 style="float: left;">${sessionScope.name}님 로그인</h1> <small style="margin-left: 7px;">ID: ${sessionScope.id}</small><br><small style="margin-left: 7px;">소속: ${sessionScope.position}</small></div>
			<div class="col-3 col-md-2">
			</div>
			<div class="col-3 col-md-4" style="margin-top: 10px;">
				<a href="MainPage.jsp"><button type="button" class="btn btn-primary">HOME</button></a>
				<a href="writingPage.jsp"><button type="button" class="btn btn-primary">글쓰기</button></a>
			</div>
		</div>
		<div class="row" style="margin-top: 15px;">
			<div class="col-6 col-md-3">
				<h6>
					<a href="#" class="link-primary">강의확인</a>
				</h6>
			</div>
			<div class="col-6 col-md-3">
				<h6>
					<a href="#" class="link-primary">성적확인</a>
				</h6>
			</div>
			<div class="col-6 col-md-3">
				<h6>
					<a href="NoticeBoardController" class="link-primary">질문게시글</a>
				</h6>
			</div>
			<div class="col-6 col-md-3">
				<h6>
					<a href="#" class="link-primary">수강신청</a>
				</h6>
			</div>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">제목</th>
						<th scope="col">작성자</th>
						<th scope="col">날짜</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="n" items="${sessionScope.dblist}">
					<tr>
						<td>${n.num}</td>				
						<td><a href="DetailViewController?title=${n.title}">${n.title}</a></td>				
						<td>${n.writer}</td>				
						<td>${n.date}</td>				
					</tr>
					</c:forEach>
					
				</tbody>
			</table>
		</div>
	</div>
	<div class="container">
		<div style="margin: 0px auto; text-align: center;">
		<c:set var="startNum" value="${param.p == null ? 1 : param.p}"/>
		
		<c:set var="startPage" value="${startNum-(startNum-1)%10}"></c:set>
		<c:if test="${(startPage-1)>0}">
		<a href="?p=${startPage-1}"><<=</a>
		</c:if>
		<c:forEach var="i" begin="0" end="9">
		<a href="?p=${startPage+pageScope.i}">${startPage+pageScope.i}</a>
		</c:forEach>
		<c:if test="${startPage+10<30}">
		<a href="?p=${startPage+10}">=>></a>
		</c:if>
		</div>
	</div>
</body>
</html>