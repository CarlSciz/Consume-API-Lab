<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Complete</title>
</head>
<body>

	<table class="table table-bordered table-dark">
		<tr>
			<th>First Name</th><th>Last Name</th><th>Innovation</th><th>Year</th>
			<c:forEach var="Complete" items="${ Complete }">
				<tr>
					<td>${ Complete.firstName }</td>
					<td>${ Complete.lastName }</td>
					<td>${ Complete.innovation }</td>
					<td>${ Complete.year }</td>
				</tr>
			</c:forEach>
	</table>
	
	<ul>
		<li><a href="/">Tiny List</a></li>
	</ul>
</body>
</html>