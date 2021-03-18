package com.example.employeesg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeesg.repository.PageRepository;

@Service
public class PageService {

	@Autowired
	private PageRepository pageRepository;

	public PageRepository getPageRepository() {
		return pageRepository;
	}

	public void setPageRepository(PageRepository pageRepository) {
		this.pageRepository = pageRepository;
	}

	
}
