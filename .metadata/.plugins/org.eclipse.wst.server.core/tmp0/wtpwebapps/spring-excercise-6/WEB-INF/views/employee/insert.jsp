<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee</h1>
	<form:form action="show" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td><form:label path="id">Id</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:textarea rows="5" path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input type="email" path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td><form:radiobutton path="gender" value="male" label="male" />
					<form:radiobutton path="gender" value="female" label="female" /></td>
			</tr>
			<tr>
				<td><form:label path="favorites">Favorite</form:label></td>
				<td><form:checkboxes items="${listFavorite}" path="favorites" />
				</td>
			</tr>
			<tr>
				<td><form:label path="position">Position</form:label></td>
				<td><form:select path="position">
						<form:option value="NONE" label="Select"></form:option>
						<form:options items="${listPosition}" />
					</form:select>
					</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>