package com.generadorRefranes.refranero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@RestController
public class RefraneroController {

    private List<String> refranes = List.of(
            "Más vale estar solo que mal acompañado",
            "Perro ladrador, poco mordedor",
            "A caballo regalado no le mires el dentado",
            "A lo hecho, pecho",
            "Al mal tiempo, buena cara",
            "Cada loco con su tema",
            "De tal palo, tal astilla",
            "El que la hace, la paga",
            "Dinero llama dinero",
            "El mundo es un pañuelo"
    );

    // Metodo para obtener los refranes aleatorios
    @GetMapping
    public String obtenerRefran(){
        Random random = new Random();
        int aleatorio = random.nextInt(refranes.size());

        return refranes.get(aleatorio);
    }
}
