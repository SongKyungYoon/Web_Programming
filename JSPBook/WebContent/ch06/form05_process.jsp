<%@page import= "java.io.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Processing</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>요청 파라미터 이름</th>
				<th>요청 파라미터 값</th>
			</tr>
		</thead>
		<tbody>
			<%
				request.setCharacterEncoding("utf-8");
			
				Enumeration paramNames = request.getParameterNames();
				while(paramNames.hasMoreElements()){
					String name = (String) paramNames.nextElement();
			%>
				<tr>
					<td><%=name %></td>
					<td><%=request.getParameter(name) %></td>
				</tr>
			<% 		
				}
			%>	
		</tbody>
	</table>
</body>
</html>