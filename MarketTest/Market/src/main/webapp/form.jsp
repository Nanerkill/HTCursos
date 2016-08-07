<%@page import="market.models.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>High Tech Market</title>
</head>
<body>

<% 

	Product p = (Product)request.getAttribute("product");
	if(p == null) {
		p = new Product();
		
	}

%>

<%@include file="WEB-INF/Menu.jsp" %>

	<form method="post" action="product">
	
		<input type="hidden" name="acao" value="add" />
		<input type="text" name="name" placeholder="Nome do Produto" />
		<input type="text" name="brand" placeholder="Marca" />
		<input type="number" name="price" placeholder="Preco" />
		<input type="text" name="date" placeholder="yy/mm/dd" />
		<input type="text" name="mk_id" placeholder="Id do Mercado" />
		<input type="submit" value="Save" />
		
	</form>

</body>
</html>