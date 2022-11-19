package com.oracle.s20221103.pej.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.s20221103.dto.Member;
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
			selMemberDogList = session.selectList("selMemberDogListAll");
		} catch (Exception e) {
			System.out.println("PejDaoImpl selMemberDogList Exception->"+e.getMessage());
		}
		return selMemberDogList;
	}


}
