package com.oracle.s20221103.lhj.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class LhjDaoImpl implements LhjDao {
	
	private final SqlSession session;

}
