package com.example.erp_management_System.repository;

import com.example.erp_management_System.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository
        extends JpaRepository<Product, Long> {
}
