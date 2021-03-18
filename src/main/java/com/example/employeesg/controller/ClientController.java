package com.example.employeesg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Client;
import com.example.employeesg.entitys.Ville;
import com.example.employeesg.model.ClientAddModel;
import com.example.employeesg.model.VilleAddModel;
import com.example.employeesg.response.ControllerResponse;
import com.example.employeesg.services.ClientService;
import com.example.employeesg.services.VilleService;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/client")


public class ClientController {

	@Autowired
    private ClientService clientService;
	
	@Autowired
	private VilleService villeService;
	
	
	@GetMapping("/list")
	public List<Client> getClientsList(){
		return this.clientService.getClientRepository().findAll();
	}
	
	
	@PostMapping("/add")
	public ControllerResponse addNewClient( @RequestBody ClientAddModel c ) {
		ControllerResponse res = new ControllerResponse();
		
		Client client = new Client();
		
		try {
			client.setCodeclient(c.getCodeclient());
			client.setVille( this.villeService.getVilleRepository().findById(c.getIdVille()).get() );
			
			this.clientService.getClientRepository().save(client);
			
			res.setSuccess(true);
			res.setMessage("client inserted !");
		}catch( Exception e ) {
			res.setSuccess(false);
			res.setMessage("client not inserted :( ");
		}
		
		
		
		return res;
	}
	
	
	
	
	
	
	
	
	
}
