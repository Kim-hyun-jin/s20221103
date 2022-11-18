package com.oracle.s20221103.lhj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.s20221103.dto.Dog;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class LhjDaoImpl implements LhjDao {
	
	private final SqlSession session;

	@Override
	public List<Dog> myDogList(Dog dog) {
		List<Dog> myDogList = null;
		System.out.println("LhjDaoImpl myDogList Start ..." );
		try {
			myDogList = session.selectList("hjMyDogList" , dog);
			System.out.println("LhjDaoImpl myDogList myDogList.size()->"+myDogList.size());
			
		} catch (Exception e) {
			System.out.println("LhjDaoImpl myDogList e.getMessage()->"+e.getMessage());
		}
		return myDogList;
	}

	@Override
	public Dog mydogInfo(Long dog_no) {
		System.out.println("LhjDaoImpl mydogInfo start..");
		Dog dog = new Dog();
		try {
			dog = session.selectOne("mydogInfo", dog_no);
			System.out.println("LhjDaoImpl mydogInfo getDOG_NAME->"+dog.getDOG_NAME());
		} catch (Exception e) {
			System.out.println("LhjDaoImpl mydogInfo Exception->"+e.getMessage());
		}
		return dog;
	}

}
