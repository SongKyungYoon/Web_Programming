<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<style type="text/css" rel="stylesheet">
	#LoginForm{
	
		width: 500px;
		margin: 10px auto;
		
	}
	small{
		color: red;
	}
</style>
</head>
<body>
	<div id=LoginForm>
		<form action=LoginController method="post">
			<div class="mb-3">
				<label for="user_id" class="form-label">아 이 디</label>
				<input type="text" class="form-control" name="id" id="user_id" >
  			</div>
 			<div class="mb-3">
    			<label for="user_pw" class="form-label">비밀번호</label>
    			<input type="password" class="form-control" name="pw" id="user_pw" >
  			</div>
  			<div class="mb-3 form-check form-check-inline">
    			<input class="form-check-input" type="radio" name="position" value="학생" id="student">
  				<label class="form-check-label" for="student">학생</label>
  			</div>
  			<div class="mb-3 form-check form-check-inline">
    			<input class="form-check-input" type="radio" name="position"  value="강사" id="lecturer">
  				<label class="form-check-label" for="lecturer">강사</label>
  			</div>
  			<div class="mb-3 form-check form-check-inline">
    			<input class="form-check-input" type="radio" name="position" value="영업" id="sales_manager">
  				<label class="form-check-label" for="sales_manager">영업</label>
  			</div>
  			<div class="mb-3 form-check form-check-inline">
    			<input class="form-check-input" type="radio" name="position" value="행정" id="admin">
  				<label class="form-check-label" for="admin">행정</label>
  			</div>
  			<div>
  				<button type="submit" class="btn btn-primary" name="button" value="로그인">로그인</button>
  				<button type="submit" class="btn btn-primary" name="button" value="회원가입">회원가입</button>
  			</div>
  			<small>${space}</small>
  			<small>${error}</small>
		</form>
	</div>
</body>
</html>