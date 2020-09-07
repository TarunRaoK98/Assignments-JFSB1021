<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Athlete Registration Page</title>
</head>
<body>
	<h2 align="center">Athlete Registration</h2>

	<form action="addAthlete" method="post">
		<input name="id" type="hidden" value="0"/>
		<table border="1" style="margin-left: auto;  margin-right: auto;">
			<tr>
				<td><label>Athlete Name</label></td>
				<td><input type="text" pattern="^([A-Z][a-z]*\s?)+$"
					maxlength="40" name="name" title="Name should not be empty, should start with an uppercase letter and must be less than 40 characters" required autofocus><br></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td>
				  	<label>Male</label>
					<input type="radio" name="gender" value="male" required>
					<label>Female</label>
				  	<input type="radio" name="gender" value="female" required><br>
			  	</td>
		 	</tr>
		 	<tr>
			  	<td><label for="cat">Category</label></td>
			  	<td>
					<select name="category" id="cat" required>
					  <option value="Running">Running</option>
					  <option value="High Jump">High Jump</option>
					  <option value="Hurdles">Hurdles</option>
					  <option value="Relay">Relay</option>
					  <option value="Javelin">Javelin</option>
					  <option value="Shot put">Shot put</option>
					</select>
				<br>
				</td>
			</tr>
			<tr>
			  	<td><label>Email</label></td>
				<td><input type="text" name="email" required><br></td>
			</tr>
			<tr>
			  	<td><label>Number</label></td>
			  	<td><input type = "text" title="Mobile number must be a valid 10 digit number" name="number" pattern="([0-9]{10})" required/></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Add"/>
					<input type="reset" value="Cancel"/>
				</td>
				<td><a href="http://localhost:8080/athlete/index.jsp">Home</a></td>
			</tr>
		</table>
	</form>
	

</body>
</html>