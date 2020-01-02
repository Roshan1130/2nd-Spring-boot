package com.instantmessage.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instantmessage.springboot.dtos.ClientDto;
import com.instantmessage.springboot.entities.ClientEntity;
import com.instantmessage.springboot.repositories.ClientRepository;

@Service
public class ClientService {

	

	@Autowired
	private ClientRepository clientRepository;

	public void saveCleint(ClientDto dto) {
		ClientEntity centity = new ClientEntity();
		centity.setName(dto.getName());
		centity.setDomain(dto.getDomain());
		centity.setUrl(dto.getUrl());
		centity.setSecretKey(dto.getSecretKey());
		clientRepository.save(centity);

	}



}