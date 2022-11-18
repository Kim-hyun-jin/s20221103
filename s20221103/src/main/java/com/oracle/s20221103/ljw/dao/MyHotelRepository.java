package com.oracle.s20221103.ljw.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.s20221103.dto.Room;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MyHotelRepository implements HotelRepository {
	private final SqlSession session;

	@Override
	public List<Room> findRoomList() {
		List<Room> result = null;
		try {
			result = session.selectList("RoomList");
		} catch (Exception e) {
			log.info("findRoomList() e.getMessage...==>{}",e.getMessage());
		}
		return result;
	}

}
