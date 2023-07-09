package com.geekster.ECommerceApp.repository;

import com.geekster.ECommerceApp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // Add custom query methods if needed
}