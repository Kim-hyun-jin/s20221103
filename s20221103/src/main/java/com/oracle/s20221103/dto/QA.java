package com.oracle.s20221103.dto;

import lombok.Data;

@Data
public class QA {

	private int questionNo;
	private String memberId;
	private String title;
	private String content;
	private String status;
	private String teacherId;
	private String answerTitle;
	private String answerContent;
	
}
