<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = getServletContext().getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="description">
<meta content="" name="author">

<title>Sign in iLost</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="<%=basePath%>/resources/css/bootstrap.css">

<!-- Custom styles for this template -->
<link rel="stylesheet" href="<%=basePath%>/resources/css/signin.css">
</head>

<body>

	<div class="container">

		<form role="form" class="form-signin" action="signin"
			method="POST">
			<h2 class="form-signin-heading">请登录</h2>
			<input name=userName type="text" autofocus="" required="" placeholder="邮箱地址"
				class="form-control" /> <input name="userPassword" type="password" required=""
				placeholder="密码" class="form-control" />
			<button type="submit" class="btn btn-lg btn-primary btn-block">登录</button>
		</form>

	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="<%=basePath%>/resources/js/jquery-2.1.0.js"></script>
	<script type="text/javascript" src="<%=basePath%>/resources/js/bootstrap.js"></script>

</body>
</html>