package com.example.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoWebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
