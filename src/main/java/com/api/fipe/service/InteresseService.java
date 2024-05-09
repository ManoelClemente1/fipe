package com.api.fipe.service;

import com.api.fipe.model.Interesse;
import com.api.fipe.repository.InteresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteresseService {

    @Autowired
    private InteresseRepository repository;

    public void criarNovoInteresse(String nome){
        Interesse interesse = new Interesse(nome);
        repository.save(interesse);
    }

    public List<Interesse> buscarListaDeInteresses(){
        return repository.findAll();
    }

}
