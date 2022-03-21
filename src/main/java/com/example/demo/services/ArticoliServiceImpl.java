package com.example.demo.services;


import com.example.demo.entities.Articoli;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ArticoliServiceImpl implements ArticoliService{

    @Override
    public void createArticolo(Articoli articolo) {

    }

    @Override
    public void deleteArticolo(String codiceArticolo) {

    }

    @Override
    public void updateArticolo(Articoli articolo) {

    }

    @Override
    public void getArticolo(String codiceArticolo) {

    }
}
