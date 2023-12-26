package com.restaurante.Restaurante.dto;

import lombok.Data;

import java.util.List;

@Data
public class PlatosDTO {

    // Atributos
    private Long id;
    private String nombre;
    private List<Integer> ingredientes;
}
