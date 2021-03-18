package com.example.employeesg.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "codeclient", nullable = false)
	private String codeclient;
	
	
	@OneToOne
	@JoinColumn(name = "villes_id")
	private Ville ville;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCodeclient() {
		return codeclient;
	}


	public void setCodeclient(String codeclient) {
		this.codeclient = codeclient;
	}


	public Ville getVille() {
		return ville;
	}


	public void setVille(Ville ville) {
		this.ville = ville;
	}


	public Client(long id, String codeclient, Ville ville) {
		super();
		this.id = id;
		this.codeclient = codeclient;
		this.ville = ville;
	}
	
	
	
	public Client() {
		super();
	}
	
	
	
	
	
	

}
