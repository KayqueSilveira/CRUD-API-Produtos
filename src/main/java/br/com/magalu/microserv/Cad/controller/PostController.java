package br.com.magalu.microserv.Cad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magalu.microserv.Cad.integracao.PostClient;
import br.com.magalu.microserv.Cad.model.PostDTO;
import br.com.magalu.microserv.Cad.model.RetornoProdutosDTO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class PostController {
	
	@Autowired
	 private PostClient postClient;
	
	    @GetMapping(value = "/{pages}")
	    public RetornoProdutosDTO getAllProdutos(@PathVariable Long pages) {
	    	
	        return postClient.getAllProdutos(pages);
	    }

	    @GetMapping(value = "/id/{id}/")
	    public PostDTO getProduto(@PathVariable String id) {
	        return postClient.getProdutoById(id);
	    }
	  

}
