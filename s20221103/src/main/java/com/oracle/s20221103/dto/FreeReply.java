package com.oracle.s20221103.dto;

import lombok.Data;

@Data
public class FreeReply {

	private String freeboardNo;
	private int replyNo;
	private String memberId;
	private String replyContent;
	private String replyRegdate;
}
