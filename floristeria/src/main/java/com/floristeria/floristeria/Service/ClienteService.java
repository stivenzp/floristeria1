package com.floristeria.floristeria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floristeria.floristeria.Repository.ClienteRepository;
import com.floristeria.floristeria.model.Cliente;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
