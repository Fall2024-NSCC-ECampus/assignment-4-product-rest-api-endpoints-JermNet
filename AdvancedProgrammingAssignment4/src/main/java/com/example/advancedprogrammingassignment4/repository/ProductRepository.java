package com.example.advancedprogrammingassignment4.repository;

import com.example.advancedprogrammingassignment4.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Default interface, didn't need to add anything extra
public interface ProductRepository extends JpaRepository<Product, Long> {
}
