package com.hasan.restaurant.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.hasan.restaurant.enums.OrderState;
import com.hasan.restaurant.enums.PaymentMethod;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateOfOrder;
	private OrderState orderState;
	private PaymentMethod paymentMethod;

	@ManyToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "id")
	private Restaurant restaurant;

	@ManyToOne
	@JoinColumn(name = "customerId", referencedColumnName = "id")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "driverId", referencedColumnName = "id")
	private Driver driver;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<ItemDetails> itemDetails = new ArrayList<>();

	public Order() {

	}

	public Order(Date dateOfOrder, OrderState orderState, Restaurant restaurant, Customer customer, Driver driver,
			PaymentMethod paymentMethod) {
		this.customer = customer;
		this.dateOfOrder = dateOfOrder;
		this.driver = driver;
		this.orderState = orderState;
		this.restaurant = restaurant;
		this.paymentMethod = paymentMethod;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public List<ItemDetails> getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(List<ItemDetails> itemDetails) {
		this.itemDetails = itemDetails;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
