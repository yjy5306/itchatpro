package com.yokipa.itchat.core.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/**
 * @Class : ItChatController
 * @Description : 공통ItChat컨트롤러
 * @Type : Controller
 * @Modification
 * 
 *   수정일      수정자                 수정내용
 *  ---------   ---------   -------------------------------
 *  2018.09.12		정찬용	
 *
 *
 */
public class ItChatController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	protected MessageSource messageSource;

	public String getMessage(String code){
		return messageSource.getMessage(code, null, "", Locale.getDefault());
	}

}
