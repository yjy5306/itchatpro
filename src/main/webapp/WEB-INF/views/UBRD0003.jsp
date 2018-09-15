<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<%--
  /**
   * @Program ID : UBRD0003
   * @Description : 게시물
   * @Modification
   * 
   *    수정일    수정자              수정내용
   *  ---------   ---------   -------------------------------
   *  2018.09.12   김준           신규등록
   *
   */
--%>
<div class="container">
	<div class="card">
		<div class="card-body">
			<!-- 제목 -->
			<h3 class="card-title">${pstVo.pstTtl}</h3>
			<div class="media">
				<div class="media-body">
					<h5 class="mt-0">
						작성자<br> <span class="regdate">${pstVo.pstRgtDt}</span>
					</h5>
				</div>
			</div>
			${pstVo.pstCont}
			<div class="text-center">
				<button type="button" class="btn btn-outline-primary btn-sm pstRcmd"
					data-toggle="button" aria-pressed="false" autocomplete="off">
					<i class="far fa-thumbs-up"></i> ${pstVo.viewGood}
				</button>
			</div>
			<!-- #댓글 -->
			<div class="media">
				<div class="media-body">
					<h5 class="mt-0">
						아무개 1<br> <span class="regdate">2018-09-07</span>
					</h5>
					<p class="cmt-content">안녕하세요 반갑습니다.</p>
				</div>
			</div>
			<!-- #댓글 -->
			<div class="media">
				<div class="media-body">
					<h5 class="mt-0">
						아무개 2<br> <span class="regdate">2018-09-07</span>
					</h5>
					<p class="cmt-content">안녕하세요 반갑습니다.</p>
				</div>
			</div>

		</div>
	</div>

	<div class="card panel-default">

		<!-- 댓글 등록 -->
		<div class="card">
			<div class="card-body">
				<form action="">
					<div class="form-group">
						<label for="comment">Comment:</label>
						<textarea class="form-control" rows="3"
							placeholder="300자 내외로 입력하세요."></textarea>
					</div>
					<button type="button"
						class="btn btn-outline-primary btn-sm pull-right">댓글달기</button>
				</form>
			</div>
		</div>
		<!-- END 댓글 등록 -->
	</div>
</div>