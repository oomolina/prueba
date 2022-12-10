/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Prueba.CRUD.Service;


import com.Prueba.CRUD.Dao.EstudianteDao;
import com.Prueba.CRUD.Model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 01139
 */

@Service
public class EstudianteServiceImplement  implements EstudianteService{
    @Autowired
    private EstudianteDao estudianteDao;

    @Override
    @Transactional(readOnly=true)
    public List<Estudiante> findAll() {
        return (List<Estudiante>) estudianteDao.findAll();
   }

    @Override
     @Transactional(readOnly=false)
    public Estudiante save(Estudiante est) {
        
        return estudianteDao.save(est);
  }

    @Override
    @Transactional(readOnly=true)
    public Estudiante findById(Integer id) {
        return estudianteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public void delete(Integer id) {
        estudianteDao.deleteById(id);
    }
    
}
