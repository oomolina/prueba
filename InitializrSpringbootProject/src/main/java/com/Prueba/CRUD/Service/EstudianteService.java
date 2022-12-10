/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Prueba.CRUD.Service;

import com.Prueba.CRUD.Model.Estudiante;
import java.util.List;

/**
 *
 * @author 01139
 */
public interface EstudianteService {
        public List<Estudiante> findAll();
    public Estudiante save(Estudiante est);
    public Estudiante findById(Integer id);
    public void delete(Integer id);
}
