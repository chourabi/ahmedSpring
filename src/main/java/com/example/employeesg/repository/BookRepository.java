package com.example.employeesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesg.entitys.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
