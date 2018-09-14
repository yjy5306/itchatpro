package com.yokipa.itchat.core.vo;

import java.util.HashMap;

/**
 * @Class : ResultMap
 * @Description : 결과반환
 * @Type : Map
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */

@SuppressWarnings("serial")
public class ResultMap extends HashMap<String, Object> {
	
	/** 반환결과오류코드 */
	private final String ERR_C = "errC";
	/** 오류내용 */
	private final String ERR_MSG = "errMsg";
	
	private final String DATA_LIST = "list";
	
	public ResultMap() {
        super();
    }

	public void setErrC(String errC){
		this.put(ERR_C, errC);
	}
	
	public String getErrC(){
		return (String)this.get("errC", "");
	}

	public void setErrMsg(String errMsg){
		this.put(ERR_MSG, errMsg);
	}
	
	public void setDataList(Object value){
		this.put(DATA_LIST, value);
	}
	
	public void add(String key, Object value){
		this.put(key, value);
	}

	public Object get(Object key, Object _default) {
        if (this.containsKey(key)) {
            return this.get(key);
        }
        return _default;
    }

}
