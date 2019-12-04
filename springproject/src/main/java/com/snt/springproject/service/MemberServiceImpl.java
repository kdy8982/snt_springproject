package com.snt.springproject.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.snt.springproject.dao.MemberDao;
import com.snt.springproject.domain.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Resource(name="memberDao")
	private MemberDao memberDao;
	
	@Override
	public MemberVO selectMember() {
		MemberVO memberVO = memberDao.selectMember();
		return memberVO;
	}
	
	@Override
	public MemberVO selectMember(MemberVO vo) {
		MemberVO memberVO = memberDao.selectMember(vo);
		return memberVO;
	}


}
