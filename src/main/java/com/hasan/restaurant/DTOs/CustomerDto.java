package com.hasan.restaurant.DTOs;

public class CustomerDto {
	private String firstName;
	private String lastName;
	private Long phoneNumber;
	private String address;
	private String username;
	private String password;
	
	public CustomerDto() {
		
	}
	
	public CustomerDto(String firstName, String lastName, Long phoneNumber, String address, String username, String password) {
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.username = username;
	}
}
