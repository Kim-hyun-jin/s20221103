package com.oracle.s20221103.pej.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}