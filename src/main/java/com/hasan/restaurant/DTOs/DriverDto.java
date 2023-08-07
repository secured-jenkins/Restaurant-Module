package com.hasan.restaurant.DTOs;

import com.hasan.restaurant.enums.DriverState;

public class DriverDto {

	private DriverState state;
	private String firstName;
	private String lastName;
	private Long phoneNumber;
	private String address;
	private String username;
	private String password;

	public DriverDto() {
	}

	public DriverDto(String firstName, String lastName, Long phoneNumber, String address, String username,
			String password, DriverState state) {
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.state = state;
	}

	public DriverState getState() {
		return state;
	}

	public void setState(DriverState state) {
		this.state = state;
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

}
