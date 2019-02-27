<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Tiny</title>
</head>
<body>
	<h1>Tiny Info Snippets</h1>

	<table class="table table-striped">
	<tr>
	<th>Name</th><th>Invented</th><th>Year</th>
	</tr>
		<c:forEach var="Tiny" items="${ Tiny }">

			<tr>
				<td>${ Tiny.name }</td>
				<td>${ Tiny.invented }</td>
				<td>${ Tiny.year }</td>
			</tr>
		</c:forEach>
	</table>
	<ul>
		<li><a href="/complete">Complete List</a></li>
	</ul>
</body>
</html>