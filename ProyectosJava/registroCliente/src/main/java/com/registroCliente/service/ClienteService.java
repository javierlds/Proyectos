package com.registroCliente.service;

import com.registroCliente.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> consultarClientes();
    Cliente guardarCliente(Cliente cliente);
}
