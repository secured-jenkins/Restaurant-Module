package com.hasan.restaurant.entities;

import com.hasan.restaurant.enums.ItemSize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private int quantity;
	private ItemSize size;
	private double sumPrice;

	@ManyToOne
	@JoinColumn(name = "itemId", referencedColumnName = "id")
	private Item item;

	@ManyToOne
	@JoinColumn(name = "orderId", referencedColumnName = "id")
	private Order order;

	public ItemDetails() {

	}

	public ItemDetails(int quantity, ItemSize size, double sumPrice, Item item, Order order) {
		this.quantity = quantity;
		this.size = size;
		this.sumPrice = sumPrice;
		this.order = order;
		this.item = item;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ItemSize getSize() {
		return size;
	}

	public void setSize(ItemSize size) {
		this.size = size;
	}

	public double getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice(double sumPrice) {
		this.sumPrice = sumPrice;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
