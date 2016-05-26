<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<HTML xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Hyaena capture</title>
		<link rel="icon" href="${C}/static/public/favicon/favicon.ico">
		<link rel="stylesheet" href="${C}/public/js/lib/bootstrap/bootstrap.css">
		<link rel="stylesheet" href="${C}/public/js/lib/angular-loading-bar/loading-bar.css">
		<link rel="stylesheet" href="${C}/public/js/lib/iCheck/skins/all.css">
		<link rel="stylesheet" href="${C}/static/admin/app/css/base.css">
		<link rel="stylesheet" href="${C}/public/css/style.css">
	</head>
	<body ng-app="app" C="${C}">
		<ui-view>
			<div class="waiting">waiting...</div>
		</ui-view>
		<script src="${C}/public/js/lib/requirejs/require.js"></script>
		<script>
			require(['${C}/public/js/main.js?______t='+new Date().getTime()]);
		</script>
	</body>
</html>