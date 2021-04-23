package br.com.magalu.microserv.Cad.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.magalu.microserv.Cad.model.Favoritos;

public interface FavoritoRepository extends CrudRepository<Favoritos, Long> {

	Favoritos findById(String id);

}
