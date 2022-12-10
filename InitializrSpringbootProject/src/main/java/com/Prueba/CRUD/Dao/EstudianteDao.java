/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Prueba.CRUD.Dao;

import com.Prueba.CRUD.Model.Estudiante;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author 01139
 */
public interface EstudianteDao extends CrudRepository<Estudiante, Integer>{
    
}

