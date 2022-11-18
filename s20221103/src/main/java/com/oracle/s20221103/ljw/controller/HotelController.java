package com.oracle.s20221103.ljw.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.oracle.s20221103.dto.Room;
import com.oracle.s20221103.ljw.service.MyHotelService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HotelController {
	private final MyHotelService mhs;
	
	@GetMapping("/hotel/reservation/main2")
	public String hotelRreservationMain2(Model model) {
		log.info("hotelRreservationMain2() start...");
		List<Room> roomList = mhs.findRoomList();
		model.addAttribute("roomList", roomList);
		log.info("hotelRreservationMain2() finish..."+roomList.toString());
		return "hotel/reservation/main";
	}
}
