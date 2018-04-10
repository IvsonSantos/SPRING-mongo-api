package com.ivson.crud.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivson.crud.api.documents.Cliente;
import com.ivson.crud.api.repositories.ClienteRepository;

@Service 		// para poder sem adicionado a outros componentes
public class ClienteServiceImpl implements ClienteService {

	@Autowired		// o Spring disponibiliza uma instancia dessa classe
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> listarTodos() {		
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente listarPorId(String id) {
		Optional<Cliente> cliente = this.clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		// passa sem ID, que assim o Spring Boot cria um novo objeto
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		// passa com ID, que assim o Spring Boot atualiza os dados
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}

}
