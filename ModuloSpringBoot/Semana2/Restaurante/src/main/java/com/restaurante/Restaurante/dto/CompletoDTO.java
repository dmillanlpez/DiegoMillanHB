package com.restaurante.Restaurante.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompletoDTO {

    // Atributos
    private Integer totalCalorias;
    private List<IngredientesDTO> ingredientesDTOList;
    private IngredientesDTO ingredienteMasCalorias;
}
