<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
{
box-sizing


:

 

border-box


}

/* Add padding to containers */
.container {
	padding: 16px;
}

input[type=number] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

.registerbtn {
	background-color: darkblue;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

a {
	color: dodgerblue;
}

</style>
</head>
<body>
	<br>
	<form method="POST" action="/register">
		<div class="container">
			<h1>Register</h1>
			<hr>

			<label for="id"><b>ID</b></label> <input type="number"
				placeholder="Enter ID" name="userId" id="userId" required> <br>

			<label for="name"><b>Name</b></label> <input type="text"
				placeholder="Enter Name" name="username" id="username" required>

			<br> <label for="pwd"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" name="pwd" id="pwd"
				required> <br>

			<hr>
			<button type="submit" class="registerbtn">Register</button>
		</div>
	</form>
	<br>
	<br>

</body>
</html>