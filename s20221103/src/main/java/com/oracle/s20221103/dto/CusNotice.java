package com.oracle.s20221103.dto;

import lombok.Data;


@Data
public class CusNotice {

	private Integer cusNo;
	private String memberId;
	private String title;
	private String content;
	private String regdate; // 저장할 때 포맷터로 date

	
}
