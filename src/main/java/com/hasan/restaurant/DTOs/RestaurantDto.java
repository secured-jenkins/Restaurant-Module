package com.hasan.restaurant.DTOs;

public class RestaurantDto {
	private String name;
	private String category;
	private ClientDto client;

	public RestaurantDto() {

	}

	public RestaurantDto(String name, String category, ClientDto client) {
		this.category = category;
		this.client = client;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ClientDto getClient() {
		return client;
	}

	public void setClient(ClientDto client) {
		this.client = client;
	}

}
