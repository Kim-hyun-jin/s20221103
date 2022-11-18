package com.oracle.s20221103.pej.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.s20221103.dto.Member;
import com.oracle.s20221103.dto.join.MemberDog;
import com.oracle.s20221103.pej.service.PejService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PejController {
	private final PejService ps;
	
	@RequestMapping(value = "mypage/member/myInfo")
	public String myInfo() {
		System.out.println("myInfo start");
		
		return "mypage/member/myInfo";
	}
	
	
	@RequestMapping(value = "/mypage/admin/memberList")
	public String selMemberDogList(Model model) {
		System.out.println("selMemberDogList start");
		List<MemberDog> selMemberDogList = ps.selMemberDogList();
		System.out.println("PejController selMemberDogList selMemberDogList.size()->"+selMemberDogList.size());
		System.out.println(""+selMemberDogList.get(2).toString());
		model.addAttribute("selMemberDogList", selMemberDogList);
		
		return "mypage/admin/memberList";
	}
}