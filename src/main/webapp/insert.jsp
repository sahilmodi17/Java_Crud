<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="allCss.jsp"%>
</head>
<body>

	<%@include file="navbar.jsp"%>
	<div class="container py-5">

		<h2>Add Student</h2>
		<form action="register" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name </label> <input
					type="text" class="form-control" id="name" name="name">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email </label> <input
					type="email" class="form-control" id="email" name="email">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Contact </label> <input
					type="number" class="form-control" id="number" name="number">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Age </label> <input
					type="number" class="form-control" id="age" name="age">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
</html>