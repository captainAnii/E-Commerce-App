package com.geekster.ECommerceApp.repository;

import com.geekster.ECommerceApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Add custom query methods if needed
}