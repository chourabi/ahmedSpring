package com.example.employeesg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Page;
import com.example.employeesg.services.PageService;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping("/pages")


public class PageController {

	@Autowired
	private PageService pageService;
	
	
	@GetMapping("/list")
	public List<Page> getAllPages(){
		return this.pageService.getPageRepository().findAll();
	}
	
}
