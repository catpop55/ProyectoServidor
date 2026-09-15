package com.example.gestor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/tareas")
public class TereasController {
    
    @GetMapping("/{id}")
    public String detalle(
        @PathVariable(name = "id") int id,
        @RequestParam(name = "formato", defaultValue = "corto") String formato ) {

        return "Tarea " + id + " en formato " + formato;
    }
    
}
