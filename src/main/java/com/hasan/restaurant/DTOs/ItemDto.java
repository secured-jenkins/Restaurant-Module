package com.hasan.restaurant.DTOs;

public class ItemDto {
	private String name;
	private double price;
	private String description;
	private RestaurantDto restaurant;

	public ItemDto() {

	}

	public ItemDto(String name, double price, String description, RestaurantDto restaurant) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.restaurant = restaurant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RestaurantDto getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantDto restaurant) {
		this.restaurant = restaurant;
	}

}
