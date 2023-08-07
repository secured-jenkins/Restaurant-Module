package com.hasan.restaurant.DTOs;

import java.sql.Date;

import com.hasan.restaurant.enums.OrderState;
import com.hasan.restaurant.enums.PaymentMethod;

public class OrderDto {

	private Date dateOfOrder;
	private OrderState orderState;
	private PaymentMethod paymentMethod;
	private RestaurantDto restaurant;
	private CustomerDto customer;
	private DriverDto driver;

	public OrderDto() {

	}

	public OrderDto(Date dateOfOrder, OrderState orderState, PaymentMethod paymentMethod, RestaurantDto restaurant,
			CustomerDto customer, DriverDto driver) {
		this.dateOfOrder = dateOfOrder;
		this.orderState = orderState;
		this.paymentMethod = paymentMethod;
		this.restaurant = restaurant;
		this.customer = customer;
		this.driver = driver;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public RestaurantDto getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantDto restaurant) {
		this.restaurant = restaurant;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	public DriverDto getDriver() {
		return driver;
	}

	public void setDriver(DriverDto driver) {
		this.driver = driver;
	}

}
