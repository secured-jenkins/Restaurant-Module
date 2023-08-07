package com.hasan.restaurant.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hasan.restaurant.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
