package com.hasan.restaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.oauth2.client.ClientRegistrationsBeanDefinitionParser;
import org.springframework.stereotype.Service;

import com.hasan.restaurant.DTOs.ClientDto;
import com.hasan.restaurant.entities.Client;
import com.hasan.restaurant.exceptions.NotFoundException;
import com.hasan.restaurant.repos.ClientRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {
	@Autowired
	private ClientRepo clientRepo;

	@Autowired
	private ConverterDTO converter;

	public Mono<ClientDto> addClient(ClientDto client) {
		return Mono.just(converter.entityToClientDto(clientRepo.save(converter.clientDTOToEntity(client))));
	}

	public Mono<ClientDto> findClientById(Long id) {
		return Mono
				.just(converter.entityToClientDto(clientRepo.findById(id).orElseThrow(() -> new NotFoundException())));
	}

	public Flux<ClientDto> getAlllClients() {
		return Flux.fromIterable(clientRepo.findAll()).map(x -> converter.entityToClientDto(x));
	}

}
