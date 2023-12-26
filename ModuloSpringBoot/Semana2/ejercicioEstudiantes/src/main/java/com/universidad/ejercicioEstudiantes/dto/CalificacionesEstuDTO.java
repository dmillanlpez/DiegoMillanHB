package com.universidad.ejercicioEstudiantes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalificacionesEstuDTO {

    // Atributos
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
    private String nombre;


}
