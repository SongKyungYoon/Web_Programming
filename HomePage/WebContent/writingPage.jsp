<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 페이지</title>
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
			<div class="col-3 col-md-4">
				<p>
					<small>ID: ${sessionScope.id}</small><br> <small>소속: ${sessionScope.position}</small>
				</P>
			</div>
			<form class="row g-3" action="NoticeBoardController" method="post">
				<div class="col-md-3">
					<label for="inputWriter" class="form-label">글 쓴 이</label> <small style="color: red;">${requestScope.name}</small> <input
						type="text" name="writer" class="form-control" id="inputWriter" placeholder="본인 이름을 적어주세요" required>
				</div>
				<div class="col-md-3">
					<label for="inputId" class="form-label">아 이 디</label> <small style="color: red;">${requestScope.id}</small> <input
						type="text" name="id" class="form-control" id="inputId" placeholder="로그인 계정을 입력해 주세요" required>
				</div>
				<div class="col-md-3">
					<label for="inputContent" class="form-label">글 제목</label> <input
						type="text" name="title" class="form-control" id="inputContent" required>
				</div>
				<div class="col-md-3">
					<label for="inputDate" class="form-label">작성일자</label> <input
						type="date" name="date" class="form-control" id="inputDate" required>
				</div>
				<div class="col-12 form-floating">
					<textarea class="form-control" placeholder="Leave a comment here"
						id="floatingTextarea2" name="text" style="height: 100px" required></textarea>
					<label for="floatingTextarea2">글 내용</label>
				</div>
				<div class="col-10">
				</div>
				<div class="col-2">
					<button type="submit" class="btn btn-primary">제출</button>
					<button type="reset" class="btn btn-primary">취소</button>
					<a href="./noticeboard.jsp"><button type="button" class="btn btn-primary">나가기</button></a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>