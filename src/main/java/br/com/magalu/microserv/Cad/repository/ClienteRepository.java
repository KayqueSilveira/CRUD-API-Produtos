package br.com.magalu.microserv.Cad.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.magalu.microserv.Cad.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Cliente findClienteByEmail(String email);

}
