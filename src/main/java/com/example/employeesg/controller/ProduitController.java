package com.example.employeesg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Book;
import com.example.employeesg.entitys.Produit;
import com.example.employeesg.repository.ProduitRepository;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/produits")

public class ProduitController {
	
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping("/add")

	public void ajouterProduit(){
		System.out.println("raho jeni appel men and ll postman");
		
		/*Produit p = new Produit();
		
		p.setLabel("COCA");
		p.setPrice(500);
		
		this.produitRepository.save(p);*/
		
		
		
	}
		
	
	
	

}
