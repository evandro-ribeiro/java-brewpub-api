package me.dio.service;

import me.dio.domain.model.Cliente;

public interface ClienteService {

    Cliente findById(Long id);

    Cliente create(Cliente userToCreate);
}
