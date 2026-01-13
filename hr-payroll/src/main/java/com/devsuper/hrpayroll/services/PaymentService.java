package com.devsuper.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuper.hrpayroll.entities.Payment;
import com.devsuper.hrpayroll.entities.Worker;
import com.devsuper.hrpayroll.feignclients.WorkerFeignClient;


@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	
	public Payment getPayment(long workerId, int days) {
	
		Worker worker = workerFeignClient.findById(workerId).getBody();
	    return new Payment(worker.getName(), worker.getDailyIncome(), days);
	} 


	
	
	
}
