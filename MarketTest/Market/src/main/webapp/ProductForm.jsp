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

	<div class="containder">
		
		<div class="topleft">
			<h1>Save</h1>
			<form action="product" method="post">
				<input type="hidden" name="acao" value="add" />
				<input type="text" name="name" placeholder="Name" />
				<input type="text" name="brand" placeholder="Brand" />
				<input type="text" name="price" placeholder="Price" />
				<input type="text" name="date" placeholder="Date" />
				<input type="text" name="mk_id" placeholder="Market Id" />
				<input type="submit" value="Save" />
			</form>
		</div>
		
		<div class="topright">
			<h1>Delete</h1>
			<form action="product" method="post">
				<input type="hidden" name="acao" value="delete" />
				<input type="text" name="id" placeholder="Id" />
				<input type="submit" value="Delete" />
			</form>
		</div>
		
		<div class="bottomleft">
			<h1>Update</h1>
			<form action="product" method="post">
				<input type="hidden" name="acao" value="update" />
				<input type="text" name="id" placeholder="Id" />
				<input type="text" name="name" placeholder="Name" />
				<input type="text" name="brand" placeholder="Brand" />
				<input type="text" name="price" placeholder="Price" />
				<input type="text" name="date" placeholder="Date" />
				<input type="text" name="mk_id" placeholder="Market Id" />
				<input type="submit" value="Update" />
			</form>
		</div>
		
		<div class="bottomright">
			<h1>FindAllByMarket</h1>
				<form action="product" method="post">
				<input type="hidden" name="acao" value="findByMarket" />
				<input type="text" name="id" placeholder="id" />
				<input type="submit" value="Find!" />
			</form>
		</div>
		
	</div>

</body>
</html>