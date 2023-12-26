package com.universidad.ejercicioEstudiantes.service;
import com.universidad.ejercicioEstudiantes.dto.CalificacionesEstuDTO;
import com.universidad.ejercicioEstudiantes.model.Calificaciones;
import com.universidad.ejercicioEstudiantes.model.Estudiante;

import java.util.List;

public interface ICalificacionesService {

    Calificaciones getCalificacionesNumMatricula(Long numMatricula);
    List<Estudiante> getEstudiantes();

    List<CalificacionesEstuDTO> getCalificacionesOrDesc();

}
