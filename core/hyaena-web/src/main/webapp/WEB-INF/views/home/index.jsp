<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<HTML xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Hyaena Home</title>
		<link rel="icon" href="${C}/static/public/favicon/favicon.ico">
		<link rel="stylesheet" href="${C}/public/js/lib/bootstrap/bootstrap.css">
		<link rel="stylesheet" href="${C}/static/admin/app/css/base.css">
		<link rel="stylesheet" href="${C}/public/css/style.css">
	</head>
	<body ng-app="app" C="${C}" ui-view>
		<div class="header-top" id="home">
			<div class="container">
				<div class="head">
					<div class="header-left">
						<div class="logo">
							<a href="/"><strong>Hyaena</strong></a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="banner">
			<div class="container">
				<div class="banner-top">
					<div class="jumbotron">
						<h1>Everyone Can Be an Architect</h1>
						<p>Make your architect online</p>
						<div class="banner-btn">
							<a class="btn btn-primary btn-lg" href="${C}/capture" role="button">make your architect</a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="services">
			<div class="container">
				<div class="services-top">
					<div class="col-md-3 services-left" style="margin-left:11%;">
						<img src="${C}/static/home/img/service-2.png" alt="Design architecture" title="Design architecture" />
						<p>Design architecture</p>
						<span class="s-one"> </span>
					</div>
					<div class="col-md-3 services-left">
						<img src="${C}/static/home/img/service-1.png" alt="Download architecture" title="Download architecture" />
						<p>Download architecture</p>
						<span class="s-two"> </span>
					</div>
					<div class="col-md-3 services-left">
						<img src="${C}/static/home/img/service-4.png" alt="Use your architecture" title="Use your architecture" />
						<p>Use your architecture</p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="footer">
			<div class="container">
				<div class="footer-bottom">
					<p>Technical support comes from <a href="http://dounine.com" target="_blank">dounine</a></p>
				</div>
			</div>
		</div>
	</body>
</html>