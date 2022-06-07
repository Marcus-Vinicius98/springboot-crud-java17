package com.api.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.client.entity.Client;
import com.api.client.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public Client save(Client client) {
		return repository.save(client);
	}

	public List<Client> findAll() {
		return repository.findAll();
	}

	public Optional<Client> findById(Long id) {
		return repository.findById(id);
	}

	public void removeById(Long id) {
		repository.deleteById(id);

	}

}
