package com.example.employeesg.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name="pages" )

@JsonIgnoreProperties( {"hibernateLazyInitializer","handler","book"} )
public class Page {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column( name="number", nullable = false )
	private int number;
	
	@Column( name="content", nullable = false )
	private String content;
	
	@ManyToOne( fetch = FetchType.LAZY, optional = false )
	@JoinColumn( name= "books_id" )
	private Book book;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Page(Long id, int number, String content, Book book) {
		super();
		this.id = id;
		this.number = number;
		this.content = content;
		this.book = book;
	}
	
	public Page() {
		super();
	}
	
	

}
