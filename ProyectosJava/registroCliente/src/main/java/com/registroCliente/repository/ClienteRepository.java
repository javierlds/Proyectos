package com.registroCliente.repository;

import com.registroCliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> { // debe ser el entity y el tipo de dato de la llave

}
