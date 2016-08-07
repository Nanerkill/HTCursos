<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% User user = (User)session.getAttribute("user");
    	if(user != null)
    		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login HTShop</title>
</head>
<body>
	
	<div align="center">
		<form action="login" method="post">
			<h1>Login</h1>
			<input type="text" name="login" placeholder="Login"><br>
			<input type="text" name="password" placeholder="Password"><br>
			<input type="submit" value="Entrar">
		</form>
	</div>

</body>
</html>