package com.example.employeesg.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "villes")

public class Ville {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "ville", nullable = false)
	private String ville;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public Ville(long id, String ville) {
		super();
		this.id = id;
		this.ville = ville;
	}
	
	public Ville() {
		super();
	}
	
	
}
