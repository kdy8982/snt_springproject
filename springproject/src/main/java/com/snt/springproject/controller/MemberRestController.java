package com.snt.springproject.controller;


import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.snt.springproject.domain.MemberVO;
import com.snt.springproject.service.MemberService;

@RestController
@ResponseBody
public class MemberRestController {
	Logger logger =  LogManager.getLogger(MemberRestController.class.getName()); // 로그
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	@RequestMapping(value="/rest_member.json", produces={MediaType.APPLICATION_JSON_VALUE})
	public MemberVO  selectMebmerList( ModelMap model ) {
		MemberVO member = memberService.selectMember();
		logger.info(member.getName());
		logger.info(member.getId());
		logger.info(member);
		return member;
	}
	
	
}
