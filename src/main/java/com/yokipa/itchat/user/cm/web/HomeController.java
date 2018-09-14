package com.yokipa.itchat.user.cm.web;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yokipa.itchat.user.bd.service.CtgrService;
import com.yokipa.itchat.user.bd.vo.BDCTGRVO;

/**
 * @Class : HomeConroller
 * @Description : 메인화면 컨트롤러
 * @Type: Controller
 * @Modification
 * 
 * 	수정일      수정자      수정내용
 *  ---------   ---------   ------------------------------- 
 *  2018.09.08              신규
 *
 */
@Controller
public class HomeController {
	@Inject
	private CtgrService ctgrService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//카테고리 부르기
		try {
			List<BDCTGRVO> list = ctgrService.selCtgrList();
			model.addAttribute("ctgrList", list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "home";
	}

}
