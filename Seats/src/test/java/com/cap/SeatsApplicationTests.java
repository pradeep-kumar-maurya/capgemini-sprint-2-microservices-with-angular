package com.cap;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.Payments;
import com.cap.bean.Seats;
import com.cap.exception.InvalidDetailsException;
import com.cap.service.PaymentsServiceI;
import com.cap.service.SeatsServiceI;

@SpringBootTest
class SeatsApplicationTests {

	@Autowired
	private SeatsServiceI service;
	
	@Autowired
	private PaymentsServiceI payment_service;
	
	@Test
	void chechSeats() {
		List<Seats> list = service.getSeats();
		Assertions.assertEquals(3, list.size());
	}
	
	@Test
	void updateSeats() throws InvalidDetailsException {
		Seats seat = new Seats();
		seat.setAvailable_seats(100);
		seat.setPrice(400);
		seat.setSeat_type("BRONZE");
		seat.setSno(3);
		String s = service.updateSeats(seat);
		String s1 = "seats were updated successfully!!";
		Assertions.assertEquals(s1, s);
	}
	
	@Test
	void createPayment() {
		Payments p = new Payments();
		p.setAccount_no(1100);
		p.setBooking_id(152);
		p.setDate_of_transac("5/7/2020");
		p.setMoney_collected(800);
		p.setRefund(0);
		p.setSeat_type("Gold");
		p.setSeats_booked(1);
		Payments p1 = payment_service.payments(p);
		Assertions.assertEquals(p.toString(), p1.toString());
	}
}