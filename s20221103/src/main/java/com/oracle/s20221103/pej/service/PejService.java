package com.oracle.s20221103.pej.service;

import java.util.List;

import com.oracle.s20221103.dto.Member;
import com.oracle.s20221103.dto.MemberDog;

public interface PejService {


	List<MemberDog> selMemberDogList();

	List<MemberDog> detailMemberDog(int id);
	



}
