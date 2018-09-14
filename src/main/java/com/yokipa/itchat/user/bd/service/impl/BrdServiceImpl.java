package com.yokipa.itchat.user.bd.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yokipa.itchat.user.bd.service.BrdService;
import com.yokipa.itchat.user.bd.service.dao.BRDDAO;
import com.yokipa.itchat.user.bd.vo.BoardPageDTO;

@Service
public class BrdServiceImpl implements BrdService {
	@Inject
	private BRDDAO dao;

	@Override
	public List<BoardPageDTO> selHomeBrdList(BoardPageDTO pageBean) throws SQLException {
		return null;
	}





}
