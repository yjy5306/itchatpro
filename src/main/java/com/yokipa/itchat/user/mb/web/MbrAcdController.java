package com.yokipa.itchat.user.mb.web;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yokipa.itchat.user.mb.service.MbrAcdService;
import com.yokipa.itchat.user.mb.vo.MBMBRVO;

/**
 * @Class : MbrAcdController
 * @Description : 회원가입 컨트롤러
 * @Type : Controller
 * @Modification
 * 
 *   수정일      수정자              수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용		신규등록
 *
 */
@Controller
public class MbrAcdController {

	@Inject
	MbrAcdService mbrAcdServcie;
	
	@RequestMapping("/singup")
	public String MbrAcd(@RequestBody MBMBRVO vo) {
		
		try {
			mbrAcdServcie.insert(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return "home";
	}
}
