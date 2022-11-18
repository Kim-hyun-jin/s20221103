package com.oracle.s20221103.ljw.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.s20221103.dto.Room;
import com.oracle.s20221103.ljw.dao.MyHotelRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
@Transactional
public class MyHotelService implements HotelService {
	private final MyHotelRepository mhr;
	@Override
	public List<Room> findRoomList() {
		return mhr.findRoomList();
	}

}
