package com.oracle.s20221103.dto;

import lombok.Data;

@Data
public class Dog {
	private String 	id;  		 //회원아이디
	private Long 	dogNo;  	 //반려견번호
	private String 	dogName; 	 //반려견이름
	private Long 	dogGender; 	 //반려견성별
	private Long 	dogAge; 	 //반려견나이
	private Long 	dogWeight; 	 //반려견몸무게
	private String 	dogMemo; 	 //특이사항
	private Long 	deSexibng; 	 //중성화여부
	private String 	dogKind; 	 //견종명
	private Long 	joinCheck; 	 //유치원가입상태
	private String 	scStartdate; //유치원시작일
	private String 	scEnddate; 	 //유치원종료일
	

}
