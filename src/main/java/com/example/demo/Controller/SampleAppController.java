package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/SampleApp")
public class SampleAppController {

    @PostMapping(value = "/createArticolo", produces = "application/json")
    public void createArticolo(@RequestBody Object articolo){

    }

    @DeleteMapping(value = "/deleteArticolo/{codiceArticolo}", produces = "application/json")
    public void deleteArticolo(@PathVariable String codiceArticolo){

    }

    @PutMapping(value = "/updateArticolo", produces = "application/json")
    public void updateArticolo(@RequestBody Object articolo){

    }

    @GetMapping(value = "/getArticolo/{codiceArticolo}", produces = "application/json")
    public void getArticolo(@PathVariable String codiceArticolo){

    }
}
