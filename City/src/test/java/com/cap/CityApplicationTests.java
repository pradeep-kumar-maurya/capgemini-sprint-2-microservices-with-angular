package com.cap;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.City;
import com.cap.service.CityServiceI;

@SpringBootTest
class CityApplicationTests {

	@Autowired
	private CityServiceI service;
	
	@Test
	void contextLoads() {
		List<City> list = service.getCityNames();
		Assertions.assertEquals(3, list.size());
	}
}