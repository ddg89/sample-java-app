package com.example.demo.service;

import com.example.demo.entity.Articoli;
import com.example.demo.exception.NotFoundException;

public interface ArticoliService {

    void createArticolo(Articoli articolo);
    void deleteArticolo(String codiceArticolo) throws NotFoundException;
    void updateArticolo(Articoli articolo) throws NotFoundException;
    Articoli getArticolo(String codiceArticolo) throws NotFoundException;

}
