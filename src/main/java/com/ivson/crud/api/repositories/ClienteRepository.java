package com.ivson.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ivson.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
