package com.instantmessage.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.instantmessage.springboot.dtos.ClientDto;
import com.instantmessage.springboot.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void saveClient(@RequestBody ClientDto dto) {
		clientService.saveCleint(dto);
	}
	
}
