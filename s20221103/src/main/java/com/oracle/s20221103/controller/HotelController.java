package com.oracle.s20221103.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {
	
	@GetMapping(value = "/hotel/reservation/info")
	public String resInfo() {
		System.out.println("HotelController resInfo");
		
		return "hotel/reservation/infoInput";
	}
}
