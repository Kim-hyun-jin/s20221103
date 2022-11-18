package com.oracle.s20221103.dto;

import lombok.Data;

@Data
public class Room {
	private String roomType;
	private int rommPrice;
	private String roomFunction;
	private int limitSize;
}
