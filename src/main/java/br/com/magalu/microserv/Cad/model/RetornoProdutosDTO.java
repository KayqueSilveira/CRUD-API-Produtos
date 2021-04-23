package br.com.magalu.microserv.Cad.model;

import java.util.List;


public class RetornoProdutosDTO {


	private MetaDTO meta;
    private List<PostDTO> products;
    
	public MetaDTO getMeta() {
		return meta;
	}
	
	public void setMeta(MetaDTO meta) {
		this.meta = meta;
	}
	
	public List<PostDTO> getProducts() {
		return products;
	}
	
	public void setProducts(List<PostDTO> products) {
		this.products = products;
	}
    
}
