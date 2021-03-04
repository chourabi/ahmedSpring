package com.example.employeesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesg.entitys.Produit;


public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
