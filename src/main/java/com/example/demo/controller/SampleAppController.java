package com.example.demo.controller;

import com.example.demo.entity.Articoli;
import com.example.demo.exception.BindingException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.service.ArticoliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/SampleApp")
public class SampleAppController {

    @Autowired
    ArticoliService service;

    @PostMapping(value = "/createArticolo", produces = "application/json")
    public ResponseEntity<ResponseMessage> createArticolo(@Valid @RequestBody Articoli articolo, BindingResult binding){
        if (binding.hasErrors())
            throw new BindingException();
        service.createArticolo(articolo);

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<ResponseMessage>(new ResponseMessage(HttpStatus.OK.toString(), "Articolo creato"), header, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/deleteArticolo/{codiceArticolo}", produces = "application/json")
    public ResponseEntity<ResponseMessage> deleteArticolo(@PathVariable String codiceArticolo) throws NotFoundException {
        service.deleteArticolo(codiceArticolo);
        return new ResponseEntity<ResponseMessage>(new ResponseMessage(HttpStatus.OK.toString(), "Articolo eliminato correttamente"), HttpStatus.OK);
    }

    @PutMapping(value = "/updateArticolo", produces = "application/json")
    public ResponseEntity<ResponseMessage> updateArticolo(@RequestBody Articoli articolo) throws NotFoundException {
        service.updateArticolo(articolo);
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<ResponseMessage>(new ResponseMessage(HttpStatus.OK.toString(), "Articolo aggiornato"), header, HttpStatus.CREATED);
    }

    @GetMapping(value = "/getArticolo/{codiceArticolo}", produces = "application/json")
    public ResponseEntity<Articoli> getArticolo(@PathVariable String codiceArticolo) throws NotFoundException {
        Articoli res = service.getArticolo(codiceArticolo);
        return new ResponseEntity<Articoli>(res, HttpStatus.OK);
    }
}
