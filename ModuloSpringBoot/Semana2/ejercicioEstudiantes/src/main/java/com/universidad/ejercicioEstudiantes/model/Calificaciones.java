package com.universidad.ejercicioEstudiantes.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calificaciones {

    // Atributos
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double avgCalificacion;
    private Estudiante estudiante;


}
