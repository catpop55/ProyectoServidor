package com.example.gestor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("/adios")
    public String hola() {
        return "Hola, mundo. Te responde mi servidor.<br>Como estas?";
        
    }

    @GetMapping("/estado")
    public String estado() {
        return "Servidor en funcionamiento";
        
    }

    @GetMapping("/prestamos/resumen")
    public String resumen() {
        return "Esta aplicación gestinará los préstamos de material";
        
    }

    @GetMapping("/numero")
    public int numero() {
        return 2006;
        
    }
}
