package com.example.spring01.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring01.member.model.dao.MemberDAOImpl;
import com.example.spring01.member.model.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	// MemberDAOImpl 객체를 스프링에서 생성하여 주입시킴
	@Inject
	MemberDAOImpl memberDao;
	
	@Override
	public List<MemberVO> memberList() {
		return memberDao.memberList();
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO viewMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

}
