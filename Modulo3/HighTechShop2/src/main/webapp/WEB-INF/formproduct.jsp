<%@page import="model.Product"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>High Tech Shop</title>
</head>
<body>

<%
	Product product = (Product)request.getAttribute("product");
	if(product == null){
		product = new Product();
		product.setId(null);
		product.setName("");
		product.setPrice(0.0);
		product.setBrand("");
		product.setValidDate(new Date());
	}
		

%>

<%@include file="menu.jsp" %>

	<form method="post" action="product">
 	
		<input type="hidden" name="action" value="cad">

 		<input type="hidden" name="id" value="<%= product.getId() %>">
		<input type="text" value="<%= product.getName() %>" name="name" placeholder="Nome do produto" /> 
		<input type="number" value="<%= product.getPrice() %>" name="price" placeholder="Preço do produto" /> 
		<input type="text" value="<%= product.getBrand() %>" name="brand" placeholder="Marca do produto" /> 
		<input type="text" value="<%= product.getValidDate()%>" name="validDate" placeholder="Data de validade do produto"> 
		<input type="submit" value="Salvar">

	</form>

</body>
</html>