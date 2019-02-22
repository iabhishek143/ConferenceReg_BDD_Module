<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Details</title>
</head>
<body>
<table border="3">
		<tr>
			<th>ID</th><th>Name</th><th>Rating</th><th>Rates</th><th>Available Rooms</th>
		</tr>
		<tr>
			<td>
		<jstl:forEach var="hotels" items="${hotels}">
					<tr>
						<td>${hotels.id}</td>
						<td><a href="ConfirmationPage.obj?uid=${hotels.name}" >${hotels.name}</a></td>
						<td>${hotels.rating}</td>
						<td>${hotels.rate}</td>
						<td>${hotels.available_rooms}</td>
					</tr>
				</jstl:forEach>
	</table>
	${msg}
</body>
</html>