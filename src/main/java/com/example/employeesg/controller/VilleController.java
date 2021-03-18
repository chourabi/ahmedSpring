package com.example.employeesg.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Ville;
import com.example.employeesg.model.VilleAddModel;
import com.example.employeesg.response.ControllerResponse;
import com.example.employeesg.services.VilleService;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/ville")


public class VilleController {
	
	@Autowired
	private VilleService villeService;
	
	
	@GetMapping("/list")
	public List<Ville> getVilleList(){
		return this.villeService.getVilleRepository().findAll();
	}
	
	@PostMapping("/add")
	public ControllerResponse addNewVille( @RequestBody VilleAddModel v ) {
		ControllerResponse c = new ControllerResponse();
		
		Ville ville  = new Ville();
		
		if( v.getVille().equals("") ) {
			c.setSuccess(false);
			c.setMessage("Ville name cannot be empty !");
		}else {
			ville.setVille(v.getVille());
			
			this.villeService.getVilleRepository().save(ville);
			
			c.setSuccess(true);
			c.setMessage("ville inserted !");
		}
		
		
		
		return c;
	}
	
	
	@GetMapping("/details/{id}")
	public Ville getVilleDetails( @PathVariable(value ="id") Long id ) {
		//ControllerResponse c = new ControllerResponse();
		
		Ville ville  = new Ville();
		
		try {
			ville = this.villeService.getVilleRepository().findById(id).get();
		}catch( NoSuchElementException e ) {
			System.out.print(e.getMessage());
		}catch(Exception e) {
			
		}
		
		
		return ville;
	}
	
	
	
	
}
