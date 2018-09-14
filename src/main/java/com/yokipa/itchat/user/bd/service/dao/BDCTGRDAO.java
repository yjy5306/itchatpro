package com.yokipa.itchat.user.bd.service.dao;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.yokipa.itchat.user.bd.vo.BDCTGRVO;
/**
 * @Class : CtgrSrchServiceDao
 * @Description : 카테고리검색서비스구현
 * @Type: ServiceImpl
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.08	                     신규
 *
 */
@MapperScan("BDCTGRDAO")
public interface BDCTGRDAO {
	/*카테고리 목록 조회*/
	public List<BDCTGRVO> list() throws SQLException; 
	
}
