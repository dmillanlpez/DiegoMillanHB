package com.universidad.ejercicioEstudiantes.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    // Atributos
    private Long numMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
}
