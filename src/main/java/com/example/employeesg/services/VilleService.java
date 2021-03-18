package com.example.employeesg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeesg.repository.VilleRepository;

@Service
public class VilleService {
	
	
	@Autowired
	private VilleRepository villeRepository;

	public VilleRepository getVilleRepository() {
		return villeRepository;
	}

	public void setVilleRepository(VilleRepository villeRepository) {
		this.villeRepository = villeRepository;
	}
	
	

}
