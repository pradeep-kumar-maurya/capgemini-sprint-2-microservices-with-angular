package com.cap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.Authentication;
import com.cap.service.AuthenticationService;

@SpringBootTest
class AuthenticationApplicationTests {
	
	@Autowired
	private AuthenticationService service;

	@Test
	public void validate() {
		Authentication a = service.authenticate("pradeep", "pradeep123");
		Authentication a1 = new Authentication();
		a1.setSno(1);
		a1.setUsername("pradeep");
		a1.setPassword("pradeep123");
		Assertions.assertEquals(a1.toString(),a.toString());
	}
}