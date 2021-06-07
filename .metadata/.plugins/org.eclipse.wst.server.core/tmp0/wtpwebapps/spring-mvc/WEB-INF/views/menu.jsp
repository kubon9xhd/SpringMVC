<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
	<c:forEach items="${menu}" var="x">
		<li>${x}</li>
	</c:forEach>
</ul>