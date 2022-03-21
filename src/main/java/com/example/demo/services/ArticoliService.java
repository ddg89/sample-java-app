package com.example.demo.services;

import com.example.demo.entities.Articoli;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ArticoliService {

    void createArticolo(Articoli articolo);
    void deleteArticolo(String codiceArticolo);
    void updateArticolo(Articoli articolo);
    void getArticolo(String codiceArticolo);

}
