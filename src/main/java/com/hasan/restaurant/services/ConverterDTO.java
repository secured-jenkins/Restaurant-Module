package com.hasan.restaurant.services;

import com.hasan.restaurant.DTOs.ClientDto;
import com.hasan.restaurant.entities.Client;

public class ConverterDTO {

	public Client clientDTOToEntity(ClientDto client) {
		Client temp = new Client();
		temp.setAddress(client.getAddress());
		temp.setFirstName(client.getFirstName());
		temp.setLastName(client.getLastName());
		temp.setPhoneNumber(client.getPhoneNumber());
		return temp;
	}

	public ClientDto entityToClientDto(Client client) {
		ClientDto temp = new ClientDto();
		temp.setId(client.getId());
		temp.setAddress(client.getAddress());
		temp.setFirstName(client.getFirstName());
		temp.setLastName(client.getLastName());
		temp.setPhoneNumber(client.getPhoneNumber());
		return temp;
	}

}
