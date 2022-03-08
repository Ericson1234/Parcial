/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.concierto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erics
 */
@Repository
public interface IConciertoService {
    public List<concierto> Listar();
    public Optional<concierto>ListarId(long id);
    public void save(concierto concierto);
    public void delete (long id);
    

    
}
