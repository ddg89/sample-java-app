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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.ZonedDateTime;
import java.util.List;

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
    public void deleteArticolo(@PathVariable String codiceArticolo) throws NotFoundException {
        service.deleteArticolo(codiceArticolo);
    }

    @PutMapping(value = "/updateArticolo", produces = "application/json")
    public void updateArticolo(@RequestBody Articoli articolo) throws NotFoundException {
        service.updateArticolo(articolo);
    }

    @GetMapping(value = "/getArticolo/{codiceArticolo}", produces = "application/json")
    public Articoli getArticolo(@PathVariable String codiceArticolo) throws NotFoundException {
        Articoli res = service.getArticolo(codiceArticolo);
        return res;
    }

    @GetMapping(value = "/getAllArticoli", produces = "application/json")
    public ResponseEntity<List<Articoli>> getAllArticoli(){
        List<Articoli> articoli = service.getAllArticoli();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.setLastModified(ZonedDateTime.now());
        return new ResponseEntity<List<Articoli>>(articoli, header, HttpStatus.OK);
    }
}
