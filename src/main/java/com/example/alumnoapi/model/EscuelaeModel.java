package com.example.alumnoapi.model;

public class EscuelaeModel {
	private String nombre;
	private AlumnoeModel alumno; 
    
    public EscuelaeModel() {
	}

	public EscuelaeModel(String nombre, AlumnoeModel alumno) {
		this.nombre = nombre;
		this.alumno = alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public AlumnoeModel getAlumno() {
		return alumno;
	}

	public void setAlumnoe(AlumnoeModel alumno) {
		this.alumno = alumno;
	}

}
