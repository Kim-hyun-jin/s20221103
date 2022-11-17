package com.oracle.s20221103.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//main(index) 첫 페이지에 연결된 링크 모음
	//메인페이지 연결된 링크들 모아둠
	

//--------------------------------------메인--------------------------------------------------------------------------------------
	@GetMapping("/")
	public String root() {
		return "main/index";
	}	
	@GetMapping("/index")
	public String index() {
		return "main/index";
	}
	
	
//--------------------------------------로그인/회원가입/회원관리--------------------------------------------------------------------------------------	
	
	@GetMapping("/main/loginForm")
	public String loginForm() {
		return "main/loginForm";
	}
	
	@GetMapping("/main/signupForm")
	public String signupForm() {
		return "main/signupForm";
	}
	
	
	
	//마이페이지
	@GetMapping("/mypage/admin/main")
	public String mypageAdminMain() {
		return "mypage/admin/main";
	}
	
	@GetMapping("/mypage/member/main")
	public String mypageMemberMain() {
		return "mypage/member/main";
	}

//--------------------------------------호텔--------------------------------------------------------------------------------------
	//호텔시설안내
	@GetMapping("/hotel/intro")
	public String hotelIntro() {
		return "hotel/intro";
	}
	
	//호텔이용안내
	@GetMapping("/hotel/usage")
	public String hotelUsage() {
		return "hotel/usage";
	}
	//호텔유의사항
	@GetMapping("/hotel/caution")
	public String hotelCaution() {
		return "hotel/caution";
	}
	//호텔예약하기
	@GetMapping("/hotel/reservation/main")
	public String hotelRreservationMain() {
		return "hotel/reservation/main";
	}
	
	
//--------------------------------------유치원-------------------------------------------------------------------------------------
	//유치원 시설안내
	@GetMapping("/school/intro")
	public String schoolIntro() {
		return "school/intro";
	}
	
	//유치원 이용안내
	@GetMapping("/school/usage")
	public String schoolUsage() {
		return "school/usage";
	}
	
	//유치원 알림장
	@GetMapping("/school/dogNotice/main")
	public String schoolDogNotice() {
		return "school/dogNotice/main";
	}
	
	//행동교정신청
	@GetMapping("/school/BHCorrection/main")
	public String schoolBHCorrectionMain() {
		return "school/BHCorrection/main";
	}
	
	
//--------------------------------------고객서비스------------------------------------------------------------------------------------
	
	//공지사항 메인페이지
	@GetMapping("/customerService/cusNotice/main")
	public String customerServiceCusNoticeMain() {
		return "customerService/cusNotice/main";
	}
	
	//QA 메인페이지
	@GetMapping("/customerService/QA/QA")
	public String customerServiceQAMain() {
		return "customerService/QA/QA";
	}
	
	//자유게시판 메인페이지
	@GetMapping("/customerService/freeboard/main")
	public String customerServiceFreeboardMain() {
		return "customerService/freeboard/main";
	}
	
	
}
