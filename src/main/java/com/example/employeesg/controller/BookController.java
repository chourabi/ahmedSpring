package com.example.employeesg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Book;
import com.example.employeesg.services.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin( origins="*" )


public class BookController {
	
	
	@Autowired
	private BookService bookService;
	
	
	 @GetMapping("/list")
	 
	 public List<Book> getBooks(){
		 return this.bookService.getBookRepository().findAll();
	 }
	
	
	

}
