package com.concesionario.VentaAutos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coche {

    // Atributos
    private Long id;
    private String brand;
    private String model;
    private String kilometers;
    private Integer doors;
    private Double price;
}
