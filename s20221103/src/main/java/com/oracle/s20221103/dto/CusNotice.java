package com.oracle.s20221103.dto;

import lombok.Data;


@Data
public class CusNotice {

	private int cusNo;
	private String memberId;
	private String title;
	private String content;
	private String regdate; // ���옣�븷 �븣 �룷留룻꽣濡� date

	
}
