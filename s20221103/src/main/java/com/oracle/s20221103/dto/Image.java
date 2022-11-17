package com.oracle.s20221103.dto;

import lombok.Data;

@Data
public class Image {

	private String tableType;
	private Integer cusNo;//(자유게시판?)게시글 번호
	private Integer imageNo;
	private String imgPath;
}
