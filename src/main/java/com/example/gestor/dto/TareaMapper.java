package com.example.gestor.dto;

import com.example.gestor.model.Tarea;

public class TareaMapper {
    
    public static TareaResponse aRespuesta (Tarea tarea) {
        return new TareaResponse(tarea.getId(), tarea.getTitulo(), tarea.getPrioridad(), tarea.isCompletada(), tarea.getProyectoId());
    }

    public static Tarea aModelo(TareaRequest peticion) {
        Tarea tarea = new Tarea();
        tarea.setTitulo(peticion.getTitulo());
        tarea.setPrioridad(peticion.getPrioridad());
        tarea.setProyectoId(peticion.getProyectoId());
        return tarea;
    }

}
