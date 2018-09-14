package com.yokipa.itchat.user.bd.web;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Class : BRDConroller
 * @Description : 게시판 컨트롤러
 * @Type: Controller
 * @Modification
 * 
 * 				수정일 수정자 수정내용 --------- ---------
 *               ------------------------------- 2018.09.08 신규
 *
 */

@Controller
public class BRDController {

	/*
	 * @Inject private BRDService service;
	 */

	@RequestMapping(value = "/BRDlist", method = RequestMethod.GET)
	public String brdList(Model model) {

		System.out.println("BRDlist>>>>>>>>>>>>>>>>>success!!");
		System.out.println("BRDlist>>>>>>>>>>>>>>>>>success!!");
		System.out.println("BRDlist>>>>>>>>>>>>>>>>>success!!");

		/* List<BRDVO> list = service.selBrdList(); */
		System.out.println("try>>>>>>>>>>>>>>>>>success!!");
		/*
		 * System.out.println(service.selBrdList()); System.out.println(list);
		 * model.addAttribute("brdList",list);
		 */
		System.out.println("try>>>>>>>>>>>>>>>>>success!!");
		model.addAttribute("test", "test");
		System.out.println("try>>>>>>>>>>>>>>>>>success!!");
		return "board";
	}

	@RequestMapping(value = "/BRDview", method = RequestMethod.GET)
	public String brdView(Model model) {
		System.out.println("BRDview>>>>>>>>>>>>>>>>success!!");
		System.out.println("BRDview>>>>>>>>>>>>>>>>success!!");
		System.out.println("BRDview>>>>>>>>>>>>>>>>success!!");

		return "board";
	}

}
