package br.com.magalu.microserv.Cad.rest;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppRest {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<String> onValidationError(Exception ex){
		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}
}
