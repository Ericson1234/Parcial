/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.controller;

import com.examen1.entity.concierto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.examen1.service.IConciertoService;

/**
 *
 * @author erics
 */
@Controller
public class ConciertoController {
    @Autowired
    private IConciertoService ConciertoService;
    
    @GetMapping("/detalle")
    public String index(Model model){
        List<concierto> listadetalle=ConciertoService.Listar();
        model.addAttribute("titulo","Concierto");
        model.addAttribute("eventos",listadetalle);
        return "detalle";
    }
    
    @GetMapping("/detalleC")
    public String crearevento(Model model){
        model.addAttribute("concierto",new concierto());
        
        return "crear";
    }
    
       @PostMapping("/save")
    public String guardar(@ModelAttribute concierto concierto){
        ConciertoService.save(concierto);
        return "redirect:/detalle";
    }
    
     @GetMapping("/delete/{id}")
    public String eliminar(Model model, @PathVariable int id){
        ConciertoService.delete(id);
        return "redirect:/detalle";
    }  

     @GetMapping("/editar/{id}")
    public String editarPersona(@PathVariable int id, Model model){
         Optional<concierto>concierto=ConciertoService.ListarId(id);
         model.addAttribute("concierto",concierto);
        
          return "detalle";
    }   
          
    //}  
    //@GetMapping("/modifica/{id}")
    //public String modificarPersona(@PathVariable("id") Long idPersona){
        //personaService.getPersonById(id));
       //model.addAttribute("persona",persona);
        //return "modificarPersona";
    //}

}