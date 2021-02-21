<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<form action="request01_process.jsp" method="post">
		<p>
		<label for="id">아 이 디 :</label>
		<input type="text" id="id" name="user_id">
		</p>
		<p>
		<label for="pw">비밀번호 :</label>
		<input type="text" id="pw" name="user_pw">
		</p>
		<p>
		<input type="submit" value="전송">
		</p>
	</form>
</body>
</html>