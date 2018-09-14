<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

${list }
	<%-- <table class="table table-striped table-hover">
		<thead>
		<tr>
			<th scope="col" style="width: 60px;">번호</th>
			<th scope="col">제목</th>
			<th scope="col" style="width: 100px;">글쓴이</th>
			<th scope="col" style="width: 140px;">날짜</th>
			<th scope="col" style="width: 60px;">추전수</th>
			<th scope="col" style="width: 60px;">조회</th>
		</tr>
		</thead>
		<tbody>
		<c:set var="num" value="${pageMaker.totalCount-(pageMaker.cri.page-1)*10}" />
		<c:choose>
			<c:when test="${fn:length(list) != 0 }">
				<c:forEach items="${list }" var="list">
					<tr>
						<th scope="row">
							<c:out value="${num}" /> <c:set var="num" value="${num-1}" />
						</th>
						<td style="text-align:left;"><a href="<c:url value="/board/view${pageMaker.uri(pageMaker.cri.page) }&no=${list.no }&category=${category }" />">${list.subject}</a> <span style="color: red;">[${list.comment_count}]</span></td>
						<td>${list.wr_nick}</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${ list.register_date }" /></td>
						<td>${list.bo_good}</td>
						<td>${list.read_count}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="6">작성된 글이 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
		</tbody>
	</table>
 --%>
</body>
=======
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>



</body>
>>>>>>> branch 'master' of https://github.com/spectralfox05/itchat.git
</html>