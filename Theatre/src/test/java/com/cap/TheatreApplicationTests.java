package com.cap;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.Theatre;
import com.cap.service.TheatreServiceI;

@SpringBootTest
class TheatreApplicationTests {
	
	@Autowired
	private TheatreServiceI service;

	@Test
	void checkTheatres() {
		List<Theatre> list = service.theatreNames("HYDERABAD");
		Assertions.assertEquals(2, list.size());
	}
}