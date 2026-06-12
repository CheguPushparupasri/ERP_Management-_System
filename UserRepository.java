package com.example.erp_management_System.repository;

import com.example.erp_management_System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
long count();
}
