package com.universidad.ejercicioEstudiantes.controller;

import com.universidad.ejercicioEstudiantes.dto.CalificacionesEstuDTO;
import com.universidad.ejercicioEstudiantes.model.Calificaciones;
import com.universidad.ejercicioEstudiantes.model.Estudiante;
import com.universidad.ejercicioEstudiantes.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/universidad")
public class CalificacionesController {

    @Autowired
    CalificacionesService calificacionesService;

    @GetMapping("/estudiantes")
    public List<Estudiante> getEstudiantes(){
        return calificacionesService.getEstudiantes();
    }
    @GetMapping("/calificaciones/{numMatricula}")
    public Calificaciones getNotasporNumMatricula(@PathVariable Long numMatricula){
        return calificacionesService.getCalificacionesNumMatricula(numMatricula);
    }
    @GetMapping("/calificaciones/ordendesc")
    public List<CalificacionesEstuDTO> getNotasPorOrdDes(){
        return calificacionesService.getCalificacionesOrDesc();
    }



}
