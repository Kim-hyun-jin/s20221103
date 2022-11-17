package com.oracle.s20221103.khj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customerService/cusNotice")
public class CusNoticeController {
	
	@GetMapping("/write")
	public String writeGet() {
		
		return "customerService/cusNotice/write";
	}

	@PostMapping("/write")
	public String writePost() {
		return "redirect:/main";
	}
}
