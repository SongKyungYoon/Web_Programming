<html>
<head>
<title>Scripting Tag</title>
</head>
<body>
	<%
		for (int i = 0; i <=10; i++){
			if(i % 2 == 0){
				out.print(i+"<br>");
				//out.println(i+"<br>");
			}
		}
	%>
</body>
</html>