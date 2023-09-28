<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="r" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>All Leads</h2>
		<table>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Source</th>
			</tr>
			<r:forEach var="lead" items="${leads}">
				<tr>
					<td><a href="leadinfo?id=${lead.id}">${lead.firstName}</a></td>
					<td>${lead.lastName}</td>
					<td>${lead.email}</td>
					<td>${lead.mobile}</td>
					<td>${lead.source}</td>
				</tr>
			</r:forEach>
		</table>
</body>
</html>