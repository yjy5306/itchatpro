package com.yokipa.itchat.core.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Class : CommonExceptionController
 * @Description : 공통Exception컨트롤러
 * @Type : Controller
 * @Modification
 * 
 *   수정일      수정자                 수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용	
 *
 *
 */
@ControllerAdvice
public class CommonExceptionController extends ItChatController{
	
	/**
	 * 500 Internal Server Error(서버 내부 에러)
	 * 
	 * @param 
	 * @return ModelAndView
	 * @throws
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handlerException(Exception e, HttpServletRequest request){
		logger.debug("Error handling in handlerException");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", e.toString());		// 예) java.lang.NullPointerException
		mav.addObject("message", e.getMessage());
		mav.addObject("uri", request.getRequestURI());
		mav.setViewName("error/default");
		return mav;
	}
	

	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ModelAndView handlerRuntimeException(RuntimeException e, 
			HttpServletRequest request){
		logger.debug("Error handling in handlerRuntimeException");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", e.toString());
		mav.addObject("message", e.getMessage());
		mav.addObject("uri", request.getRequestURI());
		mav.setViewName("error/notFound");
		return mav;
	}
}
