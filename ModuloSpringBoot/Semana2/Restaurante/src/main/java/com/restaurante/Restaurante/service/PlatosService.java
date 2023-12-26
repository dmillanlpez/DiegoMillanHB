package com.restaurante.Restaurante.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restaurante.Restaurante.dto.CompletoDTO;
import com.restaurante.Restaurante.dto.IngredientesDTO;
import com.restaurante.Restaurante.dto.PlatosDTO;import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class PlatosService implements IPlatosService{

    private List<IngredientesDTO> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("src/main/resources/ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredientesDTO>> typeRef = new TypeReference<>() {};
        List<IngredientesDTO> ingreDTO= null;
        try {
            ingreDTO= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingreDTO;
    }

    private List<PlatosDTO> loadDataBase2() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("src/main/resources/dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlatosDTO>> typeRef = new TypeReference<>() {
        };
        List<PlatosDTO> platoDTO = null;
        try {
            platoDTO = objectMapper.readValue(file, typeRef);
            System.out.println(platoDTO.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return platoDTO;
    }

    // Cargo ambos json
    List<PlatosDTO> listaPlatos = loadDataBase2();
    List<IngredientesDTO> listaIngredientes = loadDataBase();


    @Override
    public CompletoDTO getPlato(String nombrePlato) {

        // Buscar el plato por nombre
        PlatosDTO plato = busquedaPlatoNombre(nombrePlato);

        if (plato != null) {
            // Calculo calorias totales
            int caloriasTotales = calcularCaloriasTotales(plato.getIngredientes());

            // Encontramos el ingrediente mas calorico
            IngredientesDTO ingredienteMasCalorico = getIngredienteMasCalorico(plato.getIngredientes());

            // Se mapea la lista de ingredients a DTO
            List<IngredientesDTO> ingredientesDTO = mapearAIngredientDTO(plato.getIngredientes());

            // Se crea el objeto ResultDTO y se establecen los valores
            CompletoDTO resultadoDTO = new CompletoDTO();
            resultadoDTO.setTotalCalorias(caloriasTotales);
            resultadoDTO.setIngredientesDTOList(ingredientesDTO);
            resultadoDTO.setIngredienteMasCalorias(ingredienteMasCalorico);

            return resultadoDTO;
        }

        return null;
    }

    // Busqueda plato por su nombre
    private PlatosDTO busquedaPlatoNombre(String nombrePlato){

        return listaPlatos.stream()
                .filter(n -> n.getNombre().equalsIgnoreCase(nombrePlato))
                .findFirst()
                .orElse(null);
    }

    // Ingrediente por id
    private IngredientesDTO busquedaIngredientePorId(int ingredienteId){

        return listaIngredientes.stream()
                .filter(n -> n.getId() == ingredienteId)
                .findFirst()
                .orElse(null);
    }

    // calculo de calorias totales
    private int calcularCaloriasTotales(List<Integer> ingredientesIds) {
        return ingredientesIds.stream()
                .map(this::busquedaIngredientePorId)
                .filter(Objects::nonNull)
                .mapToInt(IngredientesDTO::getCalories)
                .sum();
    }

    // encontrar ingrediente con mas calorias
    private IngredientesDTO getIngredienteMasCalorico(List<Integer> ingredienteId) {
        return ingredienteId.stream()
                .map(this::busquedaIngredientePorId)
                .filter(Objects::nonNull)
                .max(Comparator.comparing(IngredientesDTO::getCalories))
                .orElse(null);
    }

    private List<IngredientesDTO> mapearAIngredientDTO(List<Integer> ingredientesIds) {
        return ingredientesIds.stream()
                .map(this::busquedaIngredientePorId)
                .collect(Collectors.toList());
    }

}
