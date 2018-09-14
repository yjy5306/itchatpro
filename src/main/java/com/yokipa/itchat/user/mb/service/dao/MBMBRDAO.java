package com.yokipa.itchat.user.mb.service.dao;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.yokipa.itchat.user.mb.vo.MBMBRVO;
import com.yokipa.itchat.user.mb.vo.MbrRole;

/**
 * @Class : MBMBRDAO
 * @Description : 회원관련 DAO
 * @Type : VO
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
@MapperScan("MBMBRDAO")
public interface MBMBRDAO {

	
	/**회원 등록 */
	public void insert(MBMBRVO mbmbrVo) throws SQLException;
	
	/**회원 목록조회 */
	public List<MBMBRVO> list() throws SQLException;
	
	/**회원 삭제(업데이트) */
	public int delete(MBMBRVO mbmbrVo) throws SQLException;
	
	/**회원 권한 */
	public MbrRole getMbrRole(String mbrNm);
	
	/**회원 명 찾기 */
	public MBMBRVO getFindMbr(String mbrNm);
}
