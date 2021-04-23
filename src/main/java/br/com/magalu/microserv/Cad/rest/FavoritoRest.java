package br.com.magalu.microserv.Cad.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magalu.microserv.Cad.model.Favoritos;
import br.com.magalu.microserv.Cad.model.PostDTO;
import br.com.magalu.microserv.Cad.negocio.FavoritoService;

@RestController
@RequestMapping("cliente/favoritos")
@Validated
public class FavoritoRest {
	
	@Autowired
	private FavoritoService favoService;
	
	@PostMapping("/{id}")
	public ResponseEntity cadastrarFavorito( @RequestBody @Valid Favoritos favorito, @PathVariable Long id,  PostDTO produto) {
		favorito = favoService.addFavorito(id, favorito, produto);
		return new ResponseEntity<>(favorito, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deletarFavorito(@PathVariable Long id) {
		 //return new ResponseEntity<>(favoService.deletarFavorito(id), HttpStatus.OK);
		return new ResponseEntity<>(null);
	}
	
	@GetMapping()
	public ResponseEntity mostraFavoritos() {
		return new ResponseEntity<>(this.favoService.mostraFavorito(), HttpStatus.OK); 
	}

}
