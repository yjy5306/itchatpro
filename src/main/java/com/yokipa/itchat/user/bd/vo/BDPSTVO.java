package com.yokipa.itchat.user.bd.vo;

import java.sql.Date;

/**
 * @Class : BDCTGRVO
 * @Description : VO
 * @Type: VO
 * @Modification
 * 
 * 				수정일 수정자 수정내용 --------- ---------
 *               ------------------------------- 2018.09.08 신규
 *
 */
public class BDPSTVO {
	/** 게시물 번호 */
	private int pstNo;
	/** 카테고리 번호 */
	private int ctgrNo;
	/** 작성자 번호 */
	private int mbrNo;
	/** 게시물 제목 */
	private String pstTtl;
	/** 게시물 내용 */
	private String pstCont;
	/** 게시물 조회수 */
	private int viewCount;
	/** 게시물 추천수 */
	private int viewGood;
	/** 게시물 등록날짜 */
	private Date pstRgtDt;
	/** 게시물 수정날짜 */
	private Date pstUdtDt;
	public int getPstNo() {
		return pstNo;
	}
	public void setPstNo(int pstNo) {
		this.pstNo = pstNo;
	}
	public int getCtgrNo() {
		return ctgrNo;
	}
	public void setCtgrNo(int ctgrNo) {
		this.ctgrNo = ctgrNo;
	}
	public int getMbrNo() {
		return mbrNo;
	}
	public void setMbrNo(int mbrNo) {
		this.mbrNo = mbrNo;
	}
	public String getPstTtl() {
		return pstTtl;
	}
	public void setPstTtl(String pstTtl) {
		this.pstTtl = pstTtl;
	}
	public String getPstCont() {
		return pstCont;
	}
	public void setPstCont(String pstCont) {
		this.pstCont = pstCont;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getViewGood() {
		return viewGood;
	}
	public void setViewGood(int viewGood) {
		this.viewGood = viewGood;
	}
	public Date getPstRgtDt() {
		return pstRgtDt;
	}
	public void setPstRgtDt(Date pstRgtDt) {
		this.pstRgtDt = pstRgtDt;
	}
	public Date getPstUdtDt() {
		return pstUdtDt;
	}
	public void setPstUdtDt(Date pstUdtDt) {
		this.pstUdtDt = pstUdtDt;
	}
	

	
}
