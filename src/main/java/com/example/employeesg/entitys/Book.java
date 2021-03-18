package com.example.employeesg.entitys;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name="books" )
public class Book {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	
	@Column( name="title", nullable = false )
	private String title;
	
	@OneToMany( mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private Set<Page> pages;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Page> getPages() {
		return pages;
	}

	public void setPages(Set<Page> pages) {
		this.pages = pages;
	}

	public Book(Long id, String title, Set<Page> pages) {
		super();
		this.id = id;
		this.title = title;
		this.pages = pages;
	}
	
	public Book() {
		super();
	}
	
	
	
	
	
	
	
	
}
