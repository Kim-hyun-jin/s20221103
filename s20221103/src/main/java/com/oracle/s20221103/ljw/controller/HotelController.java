package com.oracle.s20221103.ljw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {
	
	
	@GetMapping("/hotel/reservation/main2")
	public String hotelRreservationMain2() {
		
		return "hotel/reservation/main";
	}
}
