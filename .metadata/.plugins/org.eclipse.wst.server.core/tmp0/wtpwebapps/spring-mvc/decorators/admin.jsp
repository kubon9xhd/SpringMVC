<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<link
	href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css"
	rel="stylesheet" />
<link href="<c:url value='/template/admin/css/styles.css'></c:url>"
	rel="stylesheet" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js"
	crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">
	<div id="layoutSidenav">
		<%@include file="/common/admin/header.jsp"%>
		<%@include file="/common/admin/menu.jsp"%>
		<div id="layoutSidenav_content">
			<main>
				<decorator:body></decorator:body>
			</main>
			<%@include file="/common/admin/footer.jsp"%>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
			crossorigin="anonymous"></script>
		<script src='<c:url value="/template/admin/js/scripts.js"></c:url>'></script>
		<script
			src='<c:url value="/template/admin/js/datatables-simple-demo.js"></c:url>'></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
			crossorigin="anonymous"></script>
		<script
			src="<c:url value='/template/admin/assets/demo/chart-area-demo.js'></c:url>"></script>
		<script
			src="<c:url value='/template/admin/assets/demo/chart-bar-demo.js'></c:url>"></script>
		<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest"
			crossorigin="anonymous"></script>
		<script
			src="<c:url value='/template/admin/assets/demo/chart-bar-demo.js'></c:url>"></script>
	</div>
</body>
</html>