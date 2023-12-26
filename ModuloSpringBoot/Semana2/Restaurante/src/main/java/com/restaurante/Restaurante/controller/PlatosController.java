package com.restaurante.Restaurante.controller;

import com.restaurante.Restaurante.dto.CompletoDTO;
import com.restaurante.Restaurante.service.IPlatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurante")
public class PlatosController {
    @Autowired
    IPlatosService platosService;

    @GetMapping("/plato/{nombrePlato}")
    public CompletoDTO getPlato(@PathVariable String nombrePlato){

        return platosService.getPlato(nombrePlato);
    }
}
