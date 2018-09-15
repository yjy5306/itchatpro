package com.yokipa.itchat.user.bd.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yokipa.itchat.user.bd.service.PstService;
import com.yokipa.itchat.user.bd.service.dao.BDPSTDAO;
import com.yokipa.itchat.user.bd.vo.BDPSTVO;

@Service
public class PstServiceImpl implements PstService {
	@Inject
	private BDPSTDAO dao;

	/** 게시물 정보 조회 */
	@Override
	public BDPSTVO selPost(BDPSTVO pstVo) throws SQLException {
		return  dao.selPost(pstVo);
	
		 
	}

}
