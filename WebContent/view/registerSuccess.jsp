<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>This is the home page for shopping</title>
</head>
<body>
	<h1>You registered successfully</h1>
	<ul>
		<li>Id: ${customer.id}</li>
		<li>password: ${customer.password}</li>
		<li>gender: ${customer.gender}</li>
		<li>Name: ${customer.name}</li>
		<li>Email: ${customer.email}</li>
	</ul>
	<p><a href="/helloMVC/home?action=home">go to home page</a></p>
</body>
</html>