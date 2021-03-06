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
<link rel="stylesheet" href="<%=basePath%>/resources/css/bootstrap.css">
<link rel="stylesheet"
	href="<%=basePath%>/resources/css/bootstrapValidator.css">
<link rel="stylesheet"
	href="<%=basePath%>/resources/css/font-awesome.css">
</head>

<body>

	<div class="container">

		<form role="form" class="form-horizontal" action="signin"
			method="POST">
			<div class="form-group">
				<div class="col-lg-3 col-lg-offset-5">
					<h2>请登录</h2>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-3 col-lg-offset-5 msg"></div>
			</div>
			<div class="form-group">
				<label class="col-lg-5 control-label">用户名</label>
				<div class="col-lg-3">
					<input name=userName type="text" autofocus placeholder="用户名"
						class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-5 control-label">密码</label>
				<div class="col-lg-3">
					<input name="userPassword" type="password" placeholder="密码"
						class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-5 col-lg-offset-5">
					<button type="submit" class="btn btn-lg btn-primary">登录</button>
				</div>
			</div>
		</form>
	</div>
	<!-- /container -->

	<script type="text/javascript"
		src="<%=basePath%>/resources/js/jquery-2.1.0.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/resources/js/bootstrap.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/resources/js/bootstrapValidator.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			
			var msg = getMsg();
			if(msg != null && msg != ""){
				$(".msg").addClass("alert alert-warning");
				$(".msg").text(msg);
			}

			$('.form-horizontal').bootstrapValidator({
				feedbackIcons : {
					valid : 'fa fa-check-circle',
					invalid : 'fa fa-times-circle',
					validating : 'fa fa-refresh'
				},
				fields : {
					userName : {
						validators : {
							notEmpty : {
								message : '用户名不能为空'
							},
							stringLength : {
								min : 6,
								max : 20,
								message : '用户名长度必须在6至20个字符'
							}
						}
					},
					userPassword : {
						validators : {
							notEmpty : {
								message : '密码不能为空'
							},
							different : {
								field : 'userName',
								message : '密码不能与用户名相同'
							}
						}
					}
				}
			});
		});
		
		function getMsg(){
			return '${msg}';
		}
	</script>
</body>
</html>