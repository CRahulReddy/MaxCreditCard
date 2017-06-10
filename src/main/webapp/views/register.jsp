<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<%@ page isELIgnored="false"%>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Register</h2>
		<%-- <c:out value="${message}"/>  --%>
		${message}
		<form action="registerCoustomer" method="POST">
			<div class="form-group">

				<input type="input" class="form-control" name="cardNumber"
					placeholder="Enter CreditCardNumber">
			</div>
			<div class="form-group">

				<input type="input" class="form-control" name="userName"
					placeholder="Enter Username">
			</div>
			<div class="form-group">

				<input type="password" class="form-control" name="password"
					placeholder="Enter password">
			</div>
			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>