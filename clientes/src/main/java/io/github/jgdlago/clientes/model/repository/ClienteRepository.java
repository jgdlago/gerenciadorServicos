package io.github.jgdlago.clientes.model.repository;

import io.github.jgdlago.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
