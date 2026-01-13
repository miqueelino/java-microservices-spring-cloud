package com.devsuper.hr_worker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.devsuper.hr_worker.entities.Worker;
import com.devsuper.hr_worker.repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;

	public List<Worker> findAll() {
		return workerRepository.findAll();
	}
	
	public Worker findById(Long id) {
	    return workerRepository.findById(id)
	            .orElseThrow(() -> new ResponseStatusException(
	                    HttpStatus.NOT_FOUND, "Worker not found"));
	}
}
