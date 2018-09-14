package com.yokipa.itchat.core.utils;

import java.util.List;

/**
 * @Class : ValidUtility
 * @Description : 유효체크유틸리티
 * @Type : Utility
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
public class ValidUtility {
	
	/**
	 * Object Null 아니면 참 반환
	 * @param obj
	 * @return
	 */
	public static boolean isNotNull(Object obj){
		return !isNull(obj);
	}
	
	/**
	 * Object Null 이면 참 반환
	 * @param obj
	 * @return
	 */
	public static boolean isNull(Object obj){
		if(obj == null) return true;
		else return false;
	}
	
	public static boolean isNotEmptyList(List<?> l){
		if(l == null || l.size() < 1){
			return false;
		}
		else{
			return true;
		}
	}
	
	/**
	 * String 빈값이면 참 반환
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str == null || str.isEmpty() || str.length() == 0) return true;
		else return false;
	}
	
	/**
	 * String 빈값이 아니면 참 반환
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}

}
