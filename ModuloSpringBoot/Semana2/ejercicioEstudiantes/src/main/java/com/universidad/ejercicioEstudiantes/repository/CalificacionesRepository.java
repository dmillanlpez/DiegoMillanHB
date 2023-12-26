package com.universidad.ejercicioEstudiantes.repository;
import com.universidad.ejercicioEstudiantes.model.Calificaciones;
import com.universidad.ejercicioEstudiantes.model.Estudiante;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CalificacionesRepository {

    private List<Calificaciones> calificacionesList;

    public CalificacionesRepository(){

        calificacionesList = new ArrayList<>();

        calificacionesList.add(new Calificaciones(10.0, 7.0, 8.0, 8.333, new Estudiante(1L, "Diego", "Millan", LocalDate.of(1996, 10, 30))));
        calificacionesList.add(new Calificaciones(4.0, 8.2, 7.50, 6.567, new Estudiante(2L, "Cath", "Lopez", LocalDate.of(2002, 10, 4))));
        calificacionesList.add(new Calificaciones(8.0, 7.65, 10.0, 8.55, new Estudiante(3L, "Carmen", "Lopez", LocalDate.of(1956, 10, 27))));

    }
    public List<Calificaciones> getCalificacionesList(){

        return calificacionesList;
    }
}
