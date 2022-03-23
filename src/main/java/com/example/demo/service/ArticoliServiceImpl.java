package com.example.demo.service;


import com.example.demo.entity.Articoli;
import com.example.demo.repository.ArticoliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ArticoliServiceImpl implements ArticoliService{

    @Autowired
    ArticoliRepository repository;

    @Transactional
    @Override
    public void createArticolo(Articoli articolo) {
        repository.save(articolo);
    }
    @Transactional
    @Override
    public void deleteArticolo(String codiceArticolo) {
        repository.deleteById(codiceArticolo);
    }

    @Transactional
    @Override
    public void updateArticolo(Articoli articolo) {
        repository.save(articolo);
    }

    @Override
    public Articoli getArticolo(String codiceArticolo) {
        Optional<Articoli> res = repository.findById(codiceArticolo);
        if(!res.isEmpty())
            return res.get();
        return null;
    }
}
