<%@page import="com.entity.Student"%>
<%@page import="com.conn.Dbconn"%>
<%@page import="com.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="allCss.jsp"%>
<body>

	<%@include file="navbar.jsp"%>
	<div class="container py-5">

		<%
		int id = Integer.parseInt(request.getParameter("id"));
		StudentDAO dao = new StudentDAO(Dbconn.getConnection());
		Student s = dao.getStudentById(id);
		%>

		<h2>Update Student</h2>
		<form action="update" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name </label> <input
					value="<%=s.getFullName()%>" type="text" class="form-control"
					id="name" name="name">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email </label> <input
					value="<%=s.getEmail()%>" type="email" class="form-control"
					id="email" name="email">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Contact </label>
				<input value="<%=s.getContact()%>" type="number"
					class="form-control" id="number" name="number">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Age </label> <input
					value="<%=s.getAge()%>" type="number" class="form-control"
					id="age" name="age">
			</div>


			<input type="hidden" value="<%=s.getId()%>" id="id" name="id">




			<button type="submit" class="btn btn-primary">Update</button>
		</form>
	</div>

</body>
</html>