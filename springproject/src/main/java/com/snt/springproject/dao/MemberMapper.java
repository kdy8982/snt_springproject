package com.snt.springproject.dao;

import com.snt.springproject.domain.MemberVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("memberMapper")
public interface MemberMapper {
	MemberVO selectMember() throws Exception;
}
