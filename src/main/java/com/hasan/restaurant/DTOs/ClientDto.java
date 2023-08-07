package com.hasan.restaurant.DTOs;

import java.util.ArrayList;
import java.util.List;

import com.hasan.restaurant.entities.Restaurant;

public class ClientDto {
	private Long id;
	private String firstName;
	private String lastName;
	private Long phoneNumber;
	private String address;
	private String username;
	private String password;

	public ClientDto() {
	}

	public ClientDto(String firstName, String lastName, Long phoneNumber, String address, String username,
			String password) {
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
