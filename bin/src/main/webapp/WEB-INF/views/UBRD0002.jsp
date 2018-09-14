<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<h3>자유 게시판</h3>
<div class="d-none d-lg-block"
	style="font-weight: bold; background-color: #eee; font-size: 0.8em;">
	<div class="row">
		<div class="col-1 " style="text-align: center">번호</div>
		<div class="col-5">내용</div>
		<div class="col-2">작성자</div>
		<div class="col-2" style="text-align: center">날짜</div>
		<div class="col-1" style="text-align: center">조회</div>
		<div class="col-1" style="text-align: center">추천</div>
	</div>
</div>
<hr style="margin: 0;">
<!--게시물-->
<div class="row">
	<div class="d-none d-lg-block col-lg-1 brdNum">#13021</div>
	<div class="col-lg-5 col-12 brdCont text-truncate">
		<a href="">안녕하세요 만나서 반갑습니다.</a>
	</div>
	<div class="col-lg-2 col-4 brdInfo text-truncate">작성자ㅇㅇㅇ씨</div>
	<div class="d-none d-lg-block col brdNum" style="text-align: center">
		18-09-08</div>
	<div class="col-lg-1 col-3 brdNum brdInfo" data-colName="조회"
		style="text-align: center">9999</div>
	<div class="col-lg-1 col-5 brdNum brdInfo" data-colName="추천"
		style="text-align: center">9999</div>
</div>
<hr style="margin: 0px;">
<!--게시물-->
<div class="row">
	<div class="d-none d-lg-block col-lg-1 brdNum">#13021</div>
	<div class="col-lg-5 col-12 brdCont text-truncate">
		<a href="">안녕하세요 만나서 반갑습니다.</a>
	</div>
	<div class="col-lg-2 col-4 brdInfo text-truncate">작성자ㅇㅇㅇ씨</div>
	<div class="d-none d-lg-block col brdNum" style="text-align: center">
		18-09-08</div>
	<div class="col-lg-1 col-3 brdNum brdInfo" data-colName="조회"
		style="text-align: center">9999</div>
	<div class="col-lg-1 col-5 brdNum brdInfo" data-colName="추천"
		style="text-align: center">9999</div>
</div>
<hr style="margin: 0px;">
<!--게시물-->
<div class="row">
	<div class="d-none d-lg-block col-lg-1 brdNum">#13021</div>
	<div class="col-lg-5 col-12 brdCont text-truncate">
		<a href="">안녕하세요 만나서 반갑습니다.</a>
	</div>
	<div class="col-lg-2 col-4 brdInfo text-truncate">작성자ㅇㅇㅇ씨</div>
	<div class="d-none d-lg-block col brdNum" style="text-align: center">
		18-09-08</div>
	<div class="col-lg-1 col-3 brdNum brdInfo" data-colName="조회"
		style="text-align: center">9999</div>
	<div class="col-lg-1 col-5 brdNum brdInfo" data-colName="추천"
		style="text-align: center">9999</div>
</div>
<hr style="margin: 0px;">
<!--게시물-->
<div class="row">
	<div class="d-none d-lg-block col-lg-1 brdNum">#13021</div>
	<div class="col-lg-5 col-12 brdCont text-truncate">
		<a href="">안녕하세요 만나서 반갑습니다.</a>
	</div>
	<div class="col-lg-2 col-4 brdInfo text-truncate">작성자ㅇㅇㅇ씨</div>
	<div class="d-none d-lg-block col brdNum" style="text-align: center">
		18-09-08</div>
	<div class="col-lg-1 col-3 brdNum brdInfo" data-colName="조회"
		style="text-align: center">9999</div>
	<div class="col-lg-1 col-5 brdNum brdInfo" data-colName="추천"
		style="text-align: center">9999</div>
</div>
<hr style="margin: 0px;">
<!--게시물-->
<div class="row">
	<div class="d-none d-lg-block col-lg-1 brdNum">#13021</div>
	<div class="col-lg-5 col-12 brdCont text-truncate">
		<a href="">안녕하세요 만나서 반갑습니다.</a>
	</div>
	<div class="col-lg-2 col-4 brdInfo text-truncate">작성자ㅇㅇㅇ씨</div>
	<div class="d-none d-lg-block col brdNum" style="text-align: center">
		18-09-08</div>
	<div class="col-lg-1 col-3 brdNum brdInfo" data-colName="조회"
		style="text-align: center">9999</div>
	<div class="col-lg-1 col-5 brdNum brdInfo" data-colName="추천"
		style="text-align: center">9999</div>
</div>
<hr style="margin: 0px;">
<!--검색바-->
<div class="container" style="margin-top: 30px;">
	<div class="input-group mb-3">
		<input type="text" class="form-control" placeholder="Search"
			aria-label="Recipient's username" aria-describedby="button-addon2">
		<div class="input-group-append">
			<button class="btn btn-outline-secondary" type="button"
				id="button-addon2">Search</button>
		</div>
	</div>
</div>
<!--페이지 네비게이션-->
<nav aria-label="Page navigation example">
	<ul class="pagination justify-content-center">
		<li class="page-item disabled"><a class="page-link" href="#"
			tabindex="-1">Previous</a></li>
		<li class="page-item"><a class="page-link" href="#">1</a></li>
		<li class="page-item"><a class="page-link" href="#">2</a></li>
		<li class="page-item"><a class="page-link" href="#">3</a></li>
		<li class="page-item"><a class="page-link" href="#">Next</a></li>
	</ul>
</nav>