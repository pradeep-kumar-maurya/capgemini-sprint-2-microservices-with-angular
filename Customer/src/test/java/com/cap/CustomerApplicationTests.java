package com.cap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.Customer;
import com.cap.service.CustomerServiceI;

@SpringBootTest
class CustomerApplicationTests {
	
	@Autowired
	private CustomerServiceI service;

	@Test
	void checkCustomer() {
		Customer c = service.getAccountData(1000);
		Customer c1 = new Customer();
		c1.setAccount_no(1000);
		c1.setCurrent_balance(85200);
		c1.setName("pradeep kumar");
		c1.setUsername("pradeep");
		c1.setPassword("pradeep123");
		Assertions.assertEquals(c1.toString(), c.toString());
	}
	
	@Test
	void updateCustomer() {
		Customer c = new Customer();
		c.setAccount_no(1000);
		c.setCurrent_balance(100000);
		c.setName("pradeep kumar");
		c.setUsername("pradeep");
		c.setPassword("pradeep123");
		String s = service.updateAccountDetails(c);
		String s1 = "details updated successfully";
		Assertions.assertEquals(s1, s);
	}
}