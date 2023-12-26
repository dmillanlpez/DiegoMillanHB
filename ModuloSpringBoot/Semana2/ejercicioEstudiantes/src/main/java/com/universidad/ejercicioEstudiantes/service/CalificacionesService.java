package com.universidad.ejercicioEstudiantes.service;
import com.universidad.ejercicioEstudiantes.dto.CalificacionesEstuDTO;
import com.universidad.ejercicioEstudiantes.model.Calificaciones;
import com.universidad.ejercicioEstudiantes.model.Estudiante;
import com.universidad.ejercicioEstudiantes.repository.CalificacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalificacionesService implements ICalificacionesService {
    @Autowired
    private CalificacionesRepository calificacionesRepository;

    @Override
    public Calificaciones getCalificacionesNumMatricula(Long numMatricula) {

        List<Calificaciones> calificacionesList = calificacionesRepository.getCalificacionesList();

        return calificacionesList.stream()
                .filter(n -> n.getEstudiante().getNumMatricula().equals(numMatricula))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Estudiante> getEstudiantes() {

        List<Calificaciones> calificacionesList = calificacionesRepository.getCalificacionesList();

        return calificacionesList.stream()
                .map(Calificaciones::getEstudiante)
                .collect(Collectors.toList());
    }

    @Override
    public List<CalificacionesEstuDTO> getCalificacionesOrDesc() {
        List<Calificaciones> calificacionesList = calificacionesRepository.getCalificacionesList();

        return calificacionesList.stream()
                .map(calificaciones -> new CalificacionesEstuDTO(
                        calificaciones.getCalificacion1(),
                        calificaciones.getCalificacion2(),
                        calificaciones.getCalificacion3(),
                        calificaciones.getAvgCalificacion(),
                        calificaciones.getEstudiante().getNombre()
                        ))
                .sorted(Comparator.comparingDouble(CalificacionesEstuDTO::getPromedio).reversed())
                .collect(Collectors.toList());
    }

}