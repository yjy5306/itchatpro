package com.yokipa.itchat.user.bd.service.dao;


import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.yokipa.itchat.user.bd.vo.BRDVO;
@MapperScan("BRDDAO")
public interface BRDDAO {
	
	   /**게시판 목록 조회 */
	public List <BRDVO> boardList() throws SQLException; 
	
	   /**게시판 조회 */
	public BRDVO view(BRDVO brdVo)throws SQLException;
	
	 /**게시판 총 갯수 */
	public int listCount(BRDVO brdVo)throws SQLException;
	
	   /**게시판 등록 */ 	
	public void insert(BRDVO brdVo)throws SQLException;
	
	   /**게시판 수정 */
	public void update(BRDVO brdVo)throws SQLException;
	
	   /**게시판 삭제 */
	public void delete(BRDVO brdVo)throws SQLException;

}
