package com.example.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoWebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
