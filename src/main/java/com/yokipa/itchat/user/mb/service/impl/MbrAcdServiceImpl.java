package com.yokipa.itchat.user.mb.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yokipa.itchat.user.mb.service.MbrAcdService;
import com.yokipa.itchat.user.mb.service.dao.MBMBRDAO;
import com.yokipa.itchat.user.mb.vo.MBMBRVO;

/**
 * @Class : MbrAcdServiceImpl
 * @Description : 회원가입 서비스 구현
 * @Type : ServiceImpl
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
@Service
public class MbrAcdServiceImpl implements MbrAcdService {

	@Inject
	MBMBRDAO dao;
	
	@Override
	public void insert(MBMBRVO mbmbrVo) throws SQLException {
		
		dao.insert(mbmbrVo);
	
	}

	@Override
	public List<MBMBRVO> selMbrSrch() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updMbrDelete(MBMBRVO mbmbrVo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
