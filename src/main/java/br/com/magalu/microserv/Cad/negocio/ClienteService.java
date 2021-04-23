package br.com.magalu.microserv.Cad.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magalu.microserv.Cad.excessao.ClienteException;
import br.com.magalu.microserv.Cad.excessao.ClienteInexistenteException;
import br.com.magalu.microserv.Cad.model.Cliente;
import br.com.magalu.microserv.Cad.repository.ClienteRepository;

@Service
public class ClienteService {	
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente cadastrar(Cliente cliente) {
		Cliente base = this.repository.findClienteByEmail(cliente.getEmail());
		if(!cliente.isNew() || base != null) {
			throw new ClienteException("Cliente já existe. Efetue a busca.");
			
		}
		return this.repository.save(cliente);
	}
	
	public Cliente buscarPorId(Long id) {
		return this.repository.findById(id).orElseThrow(() -> new ClienteInexistenteException("Cliente inexistente"));
	}
	
	public Cliente deletarPorId(Long id) {
		
		Cliente cliente = this.buscarPorId(id);
		if(cliente != null) {
			this.repository.delete(cliente);	
		}
		
		return cliente;
	}
	
	public List<Cliente> buscarTodosClientes() {
		return (List<Cliente>) this.repository.findAll();
	}

	
	public Cliente alterarCliente(Long id, Cliente cliente) {
		Cliente base = this.buscarPorId(id);
		if(cliente != null) {
			base.setNome(cliente.getNome());
			base.setEmail(cliente.getEmail());
			repository.save(base);
			return this.buscarPorId(id);
		}
		return null;
	}
	
}
