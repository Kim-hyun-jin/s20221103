package com.oracle.s20221103.pej.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.s20221103.dto.MemberDog;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PejDaoImpl implements PejDao {
	private final SqlSession session = null;


	@Override
	public List<MemberDog> selMemberDogList() {
		List<MemberDog> selMemberDogList = null;
		try {
			selMemberDogList = session.selectList("selMemberList");
		} catch (Exception e) {
			System.out.println("PejDaoImpl selMemberDogList Exception->"+e.getMessage());
		}
		return selMemberDogList;
	}


	@Override
	public List<MemberDog> detailMemberDog(int id) {
		List<MemberDog> detailMemberDog = null;
		System.out.println("PejDaoImpl detailMemberDog detailMemberDog start");
		try {
			detailMemberDog = session.selectList("detailMemberDog", id);
			System.out.println("PejDaoImpl detailMemberDog getMember_name->"+detailMemberDog.get(2).getId());
		} catch (Exception e) {
			System.out.println("PejDaoImpl detailMemberDog memberDog.getid->"+detailMemberDog.get(2).getMemberName());
			System.out.println("PejDaoImpl detailMemberDog Exception ->"+e.getMessage());
		}
		return detailMemberDog;
	}



}
