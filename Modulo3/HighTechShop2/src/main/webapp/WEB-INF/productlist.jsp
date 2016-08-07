<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
@import
	'https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300';
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Produtos</title>
<script>
	// Aqui vai um script em javascript
	// Função de confirmar remoção
	function confirmarRemocao() {
		return window.confirm("Tem certeza que deseja remover estes produtos?")
	}
</script>
</head>
<body>
	<%@include file="menu.jsp"%>
	<%
		List<Product> products = (List<Product>) request.getAttribute("products");
	%>
	<h1
		style="text-align: center; font-family: 'Open Sans Condensed', sans-serif;">Lista
		de produtos cadastrados</h1>

	<form method="post" action="product"
		onsubmit="return confirmarRemocao()">
		<input type="hidden" name="action" value="rem">
		<table border="0"
			style="width: 70%; margin: auto; box-shadow: 0px 0px 20px black; border: none">
			<thead style="background-color: #009cdf; color: white; border: none">
				<th style="border: none">Nome</th>
				<th style="border: none">Preço</th>
				<th style="border: none">Marca</th>
				<th style="border: none">Data de Validade</th>
				<th style="border: none">Selecione</th>
			</thead>
			<tbody style="background-color: #7a7a7a; color: white; border: none">
				<%
					for (Product product : products) {
				%>
				<tr>
					<td style="border: none"><%=product.getName()%></td>
					<td style="border: none"><%=product.getPrice()%></td>
					<td style="border: none"><%=product.getBrand()%></td>
					<td style="border: none"><%=product.getValidDate()%></td>
					<td><input name="id" type="checkbox"
						value="<%=product.getId()%>"> <a href="product?id=<%=product.getId()%>&action=update">Alterar</a>
					</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<input type="submit" value="Excluir">
	</form>

</body>
</html>