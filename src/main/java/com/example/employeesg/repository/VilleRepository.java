package com.example.employeesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeesg.entitys.Ville;



@Repository
public interface VilleRepository  extends JpaRepository<Ville, Long> {

}