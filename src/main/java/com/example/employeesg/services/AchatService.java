package com.example.employeesg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeesg.repository.AchatRepository;

@Service
public class AchatService {

	@Autowired
	private AchatRepository achatRepository;

	public AchatRepository getAchatRepository() {
		return achatRepository;
	}


	
	
}
