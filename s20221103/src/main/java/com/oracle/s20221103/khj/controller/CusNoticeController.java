package com.oracle.s20221103.khj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customerService/cusNotice")
public class CusNoticeController {
	

	//��ȸ
	@GetMapping("/detail")
	public String detail(@RequestParam(defaultValue = "1") int cusNo) {
		
		//�����۹�ȣ�� ������ ��ȸ
		
		//��ȸ��ü �𵨿� ��Ƽ� ȭ�鿡 ����
		
		return "customerService/cusNotice/detail";
	}
	
	
	
	
	//���ۼ�
	@GetMapping("/write")
	public String writeGet() {
		
		return "customerService/cusNotice/write";
	}

	@PostMapping("/write")
	public String writePost() {
		
		//������� �� ����� ���� (��ȿ�� �˻�, ����˻�) 
		
		
		//���� ���â �Ǵ� "validation ���� ǥ��
		
		return "redirect:/customerService/cusNotice/main";
	}
	
	

	
	//����
	@GetMapping("/modify")
	public String modify() {
		
		return "customerService/cusNotice/modify";
	}
	
	//����
	
}
