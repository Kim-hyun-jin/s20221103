package com.oracle.s20221103.dto;

import lombok.Data;


@Data
public class FreeBoard {

	private int freeboardNo;
	private String category;
	private String memberId;
	private String title;
	private String content;
	private String regdate;
	private String viewCount;
	private String recommand;
}
