package com.api.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.client.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
