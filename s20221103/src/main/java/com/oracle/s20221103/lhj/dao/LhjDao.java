package com.oracle.s20221103.lhj.dao;

import java.util.List;

import com.oracle.s20221103.dto.Dog;

public interface LhjDao {

	List<Dog>   myDogList(Dog dog);
	Dog         mydogInfo(Long dogNo);

}
