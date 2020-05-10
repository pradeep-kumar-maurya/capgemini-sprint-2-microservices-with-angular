package com.cap;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.Languages;
import com.cap.bean.Shows;
import com.cap.service.LanguagesServiceI;
import com.cap.service.ShowsServiceI;

@SpringBootTest
class ShowsApplicationTests {

	@Autowired
	private ShowsServiceI service;
	
	@Autowired
	private LanguagesServiceI lang_service;
	
	@Test
	void getShows() {
		List<Shows> list = service.getShows();
		Assertions.assertEquals(4, list.size());
	}
	
	@Test
	void getLanguages() {
		List<Languages> list  = lang_service.getLanguage();
		Assertions.assertEquals(3, list.size());
	}
}
