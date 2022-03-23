package com.example.demo.service;

import com.example.demo.entity.Articoli;

public interface ArticoliService {

    void createArticolo(Articoli articolo);
    void deleteArticolo(String codiceArticolo);
    void updateArticolo(Articoli articolo);
    Articoli getArticolo(String codiceArticolo);

}
