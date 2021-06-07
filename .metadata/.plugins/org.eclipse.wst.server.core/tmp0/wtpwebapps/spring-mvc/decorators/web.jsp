<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here web</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="<c:url value='/template/web/assets/favicon.ico'></c:url>" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="<c:url value='/template/web/css/styles.css'></c:url>" rel="stylesheet" />
</head>
<body>
	<%@include file="/common/web/header.jsp"%>
	<decorator:body></decorator:body>
	<%@include file="/common/web/footer.jsp"%>
</body>
</html>