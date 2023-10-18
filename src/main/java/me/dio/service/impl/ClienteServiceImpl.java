package me.dio.service.impl;

import me.dio.domain.model.Cliente;
import me.dio.domain.repository.ClienteRepository;
import me.dio.service.ClienteService;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cliente create(Cliente clienteCriado) {
        if (clienteRepository.existsById(clienteCriado.getId())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return clienteRepository.save(clienteCriado);
    }
}
