package com.oracle.s20221103.lhj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.s20221103.dto.Dog;
import com.oracle.s20221103.lhj.service.LhjService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LhjController {
	
	private final LhjService lhjs;
	
	
	@GetMapping(value = "/mypage/member/myDogList")
	public String myDogList(Dog dog, Model model) {
		System.out.println("LhjController Start myDogList..." );
		List<Dog> myDogList = lhjs.myDogList(dog);
		System.out.println("LhjController myDogList myDogList.size()=>" + myDogList.size());
		model.addAttribute("myDogList",myDogList);
		return "mypage/member/myDogList";
		
	}
	
	@GetMapping(value = "/mypage/member/myDogInfo")
	public String mydogInfo(Long dog_no, Model model) {
		System.out.println("LhjController Start mydogInfo..." );
		
		 Dog dog = lhjs.mydogInfo(dog_no);
		 model.addAttribute("dog",dog);
		
		return "mypage/member/myDogInfo";
		
	}
}
