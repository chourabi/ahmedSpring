package com.example.employeesg.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table ( name="achats_client_produit" )

public class Achat {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="clients_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="produits_id")
	private Produit produit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Achat(Long id, Client client, Produit produit) {
		super();
		this.id = id;
		this.client = client;
		this.produit = produit;
	}
	
	public Achat() {
		super();
	}
	
	
	

}
