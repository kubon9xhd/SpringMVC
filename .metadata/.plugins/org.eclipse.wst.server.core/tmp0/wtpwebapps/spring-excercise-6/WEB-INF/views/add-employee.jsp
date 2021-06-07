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
<h2>Add Employee</h2>
<form:form action="add-employee" method="POST" modelAttribute="employee">
	Id <form:input path="id"/>
	</br>
	Name <form:input path="name"/>
	</br>
	<input type="Submit" value="Submit">
</form:form>
</body>
</html>