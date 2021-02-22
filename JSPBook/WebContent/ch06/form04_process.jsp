<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Processing</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		String comment = request.getParameter("comment");
	%>
	
	<p>아 이 디 : <%=id %></p>
	<p>비밀번호 : <%=pw %></p>
	<p>이 름 : <%=name %></p>
	<p>연 락 처 : <%=phone1 %> - <%=phone2 %> - <%=phone3 %></p>
	<p>성 별 : <%=sex %></p>
	<p>취 미 :
		<%
			if(hobby != null ){
				
				for(int i = 0; i < hobby.length; i++){
		%>
					<%=hobby[i] %>
		<%
				}
			}
		%>
	</p>
	<p>가입 인사 : <%=comment %></p>
	
</body>
</html>