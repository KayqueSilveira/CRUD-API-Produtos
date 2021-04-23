package br.com.magalu.microserv.Cad.integracao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.magalu.microserv.Cad.model.PostDTO;
import br.com.magalu.microserv.Cad.model.RetornoProdutosDTO;

@FeignClient(name = "produto", url = "http://challenge-api.luizalabs.com/api")
public interface PostClient {

    @GetMapping(value = "product/?page={number}")
    RetornoProdutosDTO getAllProdutos(@RequestParam(value = "number") Long number);

    @GetMapping(value = "product/{id}/")
    PostDTO getProdutoById(@RequestParam(value = "id") String id);
    
    @GetMapping(value = "product/{id}/")
    PostDTO existsById(@RequestParam(value = "id") String id);
    
    
    
}