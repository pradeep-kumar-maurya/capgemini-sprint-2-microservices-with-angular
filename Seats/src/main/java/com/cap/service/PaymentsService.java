package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Payments;
import com.cap.dao.PaymentsDaoI;

@Service
@Transactional
public class PaymentsService implements PaymentsServiceI {
	
	@Autowired
	private PaymentsDaoI dao;

	@Override
	public Payments payments(Payments pay) {
		boolean bool = dao.existsById(pay.getBooking_id());
		if(bool) {
			return null;
		}
		else {
			return dao.save(pay);
		}
	}
}