package com.yokipa.itchat.user.bd.vo;

import java.sql.Date;

public class BRDVO {

	/** 게시물 번호 */
	private int pstNo;
	/** 카테고리 번호 */
	private int ctgrNo;
	/** 사용자 번호 */
	private int mbrNo;
	/** 사용자 이름 */
    private String mbrNm;
	/** 게시물 제목 */
    private String pstTtl;
    /** 게시물 내용 */
    private String pstCont;
    /** 게시물 조회수 */
    private int viewCount;
    /** 게시물 추천수 */
    private int viewGood;
    /** 게시물 등록 날짜 */
    private Date pstRgtDt;
    /** 게시물 페이지*/
    private int page;
    /** 게시물 총페이지 수 */
    private int perPageNum;
    
	public void setPage(int page) {
		
		if(page <= 0) {
			this.page = 1;
			return;
		}
		this.page = page;
	}
	
	public void setPerPageNum(int perPageNum) {
		if(perPageNum <= 0 || perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	public int getPageStart() {
		return (this.page - 1) * perPageNum;
	}
    
	public int getPage() {
		return page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

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
	public String getMbrNm() {
		return mbrNm;
	}
	public void setMbrNm(String mbrNm) {
		this.mbrNm = mbrNm;
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
	@Override
	public String toString() {
		return "BRDVO [pstNo=" + pstNo + ", ctgrNo=" + ctgrNo + ", mbrNo=" + mbrNo + ", mbrNm=" + mbrNm + ", pstTtl="
				+ pstTtl + ", pstCont=" + pstCont + ", viewCount=" + viewCount + ", viewGood=" + viewGood
				+ ", pstRgtDt=" + pstRgtDt + "]";
	}
    
    
  
    
	
    
    

}