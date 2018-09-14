package com.yokipa.itchat.user.mb.service;

import java.sql.SQLException;
import java.util.List;

import com.yokipa.itchat.user.mb.vo.MBMBRVO;

/**
 * @Class : MbrAcdService
 * @Description : 회원가입 서비스
 * @Type : Service
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
public interface MbrAcdService {
	
	/**회원 등록 */
	public void insert(MBMBRVO mbmbrVo) throws SQLException;
	
	/**회원 목록조회 */
	public List<MBMBRVO> selMbrSrch() throws SQLException;
	
	/**회원 삭제(업데이트) */
	public int updMbrDelete(MBMBRVO mbmbrVo) throws SQLException;
	
}
