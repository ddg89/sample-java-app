package com.example.demo.controller;

import com.example.demo.entity.Articoli;
import com.example.demo.service.ArticoliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/SampleApp")
public class SampleAppController {

    @Autowired
    ArticoliService service;

    @PostMapping(value = "/createArticolo", produces = "application/json")
    public void createArticolo(@RequestBody Articoli articolo){
        service.createArticolo(articolo);
    }

    @DeleteMapping(value = "/deleteArticolo/{codiceArticolo}", produces = "application/json")
    public void deleteArticolo(@PathVariable String codiceArticolo){
        service.deleteArticolo(codiceArticolo);
    }

    @PutMapping(value = "/updateArticolo", produces = "application/json")
    public void updateArticolo(@RequestBody Articoli articolo){
        service.updateArticolo(articolo);
    }

    @GetMapping(value = "/getArticolo/{codiceArticolo}", produces = "application/json")
    public Articoli getArticolo(@PathVariable String codiceArticolo){
        Articoli res = service.getArticolo(codiceArticolo);
        return res;
    }
}
