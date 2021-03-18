package com.example.employeesg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Achat;
import com.example.employeesg.services.AchatService;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping("/achats")
public class AchatsController {

	@Autowired
	private AchatService achatService;
	
	
	@GetMapping("/list")
	public List<Achat> getALLAchats(){
		return this.achatService.getAchatRepository().findAll();
	}
}
