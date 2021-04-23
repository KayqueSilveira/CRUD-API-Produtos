package br.com.magalu.microserv.Cad.model;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Favoritos extends AbstractPersistable<Long>{
	
	
	private String nomeCliente;
	private String idProduto;
	private String nomeProduto;
	private String preco;
	private String imagem;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	

}
