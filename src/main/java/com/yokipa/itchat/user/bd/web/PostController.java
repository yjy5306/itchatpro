package com.yokipa.itchat.user.bd.web;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yokipa.itchat.user.bd.service.CtgrService;
import com.yokipa.itchat.user.bd.service.PstService;
import com.yokipa.itchat.user.bd.vo.BDCTGRVO;
import com.yokipa.itchat.user.bd.vo.BDPSTVO;

/**
 * @Class : PostConroller
 * @Description : 게시물 컨트롤러
 * @Type: Controller
 * @Modification
 * 
 * 				수정일 수정자 수정내용 --------- ---------
 *               ------------------------------- 2018.09.08 김준 신규
 *
 */
@Controller
public class PostController {
	@Inject
	private CtgrService ctgrService;

	@Inject
	private PstService pstService;

	@RequestMapping(value = "/board/post", method = RequestMethod.GET)
	public String Post(@RequestParam("id") String id, Model model) {
		// 카테고리 부르기
		try {
			List<BDCTGRVO> list = ctgrService.selCtgrList();
			model.addAttribute("ctgrList", list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 게시물 부르기
		try {
			BDPSTVO pstVo = new BDPSTVO();
			pstVo.setPstNo(Integer.parseInt(id));
			model.addAttribute("pstVo", pstService.selPost(pstVo));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "board/view";
	}
}
