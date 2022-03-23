package com.example.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// @ControllerAdvice - Centralizzare la gestione degli ExceptionHandler
@RestController @ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionResponse> notFoundExceptionHandler(){

        ExceptionResponse response = new ExceptionResponse();
        response.setCodice(HttpStatus.NOT_FOUND.value());
        response.setMessage("Elemento non trovato");
        return new ResponseEntity<ExceptionResponse>(response, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

}
