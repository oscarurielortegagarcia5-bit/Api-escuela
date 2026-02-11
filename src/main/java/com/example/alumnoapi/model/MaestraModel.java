package com.example.alumnoapi.model;

public class MaestraModel {
    private String nombre;
    private String materia;
    private Boolean maestria;

    public MaestraModel() {
    }

    public MaestraModel(String nombre, String materia, Boolean maestria) {
        this.nombre = nombre;
        this.materia = materia;
        this.maestria = maestria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Boolean getMaestria() {
        return maestria;
    }

    public void setMaestria(Boolean maestria) {
        this.maestria = maestria;
    }
}
