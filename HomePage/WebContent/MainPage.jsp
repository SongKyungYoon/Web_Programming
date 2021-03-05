<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

</head>
<body>
<div class="container" style="margin-top: 10px;">
  <!-- Stack the columns on mobile by making one full-width and the other half-width -->
  <div class="row">
    <div class="col-md-4"><h1>${sessionScope.name}님 로그인</h1></div>
    <div class="col-3 col-md-4"><p><small>ID: ${sessionScope.id}</small><br><small>소속: ${sessionScope.position}</small></P></div>
  </div>

  <!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
  <div class="row">
    <div class="col-6 col-md-3"><h6><a href="#" class="link-primary">강의확인</a></h6></div>
    <div class="col-6 col-md-3"><h6><a href="#" class="link-primary">성적확인</a></h6></div>
    <div class="col-6 col-md-3"><h6><a href="noticeboard.jsp" class="link-primary">질문게시글</a></h6></div>
    <div class="col-6 col-md-3"><h6><a href="#" class="link-primary">수강신청</a></h6></div>
  </div>

</div>

</body>
</html>