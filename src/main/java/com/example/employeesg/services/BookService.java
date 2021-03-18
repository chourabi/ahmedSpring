package com.example.employeesg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeesg.repository.BookRepository;

@Service

public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	} 
	
	
}
