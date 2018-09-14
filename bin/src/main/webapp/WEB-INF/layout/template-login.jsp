<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Welcome UQ-AMS</title>
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<!-- Bootstrap -->
	<link href="${pageContext.request.contextPath}/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<!-- iCheck -->
    <link href="${pageContext.request.contextPath}/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath}/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- jQuery -->
	<script src="${pageContext.request.contextPath}/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap javascript -->
	<script src="${pageContext.request.contextPath}/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- bootstrap-daterangepicker -->
    <script src="${pageContext.request.contextPath}/vendors/moment/moment.js"></script>
    <script src="${pageContext.request.contextPath}/vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    	<!-- iCheck -->
	<script src="${pageContext.request.contextPath}/vendors/iCheck/icheck.min.js"></script>
	<!-- FastClick -->
	<script src="${pageContext.request.contextPath}/vendors/fastclick/lib/fastclick.js"></script>
	<!-- Validator -->
	<script src="${pageContext.request.contextPath}/vendors/validator/validator.js"></script>
	<!-- Combo Options -->
    <script src="${pageContext.request.contextPath}/js/lib/comboCodes.js"></script>
	<!-- Function Utils -->
	<script src="${pageContext.request.contextPath}/js/functionutils.js?v=20180823"></script>
	<script src="${pageContext.request.contextPath}/js/ajax_error.js"></script>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../assets/js/ie8-responsive-file-warning.js"></script><![endif]--	>
    <script src="/vendors/bootstrap/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
</head>
  
<body class="body-signin">
		<div class="form-group" style="padding:10px;">
			<select id="langC" name="lang" class="form-control pull-right" style="width:150px;"></select>
		</div>
	<div class="container">
	    <tiles:insertAttribute name="body" />
	</div>
	
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!-- <script src="${pageContext.request.contextPath}/vendors/bootstrap/assets/js/ie10-viewport-bug-workaround.js"></script> -->
	<!-- Custom Script -->
	<script src="${pageContext.request.contextPath}/js/custom.js"></script>
	
<script type="text/javascript">
	$(document).ready(function() {
		/*
		 * setCombo(columnName, objectId, selectedVal, addOptionC)
		 * columnName: Database 컬럼명
		 * objectId: 셀렉트 오브젝트의 ID 문자형
		 * selectedVal: 선택되도록 할 옵션의 값으로 null 없음
		 * addOptionC: "C" 선택, "A" 전체, null 없음
		 */
		 gfn_setCombo("MULTI_LINGUAL_C", "langC", "<c:out value='${pageContext.response.locale}'/>", null);
		 
		 $("#langC").on("change", function () {
			 window.location.href = "/change/locale/"+$(this).val();
		 });

	});
</script>
</body>
</html>