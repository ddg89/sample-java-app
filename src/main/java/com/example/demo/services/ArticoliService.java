package com.example.demo.services;

import com.example.demo.entities.Articoli;

public interface ArticoliService {

    void createArticolo(Articoli articolo);
    void deleteArticolo(String codiceArticolo);
    void updateArticolo(Articoli articolo);
    void getArticolo(String codiceArticolo);

}
