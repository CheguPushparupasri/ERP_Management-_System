package com.example.erp_management_System.repository;

import com.example.erp_management_System.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InventoryRepository
        extends JpaRepository<Inventory, Long> {
}
