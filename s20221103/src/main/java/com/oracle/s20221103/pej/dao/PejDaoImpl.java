package com.oracle.s20221103.pej.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PejDaoImpl implements PejDao {
	private final SqlSession session;
}
