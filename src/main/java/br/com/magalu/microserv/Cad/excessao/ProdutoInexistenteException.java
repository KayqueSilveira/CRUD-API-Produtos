package br.com.magalu.microserv.Cad.excessao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProdutoInexistenteException extends RuntimeException {

	public ProdutoInexistenteException(String message) {
		super(message);
	}
	
	public ProdutoInexistenteException(Throwable cause) {
		super(cause);
	}
}
