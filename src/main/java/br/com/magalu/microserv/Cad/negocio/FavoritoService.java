package br.com.magalu.microserv.Cad.negocio;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Service;

import br.com.magalu.microserv.Cad.excessao.ClienteInexistenteException;
import br.com.magalu.microserv.Cad.integracao.PostClient;
import br.com.magalu.microserv.Cad.model.Cliente;
import br.com.magalu.microserv.Cad.model.Favoritos;
import br.com.magalu.microserv.Cad.model.PostDTO;
import br.com.magalu.microserv.Cad.repository.ClienteRepository;
import br.com.magalu.microserv.Cad.repository.FavoritoRepository;

@Service
public class FavoritoService {

	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private FavoritoRepository favoritoRepository;

	@Autowired
	private PostClient postRepository;
	
	public Favoritos addFavorito(Long idCli, Favoritos favorito, PostDTO produto) {
		Cliente cliente = procuraCliente(idCli); 
		if(cliente != null) {
			if(postRepository.getProdutoById(produto.getId()) != null) {
				favorito.setIdProduto(produto.getId());
				favorito.setNomeCliente(cliente.getNome());
				favoritoRepository.save(favorito);
			}
		}
		return null;
	}
	
	public Cliente procuraCliente(Long id) {
		return this.clienteRepository.findById(id).orElseThrow(() -> new ClienteInexistenteException("Cliente inexistente"));
	}
	
	public Favoritos procuraFavorito(String id) {
		return this.favoritoRepository.findById(id);
	}
	
	public Favoritos deletarFavorito(Long id) {
		Cliente cliente = procuraCliente(id);
		Favoritos favorito;
		//favorito.setIdProduto(cliente.getId());
		if(cliente != null) {
			//this.favoritoRepository.delete(favorito);
		}
		return null;
	}
	
	public List<Favoritos> mostraFavorito() {
		return (List<Favoritos>) this.favoritoRepository.findAll();
	}
	
	
}
