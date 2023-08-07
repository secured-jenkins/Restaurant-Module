package com.hasan.restaurant.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.hasan.restaurant.enums.DriverState;
import com.hasan.restaurant.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Driver extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private DriverState state;

	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	private List<Order> order = new ArrayList<>();

	public Driver() {
	}

	public Driver(DriverState state, String username, String password, String firstName, String lastName,
			Long phoneNumber, String address) {
		super(username, password, firstName, lastName, phoneNumber, address);
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DriverState getState() {
		return state;
	}

	public void setState(DriverState state) {
		this.state = state;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> x = new ArrayList<GrantedAuthority>();
		x.add(new SimpleGrantedAuthority(Role.DRIVER.toString()));
		return x;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

}
