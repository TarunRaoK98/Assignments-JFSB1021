<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Athletes</title>
</head>
<body>
	<h1 align="center">Athletics Registration System</h1>
	<table border="1" style="margin-left: auto;  margin-right: auto; width: 100%; text-align: center;">
		<tr>
			<th>Athlete ID</th>
			<th>Athlete Name</th>
			<th>Gender</th>
			<th>Category</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		<c:forEach var="user" items="${athlist}">
			<tr>
				<td><c:out value="${user.id}" /></td>
				<td><c:out value="${user.name}" /></td>
				<td><c:out value="${user.gender}" /></td>
				<td><c:out value="${user.category}" /></td>
				<td><c:out value="${user.email}" /></td>
				<td><c:out value="${user.number}" /></td>
			</tr>

		</c:forEach>
	</table>
	<hr/>
	<a href="http://localhost:8080/athlete/index.jsp">Home</a>
	
</body>
</html>