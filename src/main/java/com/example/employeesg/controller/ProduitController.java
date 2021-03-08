package com.example.employeesg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Employee;
import com.example.employeesg.entitys.Produit;
import com.example.employeesg.model.ProduitAjoutModel;
import com.example.employeesg.repository.ProduitRepository;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping("/produits")

public class ProduitController {
	
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping("/list")

	public List<Produit> getProduitsList(){
		
		return this.produitRepository.findAll();
	}
		
	@PostMapping("/add")
	private void addNewProduit( @RequestBody ProduitAjoutModel p ) {
		Produit produit = new Produit();
		
		produit.setLabel(p.getTitreProduit());
		produit.setPrice(p.getPrixProduit());
		
		
		this.produitRepository.save(produit);
		  
	}
	
	 @GetMapping("/delete/{id}")
	 public void deleteProduit(@PathVariable(value ="id") Long id){
		 this.produitRepository.delete(   this.produitRepository.findById(id).get()  );
	 }
	 
	 @PostMapping("/update/{id}")
	 public void modiferProduit(@PathVariable(value ="id") Long id,@RequestBody ProduitAjoutModel p ){
		 
		 Produit produit =  this.produitRepository.findById(id).get();
		 
		 produit.setPrice(p.getPrixProduit());
		 produit.setLabel(p.getTitreProduit());
		 
		 this.produitRepository.save(produit);
		 
	 }
	
	
	

}
