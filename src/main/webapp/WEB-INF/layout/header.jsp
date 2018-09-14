<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
	<div class="jumbotron" style="margin-bottom: 0;">
		<h2>IT chat</h2>
		<h5>좋은 하루 보내세요.</h5>
	</div>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark"
		style="margin-bottom: 1em;">
		<a class="navbar-brand d-lg-none btn btn-outline-light" href="#"
			style="font-size: 1rem;">Log-in</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#open1" aria-controls="navbarTogglerDemo02"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="open1">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item<c:if test='${empty ctgrId}'> active</c:if>"><a class="nav-link" href="/">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<!--c tag foreach로 DB(ctgr_nm)을 가져와 돌려야 함 -->
				<c:forEach var="ctgr" items="${ctgrList}">
					<li class="nav-item<c:if test='${ctgrId==ctgr.ctgrNm}'> active</c:if>"><a class="nav-link"
						href="/board?id=${ctgr.ctgrNm}">${ctgr.ctgrNm}</a></li>
				</c:forEach>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
</body>
</html>