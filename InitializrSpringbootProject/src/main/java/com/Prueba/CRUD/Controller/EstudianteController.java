/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Prueba.CRUD.Controller;

import com.Prueba.CRUD.Model.Estudiante;
import com.Prueba.CRUD.Service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 01139
 */
@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class EstudianteController {
    
     @Autowired
    private EstudianteService estudianteService;
    
    //listar
    @GetMapping("/estudiantes")
    public List<Estudiante> listar()
    {
        return estudianteService.findAll();
    }
    
    //guardar
    @PostMapping("/estudiantes")
    public Estudiante guardar(@RequestBody Estudiante estudiante)
    {
        return estudianteService.save(estudiante);
    }
    
    //get una tarea
    @GetMapping("/estudiantes/{id}")
    public Estudiante getUnaTarea(@PathVariable Integer id)
    {
        return estudianteService.findById(id);
    }
    
    //Modeficar
    @PutMapping("/estudiantes/{id}")
    public Estudiante modifecar(@RequestBody Estudiante estudiante,@PathVariable Integer id)
    {
        Estudiante estudianteActual= estudianteService.findById(id);
        estudianteActual.setNombres(estudiante.getNombres());
        estudianteActual.setApellidos(estudiante.getApellidos());
        estudianteActual.setCodigo(estudiante.getCodigo());
        estudianteActual.setReunion(estudiante.getReunion());
        estudianteActual.setActivo(estudiante.getActivo());
        
        return estudianteService.save(estudianteActual);
    }
    
    @DeleteMapping("/estudiantes/{id}")
    public void eliminar(@PathVariable Integer id)
    {
        estudianteService.delete(id);
    }
    
    
}
