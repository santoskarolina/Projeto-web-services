package com.example.ProjetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoWebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
