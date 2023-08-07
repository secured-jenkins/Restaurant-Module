package com.hasan.restaurant.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hasan.restaurant.entities.Client;

public interface ClientRepo extends JpaRepository<Client, Long>{

}
