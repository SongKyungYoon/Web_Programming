<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</head>
<body>
	<div class="container" style="margin-top: 10px;">
		<div class="row">
			<div class="col-md-4">
				<h1>${sessionScope.name}님 로그인</h1>
			</div>
			<div class="col-3 col-md-2">
				<p>
					<small>ID: ${sessionScope.id}</small><br> <small>소속: ${sessionScope.position}</small>
				</P>
			</div>
			<div class="col-3 col-md-4" style="margin-top: 5px;">
				<a href="MainPage.jsp"><button type="button" class="btn btn-primary">HOME</button></a>
				<a href="writingPage.jsp"><button type="button" class="btn btn-primary">글쓰기</button></a>
			</div>
		</div>
		<div class="row">
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
					<a href="noticeboard.jsp" class="link-primary">질문게시글</a>
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
					<tr>
						<th scope="row">1</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>2021-03-04</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>Jacob</td>
						<td>Thornton</td>
						<td>2021-03-04</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>Larry the Bird</td>
						<td>@twitter</td>
						<td>2021-03-04</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>