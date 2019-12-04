package com.snt.springproject.controller;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snt.springproject.domain.MemberVO;
import com.snt.springproject.service.MemberService;

@Controller
public class MemberController {
	Logger logger =  LogManager.getLogger(MemberController.class.getName()); // 로그
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	@RequestMapping(value="/member.do")
	public String  selectMebmerList( ModelMap model ) {
		MemberVO member = memberService.selectMember();
		logger.info(member.getName());
		logger.info(member.getId());
		model.addAttribute("member", member);
		return "sample/SampleMember";
	}
	
	
}
