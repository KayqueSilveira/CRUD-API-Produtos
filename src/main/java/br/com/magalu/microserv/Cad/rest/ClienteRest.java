package br.com.magalu.microserv.Cad.rest;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magalu.microserv.Cad.model.Cliente;
import br.com.magalu.microserv.Cad.negocio.ClienteService;

@RestController
@RequestMapping("cliente")
@Validated
public class ClienteRest {

	@Autowired
	private ClienteService service;
	
	@PostMapping
	public ResponseEntity cadastrar(@RequestBody @Valid Cliente cliente) {
		cliente = this.service.cadastrar(cliente);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity buscar(@PathVariable @NotNull Long id) {
		Cliente cliente = this.service.buscarPorId(id);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deletar(@PathVariable @NotNull Long id) {
		Cliente cliente = this.service.deletarPorId(id);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity buscarTodos() {
		return new ResponseEntity<>(this.service.buscarTodosClientes(), HttpStatus.OK); 
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity alterarCliente(@PathVariable @NotNull Long id, @RequestBody Cliente cliente) {
		cliente = this.service.alterarCliente(id, cliente);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
}
