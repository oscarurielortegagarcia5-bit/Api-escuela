package com.example.alumnoapi.model;

public class AlumnoeModel {
	private String nombre;
    private String alumno;
    private Integer edad;
    
    public AlumnoeModel() {
	}
    
	public AlumnoeModel(String nombre, String alumno, Integer edad) {
		this.nombre = nombre;
		this.alumno = alumno;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
