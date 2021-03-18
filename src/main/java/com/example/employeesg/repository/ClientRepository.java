package com.example.employeesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeesg.entitys.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {

}