<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td>${employee.id}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${employee.name}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${employee.address}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${employee.email}</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${employee.gender}</td>
		</tr>
		<tr>
			<td>Favorite</td>
			<c:if test="${not empty employee.favorites }">
				<td><c:forEach var="items" items="${employee.favorites}">${items} </c:forEach></td>
			</c:if>
		</tr>
		<tr>
			<td>Position</td>
			<td>${employee.position}</td>
		</tr>
	</table>
</body>
</html>