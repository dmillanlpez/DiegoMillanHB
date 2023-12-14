package com.morse.morseCode.controller;

import com.morse.morseCode.logic.Morse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("/convertirAMorse")
    public String convertirAMorse(@RequestParam String frase) {
        return Morse.convertir(frase);
    }

}
