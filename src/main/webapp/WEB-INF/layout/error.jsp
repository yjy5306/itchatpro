<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h4><label>Name</label> <c:out value="${name}" /></h4>
<h4><label>URI</label> <c:out value="${uri}" /></h4>
<c:if test="${not empty message}">
	<h4><label>Message</label> <c:out value="${message}" /></h4>
</c:if>