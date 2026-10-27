package com.example.gestor.dto;

public class TareaRequest {
    
    private String titulo;
    private String prioridad;
    private Integer proyectoId;

    public TareaRequest() {}
    
    public TareaRequest(String titulo, String prioridad, Integer proyectoId) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.proyectoId = proyectoId;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

    public Integer getProyectoId() { return proyectoId; }
    public void setProyectoId(Integer proyectoId) { this.proyectoId = proyectoId; }
}
