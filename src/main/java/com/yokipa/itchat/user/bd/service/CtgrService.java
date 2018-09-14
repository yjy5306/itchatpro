package com.yokipa.itchat.user.bd.service;

import java.sql.SQLException;
import java.util.List;

import com.yokipa.itchat.user.bd.vo.BDCTGRVO;


/**
 * @Class : CtgrSrchService
 * @Description : 카테고리검색서비스
 * @Type: Service
 * @Modification
 * 
 *  ������      			������              ��������
 *  ---------   ---------   -------------------------------
 *  2018.09.06		������		�űԵ��
 *
 */
public interface CtgrService {
	   public List<BDCTGRVO> selCtgrList() throws SQLException;	
	
}
