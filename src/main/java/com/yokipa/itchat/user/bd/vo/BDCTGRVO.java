package com.yokipa.itchat.user.bd.vo;
/**
 * @Class : BDCTGRVO
 * @Description : VO
 * @Type: VO
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.08	                     신규
 *
 */
public class BDCTGRVO {
	/** 카테고리 번호 */
	private int ctgrNo;
	/** 카테고리 이름 */
	private String ctgrNm;
	
	public int getCtgrNo() {
		return ctgrNo;
	}
	public void setCtgrNo(int ctgrNo) {
		this.ctgrNo = ctgrNo;
	}
	public String getCtgrNm() {
		return ctgrNm;
	}
	public void setCtgrNm(String ctgrNm) {
		this.ctgrNm = ctgrNm;
	}
	
}
