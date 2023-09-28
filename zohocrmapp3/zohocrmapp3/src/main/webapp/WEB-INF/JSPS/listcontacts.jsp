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
	<h2>All Contacts</h2>
		<table>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Source</th>
				<th>Billing</th>
			</tr>
			<r:forEach var="contact" items="${contacts}">
				<tr>
					<td><a href="contactinfo?id=${contact.id}">${contact.firstName}</a></td>
					<td>${contact.lastName}</td>
					<td>${contact.email}</td>
					<td>${contact.mobile}</td>
					<td>${contact.source}</td>
					<td><a href="billingForm?contactId=${contact.id}">Billing</a></td>
				</tr>
			</r:forEach>
		</table>
</body>
</html>