<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title><dec:title
		default="Shop Homepage - Start Bootstrap Template" /></title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon"
	href="<c:url value='/template/web/assets/favicon.ico' /> " />
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="<c:url value='/template/web/css/style.css' /> "
	rel="stylesheet" />
</head>
<body>
	<!-- header -->
	<%@include file="/common/web/header.jsp"%>
	<!-- header -->

	<section class="py-5">
		<dec:body />
	</section>

	<!-- footer -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- footer -->

	<script src="<c:url value='/template/web/js/scripts.js' />"></script>
</body>
</html>