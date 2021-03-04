package com.example.employeesg.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produits")

public class Produit {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "label", nullable = false)
	private String label;

	
	@Column(name = "price", nullable = false)
	private int  price;
	
	


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}



	public Produit(long id, String label, int price) {
		super();
		this.id = id;
		this.label = label;
		this.price = price;
	}


	public Produit() {
		super();
	}
	
	
	
	
	
	
	
}
