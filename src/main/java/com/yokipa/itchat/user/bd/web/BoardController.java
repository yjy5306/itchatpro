package com.yokipa.itchat.user.bd.web;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yokipa.itchat.user.bd.service.BrdService;
import com.yokipa.itchat.user.bd.service.CtgrService;
import com.yokipa.itchat.user.bd.vo.BDCTGRVO;
import com.yokipa.itchat.user.bd.vo.BRDPageMaker;
import com.yokipa.itchat.user.bd.vo.BRDVO;

/**
 * @Class : HomeConroller
 * @Description : 메인화면 컨트롤러
 * @Type: Controller
 * @Modification
 * 
 * 				수정일 수정자 수정내용 --------- ---------
 *               ------------------------------- 2018.09.08 신규
 *
 */
@Controller
public class BoardController {
	@Inject
	private CtgrService ctgrService;

	@Inject
	private BrdService brdService;

	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String home(@RequestParam("id")int no,BRDVO brd, Model model) {
		System.out.println("board>>>>>>>>>>success!!");
		System.out.println("board>>>>>>>>>>success!!");
		System.out.println("board>>>>>>>>>>success!!");
	
		model.addAttribute("id", no);

		try {
			
			List<BDCTGRVO> list = ctgrService.selCtgrList();
			System.out.println(list);
			brd.setPerPageNum(10);
			model.addAttribute("ctgrList", list);
			model.addAttribute("brdList", brdService.selBrdList(brd));

			// 페이지 처리
			BRDPageMaker pageMaker = new BRDPageMaker();
			pageMaker.setBrd(brd);
			pageMaker.setTotalCount(brdService.selListCount(brd));
			System.out.println("문제2>>>>>>>>>>"+brd);
			System.out.println("페이지 데이터>>>>>>>" + pageMaker);
			System.out.println("페이지 데이터>>>>>>>" + pageMaker);
			System.out.println("페이지 데이터>>>>>>>" + pageMaker);
			model.addAttribute("pageMaker", pageMaker);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "board";
	}

}
