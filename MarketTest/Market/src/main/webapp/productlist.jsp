<%@page import="market.models.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    
    List<Product> array = (List<Product>) request.getAttribute("products");
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
// Aqui vai um script em javascript
//Função para confirmar remoção...
function confirmDelete() {
	return window.confirm("Are you sure?");
}
</script>

</head>
<body>

<%@include file="WEB-INF/Menu.jsp" %>

<form method="post" action="product" onsubmit="return confirmDelete()" >
	<table style="width: 70%" align="center">
		<thead style="background-color: #009cdf">
			<th>Name</th>
			<th>Price</th>
			<th>Brand</th>
			<th>Valid Date</th>
			<th>Edit</th>
		</thead>
		<tbody>
		<!-- for aqui dentro -->
			<% for(int i = 0; i < array.size(); i++) { %>
			<tr>
				<td><%= array.get(i).getName() %></td>
				<td><%= array.get(i).getPrice() %></td>
				<td><%= array.get(i).getBrand() %></td>
				<td><%= array.get(i).getDate() %></td>
				<td><input type="checkbox" name="id" value="<%= array.get(i).getId() %>"><a href="product?id=<%= array.get(i).getId()%>&action=update">Edit</a></td>
			</tr>
			<% } %>
		</tbody>
	</table>
	<input type="hidden" name="acao" value="deleteMany">
	<input type="submit" value="Delete" />
</form>

<%-- <%	for(Product x: array) { %> --%>
<%-- 	<h1> <%= x.getName() %> </h1> --%>
<%-- <% } %> --%>

</body>
</html>