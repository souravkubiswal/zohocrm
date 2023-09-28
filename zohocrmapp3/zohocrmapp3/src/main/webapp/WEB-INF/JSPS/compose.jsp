<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		${msg}
	</div>

	<form action="sendEmail" method="post">
	<table>
			<tr>
				<td>To</td>
				<td><input type ="text" name= "to" value = "${email}"/></td>
			</tr>
			<tr>
				<td>Subject</td>
				<td><input type ="text" name= "subject"/></td>
			</tr>
			</table>
			<textarea name="message" rows="" cols="">
		</textarea>
		<input type ="submit" value= "save"/>
	</form>
	
	
</body>
</html>