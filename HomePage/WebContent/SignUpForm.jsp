<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<style type="text/css" rel="stylesheet">
	#SignUpForm{
		width: 25%;
		margin: 10px auto;
	}
</style>
</head>
<body>
	<div id = SignUpForm>
		<form class="row g-3" action="LoginController" method="post">
  			<div class="col-md-3">
    			<label for="user_name" class="form-label">이름</label>
    			<input type="text" class="form-control" name="name" id="user_name" required>
  			</div>
  			<div class="col-md-4">
    			<label for="birthday" class="form-label">생년월일</label>
    			<input type="text" class="form-control" name="birthday" id="birthday" pattern="[0-9]{6}" placeholder="생일 6자리 입력" required>
  			</div>
  			 <div class="col-md-5">
    			<label for="phone_number" class="form-label">전화번호</label>
    			<input type="tel" class="form-control" name=phoneNumber id="phone_number" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" placeholder="'-' 포함 입력" required>
  			</div>
  			<div class="col-md-12">
    			<label for="new_id" class="form-label">새로운 아 이 디 </label> <small style="color: red;">${duplicateId}</small>
    			<input type="text" class="form-control" name="id" id="new_id" required>
  			</div>
 			 <div class="col-md-12">
    			<label for="new_pw" class="form-label">새로운 비밀번호</label>
    			<input type="text" class="form-control" name="pw" id="new_pw" required>
  			</div>
  			
  			<div class="col-12">
  				<div>
  					<label class="form-check-label" for="gridCheck">직업 </label>
    			</div>
    			<div class="form-check form-check-inline">
      				<input class="form-check-input" type="radio" name="position" value="학생" id="student" required>
      				<label class="form-check-label" for="student">학생 </label>
    			</div>
    			<div class="form-check form-check-inline">
      				<input class="form-check-input" type="radio" name="position" value="강사" id="lecturer">
      				<label class="form-check-label" for="lecturer">강사 </label>
    			</div>
    			<div class="form-check form-check-inline">
      				<input class="form-check-input" type="radio" name="position" value="영업" id="sales_manager">
      				<label class="form-check-label" for="sales_manager">영업 </label>
    			</div>
    			<div class="form-check form-check-inline">
      				<input class="form-check-input" type="radio" name="position" value="행정" id="admin">
      				<label class="form-check-label" for="admin">행정 </label>
    			</div>
  			</div>
  			<div class="col-12">
    			<button type="submit" class="btn btn-primary" name="button" value="가입하기">가입하기</button>
  			</div>
		</form>	
	</div>
</body>
</html>