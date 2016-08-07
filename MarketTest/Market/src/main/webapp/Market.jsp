<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container">
	
		<div class="topleft">
			<h1>Save</h1>
			<form action="market" method="post">
				<input type="hidden" name="acao" value="add" />
				<input type="text"  name="name" placeholder="Name" />
				<input type="submit" value="Salvar" />
			</form>
		</div>
		
		<div class="topright">
			<h1>Delete</h1>
			<form action="market" method="post">
				<input type="hidden" name="acao" value="delete" />
				<input type="text" name="name" placeholder="Name" />
				<input type="submit" value="Delete" />
			</form>
		</div>
		
		<div class="bottomleft">
			<h1>Update</h1>
			<form action="market" method="post">
				<input type="hidden" name="acao" value="update" />
				<input type="text" name="id" placeholder="Id" />
				<input type="text" name="name" placeholder="Name" />
				<input type="submit" value="Update" />
			</form>
		</div>
		
	</div>
	
</body>
</html>