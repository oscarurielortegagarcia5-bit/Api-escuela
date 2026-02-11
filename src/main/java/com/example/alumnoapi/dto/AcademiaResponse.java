package com.example.alumnoapi.dto;

public class AcademiaResponse {
	
    private EscuelaDto escuela;
    private String observaciones;

    public AcademiaResponse() {}

    public AcademiaResponse(EscuelaDto escuela, String observaciones) {
        this.escuela = escuela;
        this.observaciones = observaciones;
    }

    public EscuelaDto getEscuela() {
        return escuela;
    }

    public void setEscuela(EscuelaDto escuela) {
        this.escuela = escuela;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
