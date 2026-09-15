package com.example.gestor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public String usuario(@PathVariable(name = "id") int id) {
        return "Ficha del usuario " + id;
    }

    @GetMapping("/proyectos/{proyectoId}/incidencias/{incidenciaId}")
    public String incidenciaDeProyecto(
            @PathVariable(name = "proyectoId") int proyectoId,
            @PathVariable(name = "incidenciaId") int incidenciaId) {

        return "Incidencia " + incidenciaId + " del proyecto " + proyectoId;
    }

}
