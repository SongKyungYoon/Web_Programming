<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="dto.Product" %>
<<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"></jsp:useBean>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" 
		rel="stylesheet" 
		integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" 
		crossorigin="anonymous">
<title>상품 상세 정보</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("p_id");
		Product product = productDAO.getProductById(id);
	%>
	<div class="container">
		<div class="col-md-6">
			<h3><%=product.getPname() %></h3>
			<p><%=product.getDescription() %></p>	
			<p><b>상품 코드 : </b><span class="badge badge-danger"><%=product.getProductId() %></span></p>
			<p><b>제조사</b> : <%=product.getManufacturer() %></p>
			<p><b>분류</b> : <%=product.getCategory() %></p>
			<p><b>재고 수</b> : <%=product.getUnitsInStock() %></p>
			<h4><%=product.getUnitPrice()%>원</h4>
			<p><a href = "./products.jsp" class="btn btn-secondary">상품 주문 &raquo;</a></p>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>