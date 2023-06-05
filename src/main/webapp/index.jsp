<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDAO"%>
<%@page import="com.conn.Dbconn"%>

<%@ page import="java.sql.*"%>
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

	

	<%
	Connection con = Dbconn.getConnection();
	// out.print(con);
	%>


	<%@include file="navbar.jsp"%>
	<div class="container">
		<h2 class="text-center p-4">Students Details</h2>

		<table class="table">
			<thead>
				<tr>
					<th scope="col">Sr.no</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Contact</th>
					<th scope="col">Age</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				StudentDAO dao = new StudentDAO(Dbconn.getConnection());
				List<Student> list = dao.getAllStudent();

				for (Student s : list) {
				%>

				<tr>
					<td scope="row"><%=s.getId()%></td>
					<td><%=s.getFullName()%></td>
					<td><%=s.getEmail()%></td>
					<td><%=s.getContact()%></td>
					<td><%=s.getAge()%></td>
					<td><a href="update.jsp?id=<%=s.getId()%>"
						class="btn btn-primary">Edit</a> 
						<a href="delete?id=<%=s.getId()%>"
						class="btn btn-danger">Delete</a> </td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>




	</div>
</body>
</html>