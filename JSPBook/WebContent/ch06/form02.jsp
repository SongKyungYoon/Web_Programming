<%@ page  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Processing</title>
</head>
<body>
	<div style="width: 450px">
		<form action="#" name="member" method="get">
			<fieldset>
				<legend style="font-size: 35px"><b>회원 가입</b></legend>
				<p>
					<label for="user_id">아 이 디 : </label><input type="text"
						id="user_id" name="id"> <input type="button"
						value="아이디 중복 검사">
				</p>
				<p>
					<label for="user_pw">비밀번호 : </label><input type="password"
						id="user_pw" name="pw">
				</p>
				<p>
					<label for="user-_name">이 름 : </label><input type="text"
						id="user-_name" name="name" placeholder="한글로 입력하세요">
				</p>
				<p>
					<label>연 락 처 : </label><input type="text" maxlength="3" size="4"
						name="phone1"> - <input type="text" maxlength="4" size="4"
						name="phone2"> - <input type="text" maxlength="4" size="4"
						name="phone3">
				</p>
				<p>
					<label>성 별 : </label> 
					<input type="radio" id="sel_m" name="sex" value="남성" checked>
					<label for="sel_m">남성</label> 
					<input type="radio" id="sel_g" name="sex" value="여성">
					<label for="sel_g">여성</label>
				</p>
				<p>
					<label>취 미 : </label> 
					<label for="h1">독서</label><input	type="checkbox" id="h1" name="hobby1" checked>
					<label for="h2">운동</label><input type="checkbox" id="h2" name="hobby2">
					<label for="h3">영화</label><input type="checkbox" id="h3"	name="hobby3">
				</p>
				<div>
					<textarea name="comment" rows="3" cols="30" placeholder="가입 인사를 입력해주세요"></textarea>
				</div>
				<p>
					<input type="submit" value="가입하기"> 
					<input type="reset" value="다시 쓰기">
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>