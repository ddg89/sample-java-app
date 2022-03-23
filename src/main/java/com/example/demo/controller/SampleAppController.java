package com.example.demo.controller;

import com.example.demo.entity.Articoli;
import com.example.demo.exception.BindingException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.service.ArticoliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/SampleApp")
public class SampleAppController {

    @Autowired
    ArticoliService service;

    @PostMapping(value = "/createArticolo", produces = "application/json")
    public void createArticolo(@Valid @RequestBody Articoli articolo, BindingResult binding){
        if (binding.hasErrors())
            throw new BindingException();
        service.createArticolo(articolo);
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
}
