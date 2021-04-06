package com.example.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoWebServices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
