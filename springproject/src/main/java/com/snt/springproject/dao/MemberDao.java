package com.snt.springproject.dao;

import org.springframework.stereotype.Repository;

import com.snt.springproject.domain.MemberVO;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("memberDao")
public class MemberDao extends EgovAbstractDAO {
	
	public MemberVO selectMember(MemberVO mem) {
		return (MemberVO) select("memberDao.selectMember", mem);
	}

	public MemberVO selectMember() {
		return (MemberVO) select("memberDao.selectMember");

	}
}
