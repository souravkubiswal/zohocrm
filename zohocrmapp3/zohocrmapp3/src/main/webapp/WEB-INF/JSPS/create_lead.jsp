<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
	<h2>Lead | Create</h2>
	<hr>
	<form action="save" method = "post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			</table>
			source :
			<select name="source">
				<option value="radio">radio</option>
				<option value = "news paper">news paper</option>
				<option value="trade show">trade show</option>
				<option value="website">website</option>
			</select>
		<input type = "submit" value="save"/>
	</form>
</body>
</html>