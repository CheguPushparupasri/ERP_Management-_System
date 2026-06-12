package com.example.erp_management_System.repository;

import com.example.erp_management_System.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository
        extends JpaRepository<Supplier, Long> {
}
