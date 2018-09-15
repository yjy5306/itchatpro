package com.yokipa.itchat.user.bd.service.dao;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.yokipa.itchat.user.bd.vo.BDPSTVO;

@MapperScan("BDPSTDAO")
public interface BDPSTDAO {
	/* 카테고리 목록 조회 */
	public BDPSTVO selPost(BDPSTVO pstVo) throws SQLException;

}
