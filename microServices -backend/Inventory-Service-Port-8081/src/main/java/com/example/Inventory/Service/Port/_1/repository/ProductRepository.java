package com.example.Inventory.Service.Port._1.repository;

import com.example.Inventory.Service.Port._1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Default CRUD methods available from JpaRepository
}