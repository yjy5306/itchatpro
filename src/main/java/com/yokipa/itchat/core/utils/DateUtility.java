package com.yokipa.itchat.core.utils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Class : DateUtility
 * @Description : 날짜Utility
 * @Type : Utility
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
public class DateUtility {
	
	/**
	 * 당일일 반환 타입: YYYY-MM-DD 
	 * 
	 * @param 
	 * @return String
	 * @throws
	 */
	public static String getCurrentDateHyphen(){
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-M-dd");

		return simpleDateFormat.format(date);
	}
	
	/**
	 * 당일일 반환 타입: YYYYMMDD
	 * 
	 * @param 
	 * @return String
	 * @throws
	 */
	public static String getCurrentDate(){
		
		DecimalFormat df = new DecimalFormat("00");
		Calendar currentCal = Calendar.getInstance();
		
		currentCal.add(currentCal.DATE, 0);
		
		String year = Integer.toString(currentCal.get(Calendar.YEAR));
		String month = df.format(currentCal.get(Calendar.MONTH) + 1);
		String day = df.format(currentCal.get(Calendar.DAY_OF_MONTH));
		
		StringBuffer sb = new StringBuffer();
		sb.append(year).append(month).append(day);
		
		return sb.toString();
	}

}
