package com.oracle.s20221103.pej.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.s20221103.dto.Member;
import com.oracle.s20221103.dto.MemberDog;
import com.oracle.s20221103.pej.dao.PejDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PejServiceImpl implements PejService {
	private final PejDao pd = null;

	@Override
	public List<MemberDog> selMemberDogList() {
		List<MemberDog> selMemberDogList = null;
		System.out.println("PejServiceImpl selMemberList selMemberList Start..");
		selMemberDogList = pd.selMemberDogList();
		System.out.println("PejServiceImpl selMemberList selMemberList.size()->"+selMemberDogList.size());
		return selMemberDogList;
	}

}