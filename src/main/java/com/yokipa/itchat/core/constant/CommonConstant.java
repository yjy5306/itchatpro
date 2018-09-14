package com.yokipa.itchat.core.constant;

/**
 * @Class : CommonConstant
 * @Description : 공통상수 정의
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
public class CommonConstant {

	/** Zero & One */
	private static final String STR_ZERO = "0";
	private static final String STR_ONE = "1";
	private static final int INT_ZERO = 0;
	private static final int INT_ONE = 1;
	private static final long LONG_ZERO = 0;
	private static final long LONG_ONE = 1;
	
	/** Yes & No */
	private static final String YES = "Y";
	private static final String NO = "N";
	private static final String FAIL = "F";
	private static final String ERROR = "E";
	
	private static final String STR_EMPTY = "";
	private static final String STR_SPACE = " ";
	private static final String STR_HYPHEN = "-";
	private static final String STR_UNDERBAR = "_";
	private static final String STR_AT = "@";
	private static final String STR_SHAP = "#";
	private static final String STR_COMMA = ",";
	private static final String STR_DOT = ".";
	private static final String STR_STAR = "*";
	private static final String STR_COLON = ":";
	private static final String STR_SEMICOLON = ";";
	private static final String STR_SLASH = "/";
	
	/** result code */
	private static final String RESULT_SUCCESS = "success";
	private static final String RESULT_OK = "ok";
	private static final String RESULT_FAIL = "fail";
	private static final String RESULT_ERROR = "error";
	
	/** error reason */
	private static final String RESULT_EXCEPTION = "Exception";
	private static final String RESULT_DUPLICATE = "Duplicate";
	private static final String RESULT_USED = "Used";
	private static final String RESULT_NOT_FOUND = "NotFound";
	
	/** 
	 * Thumbnail width, height size
	 */
	private static final int THUMBNAIL_WIDTH = 100;
	private static final int THUMBNAIL_HEIGHT = 100;
	
	/** 처리코드(CRUD) */
	private static final String DELETE = "D";
	private static final String INSERT = "C";
	private static final String UPDATE = "U";
	
	/** 조회 조건 */
	private static final String RS_NXT_PAGE_FL = "nxtPageFl";
	private static final String RS_NXT1_KEY_VAL = "nxt1KeyVal";
	private static final String RS_NXT2_KEY_VAL = "nxt2KeyVal";
	private static final String RS_NXT3_KEY_VAL = "nxt3KeyVal";
	
	/** First Called Page Number */
	private static final int FIRST_PAGE_NUM = 1;
	/** page per list item count */
	private static final int PAGE_PER_COUNT= 10;
	

	/** 작업자ID 초기값 */
	private static final String DFLT_WK_ID = "system";
	
	/** 결과값의 목록명 */
	private static final String RESULT_LIST_NM = "list";
	
	

	public static String getStrZero() {
		return STR_ZERO;
	}

	public static String getStrOne() {
		return STR_ONE;
	}

	public static int getIntZero() {
		return INT_ZERO;
	}

	public static int getIntOne() {
		return INT_ONE;
	}

	public static long getLongZero() {
		return LONG_ZERO;
	}

	public static long getLongOne() {
		return LONG_ONE;
	}

	public static String getYes() {
		return YES;
	}

	public static String getNo() {
		return NO;
	}

	public static String getFail() {
		return FAIL;
	}

	public static String getError() {
		return ERROR;
	}

	public static String getStrEmpty() {
		return STR_EMPTY;
	}

	public static String getStrSpace() {
		return STR_SPACE;
	}

	public static String getStrHyphen() {
		return STR_HYPHEN;
	}

	public static String getStrUnderbar() {
		return STR_UNDERBAR;
	}

	public static String getStrAt() {
		return STR_AT;
	}

	public static String getStrShap() {
		return STR_SHAP;
	}

	public static String getStrComma() {
		return STR_COMMA;
	}

	public static String getStrDot() {
		return STR_DOT;
	}

	public static String getStrStar() {
		return STR_STAR;
	}

	public static String getStrColon() {
		return STR_COLON;
	}

	public static String getStrSemicolon() {
		return STR_SEMICOLON;
	}

	public static String getStrSlash() {
		return STR_SLASH;
	}

	public static String getResultSuccess() {
		return RESULT_SUCCESS;
	}

	public static String getResultOk() {
		return RESULT_OK;
	}

	public static String getResultFail() {
		return RESULT_FAIL;
	}

	public static String getResultError() {
		return RESULT_ERROR;
	}

	public static String getResultException() {
		return RESULT_EXCEPTION;
	}

	public static String getResultDuplicate() {
		return RESULT_DUPLICATE;
	}

	public static String getResultUsed() {
		return RESULT_USED;
	}

	public static String getResultNotFound() {
		return RESULT_NOT_FOUND;
	}

	public static int getThumbnailWidth() {
		return THUMBNAIL_WIDTH;
	}

	public static int getThumbnailHeight() {
		return THUMBNAIL_HEIGHT;
	}

	public static String getDelete() {
		return DELETE;
	}

	public static String getInsert() {
		return INSERT;
	}

	public static String getUpdate() {
		return UPDATE;
	}

	public static String getRsNxtPageFl() {
		return RS_NXT_PAGE_FL;
	}

	public static String getRsNxt1KeyVal() {
		return RS_NXT1_KEY_VAL;
	}

	public static String getRsNxt2KeyVal() {
		return RS_NXT2_KEY_VAL;
	}
	public static int getFirstPageNum() {
		return FIRST_PAGE_NUM;
	}

	public static int getPagePerCount() {
		return PAGE_PER_COUNT;
	}

	public static String getDfltWkId() {
		return DFLT_WK_ID;
	}

	public static String getRsNxt3KeyVal() {
		return RS_NXT3_KEY_VAL;
	}

	/**
	 * 결과값의 목록 지정명
	 * @return "list"
	 */
	public static String getResultListNm() {
		return RESULT_LIST_NM;
	}

	
}
