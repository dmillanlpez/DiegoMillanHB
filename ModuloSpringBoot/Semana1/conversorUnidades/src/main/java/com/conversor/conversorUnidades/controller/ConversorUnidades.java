package com.conversor.conversorUnidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorUnidades {
    @GetMapping("/conversor")
    public String conversor(@RequestParam double data){

        return data + " centimetros son " + (data / 100) + " metros";
    }
}
