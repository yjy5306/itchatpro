package com.yokipa.itchat.user.bd.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import com.yokipa.itchat.user.bd.service.HomeBrdService;
import com.yokipa.itchat.user.bd.service.dao.BRDDAO;
import com.yokipa.itchat.user.bd.vo.BoardPageDTO;

public class HomeBrdServiceImpl implements HomeBrdService {
	@Inject
	private BRDDAO dao;

	@Override
	public List<BoardPageDTO> selHomeBrdList(BoardPageDTO pageBean) throws SQLException {
		return null;
	}



}
