package com.example.alumnoapi.dto;

public class EscuelaDto {
	
    private String nombre;
    private AlumnoDto alumno;

    public EscuelaDto() {}

    public EscuelaDto(String nombre, AlumnoDto alumno) {
        this.nombre = nombre;
        this.alumno = alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AlumnoDto getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDto alumno) {
        this.alumno = alumno;
    }

}
