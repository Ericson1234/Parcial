/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.concierto;
import com.examen1.repository.ConciertoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author erics
 */
@Service
public class ConciertoService implements IConciertoService {

    //Inyeccion de dependencias
    @Autowired
    private ConciertoRepository conciertorepository;

    @Override
    public List<concierto> Listar() {
        return (List<concierto>)conciertorepository;
    }

    @Override
    public Optional<concierto> ListarId(long id) {
         return conciertorepository.findById(id);
    }

    @Override
    public void save(concierto concierto) {
        conciertorepository.save(concierto);
       
    }

    @Override
    public void delete(long id) {
        conciertorepository.deleteById(id);
    }

    
}
  
