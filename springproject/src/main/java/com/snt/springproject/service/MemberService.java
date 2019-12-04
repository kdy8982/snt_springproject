package com.snt.springproject.service;

import com.snt.springproject.domain.MemberVO;

public interface MemberService {
	MemberVO selectMember();
	MemberVO selectMember(MemberVO vo);
}
