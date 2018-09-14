package com.yokipa.itchat.user.mb.service;

import java.util.Arrays;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.yokipa.itchat.user.mb.service.dao.MBMBRDAO;
import com.yokipa.itchat.user.mb.vo.MBMBRVO;
import com.yokipa.itchat.user.mb.vo.MbrRole;

/**
 *  인증 객체를 생성해 
 *  유저가 입력한 로그인정보를 비교한다 
 *  
 * @author ryo16
 */
public class MbrSecurityService implements UserDetailsService {

	@Inject
	MBMBRDAO dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


		//{MBR 생성}
		MBMBRVO mbr = dao.getFindMbr(username);
		MbrRole mbrRole = dao.getMbrRole(username);
		
		mbr.setGetMbrRole(Arrays.asList(mbrRole));

		if(mbr == null) {
			
			throw new UsernameNotFoundException(username);
		}
		
		
		return mbr;
	}
	
	

}
