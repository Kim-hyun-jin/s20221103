package com.oracle.s20221103.dto;

import lombok.Data;

@Data
public class MemberDog {
	private int 	id;				// 회원번호
	private String 	username;		// 회원아이디
	private String 	role;			// 권한
	private String 	password;		// 비밀번호
	private Long	member_call;		// 연락처
	private String	member_name;		// 이름
	private String	member_address;	// 주소
	private String	member_email;	// 이메일
	private String	prof_img;		// 프로필사진
	private String	teacher;		// 담당선생님
	private Long	member_drop;		// 탈퇴여부
	private Long 	dog_no;  	 //반려견번호
	private String 	dog_name; 	 //반려견이름
	private Long 	dog_gender; 	 //반려견성별
	private Long 	dog_age; 	 //반려견나이
	private Long 	dog_weight; 	 //반려견몸무게
	private String 	dog_memo; 	 //특이사항
	private Long 	de_sexibng; 	 //중성화여부
	private String 	dog_kind; 	 //견종명
	private Long 	join_check; 	 //유치원가입상태
	private String 	sc_startdate; //유치원시작일
	private String 	sc_enddate; 	 //유치원종료일
}
