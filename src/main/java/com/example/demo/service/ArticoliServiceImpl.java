package com.example.demo.service;


import com.example.demo.entity.Articoli;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.ArticoliRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.attribute.standard.PresentationDirection;
import java.util.List;
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
    public void deleteArticolo(String codiceArticolo) throws NotFoundException {
        Optional<Articoli> art = repository.findById(codiceArticolo);
        if (art.isEmpty())
            throw new NotFoundException();

        repository.deleteById(codiceArticolo);
    }

    @Transactional
    @Override
    public void updateArticolo(Articoli articolo) throws NotFoundException{
        if (!repository.existsById(articolo.getCodart()))
            throw new NotFoundException();
        repository.save(articolo);
    }

    @Override
    public Articoli getArticolo(String codiceArticolo) throws NotFoundException {
        Optional<Articoli> res = repository.findById(codiceArticolo);
        if(res.isEmpty())
            throw new NotFoundException();
        return res.get();
    }

    @Override
    public List<Articoli> getAllArticoli() {
        List<Articoli> list = repository.findAll();
        return list;
    }


}
