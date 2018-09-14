package com.yokipa.itchat.user.bd.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yokipa.itchat.user.bd.service.CtgrService;
/**
 * @Class : CtgrSrchServiceImpl
 * @Description : 카테고리검색서비스구현
 * @Type: ServiceImpl
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.08	                     신규
 *
 */
import com.yokipa.itchat.user.bd.service.dao.BDCTGRDAO;
import com.yokipa.itchat.user.bd.vo.BDCTGRVO;

@Service
public class CtgrServiceImpl implements CtgrService {
	@Inject
	private BDCTGRDAO dao;

	/** 카테고리 목록 조회 */
	@Override
	public List<BDCTGRVO> selCtgrList() throws SQLException {

		return dao.list();
	}

}
