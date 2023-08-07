package com.hasan.restaurant.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hasan.restaurant.entities.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long>{

}
