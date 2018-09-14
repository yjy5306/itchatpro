<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
/**
 * @Class : UCC020501
 * @Description : 문의답변목록조회
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.08		ITU107		신규
 *
 */
--%>
<!-- content -->
			<div class="right_col" role="main">
				<div class="">
					<!-- page title -->
					<div class="page-title">
						<div class="title_left">
							<h3>고객센터<small>Customer Center</small></h3>
						</div>
					</div>
					<!-- /page title -->

					<div class="clearfix"></div>

					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>Q&amp;A<small>Question and Answer</small></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
								<form id="formSrch" method="post" action="/center/request/listPageProc">
									<input type="hidden" id="nxt1keyval" name="nxt1keyval" />
									<input type="hidden" id="startDt" name="startDt" />
									<input type="hidden" id="endDt" name="endDt" />
									<input type="hidden" id="pagePerCnt" name="pagePerCnt" />
									<input type="hidden" id="nxtPageFl" name="nxtPageFl" />
								</form>
									<div class="panel panel-default">
										<div class="panel-body">
											<form class="form-horizontal form-label-left" name="formEdit">
												<div class="form-group">
													<label class="control-label col-md-2">유형분류</label>
													<div class="col-md-6" style="margin-bottom: 10px;">
														<select name="deptC" class="form-control" style="width:auto; margin-right: 10px;float:left">
															<option>회원혜택/서비스</option>
															<option>회원정보</option>
															<option>주문/결제 방법</option>
															<option>취소/교환/반품</option>
															<option>배송관련</option>
															<option>영수증</option>
															<option>사이트 이용문의</option>
														</select>
														<select class="form-control" style="width:auto;">
															<option>--선택--</option>
															<option>회원혜택</option>
														</select>
													</div>
													<div class="col-md-4">
														<div class="text-right">
															<button type="button" class="btn btn-success" id="btnRgt"
																name="btnRgt"><i class="fa fa-pencil"></i> 새글쓰기</button>
															<button type="button" class="btn btn-primary" id="btnSrch"
																name="btnSrch">검색</button>
														</div>
													</div>
												</div>
											</form>
										</div>
										<div class="table-responsive"> 
											<table class="table table-hover head-stress">
												<thead>
													<tr>
														<th>번호</th>
														<th>분류</th>
														<th>제목</th>
														<th>답변자명</th>
														<th>답변일</th>
													</tr>
												</thead>
												<tbody id="tableBody">
<!-- 													<tr>
														<td scope="row">321</td>
														<td>회원혜택/서비스 > 회원혜택</td>
														<td><a href="request_reply.html">회원가입시 인증단계는 어떻게 되나요?</a></td>
														<td>홍길동</td>
														<td>2018-08-31</td>
													</tr> -->
												</tbody>
											</table>
										</div>
									</div>
									<div class="text-center" style="margin-bottom:50px;">
										<button type="submit" class="btn btn-default"><i class="fa fa-play-circle"></i> 다음</button>
									</div>
								</div>
								<!-- /x_content -->
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--// content -->
<script type="text/javascript">
$(document).ready(function() {
	
	/**
	* 다음버튼 클릭 이벤트
	*/
	$("#btnSrchNxt").on("click touchstart", function(){
		$.searchForm();
	});
	
	/**
	* 검색버튼 클릭 이벤트
	*/
	$("#btnSrch").on("click touchstart", function(){
		// 다음키값 초기화
		$("#nxt1KeyVal").val("");
		
		// 목록 초기화
		$("#tableBody tr").remove();
		// 목록 조회 
		$.searchForm();
	});
	
	// 첫페이지 조회
	$.searchForm();
});

/**
 * 조회
 */
$.searchForm=function(){
	
	var data = $('#formSrch').serializeObject(), dataStr = JSON.stringify(data);
	// 다음 조회 버튼 비활성
	$("#btnSrchNxt").attr("disabled",true);
	
	$.ajax({
   		url : "/center/request/listPageProc"
		, method : "post"
   		, dataType : 'json'
   		, data : dataStr
   		, processData : true
   		, contentType : "application/json; charset=UTF-8"
	})
	.done(function(data){
		$.searchFormCallback(data);
   	});
}
/*
 * 조회콜백함수
 */
$.searchFormCallback=function(data){
	if(data.errC == '0000'){
		console.log(data);
		$.each(data.list, function(i, item) {
	        var $tr = $("<tr>").append(
	            $("<td>").text(item.qnaPstNo),
	            $("<td>").text(item.faqUpCtgrC),
	            $("<td>").append("<a href=/center/request/detail?="+item.qnaPstNo+">"+item.qnaPstTtl+"</a>"),
	            $("<td>").text(item.lstMdfWkrId),
	            $("<td>").text(item.lstMdfDtm)).appendTo("#tableBody");
	    });
		$("#nxt1KeyVal").val(data.nxt1KeyVal);
		$("#nxtPageFl").val(data.nxtPageFl);
		if(data.nxtPageFl == 'Y') $("#btnSrchNxt").removeAttr("disabled");
	}
	else{
		
	}	
}

</script>