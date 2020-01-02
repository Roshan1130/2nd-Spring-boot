package com.instantmessage.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.instantmessage.springboot.entities.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, Integer>{

}
