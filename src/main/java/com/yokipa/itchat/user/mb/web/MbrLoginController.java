package com.yokipa.itchat.user.mb.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yokipa.itchat.user.mb.vo.MBMBRVO;
import com.yokipa.itchat.user.mb.vo.MbrRole;




/**
 * 로그인시 j_spring_security_check
 * 로그아웃시 j_spring_security_logout
 * @author ryo16
 */
@Controller
public class MbrLoginController {
	
	   public MBMBRVO getUser()
	    {
	        return (MBMBRVO)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    }
	   
	   
	   
	    
	    @RequestMapping(value = "/index", method = RequestMethod.GET)
	    public ModelAndView index()
	    {
	        ModelAndView view = new ModelAndView();
	        view.setViewName("index");
	        view.addObject("username", getUser().getUsername());
	        
	        return view;
	    }
	    
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public ModelAndView login()
	    {
	        ModelAndView view = new ModelAndView();
	        view.setViewName("login");
	        
	        return view;
	    }
	
}
