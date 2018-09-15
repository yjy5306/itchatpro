<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<%--
  /**
   * @Program ID : UBRD0002
   * @Description : 게시판
   * @Modification
   * 
   *    수정일    수정자              수정내용
   *  ---------   ---------   -------------------------------
   *  2018.09.12   김준           신규등록
   *
   */
--%>

${brdList }
<button type="button" class="btn btn-secondary btn-sm float-right" >글 작성</button>
<h3>${ctgrId} 게시판</h3>

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
<c:forEach var="list" items="${brdList }">
<div class="row">
	<div class="d-none d-lg-block col-lg-1 brdNum">${list.pstNo}</div>
	<div class="col-lg-5 col-12 brdCont text-truncate">
		<a href="<c:url value="/BRDview?no=${list.pstNo }" />">${list.pstTtl}</a>
	</div>
	<div class="col-lg-2 col-4 brdInfo text-truncate">${list.mbrNm }</div>
	<div class="d-none d-lg-block col brdNum" style="text-align: center">
		<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${list.pstRgtDt}" /></div>
	<div class="col-lg-1 col-3 brdNum brdInfo" data-colName="조회"
		style="text-align: center">${list.viewCount}</div>
	<div class="col-lg-1 col-5 brdNum brdInfo" data-colName="추천"
		style="text-align: center">${list.viewGood}</div>
</div>
<hr style="margin: 0px;">
</c:forEach>

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
	
	<c:if test="${pageMaker.startPage >= 11 }">
		<li class="page-item disabled"><a class="page-link" href="<c:url value="/board${pageMaker.uri(pageMaker.start)}"/>">Previous</a></li>
	</c:if>
	
	<c:forEach var="a" begin="${pageMaker.startPage }" end="${pageMaker.totalPage }">
	${pageMaker.uri(a)}
		<li class="page-item"><a class="page-link" href="<c:url value="/board?id=${id}&${pageMaker.uri(a)}"/>">${a }</a></li>
	</c:forEach>
	
	<c:if test="${pageMaker.next  }">
		<li class="page-item"><a class="page-link" href="<c:url value="/board${pageMaker.uri(pageMaker.totalPage + 1)} "/>">Next</a></li>
	</c:if>
		
	</ul>
</nav>