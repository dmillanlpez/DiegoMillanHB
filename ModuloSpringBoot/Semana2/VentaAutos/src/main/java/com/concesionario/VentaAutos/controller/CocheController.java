package com.concesionario.VentaAutos.controller;

import com.concesionario.VentaAutos.model.Coche;
import com.concesionario.VentaAutos.service.ICocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CocheController {

    @Autowired
    ICocheService carService;

    // insertado coches
    @PostMapping("/vehicles")
    public void insertarCoche(@RequestBody Coche coche){
       carService.insertarCoche(coche);
    }

    // ordenar por precio
    @GetMapping("/vehicles/prices")
    public List<Coche> cocheOrdenadoPrecio(){
        return carService.getCochesOrdPrecio();
    }
    @GetMapping("/vehicles/{id}")
    public Coche getCochePorId(@PathVariable Long id){
        return carService.getCochePorId(id);
    }
}
