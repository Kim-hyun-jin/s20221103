package com.oracle.s20221103.lhj.controller;

import org.springframework.stereotype.Controller;

import com.oracle.s20221103.lhj.service.LhjService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LhjController {
	
	private final LhjService es;
	

}
