package com.oracle.s20221103.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Dog {
	private String 	ID;  		  //회원아이디
	private Long 	DOG_NO;  	  //반려견번호
	private String 	DOG_NAME; 	  //반려견이름
	private Long 	DOG_GENDER;   //반려견성별
	private Long 	DOG_AGE; 	  //반려견나이
	private Long 	DOG_WEIGHT;   //반려견몸무게
	private String 	DOG_MEMO; 	  //특이사항
	private Long 	DE_SEXIBNG;   //중성화여부
	private String 	DOG_KIND; 	  //견종명
	private Long 	JOIN_CHECK;   //유치원가입상태
	private String 	SC_STARTDATE; //유치원시작일
	private String 	SC_ENDDATE;   //유치원종료일
	

}
