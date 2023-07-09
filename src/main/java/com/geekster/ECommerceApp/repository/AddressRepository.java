package com.geekster.ECommerceApp.repository;

import com.geekster.ECommerceApp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    // Add custom query methods if needed
}