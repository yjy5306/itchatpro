package com.yokipa.itchat.core.constant;

/**
 * @Class : ErrorCodeConstant
 * @Description : 에러코드상수 정의
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
public class ErrorCodeConstant {
	
	/** 정상적으로 처리된 경우 */
	private static final String SUCCESS = "0000";
	
	/** 일반적인 실패 */
	private static final String FAILURE = "E001";
	
	/** 중복으로 인한 오류 */
	private static final String DUPLICATED = "E002";
	
	/** 처리대상 미존재 */
	private static final String NOT_FOUND = "E003";	
	
	/** 이미 등록된 경우  */
	private static final String REGISTERED = "E004";
	
	/** 필수항목 오류 */
	private static final String EMPTY_REQUIRED = "E005";
	
	/** 권한부족 */
	private static final String UNAUTHORIZED = "E006";
	
	/** DB관련 오류 */
	private static final String DB_ERROR = "E007";
	
	/** 시스템오류 */
	private static final String SYSTEM_ERROR = "E008";
	
	/** 오류 */
	private static final String ERROR = "E009";
	
	/**
	 * 공통그룹코드 삭제시
	 * 공통세부코드 존재하는 경우 에러 발생
	 */
	private static final String EXIST_DTL_CD = "E010";
	
	/** 
	 * 로그인시 계정확인
	 * 로그인시 아이디와 비밀번호에 해당하는 계정 조회안됨 
	 */
	private static final String WRNG_ID_PWD = "E011";
	
	/**
	 * 비정상 계정
	 * 계정이 미승인상태이거나 퇴사 업무 전환된 경우
	 */
	private static final String ACCN_ABNRML = "E012";
	
	/** 계정잠김 */
	private static final String ACCN_LCK = "E013";

	/**
	 * 에러 메시지 반환
	 * @param errC
	 * @return
	 */
	public static String getMessage(String errC){
		String msg = "";
		
		switch (errC) {
			case SUCCESS:
				msg = "성공적으로 실행되었습니다.";
				break;
				
			case FAILURE:
				msg = "요청 처리에 실패하였습니다.";
				break;
				
			case DUPLICATED:
				msg = "요청이 중복되어 처리가 완료되지 못했습니다.";
				break;
				
			case NOT_FOUND:
				msg = "요청 대상이 존재하지않아 처리되지않았습니다.";
				break;
				
			case REGISTERED:
				msg = "이미 처리되었습니다.";
				break;
				
			case EMPTY_REQUIRED:
				msg = "필수 항목의 값이 없습니다.";
				break;
				
			case UNAUTHORIZED:
				msg = "권한이 없어서 처리되지않았습니다.";
				break;
				
			case DB_ERROR:
				msg = "DB 처리중에 오류가 발생하였습니다.";
				break;
				
			case SYSTEM_ERROR:
				msg = "시스템 오류가 발생하였습니다.";
				break;
				
			case ERROR:
				msg = "오류가 발생하였습니다.";
				break;
				
			case EXIST_DTL_CD:
				msg = "세부코드가 존재하므로 그룹코드 삭제 불가합니다.";
				break;
				
			case ACCN_ABNRML:
				msg = "계정이 비활성상태입니다. 담당자에게 문의하십시오.";
				break;
				
			case WRNG_ID_PWD:
				msg = "아이디와 비밀번호를 확인하십시오.";
				break;

			case ACCN_LCK:
				msg = "잠김계정입니다. 담당자에게 문의하십시오.";
				break;
	
			default:
				break;
		}
		return msg;
	}
	
	/**
	 * 에러가 아닌 경우
	 * @return "0000"
	 */
	public static String getSuccess() {
		return SUCCESS;
	}
	
	/**
	 * 성공이 아닌 경우
	 * @return "E001"
	 */
	public static String getFailure() {
		return FAILURE;
	}
	
	/**
	 * 키가 중복되어 처리할 수 없는 경우
	 * @return "E002"
	 */
	public static String getDuplicated() {
		return DUPLICATED;
	}
	
	/**
	 * 수정이나 삭제 처리대상이 조회되지않는 경우
	 * @return "E003"
	 */
	public static String getNotFound() {
		return NOT_FOUND;
	}
	
	/**
	 * 이미 등록되거나 처리된 경우
	 * @return "E004"
	 */
	public static String getRegistered() {
		return REGISTERED;
	}
	
	/**
	 * 필수입력 항목이 빈값인 경우
	 * @return "E005"
	 */
	public static String getEmptyRequired() {
		return EMPTY_REQUIRED;
	}
	
	/**
	 * DB 관련 오류인 경우
	 * @return "E007"
	 */
	public static String getDbError() {
		return DB_ERROR;
	}
	
	/**
	 * 사용자 오류가 아니라 시스템 오류인 경우
	 * @return "E008"
	 */
	public static String getSystemError() {
		return SYSTEM_ERROR;
	}
	
	/**
	 * 특정지을수없는 범용적인 오류인 경우
	 * @return "E009"
	 */
	public static String getError() {
		return ERROR;
	}

	/**
	 * 권한이 없는 경우
	 * @return "E006"
	 */
	public static String getUnauthorized() {
		return UNAUTHORIZED;
	}
	/**
	 * 세브코드가 존재해서 그룹코드 삭제 불가
	 * @return "E010"
	 */
	public static String getExistDtlCd() {
		return EXIST_DTL_CD;
	}
	
	public static String getWrngIdPwd() {
		return WRNG_ID_PWD;
	}

	public static String getAccnAbnrml() {
		return ACCN_ABNRML;
	}

	public static String getAccnLck() {
		return ACCN_LCK;
	}

}
